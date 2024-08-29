package jv.triersistemas.primeiro_projeto_java_spring.repository;

import jv.triersistemas.primeiro_projeto_java_spring.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
}
