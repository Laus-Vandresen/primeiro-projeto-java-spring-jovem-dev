package jv.triersistemas.primeiro_projeto_java_spring.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jv.triersistemas.primeiro_projeto_java_spring.dto.TarefaDto;
import jv.triersistemas.primeiro_projeto_java_spring.service.TarefaService;

@Service
public class TarefaServiceImpl implements TarefaService {
	
	private static List<TarefaDto> tarefas = new ArrayList<>();
    private static Long contadorId = 1L;
    
	@Override
	public List<TarefaDto> getTodasTarefas() {
		return tarefas;
	}
	
	@Override
	public Optional<TarefaDto> findById(Long id) {
    	return tarefas.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

	@Override
	public TarefaDto adicionarTarefa(TarefaDto novaTarefa) {
		novaTarefa.setId(contadorId++);
        tarefas.add(novaTarefa);
        return novaTarefa;
	}

	@Override
	public TarefaDto atualizarTarefa(Long id, TarefaDto tarefaAtualizada) {
		Optional<TarefaDto> tarefa = findById(id);
        if (tarefa.isPresent()) {
            tarefa.get().setTitulo(tarefaAtualizada.getTitulo());
            tarefa.get().setDescricao(tarefaAtualizada.getDescricao());
            tarefa.get().setCompleta(tarefaAtualizada.isCompleta());
            return tarefa.get();
        }
        return null;
	}

	@Override
	public void removerTarefa(Long id) {
		tarefas.removeIf(t -> t.getId().equals(id));
	}
	

}
