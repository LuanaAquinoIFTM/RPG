package br.edu.iftm.rpgjava.testes;

import br.edu.iftm.rpgjava.classes.*;

import java.util.Random;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Armadura armaduraG = new Armadura("Armadura de Gladiador", 12, 4, 20);
            Armadura armaduraA = new Armadura("Armadura Corselete de Couro", 8, 2, 25);
            Armadura armaduraM = new Armadura("Armadura Loriga segmentada", 12, 1, 12);

            Arma armaG = new Arma("Machado de Mão", 50, 70);
            Arma armaA = new Arma("Arco", 58, 90);
            Arma armaM = new Arma("Cajado", 55, 50);

            System.out.println("---Criando o Arqueiro---");
            System.out.print("Digite o nome do Arqueiro: ");
            String nomeA = entrada.next();
            Arqueiro a = new Arqueiro(nomeA,6, 25,40, 20, 5, 10, 50, 20, 10, 0, armaduraM, armaM);
            a.setArmadura(armaduraA);
            a.setArma(armaA);

            System.out.println("---Criando o Guerreiro---");
            System.out.print("Digite o nome do Guerreiro: ");
            String nomeG = entrada.next();
            Guerreiro g = new Guerreiro(nomeG,25, 10,0, 20, 5, 25, 50, 20, 10, 0);
            g.setArmadura(armaduraG);
            g.setArma(armaG);

            System.out.println("---Criando o Mago---");
            System.out.print("Digite o nome do Mago ");
            String nomeM = entrada.next();
            Mago m = new Mago(nomeM,25, 20,25, 45, 0, 40, 50, 10, 25, 45, armaduraM, armaM);
            m.setArmadura(armaduraM);
            m.setArma(armaM);


            //Lutas:

            int round  = 1;
            Random dado = new Random();

            System.out.println("Informe a inicial do personagem. Por exemplo: Guerreiro - 'G' ");
            while( (g.getVida() > 0 && a.getVida() > 0) ||(g.getVida() > 0 && m.getVida() > 0) || (a.getVida() > 0 && m.getVida() > 0)){
                System.out.println("Oponente 1: " + g.getNome());
                System.out.println("Oponente 2: " + a.getNome());
                System.out.println("Oponente 3: " + m.getNome());

                //Primeiro Turno
                System.out.println("\nRound: " + round);
                System.out.println("Primeiro jogardor: Guerreiro");
                System.out.println("Quem deseja atacar? M ou A ");
                char oponente = entrada.next().charAt(0);

                if (oponente == 'A') {

                    int valorDado = dado.nextInt(6);
                    System.out.println("Valor do dado: " + valorDado);
                    int valorAtaque = g.atacar(valorDado, a.getResistencia());
                    a.defender(valorAtaque);
                    round++;

                } else if (oponente == 'M') {

                    int valorDado = dado.nextInt(6);
                    System.out.println("Valor do dado: " + valorDado);
                    int valorAtaque = g.atacar(valorDado, m.getResistencia());
                    m.defender(valorAtaque);
                    round++;

                }

                //Segundo turno
                System.out.println("\nRound: " + round);
                System.out.println("Segundo jogardor: Arqueiro");
                System.out.println("Quem deseja atacar? G ou M ");
                oponente = entrada.next().charAt(0);

                if (oponente == 'G') {

                    int valorDado = dado.nextInt(6);
                    System.out.println("Valor do dado: " + valorDado);
                    int valorAtaque = a.atacar(valorDado, g.getResistencia());
                    g.defender(valorAtaque);
                    round++;

                } else if (oponente == 'M') {

                    int valorDado = dado.nextInt(6);
                    System.out.println("Valor do dado: " + valorDado);
                    int valorAtaque = a.atacar(valorDado, m.getResistencia());
                    m.defender(valorAtaque);
                    round++;

                }

                //Terceiro turno
                System.out.println("\nRound: " + round);
                System.out.println("Terceiro jogardor: Mago");
                System.out.println("Quem deseja atacar? A ou G ");
                oponente = entrada.next().charAt(0);

                if (oponente == 'A') {

                    int valorDado = dado.nextInt(6);
                    System.out.println("Valor do dado: " + valorDado);
                    int valorAtaque = m.atacar(valorDado, a.getResistencia());
                    a.defender(valorAtaque);
                    round++;

                } else if (oponente == 'G') {

                    int valorDado = dado.nextInt(6);
                    System.out.println("Valor do dado: " + valorDado);
                    int valorAtaque = m.atacar(valorDado, g.getResistencia());
                    g.defender(valorAtaque);
                    round++;

                }
                if(m.getVida() <= 0){
                    System.out.println(m.getNome() + " morreu!");
                    m = new Mago();
                }
                if(g.getVida() <= 0){
                    System.out.println(g.getNome() + " morreu!");
                    g = new Guerreiro();
                }
                if(a.getVida() <= 0) {
                    System.out.println(a.getNome() + " morreu!");
                    a = new Arqueiro();
                }
            }
        }
    }
}
    
        
                    
              

