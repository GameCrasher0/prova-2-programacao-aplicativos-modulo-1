package com.company;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    String cpf;
    String nome;
    Double totalCompra;
    List<Produtos> produtos;

    void atualizaTotalCompra(){
        for(Produtos p : this.produtos){
            totalCompra =+ p.precoTotal;

        }

    }
}
