package br.unicamp.mc851.evisita.oapi.srv.gateway.external.gateway.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "adminService", url = "${oapi.srv.admin}")
public interface AdminClient {

    @PostMapping("/login")
    ResponseEntity<Object> login(@RequestHeader("Authorization") String token);
}
