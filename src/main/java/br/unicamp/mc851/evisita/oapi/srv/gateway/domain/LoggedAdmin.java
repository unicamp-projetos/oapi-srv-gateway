package br.unicamp.mc851.evisita.oapi.srv.gateway.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggedAdmin {
    private String name;
    private String password;
    private String token;
}
