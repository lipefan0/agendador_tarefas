package br.com.upvisibility.agendador_tarefas.business.mapper;


import br.com.upvisibility.agendador_tarefas.business.dto.TarefasDTO;
import br.com.upvisibility.agendador_tarefas.infrastructure.enitity.Tarefas;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaConverter {

    Tarefas paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(Tarefas entity);

    List<Tarefas> paraTarefaEntityList(List<TarefasDTO> dtoList);

    List<TarefasDTO> paraTarefaDTOList(List<Tarefas> entityList);
}
