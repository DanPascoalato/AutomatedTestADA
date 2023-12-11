package br.com.ada.ifome;

import br.com.ada.ifome.model.Entregador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class IfomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfomeApplication.class, args);
	}

//	public static void main(String[] args) {
//		// Exemplo de uso
//		Entregador entregador = new Entregador("12345678901", "CPF",LocalDate.of(2023, 1, 1));
//		entregador.validarDocumento();
//		entregador.validarVeiculo("ABC1234", "12345678901", "2015");
//		entregador.validarContaBancaria("1234", "56789", "corrente", "Banco ABC");
//	}

}
