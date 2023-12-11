package br.com.ada.ifome.atividade2;


import br.com.ada.ifome.usuario.Usuario;
import br.com.ada.ifome.usuario.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/deliveryMan")
public class DeliverymanController {

    private final DeliverymanService deliverymanService;

    @PostMapping
    public ResponseEntity<DeliverymanModel> salvar(@RequestBody DeliverymanModel deliveryMan) {
        return ResponseEntity.status(201).body(deliverymanService.salvar(deliveryMan));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeliverymanModel> atualizar(@PathVariable Long id, @RequestBody DeliverymanModel deliveryMan) {
        deliveryMan.setId(id);
        return ResponseEntity.ok(deliverymanService.salvar(deliveryMan));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DeliverymanModel> remover(@PathVariable Long id) {
        return ResponseEntity.ok(deliverymanService.remover(id));
    }
}
