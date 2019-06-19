package com.gaozhao.sys_manage.dao;
import com.gaozhao.sys_manage.pojo.bo.EduBureauBo;
import com.gaozhao.sys_manage.pojo.domain.SysEdubureau;
import java.util.List;
import com.gaozhao.app_common.util.Assist;
import com.gaozhao.sys_manage.pojo.vo.SysEduBureauFromPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysEdubureauDao{
	/**
	 * 获得SysEdubureau数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysEdubureauRowCount(Assist assist);
	/**
	 * 获得SysEdubureau数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysEdubureau> selectSysEdubureau(Assist assist);
	/**
	 * 获得一个SysEdubureau对象,以参数SysEdubureau对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysEdubureau selectSysEdubureauByObj(SysEdubureau obj);
	/**
	 * 通过SysEdubureau的id获得SysEdubureau对象
	 * @param id
	 * @return
	 */
    SysEdubureau selectSysEdubureauById(Long id);
	/**
	 * 插入SysEdubureau到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysEdubureau(SysEdubureau value);
	/**
	 * 插入SysEdubureau中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysEdubureau(SysEdubureau value);
	/**
	 * 批量插入SysEdubureau到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysEdubureauByBatch(List<SysEdubureau> value);
	/**
	 * 通过SysEdubureau的id删除SysEdubureau
	 * @param id
	 * @return
	 */
    int deleteSysEdubureauById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除SysEdubureau
	 * @param assist
	 * @return
	 */
    int deleteSysEdubureau(Assist assist);
	/**
	 * 通过SysEdubureau的id更新SysEdubureau中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysEdubureauById(SysEdubureau enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysEdubureau中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysEdubureau(@Param("enti") SysEdubureau value, @Param("assist") Assist assist);
	/**
	 * 通过SysEdubureau的id更新SysEdubureau中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysEdubureauById(SysEdubureau enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysEdubureau中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysEdubureau(@Param("enti") SysEdubureau value, @Param("assist") Assist assist);

    Long getSysEduBureauListCount(SysEduBureauFromPage sysEduBureauFromPage);

	List<EduBureauBo> getSysEduBureauList(SysEduBureauFromPage sysEduBureauFromPage);
}