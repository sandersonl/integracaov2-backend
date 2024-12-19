package com.integracaobackend.controllers;

import com.integracaobackend.entity.Model;
import com.integracaobackend.repositories.IModelRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "API REST Modelos")
@CrossOrigin(value = "*")
public class ModelController {

    @Autowired
    IModelRepository IModelRepository;

    @GetMapping("/models")
    @ApiOperation(value = "Retorna uma lista de modelos")
    public List<Model> listModel() {
        return IModelRepository.findAll();
    }

    @GetMapping("/model/{id}")
    @ApiOperation(value = "Retorna um modelo com o ID solicitado")
    public Model modelById(@PathVariable(value = "id") int id){
        return IModelRepository.findById(id);
    }

    @PostMapping("/model")
    @ApiOperation(value = "Salva um modelo")
    public Model saveModel(@RequestBody Model model) {
        return IModelRepository.save(model);
    }

    @DeleteMapping("/model")
    @ApiOperation(value = "Deleta um modelo")
    public void deleteModel(@RequestBody Model model) {
        IModelRepository.delete(model);
    }

    @PutMapping("/model")
    @ApiOperation(value = "Atualiza um modelo")
    public Model updateModel(@RequestBody Model model) {
        return IModelRepository.save(model);
    }

}
