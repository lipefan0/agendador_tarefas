package br.com.upvisibility.agendador_tarefas.business;

import br.com.upvisibility.agendador_tarefas.business.dto.TarefasDTO;
import br.com.upvisibility.agendador_tarefas.business.mapper.TarefaConverter;
import br.com.upvisibility.agendador_tarefas.infrastructure.enitity.Tarefas;
import br.com.upvisibility.agendador_tarefas.infrastructure.enums.StatusNotiificacaoEnum;
import br.com.upvisibility.agendador_tarefas.infrastructure.repository.TarefasRepository;
import br.com.upvisibility.agendador_tarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefasRepository tarefasRepository;
    private final TarefaConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefasa(TarefasDTO dto, String token) {
        String email = jwtUtil.extractUsername(token.substring(7));

        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacao(StatusNotiificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);

        Tarefas entity = tarefaConverter.paraTarefaEntity(dto);
        return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));

    }

}
