package com.mycompany.aula12;

import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mamifero m = new Mamifero();
        System.out.print("Digite a cor do pelo do mamífero:\n>>> ");
        m.setCorPelo(input.nextLine());
        System.out.print("Digite o peso do mamífero:\n>>> ");
        m.setPeso(input.nextFloat());
        m.alimentar();
        m.emetirSom();
        m.locomover();
        System.out.println(m.toString());

        Reptil r = new Reptil();
        input.nextLine(); 
        System.out.print("Digite a cor da escama do réptil:\n>>> ");
        r.setCorEscama(input.nextLine());
        System.out.print("Digite a idade do réptil:\n>>> ");
        r.setIdade(input.nextInt());
        System.out.print("Digite o número de membros do réptil:\n>>> ");
        r.setMembros(input.nextInt());
        System.out.print("Digite o peso do réptil:\n>>> ");
        r.setPeso(input.nextFloat());
        r.alimentar();
        r.emetirSom();
        r.locomover();
        System.out.println(r.toString());

        Peixe p = new Peixe();
        input.nextLine(); 
        System.out.print("Digite a cor da escama do peixe:\n>>> ");
        p.setCorEscama(input.nextLine());
        System.out.print("Digite a idade do peixe:\n>>> ");
        p.setIdade(input.nextInt());
        System.out.print("Digite o número de membros do peixe:\n>>> ");
        p.setMembros(input.nextInt());
        System.out.print("Digite o peso do peixe:\n>>> ");
        p.setPeso(input.nextFloat());
        p.soltarBolha();
        p.alimentar();
        p.emetirSom();
        p.locomover();
        System.out.println(p.toString());

        Ave a = new Ave();
        input.nextLine(); 
        System.out.print("Digite a cor da pena da ave:\n>>> ");
        a.setCorPena(input.nextLine());
        System.out.print("Digite a idade da ave:\n>>> ");
        a.setIdade(input.nextInt());
        System.out.print("Digite o número de membros da ave:\n>>> ");
        a.setMembros(input.nextInt());
        System.out.print("Digite o peso da ave:\n>>> ");
        a.setPeso(input.nextFloat());
        a.alimentar();
        a.emetirSom();
        a.fazendoNinho();
        a.locomover();
        System.out.println(a.toString());

        Canguru c = new Canguru();
        c.usarBolsa();
        c.locomover();
        System.out.println(c.toString());

        Cachorro k = new Cachorro();
        k.locomover();
        k.emetirSom();
        System.out.println(k.toString());

        Cobra o = new Cobra();
        System.out.println(o.toString());

        Tartaruga t = new Tartaruga();
        System.out.println(t.toString());

        Goldfish g = new Goldfish();
        System.out.println(g.toString());

        Arara w = new Arara();
        System.out.println(w.toString());

        input.close();
    }
}
