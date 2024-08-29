package jv.triersistemas.primeiro_projeto_java_spring.controller;

import jv.triersistemas.primeiro_projeto_java_spring.dto.CategoriaDto;
import jv.triersistemas.primeiro_projeto_java_spring.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public CategoriaDto salvarCategoria(@RequestBody CategoriaDto categoriaDto) {
        return categoriaService.salvarCategoria(categoriaDto);
    }
}
