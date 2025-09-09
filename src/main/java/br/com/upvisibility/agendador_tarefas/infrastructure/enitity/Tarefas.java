package br.com.upvisibility.agendador_tarefas.infrastructure.enitity;

import br.com.upvisibility.agendador_tarefas.infrastructure.enums.StatusNotiificacaoEnum;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("tarefas")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tarefas {
    @Id
    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime dataAlteracao;
    private StatusNotiificacaoEnum statusNotificacao;
}
