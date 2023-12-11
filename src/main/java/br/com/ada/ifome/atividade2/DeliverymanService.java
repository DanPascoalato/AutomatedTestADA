package br.com.ada.ifome.atividade2;


import br.com.ada.ifome.atividade2.endereco.EnderecoRepository;
import br.com.ada.ifome.usuario.exceptions.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeliverymanService {

    private final DeliverymanRepository deliverymanRepository;
    private final EnderecoRepository enderecoRepository;

    public DeliverymanModel salvar(DeliverymanModel deliveryMan) {

        var isCpfValido = this.validaCpf(deliveryMan.getCpf());
        if (!isCpfValido) {
            throw new CpfInvalidoException();
        }
        var usuarioEncontrado = this.deliverymanRepository.findByCpf(deliveryMan.getCpf());
        if (usuarioEncontrado.isPresent()) {
            throw new CpfExistenteException();
        }

        var endereco = enderecoRepository.save(deliveryMan.getEndereco());
        deliveryMan.setEndereco(endereco);
        return deliverymanRepository.save(deliveryMan);
    }

    public List<DeliverymanModel> buscarUsuarios() {
        return this.deliverymanRepository.findAll();
    }

//    public Usuario atualizar(Usuario usuarioRequest) {
//        var usuario = deliverymanRepository.findById(usuarioRequest.getId());
//        if (usuario.isEmpty()) {
//            throw new UsuarioNaoEncontradoException();
//        }
//        return deliverymanRepository.save(usuarioRequest);
//    }

    private boolean validaCpf(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        return cpf.length() == 11;
    }

    public DeliverymanModel remover(Long id) {
        var deliverymanModel = deliverymanRepository.findById(id);
        if (deliverymanModel.isEmpty()) {
            throw new UsuarioNaoEncontradoException();
        }
        deliverymanRepository.deleteById(id);
        return deliverymanModel.get();
    }

    public void validateDeliveryMan(DeliverymanModel deliveryMan){
        if (deliveryMan == null) {
            throw new UsuarioInvalidoException();
        }

        if (deliveryMan.getId() != null) {
            throw new UsuarioExistenteException();
        }




    }
}
