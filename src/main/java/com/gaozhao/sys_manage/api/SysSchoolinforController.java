package com.gaozhao.sys_manage.api;

import com.gaozhao.app_common.pojo.Result;
import com.gaozhao.app_common.util.Assist;
import com.gaozhao.app_common.util.Page;
import com.gaozhao.app_common.util.ResultUtil;
import com.gaozhao.app_common.util.SnowFlake;
import com.gaozhao.sys_manage.pojo.domain.SysSchoolinfor;
import com.gaozhao.sys_manage.pojo.vo.SysSchoolForm;
import com.gaozhao.sys_manage.pojo.vo.SysSchoolFormPage;
import com.gaozhao.sys_manage.service.SysSchoolinforService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "学校接口")
@RequestMapping("/sys_manage/sys_school/")
public class SysSchoolinforController {
    @Autowired
    private SysSchoolinforService service;

    @ApiOperation(value = "根据条件查询学校列表")
    @PostMapping("list")
    public Result getSysSchool(SysSchoolFormPage sysSchoolFormPage){
        Page sysSchoolList = service.getSysSchoolList(sysSchoolFormPage);
        return ResultUtil.success(sysSchoolList);
    }

    @ApiOperation(value = "开通学校")
    @PostMapping("create")
    public Result createSysSchool(SysSchoolForm sysSchoolForm) throws ParseException {
        String schoolName = sysSchoolForm.getSchoolName();
        //查找学校名称，如果存在就返回错误
        Assist assist=new Assist();
        assist.setRequires(Assist.andEq("school_name",schoolName));
        List<SysSchoolinfor> sysSchoolinfors = service.selectSysSchoolinfor(assist);
        if (sysSchoolinfors.size()>0) {
            return ResultUtil.error("该学校已经存在");
        }
        SysSchoolinfor schoolinfor= new SysSchoolinfor();
        //服务开始时间
        String startTime = sysSchoolForm.getValidStartTime();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date validStartTime = sdf.parse(startTime);
        schoolinfor.setValidStartTime(validStartTime);
        //服务结束时间
        String endTime = sysSchoolForm.getValidEndTime();
        Date validEndTime = sdf.parse(endTime);
        schoolinfor.setValidEndTime(validEndTime);
        //创建时间与更新时间
        schoolinfor.setCreateTime(new Date());
        schoolinfor.setUpdateTime(new Date());
        //唯一标识符
        schoolinfor.setFkCode(SnowFlake.getId());

        BeanUtils.copyProperties(sysSchoolForm,schoolinfor);
        int i = service.insertNonEmptySysSchoolinfor(schoolinfor);
        if (i==0) {
            return ResultUtil.error("学校开通失败");
        }

        return ResultUtil.success("学校开通成功");
    }

    @ApiOperation(value = "更新学校")
    @PostMapping("update/{id}")
    public Result updateSysSchool(SysSchoolForm sysSchoolForm, @PathVariable String id) throws ParseException {
        SysSchoolinfor sysSchoolinfor = service.selectSysSchoolinforById(Long.parseLong(id));
        //学校开始服务时间
        SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-dd");
        String startTime = sysSchoolForm.getValidStartTime();
        Date validStartTime = sdf.parse(startTime);
        //学校结束服务时间
        String endTime = sysSchoolForm.getValidEndTime();
        Date validEndTime = sdf.parse(endTime);



        BeanUtils.copyProperties(sysSchoolForm,sysSchoolinfor);
        sysSchoolinfor.setUpdateTime(new Date());
        sysSchoolinfor.setValidStartTime(validStartTime);
        sysSchoolinfor.setValidEndTime(validEndTime);
        sysSchoolinfor.setDelStatus(0);

        int i = service.updateSysSchoolinforById(sysSchoolinfor);
        if (i==0) {
            return ResultUtil.error("更新学校失败");
        }
        return  ResultUtil.success("更新学校成功");
    }
}
