package br.unicamp.mc851.evisita.oapi.srv.gateway.config.security.util;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggedAdminInfo {
}
