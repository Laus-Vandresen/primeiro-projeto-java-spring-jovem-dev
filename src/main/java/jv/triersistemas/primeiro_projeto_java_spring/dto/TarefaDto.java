package jv.triersistemas.primeiro_projeto_java_spring.dto;

import jv.triersistemas.primeiro_projeto_java_spring.entity.TarefaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TarefaDto {
	private Long id;
    private String titulo;
    private String descricao;
    private Boolean completa;
    
    public TarefaDto(TarefaEntity entity) {
    	this.id = entity.getId();
    	this.titulo = entity.getTitulo();
    	this.descricao = entity.getDescricao();
    	this.completa = entity.getCompleta();
    }
}
