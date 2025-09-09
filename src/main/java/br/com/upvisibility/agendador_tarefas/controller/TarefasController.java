package br.com.upvisibility.agendador_tarefas.controller;

import br.com.upvisibility.agendador_tarefas.business.TarefaService;
import br.com.upvisibility.agendador_tarefas.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<TarefasDTO>> buscarTarefasPorEmail(
            @RequestHeader("Authorization") String token
    ) {
        return ResponseEntity.ok(tarefaService.buscarTarefasPorEmail(token));
    }

    @GetMapping("/eventos")
    public ResponseEntity<List<TarefasDTO>> buscarListaTarefasPorPeriodo(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)LocalDateTime dataInicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)LocalDateTime dataFim
    ) {
        return ResponseEntity.ok(tarefaService.buscaTarefasPorPeriodo(dataInicio, dataFim));
    }
}
