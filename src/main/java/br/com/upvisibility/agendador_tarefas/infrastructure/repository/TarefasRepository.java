package br.com.upvisibility.agendador_tarefas.infrastructure.repository;

import br.com.upvisibility.agendador_tarefas.infrastructure.enitity.Tarefas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<Tarefas, String> {
}
