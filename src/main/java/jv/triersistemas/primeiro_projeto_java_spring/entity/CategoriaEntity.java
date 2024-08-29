package jv.triersistemas.primeiro_projeto_java_spring.entity;

import jakarta.persistence.*;
import jv.triersistemas.primeiro_projeto_java_spring.dto.CategoriaDto;
import jv.triersistemas.primeiro_projeto_java_spring.enuns.PrioridadeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Enumerated(EnumType.ORDINAL)
    private PrioridadeEnum prioridadeEnum;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<TarefaEntity> tarefas;

    public CategoriaEntity(CategoriaDto dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.descricao = dto.getDescricao();
        this.prioridadeEnum = dto.getPrioridadeEnum();
    }
}
