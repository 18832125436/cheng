package com.bdqn.dao;

import com.bdqn.entity.Edoc_entry;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Edoc_entryDao {
    /**
     * 查询全部
     * @return
     */
    List<Edoc_entry> getAll(@Param("title") String title,@Param("uploaduser") String uploaduser);

    /**
     * 根据id查询单个
     * @return
     */
    Edoc_entry getOneById(@Param("id") Integer id);
    /**
     * 根据id删除单个
     * @return
     */
    int delOneById(@Param("id") Integer id);

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
