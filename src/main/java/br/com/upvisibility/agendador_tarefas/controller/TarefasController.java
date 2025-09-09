package br.com.upvisibility.agendador_tarefas.controller;

import br.com.upvisibility.agendador_tarefas.business.TarefaService;
import br.com.upvisibility.agendador_tarefas.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tarefas")
public class TarefasController {

    private final TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<TarefasDTO> criarTarefa(
            @RequestBody TarefasDTO dto,
            @RequestHeader("Authorization") String token
    ) {
        return ResponseEntity.ok(tarefaService.gravarTarefasa(dto, token));
    }
}
