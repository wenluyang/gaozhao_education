package com.gaozhao.sys_manage.api;

import com.gaozhao.app_common.pojo.Result;
import com.gaozhao.app_common.util.Assist;
import com.gaozhao.app_common.util.Page;
import com.gaozhao.app_common.util.ResultUtil;
import com.gaozhao.sys_manage.pojo.domain.SysUser;
import com.gaozhao.sys_manage.pojo.vo.SysSchoolUserForm;
import com.gaozhao.sys_manage.pojo.vo.SysUserFormPage;
import com.gaozhao.sys_manage.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "用户接口")
@RequestMapping("/sys_manage/sysuser/")
public class SysUserController {
    @Autowired
    private SysUserService service;

    @ApiOperation(value = "根据条件获取列表")
    @GetMapping("list")
    public Result getSysUser(SysUserFormPage sysUserFormPage) {
        Page sysUserList = service.getSysUser(sysUserFormPage);
        return ResultUtil.success(sysUserList);
    }

    @ApiModelProperty(value = "创建学校用户")
    @PostMapping("create_school_user")
    public Result createSchoolUser(SysSchoolUserForm sysSchoolUserForm){
        String userAccount = sysSchoolUserForm.getUserAccount();
        Assist assist=new Assist();
        assist.setRequires(Assist.andEq("user_account",userAccount));
        List<SysUser> sysUserList = service.selectSysUser(assist);
        if (sysUserList.size()>0) {
            return ResultUtil.error("该用户名已经存在！");
        }
        SysUser sysUser=new SysUser();
        BeanUtils.copyProperties(sysSchoolUserForm,sysUser);
        sysUser.setCreateTime(new Date());
        sysUser.setUpdateTime(new Date());
        sysUser.setDelStatus(0);

        int i = service.insertNonEmptySysUser(sysUser);
        if (i==0) {
            return ResultUtil.error("创建用户失败");
        }
        return ResultUtil.success("创建成功");
    }


}

