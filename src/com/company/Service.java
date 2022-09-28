package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    static List<Clientes> clientList = new ArrayList<>();

    static void Service() {
        LOOPPRINCIPAL:
        while (true) {
            Scanner scannerPrincipal = new Scanner(System.in);
            Clientes clientes = new Clientes();
            Produtos produtos = new Produtos();
            //clientes.produtos.add(produtos);
            System.out.println("====================================================");
            System.out.println("Bem-vindo ao sistema da loja");
            System.out.println("Aqui você podera adicionar os produtos de um usuario");
            System.out.println("====================================================");
            System.out.println("Digite 1 para adicionar um cliente e seus produtos");
            System.out.println("Digite 2 para excluir um cliente e seus produtos");
            System.out.println("Digite 3 para saber os dados de um cliente pelo CPF");
            System.out.println("Digite 4 para mostrar todos os clientes");
            System.out.println("Digite 5 para editar a um cliente e seus produtos");
            System.out.println("Digite 6 para sair");
            System.out.println("====================================================");
            int escolhaPrincipal = scannerPrincipal.nextInt();
            if (escolhaPrincipal == 1) {
                LOOPUM:
                while (true) {
                    Scanner scannerLoopUm = new Scanner(System.in);
                    System.out.println("Entre com o nome do cliente");
                    clientes.nome = scannerLoopUm.nextLine();
                    System.out.println("Entre com o CPF do cliente");
                    clientes.cpf =scannerLoopUm.nextLine();
                    System.out.println("Gostaria de adicionar os produtos?");
                    System.out.println("Digite 1 para adicionar");
                    System.out.println("Digite 2 para sair");
                    int escolhaCliente = scannerLoopUm.nextInt();
                    if (escolhaCliente == 1){
                        LOOPPRODUTO:
                        while (true){
                            System.out.println("====================================================");
                            System.out.println("Lista de produtos");
                            System.out.println("ID - Nome - Valor");
                            System.out.println("1 - PC - $200,00");
                            System.out.println("2 - Notebook - $300,00");
                            System.out.println("3 - MAC - $5000,00");
                            System.out.println("====================================================");
                            System.out.println("Digite o ID do produto");
                            int ID = scannerLoopUm.nextInt();
                            if (ID == 1){
                                produtos.id = 1;
                                produtos.nome = "PC";
                                produtos.precoIndividual = 200.00;

                            }
                            if (ID == 2){
                                produtos.id = 2;
                                produtos.nome = "Notebook";
                                produtos.precoIndividual = 300.00;
                            }
                            if (ID == 3){
                                produtos.id = 3;
                                produtos.nome = "MAC";
                                produtos.precoIndividual = 5000.00;
                            }
                            clientes.produtos.add(produtos);
                            System.out.println("Quer adicionar mais produtos?");
                            System.out.println("Digite 1 para adicionar");
                            System.out.println("Digite 2 para sair");
                            int produtoLoop = scannerLoopUm.nextInt();
                            if (produtoLoop == 2);
                            break LOOPPRODUTO;
                        }
                    }
                    clientList.add(clientes);
                    if (escolhaCliente == 2){
                        break LOOPUM;
                    }
                }
            }
            if (escolhaPrincipal == 2) {
                LOOPDOIS:
                while (true) {
                    Scanner scannerLoopDois = new Scanner(System.in);
                    System.out.println("Digite o CPF do Cliente pra excluir seus dados");
                    Integer clienteExcluir = scannerLoopDois.nextInt();
                    for (int i = 0; i < clientList.size(); i++) {
                        if (clienteExcluir.equals(clientList.get(i).cpf)) {
                            clientList.remove(i);
                        }
                    }
                    System.out.println("Digite 1 para continuar a excluir ou 2 para sair");
                    int loopDoisSair = scannerLoopDois.nextInt();
                    if (loopDoisSair == 2) {
                        break LOOPDOIS;
                    }
                }
            }
            if (escolhaPrincipal == 3) {
                LOOPTRES:
                while (true) {
                    Scanner scannerMostrar = new Scanner(System.in);
                    System.out.println("Digite o CPF do cliente para exibir seus status");
                    Integer clienteMostrar = scannerMostrar.nextInt();
                    for (Clientes i : clientList) {
                        if (clienteMostrar.equals(i.cpf)) {
                            System.out.println("====================================");
                            System.out.println("Nome: " + i.nome);
                            System.out.println("CPF: " + i.cpf);
                            System.out.println("Lista de produtos" + i.produtos);
                            System.out.println("====================================");
                        }
                    }
                    System.out.println("Digite 1 para continuar ou 2 para sair");
                    int loopTresSair = scannerMostrar.nextInt();
                    if (loopTresSair == 2) {
                        break LOOPTRES;
                    }
                }
            }
            if (escolhaPrincipal == 4) {
                System.out.println("====================================");
                System.out.println("Lista Completa");
                for (Clientes a : clientList) {
                    System.out.println("====================================");
                    System.out.println("Nome: " + a.nome);
                    System.out.println("CPF: " + a.cpf);
                    System.out.println("Lista de produtos" + a.produtos);
                }
                System.out.println("====================================");
            }
            if (escolhaPrincipal == 5) {
                LOOPQUATRO:
                while (true) {
                    Scanner scannerEditarCliente = new Scanner(System.in);
                    System.out.println("Digite o CPF do cliente para editar seus dados");
                    Integer scannerEditar = scannerEditarCliente.nextInt();
                    for (int i = 0; i < clientList.size(); i++) {
                        if (scannerEditar.equals(clientList.get(i).cpf)) {
                            System.out.println("Digite o novo nome do cliente");
                            String novoNome = scannerEditarCliente.nextLine();
                            clientList.get(i).nome = novoNome;
                            System.out.println("Digite o novo CPF do cliente");
                            String novoCpf = scannerEditarCliente.nextLine();
                            clientList.get(i).cpf = novoCpf;
                        }
                    }
                    System.out.println("Digite 1 para continuar ou 2 para sair");
                    int loopSairQuatro = scannerEditarCliente.nextInt();
                    if (loopSairQuatro == 2) {
                        break LOOPQUATRO;
                    }
                }
            }
            if (escolhaPrincipal == 6){
                break LOOPPRINCIPAL;
            }
        }
    }
}