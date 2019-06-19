package com.gaozhao.sys_manage.service.Impl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.gaozhao.app_common.util.Page;
import com.gaozhao.sys_manage.dao.SysSchoolinforDao;
import com.gaozhao.sys_manage.pojo.bo.EduBureauBo;
import com.gaozhao.sys_manage.pojo.domain.SysSchoolinfor;
import com.gaozhao.app_common.util.Assist;
import com.gaozhao.sys_manage.pojo.vo.SysSchoolFormPage;
import com.gaozhao.sys_manage.service.SysSchoolinforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysSchoolinforServiceImpl implements SysSchoolinforService{
    @Autowired
    private SysSchoolinforDao sysSchoolinforDao;
    @Override
    public long getSysSchoolinforRowCount(Assist assist){
        return sysSchoolinforDao.getSysSchoolinforRowCount(assist);
    }
    @Override
    public List<SysSchoolinfor> selectSysSchoolinfor(Assist assist){
        return sysSchoolinforDao.selectSysSchoolinfor(assist);
    }
    @Override
    public SysSchoolinfor selectSysSchoolinforByObj(SysSchoolinfor obj){
        return sysSchoolinforDao.selectSysSchoolinforByObj(obj);
    }
    @Override
    public SysSchoolinfor selectSysSchoolinforById(Long id){
        return sysSchoolinforDao.selectSysSchoolinforById(id);
    }
    @Override
    public int insertSysSchoolinfor(SysSchoolinfor value){
        return sysSchoolinforDao.insertSysSchoolinfor(value);
    }
    @Override
    public int insertNonEmptySysSchoolinfor(SysSchoolinfor value){
        return sysSchoolinforDao.insertNonEmptySysSchoolinfor(value);
    }
    @Override
    public int insertSysSchoolinforByBatch(List<SysSchoolinfor> value){
        return sysSchoolinforDao.insertSysSchoolinforByBatch(value);
    }
    @Override
    public int deleteSysSchoolinforById(Long id){
        return sysSchoolinforDao.deleteSysSchoolinforById(id);
    }
    @Override
    public int deleteSysSchoolinfor(Assist assist){
        return sysSchoolinforDao.deleteSysSchoolinfor(assist);
    }
    @Override
    public int updateSysSchoolinforById(SysSchoolinfor enti){
        return sysSchoolinforDao.updateSysSchoolinforById(enti);
    }
    @Override
    public int updateSysSchoolinfor(SysSchoolinfor value, Assist assist){
        return sysSchoolinforDao.updateSysSchoolinfor(value,assist);
    }
    @Override
    public int updateNonEmptySysSchoolinforById(SysSchoolinfor enti){
        return sysSchoolinforDao.updateNonEmptySysSchoolinforById(enti);
    }
    @Override
    public int updateNonEmptySysSchoolinfor(SysSchoolinfor value, Assist assist){
        return sysSchoolinforDao.updateNonEmptySysSchoolinfor(value,assist);
    }

    @Override
    public Page getSysSchoolList(SysSchoolFormPage sysSchoolFormPage) {
        long pageSize = sysSchoolFormPage.getPageSize();
        long pageNo = sysSchoolFormPage.getPageNo();
        sysSchoolFormPage.setPageNo((sysSchoolFormPage.getPageNo() - 1) * pageSize);
        // 获取状态
        String state = sysSchoolFormPage.getState();
        if (state==null) {
            state="全部";
        }

        // 获取当前时间
        Date d1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(d1);
        switch (state) {
            case "全部": {
                sysSchoolFormPage.setState(null);
                break;
            }
            case "未使用": {
                sysSchoolFormPage.setState("seb.VALID_START_TIME > '" + format + "'");
                break;
            }
            case "使用中": {
                sysSchoolFormPage.setState(
                        "seb.VALID_START_TIME < '" + format + "'" + " AND seb.VALID_END_TIME>" + "'" + format + "'");
                break;
            }
            case "已到期": {
                sysSchoolFormPage.setState("'" + format + "' > seb.VALID_END_TIME");
                break;
            }
            default:
                return null;
        }

        // 查询总数
        Long count = sysSchoolinforDao.getSysSchoolListCount(sysSchoolFormPage);
        // 分页查询
        List<SysSchoolinfor> sysSchoolOpenList = sysSchoolinforDao.getSysSchoolList(sysSchoolFormPage);
        return Page.PageUtil(count, pageNo, pageSize, sysSchoolOpenList);
    }

    public SysSchoolinforDao getSysSchoolinforDao() {
        return this.sysSchoolinforDao;
    }

    public void setSysSchoolinforDao(SysSchoolinforDao sysSchoolinforDao) {
        this.sysSchoolinforDao = sysSchoolinforDao;
    }

}