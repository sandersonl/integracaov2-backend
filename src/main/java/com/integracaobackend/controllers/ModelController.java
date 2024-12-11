package com.integracaobackend.controllers;

import com.integracaobackend.entity.Model;
import com.integracaobackend.repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ModelController {

    @Autowired
    ModelRepository modelRepository;

    @GetMapping("/models")
    public List<Model> models() {
        return modelRepository.findAll();
    }

    @GetMapping("/models/{id}")
    public Model modelById(@PathVariable(value = "id") int id){
        return modelRepository.findById(id);
    }

    @GetMapping("/models/category/id/{id}")
    public List<Model> modelByCategoryId(@PathVariable(value = "id") int id) {
        return modelRepository.findAll().stream().filter(model -> model.getCategory().getId() == id).collect(Collectors.toList());
    }

    @GetMapping("/models/category/{name}")
    public List<Model> modelByCategoryName(@PathVariable(value = "name") String name) {
        return modelRepository.findAll().stream().filter(model -> model.getCategory().getName().equals(name)).collect(Collectors.toList());
    }

//    @GetMapping("/models/category/line/{name}")
//    public List<Model> modelByLineName(@PathVariable(value = "name") String name) {
//        return modelRepository.findAll().stream().filter(model -> model.getCategory().getLine().getName().equals(name)).collect(Collectors.toList());
//    }
}
