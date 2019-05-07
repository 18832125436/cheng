package com.bdqn.service;

import com.bdqn.entity.Edoc_entry;
import java.util.List;

public interface Edoc_entryService {
    /**
     * 查询全部
     * @return
     */
    List<Edoc_entry> getAll(String title, String uploaduser);

    /**
     * 根据id查询单个
     * @return
     */
    Edoc_entry getOneById(Integer id);
    /**
     * 根据id删除单个
     * @return
     */
    int delOneById(Integer id);

    /**
     * 添加
     * @param edoc_entry
     * @return
     */
    int addOne(Edoc_entry edoc_entry);

    /**
     * 修改
     * @param edoc_entry
     * @return
     */
    int updOne(Edoc_entry edoc_entry);
}
