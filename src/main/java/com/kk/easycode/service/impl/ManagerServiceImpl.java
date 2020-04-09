package com.kk.easycode.service.impl;

import com.kk.easycode.entity.Manager;
import com.kk.easycode.dao.ManagerDao;
import com.kk.easycode.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

 /**
 * @ClassName ManagerServiceImpl
 * @Description (Manager)表服务实现类
 * @author makejava
 * @date 2020-03-22 10:26:42
 * @Version 1.0
 **/
@Service("managerService")
public class ManagerServiceImpl  implements ManagerService {

    @Resource
    protected ManagerDao managerDao;

    /**
     * @Description 添加Manager
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param manager 实例对象
     * @return 是否成功
     */
    @Override
    public boolean insert(Manager manager) {
        if(managerDao.insert(manager) == 1){
            return true;
        }
        return false;
    }

    /**
     * @Description 删除Manager
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        if(managerDao.deleteById(id) == 1){
            return true;
        }
        return false;
    }

    /**
     * @Description 查询单条数据
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Manager queryById(Integer id) {
        return managerDao.queryById(id);
    }

    /**
     * @Description 查询全部数据
     * @author makejava
     * @date 2020-03-22 10:26:42
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    @Override
    public List<Manager> queryAll() {
        return managerDao.queryAll();
    }

    /**
     * @Description 实体作为筛选条件查询数据
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param manager 实例对象
     * @return 对象列表
     */
    @Override
    public List<Manager> queryAll(Manager manager) {
        return managerDao.queryAll(manager);
    }

    /**
     * @Description 修改数据，哪个属性不为空就修改哪个属性
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param manager 实例对象
     * @return 是否成功
     */
    @Override
    public boolean update(Manager manager) {
        if(managerDao.update(manager) == 1){
            return true;
        }
        return false;
    }

}