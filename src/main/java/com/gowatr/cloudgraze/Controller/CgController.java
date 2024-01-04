package com.gowatr.cloudgraze.Controller;

import com.gowatr.cloudgraze.Entity.CloudGraze;
import com.gowatr.cloudgraze.Service.CgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController


public class CgController {
    @Autowired
    private CgService service;

    @PostMapping("/post")
    public CloudGraze saveEntity(@RequestBody CloudGraze entity) {
        return service.saveEntity(entity);
    }
    @GetMapping("/cg.spring")
    public List<CloudGraze> getAllEntities() {
        return service.getAllEntities();
    }



}
