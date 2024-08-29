package jv.triersistemas.primeiro_projeto_java_spring.controller;

import jv.triersistemas.primeiro_projeto_java_spring.dto.TarefaDto;
import jv.triersistemas.primeiro_projeto_java_spring.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
	@Autowired
	private TarefaService tarefaService;
	
    @GetMapping
    public List<TarefaDto> getTodasTarefas() {
        return tarefaService.getTodasTarefas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaDto> getTarefaPorId(@PathVariable Long id) {
        Optional<TarefaDto> tarefa = tarefaService.findById(id);
        return tarefa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

    @PostMapping
    public TarefaDto adicionarTarefa(@RequestBody TarefaDto novaTarefa) {
        return tarefaService.adicionarTarefa(novaTarefa);
    }

    @PutMapping("/{id}")
    public TarefaDto atualizarTarefa(@PathVariable Long id, @RequestBody TarefaDto tarefaAtualizada) {
        return tarefaService.atualizarTarefa(id, tarefaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void removerTarefa(@PathVariable Long id) {
        tarefaService.removerTarefa(id);
    }
    
    
}

