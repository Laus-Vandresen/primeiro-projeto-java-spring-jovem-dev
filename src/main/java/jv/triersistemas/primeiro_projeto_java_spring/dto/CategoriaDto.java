package jv.triersistemas.primeiro_projeto_java_spring.dto;

import jakarta.persistence.*;
import jv.triersistemas.primeiro_projeto_java_spring.entity.CategoriaEntity;
import jv.triersistemas.primeiro_projeto_java_spring.entity.TarefaEntity;
import jv.triersistemas.primeiro_projeto_java_spring.enuns.PrioridadeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CategoriaDto {

    private Long id;
    private String nome;
    private String descricao;
    private PrioridadeEnum prioridadeEnum;

    public CategoriaDto(CategoriaEntity categoriaEntity) {
        this.id = categoriaEntity.getId();
        this.nome = categoriaEntity.getNome();
        this.descricao = categoriaEntity.getDescricao();
        this.prioridadeEnum = categoriaEntity.getPrioridadeEnum();
    }
}
