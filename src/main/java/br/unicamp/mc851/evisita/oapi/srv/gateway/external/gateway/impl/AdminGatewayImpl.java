package br.unicamp.mc851.evisita.oapi.srv.gateway.external.gateway.impl;

import br.unicamp.mc851.evisita.oapi.srv.gateway.domain.LoggedAdmin;
import br.unicamp.mc851.evisita.oapi.srv.gateway.external.gateway.AdminGateway;
import br.unicamp.mc851.evisita.oapi.srv.gateway.external.gateway.client.AdminClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminGatewayImpl implements AdminGateway {

    private final AdminClient client;

    @Override
    public ResponseEntity<Object> authenticateLoggedUser(LoggedAdmin loggedAdmin) {
        return client.login(loggedAdmin.getToken());
    }
}
