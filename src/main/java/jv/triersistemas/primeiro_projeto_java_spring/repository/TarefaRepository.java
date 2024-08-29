package jv.triersistemas.primeiro_projeto_java_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jv.triersistemas.primeiro_projeto_java_spring.entity.TarefaEntity;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {

}
