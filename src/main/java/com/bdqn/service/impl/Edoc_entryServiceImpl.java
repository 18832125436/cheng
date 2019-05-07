package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.Edoc_entryDao;
import com.bdqn.entity.Edoc_entry;
import com.bdqn.service.Edoc_entryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class Edoc_entryServiceImpl extends BaseServiceImpl implements Edoc_entryService {

    @Resource
    private Edoc_entryDao edoc_entryDao;


    @Override
    public List<Edoc_entry> getAll(String title, String uploaduser) {
        return edoc_entryDao.getAll(title,uploaduser);
    }

    @Override
    public Edoc_entry getOneById(Integer id) {
        return edoc_entryDao.getOneById(id);
    }

    @Override
    public int delOneById(Integer id) {
        return edoc_entryDao.delOneById(id);
    }

    @Override
    public int addOne(Edoc_entry edoc_entry) {
        return edoc_entryDao.addOne(edoc_entry);
    }

    @Override
    public int updOne(Edoc_entry edoc_entry) {
        return edoc_entryDao.updOne(edoc_entry);
    }
}
