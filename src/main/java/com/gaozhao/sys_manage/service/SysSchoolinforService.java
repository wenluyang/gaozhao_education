package com.gaozhao.sys_manage.service;
import java.util.List;

import com.gaozhao.app_common.util.Page;
import com.gaozhao.sys_manage.pojo.domain.SysSchoolinfor;
import com.gaozhao.app_common.util.Assist;
import com.gaozhao.sys_manage.pojo.vo.SysSchoolFormPage;

public interface SysSchoolinforService{
	/**
	 * 获得SysSchoolinfor数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysSchoolinforRowCount(Assist assist);
	/**
	 * 获得SysSchoolinfor数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysSchoolinfor> selectSysSchoolinfor(Assist assist);
	/**
	 * 获得一个SysSchoolinfor对象,以参数SysSchoolinfor对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysSchoolinfor selectSysSchoolinforByObj(SysSchoolinfor obj);
	/**
	 * 通过SysSchoolinfor的id获得SysSchoolinfor对象
	 * @param id
	 * @return
	 */
    SysSchoolinfor selectSysSchoolinforById(Long id);
	/**
	 * 插入SysSchoolinfor到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysSchoolinfor(SysSchoolinfor value);
	/**
	 * 插入SysSchoolinfor中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysSchoolinfor(SysSchoolinfor value);
	/**
	 * 批量插入SysSchoolinfor到数据库
	 * @param value
	 * @return
	 */
    int insertSysSchoolinforByBatch(List<SysSchoolinfor> value);
	/**
	 * 通过SysSchoolinfor的id删除SysSchoolinfor
	 * @param id
	 * @return
	 */
    int deleteSysSchoolinforById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除SysSchoolinfor
	 * @param assist
	 * @return
	 */
    int deleteSysSchoolinfor(Assist assist);
	/**
	 * 通过SysSchoolinfor的id更新SysSchoolinfor中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysSchoolinforById(SysSchoolinfor enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysSchoolinfor中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysSchoolinfor(SysSchoolinfor value, Assist assist);
	/**
	 * 通过SysSchoolinfor的id更新SysSchoolinfor中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysSchoolinforById(SysSchoolinfor enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysSchoolinfor中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysSchoolinfor(SysSchoolinfor value, Assist assist);

	Page getSysSchoolList(SysSchoolFormPage sysSchoolFormPage);
}