package br.com.upvisibility.agendador_tarefas.business.dto;

import br.com.upvisibility.agendador_tarefas.infrastructure.enums.StatusNotiificacaoEnum;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTO {
    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime dataAlteracao;
    private StatusNotiificacaoEnum statusNotificacao;
}
