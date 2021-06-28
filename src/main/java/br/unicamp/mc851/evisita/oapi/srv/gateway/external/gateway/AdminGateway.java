package br.unicamp.mc851.evisita.oapi.srv.gateway.external.gateway;

import br.unicamp.mc851.evisita.oapi.srv.gateway.domain.LoggedAdmin;
import org.springframework.http.ResponseEntity;

public interface AdminGateway {
    ResponseEntity<Object> authenticateLoggedUser(LoggedAdmin loggedAdmin);
}
