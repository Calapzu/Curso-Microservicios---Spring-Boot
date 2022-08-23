package com.usuario.service.feignclients;

import com.usuario.service.modelos.Carro;
import com.usuario.service.modelos.Moto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="carro-service")
@RequestMapping("/carro")
public interface CarroFeignClients {
    @PostMapping()
    public Carro save(@RequestBody Carro carro);

    @GetMapping("/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);

}
