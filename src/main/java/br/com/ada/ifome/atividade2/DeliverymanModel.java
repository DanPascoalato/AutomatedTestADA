package br.com.ada.ifome.atividade2;

import br.com.ada.ifome.atividade2.endereco.Endereco;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class DeliverymanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true, nullable = false)
    private String cpf;
    private String email;
    @OneToOne
    private Endereco endereco;
    private String placa;
    private String renavam;
    private String anoModelo;
    private String numeroDocumento;
    private String tipoDocumento;
    private LocalDate dataVencimentoCNH;

}

