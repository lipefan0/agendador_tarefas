package br.com.upvisibility.agendador_tarefas.infrastructure.client;

import br.com.upvisibility.agendador_tarefas.business.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "usuarios",
        url = "${usuario.url}"
)
public interface UsuarioClient {

    @GetMapping("/usuario")
    UsuarioDTO buscarUsuarioPorEmail(
            @RequestParam("email") String email,
            @RequestHeader("Authorization") String token
    );
}
