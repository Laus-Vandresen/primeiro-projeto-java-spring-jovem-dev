package jv.triersistemas.primeiro_projeto_java_spring.service.impl;

import jv.triersistemas.primeiro_projeto_java_spring.dto.CategoriaDto;
import jv.triersistemas.primeiro_projeto_java_spring.entity.CategoriaEntity;
import jv.triersistemas.primeiro_projeto_java_spring.repository.CategoriaRepository;
import jv.triersistemas.primeiro_projeto_java_spring.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    @Override
    public CategoriaDto salvarCategoria(CategoriaDto categoriaDto) {
        CategoriaEntity entidadePersistida = repository.save(new CategoriaEntity(categoriaDto));
        return new CategoriaDto(entidadePersistida);
    }
}
