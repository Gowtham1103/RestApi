package com.gowatr.cloudgraze.Service;

import com.gowatr.cloudgraze.Entity.CloudGraze;
import com.gowatr.cloudgraze.Repository.CgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CgService {
    @Autowired
    private CgRepository repository;

    public List<CloudGraze> getAllEntities() {
        return repository.findAll();
    }

    public CloudGraze saveEntity(CloudGraze entity) {
        return repository.save(entity);
    }


}
