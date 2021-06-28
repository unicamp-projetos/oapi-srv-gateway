package br.unicamp.mc851.evisita.oapi.srv.gateway.config.security.util;

import br.unicamp.mc851.evisita.oapi.srv.gateway.domain.LoggedAdmin;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.Base64;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TokenUtil {

    public static LoggedAdmin getCurrentLoggedAdmin(String token) {
        if (!StringUtils.hasText(token)) {
            return null;
        }

        return resolveToken(token);
    }

    private static LoggedAdmin resolveToken(String token) {
        token = token.replace("Bearer ", "");
        var strings = token.split("\\.");
        var payload = new String(Base64.getDecoder().decode(strings[1]));

        var loggedAdmin = buildLoggedAdminFromJson(payload);
        loggedAdmin.setToken(token);

        return loggedAdmin;
    }

    private static LoggedAdmin buildLoggedAdminFromJson(String json) {
        if (!StringUtils.hasText(json)) {
            return null;
        }

        var objectMapper = new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule());

        try {
            return objectMapper.readValue(json, LoggedAdmin.class);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
            return null;
        }

    }
}
