package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.entity.Edoc_entry;
import com.bdqn.service.Edoc_entryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class Edoc_entryController extends BaseController {
    @Resource
    private Edoc_entryService edoc_entryService;

    @PostMapping("/getAll")
    public String getAll(String title,String uploaduser){
        List<Edoc_entry> list = edoc_entryService.getAll(title,uploaduser);
        return dealQueryResult(list,list);
    }

    @PostMapping("/getOneById")
    public String getOneById(Integer id){
        Edoc_entry membersinfo = edoc_entryService.getOneById(id);
        return dealQueryResult(membersinfo,membersinfo);
    }

    @PostMapping("/addOne")
    public String addOne(Edoc_entry edoc_entry){
        int result = edoc_entryService.addOne(edoc_entry);
        return dealSuccessResult("增加成功",result);
    }

    @PostMapping("/updOne")
    public String updOne(Edoc_entry edoc_entry){
        int result = edoc_entryService.updOne(edoc_entry);
        return dealSuccessResult("修改成功",result);
    }

    @PostMapping("/delOneById")
    public String delOneById(Integer id){
        int result = edoc_entryService.delOneById(id);
        return dealSuccessResult("删除成功",result);
    }
}
