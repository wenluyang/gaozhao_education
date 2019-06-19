package com.gaozhao.sys_manage.service.Impl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.gaozhao.app_common.util.Page;
import com.gaozhao.sys_manage.dao.SysEdubureauDao;
import com.gaozhao.sys_manage.pojo.bo.EduBureauBo;
import com.gaozhao.sys_manage.pojo.domain.SysEdubureau;
import com.gaozhao.app_common.util.Assist;
import com.gaozhao.sys_manage.pojo.vo.SysEduBureauFromPage;
import com.gaozhao.sys_manage.service.SysEdubureauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysEdubureauServiceImpl implements SysEdubureauService{
    @Autowired
    private SysEdubureauDao sysEdubureauDao;
    @Override
    public long getSysEdubureauRowCount(Assist assist){
        return sysEdubureauDao.getSysEdubureauRowCount(assist);
    }
    @Override
    public List<SysEdubureau> selectSysEdubureau(Assist assist){
        return sysEdubureauDao.selectSysEdubureau(assist);
    }
    @Override
    public SysEdubureau selectSysEdubureauByObj(SysEdubureau obj){
        return sysEdubureauDao.selectSysEdubureauByObj(obj);
    }
    @Override
    public SysEdubureau selectSysEdubureauById(Long id){
        return sysEdubureauDao.selectSysEdubureauById(id);
    }
    @Override
    public int insertSysEdubureau(SysEdubureau value){
        return sysEdubureauDao.insertSysEdubureau(value);
    }
    @Override
    public int insertNonEmptySysEdubureau(SysEdubureau value){
        return sysEdubureauDao.insertNonEmptySysEdubureau(value);
    }
    @Override
    public int insertSysEdubureauByBatch(List<SysEdubureau> value){
        return sysEdubureauDao.insertSysEdubureauByBatch(value);
    }
    @Override
    public int deleteSysEdubureauById(Long id){
        return sysEdubureauDao.deleteSysEdubureauById(id);
    }
    @Override
    public int deleteSysEdubureau(Assist assist){
        return sysEdubureauDao.deleteSysEdubureau(assist);
    }
    @Override
    public int updateSysEdubureauById(SysEdubureau enti){
        return sysEdubureauDao.updateSysEdubureauById(enti);
    }
    @Override
    public int updateSysEdubureau(SysEdubureau value, Assist assist){
        return sysEdubureauDao.updateSysEdubureau(value,assist);
    }
    @Override
    public int updateNonEmptySysEdubureauById(SysEdubureau enti){
        return sysEdubureauDao.updateNonEmptySysEdubureauById(enti);
    }
    @Override
    public int updateNonEmptySysEdubureau(SysEdubureau value, Assist assist){
        return sysEdubureauDao.updateNonEmptySysEdubureau(value,assist);
    }

    @Override
    public int deleteBatchSysEdubureau(List<String> ids) {
        //根据ID找到教育局外键数组

        return 0;
    }

    @Override
    public Page getSysEduBureauList(SysEduBureauFromPage sysEduBureauFromPage) {
        long pageSize = sysEduBureauFromPage.getPageSize();
        long pageNo = sysEduBureauFromPage.getPageNo();
        sysEduBureauFromPage.setPageNo((sysEduBureauFromPage.getPageNo() - 1) * pageSize);
        // 获取状态
        String state = sysEduBureauFromPage.getState();
        if (state==null) {
            state="全部";
        }
        // 获取当前时间
        Date d1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(d1);
        switch (state) {
            case "全部": {
                sysEduBureauFromPage.setState(null);
                break;
            }
            case "未使用": {
                sysEduBureauFromPage.setState("seb.VALID_START_TIME > '" + format + "'");
                break;
            }
            case "使用中": {
                sysEduBureauFromPage.setState(
                        "seb.VALID_START_TIME < '" + format + "'" + " AND seb.VALID_END_TIME>" + "'" + format + "'");
                break;
            }
            case "已到期": {
                sysEduBureauFromPage.setState("'" + format + "' > seb.VALID_END_TIME");
                break;
            }
            default:
                return null;
        }

        // 查询总数
        Long count = sysEdubureauDao.getSysEduBureauListCount(sysEduBureauFromPage);
        // 分页查询
        List<EduBureauBo> sysSchoolOpenList = sysEdubureauDao.getSysEduBureauList(sysEduBureauFromPage);
        return Page.PageUtil(count, pageNo, pageSize, sysSchoolOpenList);

    }

    public SysEdubureauDao getSysEdubureauDao() {
        return this.sysEdubureauDao;
    }

    public void setSysEdubureauDao(SysEdubureauDao sysEdubureauDao) {
        this.sysEdubureauDao = sysEdubureauDao;
    }

}