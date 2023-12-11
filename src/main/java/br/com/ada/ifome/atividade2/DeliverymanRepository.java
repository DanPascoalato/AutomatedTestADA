package br.com.ada.ifome.atividade2;

import br.com.ada.ifome.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeliverymanRepository extends JpaRepository<DeliverymanModel, Long> {
    Optional<Usuario> findByCpf(String cpf);
}


