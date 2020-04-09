package com.kk.easycode.service;

import com.kk.easycode.entity.Items;
import java.util.List;

/**
 * (Items)表服务接口
 *
 * @author makejava
 * @since 2020-03-22 09:56:48
 */
public interface ItemsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Items queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Items> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param items 实例对象
     * @return 实例对象
     */
    Items insert(Items items);

    /**
     * 修改数据
     *
     * @param items 实例对象
     * @return 实例对象
     */
    Items update(Items items);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}