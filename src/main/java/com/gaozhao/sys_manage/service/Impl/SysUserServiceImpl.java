package com.gaozhao.sys_manage.service.Impl;
import java.util.List;

import com.gaozhao.app_common.util.Page;
import com.gaozhao.sys_manage.dao.SysUserDao;
import com.gaozhao.sys_manage.pojo.domain.SysUser;
import com.gaozhao.app_common.util.Assist;
import com.gaozhao.sys_manage.pojo.vo.SysUserFormPage;
import com.gaozhao.sys_manage.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserDao sysUserDao;
    @Override
    public long getSysUserRowCount(Assist assist){
        return sysUserDao.getSysUserRowCount(assist);
    }
    @Override
    public List<SysUser> selectSysUser(Assist assist){
        return sysUserDao.selectSysUser(assist);
    }
    @Override
    public SysUser selectSysUserByObj(SysUser obj){
        return sysUserDao.selectSysUserByObj(obj);
    }
    @Override
    public SysUser selectSysUserById(Long id){
        return sysUserDao.selectSysUserById(id);
    }
    @Override
    public int insertSysUser(SysUser value){
        return sysUserDao.insertSysUser(value);
    }
    @Override
    public int insertNonEmptySysUser(SysUser value){
        return sysUserDao.insertNonEmptySysUser(value);
    }
    @Override
    public int insertSysUserByBatch(List<SysUser> value){
        return sysUserDao.insertSysUserByBatch(value);
    }
    @Override
    public int deleteSysUserById(Long id){
        return sysUserDao.deleteSysUserById(id);
    }
    @Override
    public int deleteSysUser(Assist assist){
        return sysUserDao.deleteSysUser(assist);
    }
    @Override
    public int updateSysUserById(SysUser enti){
        return sysUserDao.updateSysUserById(enti);
    }
    @Override
    public int updateSysUser(SysUser value, Assist assist){
        return sysUserDao.updateSysUser(value,assist);
    }
    @Override
    public int updateNonEmptySysUserById(SysUser enti){
        return sysUserDao.updateNonEmptySysUserById(enti);
    }
    @Override
    public int updateNonEmptySysUser(SysUser value, Assist assist){
        return sysUserDao.updateNonEmptySysUser(value,assist);
    }

    @Override
    public Page getSysUser(SysUserFormPage sysUserFormPage) {
        Long pageNo = sysUserFormPage.getPageNo();
        Long pageSize = sysUserFormPage.getPageSize();
        sysUserFormPage.setPageNo((sysUserFormPage.getPageNo() - 1) * pageSize);
        // 查询总数
        Long count = sysUserDao.getSysUserListCount(sysUserFormPage);
        // 分页查询
        List<SysUser> sysUserList = sysUserDao.getSysUserList(sysUserFormPage);
        return Page.PageUtil(count, pageNo, pageSize, sysUserList);
    }

    public SysUserDao getSysUserDao() {
        return this.sysUserDao;
    }

    public void setSysUserDao(SysUserDao sysUserDao) {
        this.sysUserDao = sysUserDao;
    }

}