package br.com.ada.ifome.atividade2.atividade1;

import br.com.ada.ifome.atividade2.DeliverymanModel;
import br.com.ada.ifome.model.Entregador;

import java.time.LocalDate;


public class Validator {

    public static void validarDocumento(DeliverymanModel deliverymanModel) {
        // Validar número do documento
        switch (deliverymanModel.getTipoDocumento()) {
            case "CPF":
                if (deliverymanModel.getNumeroDocumento().length() == 11) {
                    System.out.println("CPF válido.");
                } else {
                    System.out.println("CPF inválido.");
                }
                break;
            case "RG":
                if (deliverymanModel.getNumeroDocumento().length() == 7) {
                    System.out.println("RG válido.");
                } else {
                    System.out.println("RG inválido.");
                }
                break;
            case "CNH":
                if (validateCNH(deliverymanModel)) {
                    System.out.println("CNH válido.");
                } else {
                    System.out.println("CNH inválido.");
                }
                break;
            default:
                System.out.println("Tipo de documento não suportado.");
        }
    }
    public static boolean validateCNH(DeliverymanModel deliverymanModel){
        LocalDate dataAtual = LocalDate.now();
        if (deliverymanModel.getDataVencimentoCNH().isBefore(dataAtual) || !(deliverymanModel.getNumeroDocumento().length() == 11)) {
            return false;
        }
        return true;
    }

        public static void validarVeiculo(String placa, String renavam, String anoModelo) {
            // Validar a placa do veículo
            if (!placa.matches("[A-Z]{3}\\d{1}[A-Z]{1}\\d{2}")) {
                System.out.println("Placa do veículo inválida.");
            } else {
                System.out.println("Placa do veículo válida.");
            }

            // Validar o ano do modelo do veículo
            int ano = Integer.parseInt(anoModelo);
            if (ano < 2010) {
                System.out.println("Ano do modelo do veículo inválido.");
            } else {
                System.out.println("Ano do modelo do veículo válido.");
            }

            // Validar o RENAVAM do veículo
            if (!renavam.matches("\\d{11}")) {
                System.out.println("RENAVAM do veículo inválido.");
            } else {
                System.out.println("RENAVAM do veículo válido.");
            }
        }

//        public void validarContaBancaria(String numeroAgencia, String numeroConta, String tipoConta, String instituicaoBancaria) {
//            // Validar número da agência
//            if (!numeroAgencia.matches("\\d+")) {
//                System.out.println("Número da agência inválido.");
//            } else {
//                System.out.println("Número da agência válido.");
//            }
//
//            // Validar número da conta
//            if (!numeroConta.matches("\\d+")) {
//                System.out.println("Número da conta inválido.");
//            } else {
//                System.out.println("Número da conta válido.");
//            }
//
//            // Validar tipo de conta
//            String[] tiposConta = {"corrente", "poupanca"};
//            if (!tipoConta.toLowerCase().matches(String.join("|", tiposConta))) {
//                System.out.println("Tipo de conta inválido.");
//            } else {
//                System.out.println("Tipo de conta válido.");
//            }
//
//            // Validar instituição bancária
//            String[] instituicoesBancarias = {"Banco ABC", "Banco XYZ"};
//            if (!instituicaoBancaria.matches(String.join("|", instituicoesBancarias))) {
//                System.out.println("Instituição bancária inválida.");
//            } else {
//                System.out.println("Instituição bancária válida.");
//            }
//        }
}


