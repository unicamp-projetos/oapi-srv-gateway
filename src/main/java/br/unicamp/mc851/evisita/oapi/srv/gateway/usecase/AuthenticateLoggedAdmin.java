package br.unicamp.mc851.evisita.oapi.srv.gateway.usecase;

import br.unicamp.mc851.evisita.oapi.srv.gateway.domain.LoggedAdmin;

public interface AuthenticateLoggedAdmin {
    Boolean execute(LoggedAdmin loggedAdmin);
}
