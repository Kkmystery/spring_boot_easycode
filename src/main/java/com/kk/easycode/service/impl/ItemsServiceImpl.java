package com.kk.easycode.service.impl;

import com.kk.easycode.entity.Items;
import com.kk.easycode.dao.ItemsDao;
import com.kk.easycode.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Items)表服务实现类
 *
 * @author makejava
 * @since 2020-03-22 09:56:48
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Resource
    private ItemsDao itemsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Items queryById(Integer id) {
        return this.itemsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Items> queryAllByLimit(int offset, int limit) {
        return this.itemsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param items 实例对象
     * @return 实例对象
     */
    @Override
    public Items insert(Items items) {
        this.itemsDao.insert(items);
        return items;
    }

    /**
     * 修改数据
     *
     * @param items 实例对象
     * @return 实例对象
     */
    @Override
    public Items update(Items items) {
        this.itemsDao.update(items);
        return this.queryById(items.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.itemsDao.deleteById(id) > 0;
    }
}