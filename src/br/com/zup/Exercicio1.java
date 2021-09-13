package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1 {

    // Crie um programa para gerenciar uma lista de produtos de um estabelecimento, cada produto tem um nome e um preço. No final do programa, o usuário deve decidir se irá adicionar mais de um produto, exibir todos os produtos cadastrados ou excluir um produto pelo nome.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        Boolean repetirAdd = true;
        String nomeProduto;
        String precoProduto;
        String confirmarAdd;
        String confirmarVer;
        String confirmarRemover;
        String produtoRemovido;

        // HashMap
        Map<String, String> listaProdutos = new HashMap<String, String>();

        // Primeira parte do console
        System.out.println("Este programa irá gerenciar uma lista de produtos com nome e preço");

        // Inserindo produtos
        while (repetirAdd){
            System.out.println("Qual é o produto que você deseja adicionar?");
            nomeProduto = leitor.nextLine();
            System.out.println("Quanto custa esse produto?");
            precoProduto = leitor.nextLine();
            listaProdutos.put(nomeProduto, nomeProduto + " R$" + precoProduto);
            System.out.println("Produto adicionado.");
            System.out.println("Deseja adicionar mais algum produto? Responda com Sim ou Não");
            confirmarAdd = leitor.next();
            leitor.nextLine();
            if (confirmarAdd.equalsIgnoreCase("não")){
                repetirAdd = false;
                System.out.println("Deseja visualizar a lista de produtos? Responda com Sim ou Não");
                confirmarVer = leitor.next();
                if (confirmarVer.equalsIgnoreCase("sim")){
                    for (String mostrarTudo : listaProdutos.values()){
                        System.out.println(mostrarTudo);
                    }
                }
                System.out.println("Deseja remover algum produto? Responda com Sim ou Não");
                confirmarRemover = leitor.next();
                System.out.println("Qual o nome do produto que deseja remover?");
                leitor.nextLine();
                produtoRemovido = leitor.nextLine();
                if (listaProdutos.containsKey(produtoRemovido)){
                    listaProdutos.remove(produtoRemovido);
                    System.out.println(listaProdutos);
                }
            }
            else {
            }
        }


    }
}
