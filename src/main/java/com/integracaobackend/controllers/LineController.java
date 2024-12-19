package com.integracaobackend.controllers;

import com.integracaobackend.entity.Line;
import com.integracaobackend.repositories.ILineRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "API REST Linhas")
@CrossOrigin(origins = "*")
public class LineController {

    @Autowired
    ILineRepository ILineRepository;

    @GetMapping("/lines")
    @ApiOperation(value = "Retorna uma lista de linhas")
    public List<Line> listLine() {
        return ILineRepository.findAll();
    }

    @RequestMapping("/line/{id}")
    @ApiOperation(value = "Retorna uma linha com o ID solicitado")
    public Line lineById(@PathVariable(value = "id") int id) {
        return ILineRepository.findById(id);
    }

    @PostMapping("/line")
    @ApiOperation(value = "Salva uma linha")
    public Line saveLine(@RequestBody Line line) {
        return ILineRepository.save(line);
    }

    @DeleteMapping("/line")
    @ApiOperation(value = "Deleta uma linha")
    public void deleteLine(@RequestBody Line line) {
        ILineRepository.delete(line);
    }

    @PutMapping("/line")
    @ApiOperation(value = "Atualiza uma linha")
    public Line updateLine(@RequestBody Line line) {
        return ILineRepository.save(line);
    }

}
