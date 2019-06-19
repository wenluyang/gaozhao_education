package com.gaozhao.sys_manage.api;

import com.gaozhao.app_common.util.Assist;
import com.gaozhao.app_common.util.Page;
import com.gaozhao.app_common.util.ResultUtil;
import com.gaozhao.app_common.util.SnowFlake;
import com.gaozhao.sys_manage.pojo.domain.SysEdubureau;
import com.gaozhao.sys_manage.pojo.vo.SysEduBureauFromPage;
import com.gaozhao.sys_manage.pojo.vo.SysEdubureauForm;
import com.gaozhao.sys_manage.service.SysEdubureauService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gaozhao.app_common.pojo.Result;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/sys_manage/sysedubureau/")
@Api(tags = "教育局机构api")
public class SysEdubureauController {
	@Autowired
	private SysEdubureauService service;

	@GetMapping("list")
	@ApiOperation(value = "分页查询所有教育局列表(条件查询,省市区,状态,名字,编码(状态默认为'全部'必传)")
	public Result getSysEdubureau(SysEduBureauFromPage sysEduBureauFromPage){
		Page sysEduBureauOpenList = service.getSysEduBureauList(sysEduBureauFromPage);
		return ResultUtil.success(sysEduBureauOpenList);
	}

	@PostMapping("create")
	@ApiOperation(value = "添加教育局机构")
	public Result createSysEdubureau(SysEdubureauForm sysedubureauForm) throws ParseException {
		//先判断教育局名称是否存在  存在就返回错误提示
		String eduName = sysedubureauForm.getEduName();
		Assist assist=new Assist();
		assist.setRequires(Assist.andEq("edu_name",eduName));
		List<SysEdubureau> sysEdubureaus = service.selectSysEdubureau(assist);
		if(sysEdubureaus.size()>0){
			return ResultUtil.error("该教育局已经存在");
		}
		//判断教育局编号是否存在 存在就返回错误提示
		String eduCode = sysedubureauForm.getEduCode();
		assist.setRequires(Assist.andEq("edu_code",eduCode));
		List<SysEdubureau> sysEdubureaus1 = service.selectSysEdubureau(assist);
		if (sysEdubureaus1.size()>0) {
			return ResultUtil.error("该教育局已经存在");
		}

		SysEdubureau sysEdubureau=new SysEdubureau();
		BeanUtils.copyProperties(sysedubureauForm,sysEdubureau);
		//开始服务时间
		String startTime=sysedubureauForm.getValidStartTime();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date validStartTime = sdf.parse(startTime);
		//服务结束时间
		String endTime = sysedubureauForm.getValidEndTime();
		Date validEndTime = sdf.parse(endTime);
		//时间
		sysEdubureau.setCreateTime(new Date());
		sysEdubureau.setUpdateTime(new Date());
		sysEdubureau.setValidStartTime(validStartTime);
		sysEdubureau.setValidEndTime(validEndTime);
		// 自动生成fkcode
		sysEdubureau.setFkCode(SnowFlake.getId());
		//删除状态为0
		sysEdubureau.setDelStatus(0);
		// 保存

		int i = service.insertSysEdubureau(sysEdubureau);
		if(i==0){
			return ResultUtil.error("教育局添加失败");
		}

		return  ResultUtil.success("教育局添加成功");
	}

	@GetMapping("get/{id}")
	@ApiOperation(value = "根据ID获取教育局信息")
	public Result getSysEdubureau(@PathVariable String id){
		SysEdubureau sysEdubureau = service.selectSysEdubureauById(Long.parseLong(id));
		return  ResultUtil.success(sysEdubureau);
	}

	@PostMapping("update")
	@ApiOperation(value = "更新教育局机构")
	public Result updateSysEdubureau(SysEdubureauForm sysedubureauForm, @RequestParam String id) throws ParseException {
		SysEdubureau sysEdubureau = service.selectSysEdubureauById(Long.parseLong(id));
		//开始服务时间
		String startTime = sysedubureauForm.getValidStartTime();
		SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-dd");
		Date validStartTime = sdf.parse(startTime);
		//结束服务时间
		String endTime = sysedubureauForm.getValidEndTime();
		Date validEndTime = sdf.parse(endTime);

		BeanUtils.copyProperties(sysedubureauForm,sysEdubureau);
		sysEdubureau.setValidStartTime(validStartTime);
		sysEdubureau.setValidEndTime(validEndTime);
		sysEdubureau.setUpdateTime(new Date());

		int i = service.updateSysEdubureauById(sysEdubureau);
		if (i>0) {
			return ResultUtil.success("教育局更新成功");
		}
		return  ResultUtil.error("教育局更新失败");
	}


	@PostMapping("delete")
	@ApiOperation(value = "批量删除教育局")
	public Result deleteSysEdubureau(List<String> ids){
		return null;
	}


}
