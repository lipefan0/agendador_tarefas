package br.com.upvisibility.agendador_tarefas.infrastructure.repository;

import br.com.upvisibility.agendador_tarefas.infrastructure.enitity.Tarefas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TarefasRepository extends MongoRepository<Tarefas, String> {
    List<Tarefas> findByDataEventoBetween(LocalDateTime dataInicio, LocalDateTime dataFim);

    List<Tarefas> findTarefasByEmailUsuario(String emailUsuario);
}
