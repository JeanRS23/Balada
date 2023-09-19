package br.senai.sp.balada;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Balada {
    public static void main(String[] args) {


        String nome, nome2;
        long cpf, cpf2;
        long rg, rg2;
        int idade = 0, idade2 =0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf = teclado.nextLong();
        System.out.println("Digite seu RG: ");
        rg = teclado.nextLong();
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();

        while (idade==0) {

            if (teclado.hasNextInt()) {
                idade = teclado.nextInt();
            } else {
                System.out.println("Digite um inteiro!");
                teclado.next();
            }
        }

        if (idade >= 18 && idade %2 == 0) {
            System.out.println("Entrada autorizada!");
        } else if (idade >= 18 && idade %2 != 0) {

            System.out.println("Qual seu nome Acompanhante: ");
            nome2 = teclado.next();
            System.out.println("Digite seu CPF Acompanhante: ");
            cpf2 = teclado.nextLong();
            System.out.println("Digite seu RG Acompanhante: ");
            rg2 = teclado.nextLong();
            System.out.println("Digite sua idade Acompanhante: ");
            idade2 = teclado.nextInt();

        } else {
            System.out.println("Proibido a entrada de menores!");
        }

        if ((idade+idade2)%2==0){
            System.out.println("Entrem na balada!");
        } else{
            System.out.println("Não autorizamos sua entrada!");
        }



        /** Informações */

        System.out.println("---------------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Idade: " + idade);


    }


    }


