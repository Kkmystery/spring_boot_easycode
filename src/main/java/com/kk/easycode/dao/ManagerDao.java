package com.kk.easycode.dao;

import com.kk.easycode.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

 /**
 * @InterfaceName ManagerDao
 * @Description (Manager)表数据库访问层
 * @author makejava
 * @date 2020-03-22 10:26:42
 * @Version 1.0
 **/
@Mapper
public interface ManagerDao {

    /**
     * @Description 添加Manager
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param manager 实例对象
     * @return 影响行数
     */
    int insert(Manager manager);
    
    /**
     * @Description 删除Manager
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

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
     * @Description 修改Manager
     * @author makejava
     * @date 2020-03-22 10:26:42
     * @param 根据manager的主键修改数据
     * @return 影响行数
     */
    int update(Manager manager);

}