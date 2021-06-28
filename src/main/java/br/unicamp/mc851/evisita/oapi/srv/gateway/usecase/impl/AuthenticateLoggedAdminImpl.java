package br.unicamp.mc851.evisita.oapi.srv.gateway.usecase.impl;

import br.unicamp.mc851.evisita.oapi.srv.gateway.domain.LoggedAdmin;
import br.unicamp.mc851.evisita.oapi.srv.gateway.external.gateway.AdminGateway;
import br.unicamp.mc851.evisita.oapi.srv.gateway.usecase.AuthenticateLoggedAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticateLoggedAdminImpl implements AuthenticateLoggedAdmin {

    private final AdminGateway gateway;

    @Override
    public Boolean execute(LoggedAdmin loggedAdmin) {
        return gateway.authenticateLoggedUser(loggedAdmin).getStatusCode().is2xxSuccessful();
    }
}
