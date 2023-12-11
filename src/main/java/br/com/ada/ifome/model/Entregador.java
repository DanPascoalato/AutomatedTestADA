package br.com.ada.ifome.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Entregador {
    private String numeroDocumento;

    private String tipoDocumento;
    private LocalDate dataVencimentoCNH;


    public Entregador(String numeroDocumento, String tipoDocumento, LocalDate dataVencimentoCNH) {
        this.numeroDocumento = numeroDocumento;
        this.dataVencimentoCNH = dataVencimentoCNH;
        this.tipoDocumento = tipoDocumento;
    }
}