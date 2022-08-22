package com.usuario.service.modelos;

import lombok.Getter;
import lombok.Setter;

public class Moto {

    public Moto(){
        super();
    }

    @Getter @Setter
    private String marca;

    @Getter @Setter
    private String modelo;

    @Getter @Setter
    private int usuarioId;
}
