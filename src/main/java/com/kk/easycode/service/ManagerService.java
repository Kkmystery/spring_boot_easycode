package com.kk.easycode.service;

import com.kk.easycode.entity.Manager;
import java.util.List;

/**
 * @InterfaceName ManagerService
 * @Description (Manager)表服务接口
 * @author makejava
 * @date 2020-03-22 10:26:42
 * @Version 1.0
 **/
public interface ManagerService {

    /**
     * @Description 添加Manager
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param manager 实例对象
     * @return 是否成功
     */
    boolean insert(Manager manager);

    /**
     * @Description 删除Manager
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * @Description 查询单条数据
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param id 主键
     * @return 实例对象
     */
    Manager queryById(Integer id);

    /**
     * @Description 查询全部数据
     * @author makejava
     * @date 2020-03-22 10:26:42
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Manager> queryAll();

    /**
     * @Description 实体作为筛选条件查询数据
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param manager 实例对象
     * @return 对象列表
     */
    List<Manager> queryAll(Manager manager);

    /**
     * @Description 修改数据，哪个属性不为空就修改哪个属性
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param manager 实例对象
     * @return 是否成功
     */
    boolean update(Manager manager);

}