package br.edu.iftm.rpgjava.teste;

import java.util.Random;
import java.util.Scanner;

import br.edu.iftm.rpgjava.classes.Arma;
import br.edu.iftm.rpgjava.classes.Armadura;
import br.edu.iftm.rpgjava.classes.Arqueiro;
import br.edu.iftm.rpgjava.classes.Guerreiro;
import br.edu.iftm.rpgjava.classes.Mago;

public class Principal2 {
    
    public static void main(String[] args, String string, String string2) {
        Scanner entrada = new Scanner(System.in); 
            System.out.println("-Crie três personagens para o RPG!!!");
        
            System.out.println("-Informe qual personagem você deseja escolher (Guerreiro, Mago ou Arqueiro.");
            System.out.print(" Personagem 1: ");
            String personagem1 = entrada.nextLine();
            
            Arma arma = new Arma();
            Armadura armadura = new Armadura();
            
            //Atributos da classe Guerreiro//
            if(personagem1 == "Guerreiro" ){
                Guerreiro g = new Guerreiro();
                System.out.print("Informe o nome do Guerreiro: ");
                String nomeP1 = entrada.next();
                g.setNome(nomeP1);

                System.out.print("Informe o valor da força do Guerreiro: ");
                int forcaP1 = entrada.nextInt();
                g.setForca(forcaP1);

                System.out.print("Informe o valor da destreza do Guerreiro: ");
                int destrezaP1 = entrada.nextInt();
                g.setDestreza(destrezaP1);

                System.out.print("Informe o valor da agilidade do Guerreiro: ");
                int agilidadeP1 = entrada.nextInt();
                g.setAgilidade(agilidadeP1);

                System.out.print("Informe o valor inteligência do Guerreiro: ");
                int inteligenciaP1 = entrada.nextInt();
                g.setInteligencia(inteligenciaP1);

                System.out.print("Informe o valor do carisma do Guerreiro:  ");
                int carismaP1 = entrada.nextInt();
                g.setCarisma(carismaP1);

                System.out.print("Informe o valor da resistência do Guerreiro: ");
                int resistenciaP1 = entrada.nextInt();
                g.setResistencia(resistenciaP1);

                System.out.print("Informe o valor da vida do Guerreiro: ");
                int vidaP1 = entrada.nextInt();
                g.setVida(vidaP1);

                System.out.print("Informe o valor da estamina do Guerreiro: ");
                int estaminaP1 = entrada.nextInt();
                g.setEstamina(estaminaP1);

                System.out.print("Informe o valor da sorte do Guerreiro: ");
                int sorteP1 = entrada.nextInt();
                g.setSorte(sorteP1);

                System.out.print("Informe o valor da mana do Guerreiro:");
                int manaP1 = entrada.nextInt();
                g.setMana(manaP1);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP1 = entrada.nextLine();
                arma.setNome(armaP1);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP1 = entrada.nextInt();
                arma.setDano(danoP1);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeP1 = entrada.nextInt();
                arma.setDurabilidade(durabilidadeP1);

                g.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP1 = entrada.next();
                armadura.setNome(armaduraP1);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP1 = entrada.nextInt();
                armadura.setPeso(pesoP1);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP1 = entrada.nextInt();
                armadura.setDefesa(defesaP1);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeAp1g = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeAp1g);

                g.setArmadura(armadura);

            }if(personagem1 == "Mago"){
                Mago m = new Mago();
                System.out.print("Informe o nome do Mago: ");
                String nomeP1m = entrada.next();
                m.setNome(nomeP1m);

                System.out.print("Informe o valor da força do Mago: ");
                int forcaP1m = entrada.nextInt();
                m.setForca(forcaP1m);

                System.out.print("Informe o valor da destreza do Mago: ");
                int destrezaP1m = entrada.nextInt();
                m.setDestreza(destrezaP1m);

                System.out.print("Informe o valor da agilidade do Mago: ");
                int agilidadeP1m = entrada.nextInt();
                m.setAgilidade(agilidadeP1m);

                System.out.print("Informe o valor inteligência do Mago: ");
                int inteligenciaP1m = entrada.nextInt();
                m.setInteligencia(inteligenciaP1m);

                System.out.print("Informe o valor do carisma do Mago:  ");
                int carismaP1m = entrada.nextInt();
                m.setCarisma(carismaP1m);

                System.out.print("Informe o valor da resistência do Mago: ");
                int resistenciaP1m = entrada.nextInt();
                m.setResistencia(resistenciaP1m);

                System.out.print("Informe o valor da vida do Mago: ");
                int vidaP1m = entrada.nextInt();
                m.setVida(vidaP1m);

                System.out.print("Informe o valor da estamina do Mago: ");
                int estaminaP1m = entrada.nextInt();
                m.setEstamina(estaminaP1m);

                System.out.print("Informe o valor da sorte do Mago: ");
                int sorteP1m = entrada.nextInt();
                m.setSorte(sorteP1m);

                System.out.print("Informe o valor da mana do Mago:");
                int manaP1m = entrada.nextInt();
                m.setMana(manaP1m);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP1m = entrada.nextLine();
                arma.setNome(armaP1m);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP1m = entrada.nextInt();
                arma.setDano(danoP1m);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeP1m = entrada.nextInt();
                arma.setDurabilidade(durabilidadeP1m);

                m.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP1m = entrada.next();
                armadura.setNome(armaduraP1m);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP1m = entrada.nextInt();
                armadura.setPeso(pesoP1m);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP1m = entrada.nextInt();
                armadura.setDefesa(defesaP1m);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeAp1m = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeAp1m);

                m.setArmadura(armadura);

            }if(personagem1 == "Arqueiro"){
                Arqueiro a = new Arqueiro(); 
                System.out.print("Informe o nome do Arqueiro: ");
                String nomeP1a = entrada.next();
                a.setNome(nomeP1a);

                System.out.print("Informe o valor da força do Arqueiro: ");
                int forcaP1a = entrada.nextInt();
                a.setForca(forcaP1a);

                System.out.print("Informe o valor da destreza do Arqueiro: ");
                int destrezaP1a = entrada.nextInt();
                a.setDestreza(destrezaP1a);

                System.out.print("Informe o valor da agilidade do Arqueiro: ");
                int agilidadeP1a = entrada.nextInt();
                a.setAgilidade(agilidadeP1a);

                System.out.print("Informe o valor inteligência do Arqueiro: ");
                int inteligenciaP1a = entrada.nextInt();
                a.setInteligencia(inteligenciaP1a);

                System.out.print("Informe o valor do carisma do Arqueiro:  ");
                int carismaP1a = entrada.nextInt();
                a.setCarisma(carismaP1a);

                System.out.print("Informe o valor da resistência do Arqueiro: ");
                int resistenciaP1a = entrada.nextInt();
                a.setResistencia(resistenciaP1a);

                System.out.print("Informe o valor da vida do Arqueiro: ");
                int vidaP1a = entrada.nextInt();
                a.setVida(vidaP1a);

                System.out.print("Informe o valor da estamina do Arqueiro: ");
                int estaminaP1a = entrada.nextInt();
                a.setEstamina(estaminaP1a);

                System.out.print("Informe o valor da sorte do Arqueiro: ");
                int sorteP1a = entrada.nextInt();
                a.setSorte(sorteP1a);

                System.out.print("Informe o valor da mana do Arqueiro:");
                int manaP1a = entrada.nextInt();
                a.setMana(manaP1a);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP1a = entrada.nextLine();
                arma.setNome(armaP1a);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP1a = entrada.nextInt();
                arma.setDano(danoP1a);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeP1a = entrada.nextInt();
                arma.setDurabilidade(durabilidadeP1a);

                a.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP1a = entrada.next();
                armadura.setNome(armaduraP1a);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP1a = entrada.nextInt();
                armadura.setPeso(pesoP1a);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP1a = entrada.nextInt();
                armadura.setDefesa(defesaP1a);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeAp1a = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeAp1a);

                a.setArmadura(armadura);

            System.out.print(" Personagem 2: ");
            String personagem2 = entrada.nextLine();

            if(personagem2 == "Guerreiro"){
                Guerreiro g = new Guerreiro();
                System.out.print("Informe o nome do Guerreiro: ");
                String nomeP2 = entrada.next();
                g.setNome(nomeP2);

                System.out.print("Informe o valor da força do Guerreiro: ");
                int forcaP2 = entrada.nextInt();
                g.setForca(forcaP2);

                System.out.print("Informe o valor da destreza do Guerreiro: ");
                int destrezaP2 = entrada.nextInt();
                g.setDestreza(destrezaP2);

                System.out.print("Informe o valor da agilidade do Guerreiro: ");
                int agilidadeP2 = entrada.nextInt();
                g.setAgilidade(agilidadeP2);

                System.out.print("Informe o valor inteligência do Guerreiro: ");
                int inteligenciaP2 = entrada.nextInt();
                g.setInteligencia(inteligenciaP2);

                System.out.print("Informe o valor do carisma do Guerreiro:  ");
                int carismaP2 = entrada.nextInt();
                g.setCarisma(carismaP2);

                System.out.print("Informe o valor da resistência do Guerreiro: ");
                int resistenciaP2 = entrada.nextInt();
                g.setResistencia(resistenciaP2);

                System.out.print("Informe o valor da vida do Guerreiro: ");
                int vidaP2 = entrada.nextInt();
                g.setVida(vidaP2);

                System.out.print("Informe o valor da estamina do Guerreiro: ");
                int estaminaP2 = entrada.nextInt();
                g.setEstamina(estaminaP2);

                System.out.print("Informe o valor da sorte do Guerreiro: ");
                int sorteP2 = entrada.nextInt();
                g.setSorte(sorteP2);

                System.out.print("Informe o valor da mana do Guerreiro:");
                int manaP2 = entrada.nextInt();
                g.setMana(manaP2);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP2 = entrada.nextLine();
                arma.setNome(armaP2);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP2 = entrada.nextInt();
                arma.setDano(danoP2);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeP2 = entrada.nextInt();
                arma.setDurabilidade(durabilidadeP2);

                g.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP2 = entrada.next();
                armadura.setNome(armaduraP2);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP2 = entrada.nextInt();
                armadura.setPeso(pesoP2);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP2 = entrada.nextInt();
                armadura.setDefesa(defesaP2);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeP2a = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeP2a);

                g.setArmadura(armadura);


            }if(personagem2 == "Mago"){
                Mago m = new Mago();
                System.out.print("Informe o nome do Mago: ");
                String nomeP2m = entrada.next();
                m.setNome(nomeP2m);

                System.out.print("Informe o valor da força do Mago: ");
                int forcaP2m = entrada.nextInt();
                m.setForca(forcaP2m);

                System.out.print("Informe o valor da destreza do Mago: ");
                int destrezaP2m = entrada.nextInt();
                m.setDestreza(destrezaP2m);

                System.out.print("Informe o valor da agilidade do Mago: ");
                int agilidadeP2m = entrada.nextInt();
                m.setAgilidade(agilidadeP2m);

                System.out.print("Informe o valor inteligência do Mago: ");
                int inteligenciaP2m = entrada.nextInt();
                m.setInteligencia(inteligenciaP2m);

                System.out.print("Informe o valor do carisma do Mago:  ");
                int carismaP2m = entrada.nextInt();
                m.setCarisma(carismaP2m);

                System.out.print("Informe o valor da resistência do Mago: ");
                int resistenciaP2m = entrada.nextInt();
                m.setResistencia(resistenciaP2m);

                System.out.print("Informe o valor da vida do Mago: ");
                int vidaP2m = entrada.nextInt();
                m.setVida(vidaP2m);

                System.out.print("Informe o valor da estamina do Mago: ");
                int estaminaP2m = entrada.nextInt();
                m.setEstamina(estaminaP2m);

                System.out.print("Informe o valor da sorte do Mago: ");
                int sorteP2m = entrada.nextInt();
                m.setSorte(sorteP2m);

                System.out.print("Informe o valor da mana do Mago:");
                int manaP2m = entrada.nextInt();
                m.setMana(manaP2m);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP2m = entrada.nextLine();
                arma.setNome(armaP2m);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP2m = entrada.nextInt();
                arma.setDano(danoP2m);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeP2m = entrada.nextInt();
                arma.setDurabilidade(durabilidadeP2m);

                m.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP2m = entrada.next();
                armadura.setNome(armaduraP2m);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP2m = entrada.nextInt();
                armadura.setPeso(pesoP2m);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP2m = entrada.nextInt();
                armadura.setDefesa(defesaP2m);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeAp2m = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeAp2m);

                m.setArmadura(armadura);


            }if(personagem2 == "Arqueiro"){
                Arqueiro a = new Arqueiro();
                System.out.print("Informe o nome do Arqueiro: ");
                String nomeP2a = entrada.next();
                a.setNome(nomeP2a);

                System.out.print("Informe o valor da força do Arqueiro: ");
                int forcaP2a = entrada.nextInt();
                a.setForca(forcaP2a);

                System.out.print("Informe o valor da destreza do Arqueiro: ");
                int destrezaP2a = entrada.nextInt();
                a.setDestreza(destrezaP2a);

                System.out.print("Informe o valor da agilidade do Arqueiro: ");
                int agilidadeP2a = entrada.nextInt();
                a.setAgilidade(agilidadeP2a);

                System.out.print("Informe o valor inteligência do Arqueiro: ");
                int inteligenciaP2a = entrada.nextInt();
                a.setInteligencia(inteligenciaP2a);

                System.out.print("Informe o valor do carisma do Arqueiro:  ");
                int carismaP2a = entrada.nextInt();
                a.setCarisma(carismaP2a);

                System.out.print("Informe o valor da resistência do Arqueiro: ");
                int resistenciaP2a = entrada.nextInt();
                a.setResistencia(resistenciaP2a);

                System.out.print("Informe o valor da vida do Arqueiro: ");
                int vidaP2a = entrada.nextInt();
                a.setVida(vidaP2a);

                System.out.print("Informe o valor da estamina do Arqueiro: ");
                int estaminaP2a = entrada.nextInt();
                a.setEstamina(estaminaP2a);

                System.out.print("Informe o valor da sorte do Arqueiro: ");
                int sorteP2a = entrada.nextInt();
                a.setSorte(sorteP2a);

                System.out.print("Informe o valor da mana do Arqueiro:");
                int manaP2a = entrada.nextInt();
                a.setMana(manaP2a);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP2a = entrada.nextLine();
                arma.setNome(armaP2a);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP2a = entrada.nextInt();
                arma.setDano(danoP2a);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeAp2 = entrada.nextInt();
                arma.setDurabilidade(durabilidadeAp2);

                a.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP2a = entrada.next();
                armadura.setNome(armaduraP2a);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP2a = entrada.nextInt();
                armadura.setPeso(pesoP2a);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP2a = entrada.nextInt();
                armadura.setDefesa(defesaP2a);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeAp2a = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeAp2a);

                a.setArmadura(armadura);

            System.out.print(" Personagem 3: ");
            String personagem3 = entrada.nextLine();

            if(personagem3 == "Guerreiro"){
                Guerreiro g = new Guerreiro();
                System.out.print("Informe o nome do Guerreiro: ");
                String nomeP3 = entrada.next();
                g.setNome(nomeP3);

                System.out.print("Informe o valor da força do Guerreiro: ");
                int forcaP3 = entrada.nextInt();
                g.setForca(forcaP3);

                System.out.print("Informe o valor da destreza do Guerreiro: ");
                int destrezaP3 = entrada.nextInt();
                g.setDestreza(destrezaP3);

                System.out.print("Informe o valor da agilidade do Guerreiro: ");
                int agilidadeP3 = entrada.nextInt();
                g.setAgilidade(agilidadeP3);

                System.out.print("Informe o valor inteligência do Guerreiro: ");
                int inteligenciaP3 = entrada.nextInt();
                g.setInteligencia(inteligenciaP3);

                System.out.print("Informe o valor do carisma do Guerreiro:  ");
                int carismaP3 = entrada.nextInt();
                g.setCarisma(carismaP3);

                System.out.print("Informe o valor da resistência do Guerreiro: ");
                int resistenciaP3 = entrada.nextInt();
                g.setResistencia(resistenciaP3);

                System.out.print("Informe o valor da vida do Guerreiro: ");
                int vidaP3 = entrada.nextInt();
                g.setVida(vidaP3);

                System.out.print("Informe o valor da estamina do Guerreiro: ");
                int estaminaP3 = entrada.nextInt();
                g.setEstamina(estaminaP3);

                System.out.print("Informe o valor da sorte do Guerreiro: ");
                int sorteP3 = entrada.nextInt();
                g.setSorte(sorteP3);

                System.out.print("Informe o valor da mana do Guerreiro:");
                int manaP3 = entrada.nextInt();
                g.setMana(manaP3);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP3 = entrada.nextLine();
                arma.setNome(armaP3);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP3 = entrada.nextInt();
                arma.setDano(danoP3);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeP3 = entrada.nextInt();
                arma.setDurabilidade(durabilidadeP3);

                g.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP3 = entrada.next();
                armadura.setNome(armaduraP3);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP3 = entrada.nextInt();
                armadura.setPeso(pesoP3);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP3 = entrada.nextInt();
                armadura.setDefesa(defesaP3);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeP3a = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeP3a);

                g.setArmadura(armadura);


            }if(personagem3 == "Mago"){
                Mago m = new Mago();
                System.out.print("Informe o nome do Mago: ");
                String nomeP3m = entrada.next();
                m.setNome(nomeP3m);

                System.out.print("Informe o valor da força do Mago: ");
                int forcaP3m = entrada.nextInt();
                m.setForca(forcaP3m);

                System.out.print("Informe o valor da destreza do Mago: ");
                int destrezaP3m = entrada.nextInt();
                m.setDestreza(destrezaP3m);

                System.out.print("Informe o valor da agilidade do Mago: ");
                int agilidadeP3m = entrada.nextInt();
                m.setAgilidade(agilidadeP3m);

                System.out.print("Informe o valor inteligência do Mago: ");
                int inteligenciaP3m = entrada.nextInt();
                m.setInteligencia(inteligenciaP3m);

                System.out.print("Informe o valor do carisma do Mago:  ");
                int carismaP3m = entrada.nextInt();
                m.setCarisma(carismaP3m);

                System.out.print("Informe o valor da resistência do Mago: ");
                int resistenciaP3m = entrada.nextInt();
                m.setResistencia(resistenciaP3m);

                System.out.print("Informe o valor da vida do Mago: ");
                int vidaP3m = entrada.nextInt();
                m.setVida(vidaP3m);

                System.out.print("Informe o valor da estamina do Mago: ");
                int estaminaP3m = entrada.nextInt();
                m.setEstamina(estaminaP3m);

                System.out.print("Informe o valor da sorte do Mago: ");
                int sorteP3m = entrada.nextInt();
                m.setSorte(sorteP3m);

                System.out.print("Informe o valor da mana do Mago:");
                int manaP3m = entrada.nextInt();
                m.setMana(manaP3m);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP3m = entrada.nextLine();
                arma.setNome(armaP3m);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP3m = entrada.nextInt();
                arma.setDano(danoP3m);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeP3m = entrada.nextInt();
                arma.setDurabilidade(durabilidadeP3m);

                m.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP3m = entrada.next();
                armadura.setNome(armaduraP3m);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP3m = entrada.nextInt();
                armadura.setPeso(pesoP3m);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP3m = entrada.nextInt();
                armadura.setDefesa(defesaP3m);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeAp3m = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeAp3m);

                m.setArmadura(armadura);


            }if(personagem3 == "Arqueiro"){
                Arqueiro a = new Arqueiro();
                System.out.print("Informe o nome do Arqueiro: ");
                String nomeP3a = entrada.next();
                a.setNome(nomeP3a);

                System.out.print("Informe o valor da força do Arqueiro: ");
                int forcaP3a = entrada.nextInt();
                a.setForca(forcaP3a);

                System.out.print("Informe o valor da destreza do Arqueiro: ");
                int destrezaP3a = entrada.nextInt();
                a.setDestreza(destrezaP3a);

                System.out.print("Informe o valor da agilidade do Arqueiro: ");
                int agilidadeP3a = entrada.nextInt();
                a.setAgilidade(agilidadeP3a);

                System.out.print("Informe o valor inteligência do Arqueiro: ");
                int inteligenciaP3a = entrada.nextInt();
                a.setInteligencia(inteligenciaP3a);

                System.out.print("Informe o valor do carisma do Arqueiro:  ");
                int carismaP3a = entrada.nextInt();
                a.setCarisma(carismaP3a);

                System.out.print("Informe o valor da resistência do Arqueiro: ");
                int resistenciaP3a = entrada.nextInt();
                a.setResistencia(resistenciaP3a);

                System.out.print("Informe o valor da vida do Arqueiro: ");
                int vidaP3a = entrada.nextInt();
                a.setVida(vidaP3a);

                System.out.print("Informe o valor da estamina do Arqueiro: ");
                int estaminaP3a = entrada.nextInt();
                a.setEstamina(estaminaP3a);

                System.out.print("Informe o valor da sorte do Arqueiro: ");
                int sorteP3a = entrada.nextInt();
                a.setSorte(sorteP3a);

                System.out.print("Informe o valor da mana do Arqueiro:");
                int manaP3a = entrada.nextInt();
                a.setMana(manaP3a);

                System.out.println("------Arma------");

                System.out.print("Informe o nome da arma: ");
                String armaP3a = entrada.nextLine();
                arma.setNome(armaP3a);

                System.out.print("Informe o valor de dano que a arma vai fazer: ");
                int danoP3a = entrada.nextInt();
                arma.setDano(danoP3a);

                System.out.print("Informe o valor da durabilidade da arma: ");
                int durabilidadeAp3 = entrada.nextInt();
                arma.setDurabilidade(durabilidadeAp3);

                a.setArma(arma);

                System.out.println("------Armadura------");

                System.out.print("Informe o nome da armadura: ");
                String armaduraP3a = entrada.next();
                armadura.setNome(armaduraP3a);

                System.out.print("Informe o valor do peso da armadura: ");
                int pesoP3a = entrada.nextInt();
                armadura.setPeso(pesoP3a);

                System.out.print("Informe o valor da defesa da armadura: ");
                int defesaP3a = entrada.nextInt();
                armadura.setDefesa(defesaP3a);

                System.out.print("Informe a durabilidade da armadura: ");
                int durabilidadeAp3a = entrada.nextInt();
                armadura.setDurabilidade(durabilidadeAp3a);

                a.setArmadura(armadura);


            
                Random dado = new Random();
                int round  = 1;
                Guerreiro g = new Guerreiro( );
                Arqueiro a = new Arqueiro();     
                Mago m = new Mago();

                if(personagem1 == "Guerreiro" ){
                    if(personagem2 == "Mago"){
                        if(personagem3 == "Arqueiro"){
                            while(g.getVida() > 0 && m.getVida() > 0 && a.getVida() > 0){
                                System.out.println("Round: " + round);
                                System.out.println("Oponente 1: " + g.getNome());
                                System.out.println("Oponente 2: " + m.getNome());
                                System.out.println("Oponente 3: " + a.getNome());
                                
                                //turno do mago (m)
                                int valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                int valorAtaque = m.atacar(valorDado);
                                g.defender(valorAtaque);
                                a.defender(valorAtaque);

                            
                                //turno do guerreiro (g)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = g.atacar(valorDado, valorAtaque);
                                m.defender(valorAtaque);
                                a.defender(valorAtaque);

                                //turno do arqueiro (a)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = a.atacar(valorDado, valorAtaque);
                                g.defender(valorAtaque);
                                m.defender(valorAtaque);

                                //round = round +1
                                round++;

                                if(m.getVida() <= 0 && a.getVida() <= 0){
                                    System.out.println("Gerreiro " + g.getNome() + " foi campeão!!!" );
                                }else if(g.getVida() <= 0 && a.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Mago " + m.getNome() + " foi campeão!!!");
                                }else if(g.getVida() <= 0 && m.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Arqueiro " + a.getNome() + " foi campeão!!!");
                                
                                }}}

                    }else if(personagem2 == "Arqueiro"){
                        if(personagem3 == "Mago")
                            while(g.getVida() > 0 && a.getVida() > 0 && m.getVida() > 0){
                                System.out.println("Round: " + round);
                                System.out.println("Oponente 1: " + g.getNome());
                                System.out.println("Oponente 2: " + a.getNome());
                                System.out.println("Oponente 3: " + m.getNome());

                                //turno do arqueiro
                                int valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                int valorAtaque = a.atacar(valorDado);
                                g.defender(valorAtaque);
                                m.defender(valorAtaque);
                        
                            
                                //turno do guerreiro (g)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = g.atacar(valorDado, valorAtaque);
                                a.defender(valorAtaque);
                                m.defender(valorAtaque);

                                //turno do mago (m)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = m.atacar(valorDado, valorAtaque);
                                a.defender(valorAtaque);
                                g.defender(valorAtaque);

                                //round = round +1
                                round++;

                                if(a.getVida() <= 0 && m.getVida() <= 0){
                                    System.out.println("Gerreiro " + g.getNome() + " foi campeão!!!" );
                                }else if(g.getVida() <= 0 && m.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Arqueiro " + a.getNome() + " foi campeão!!!");
                                }else if(g.getVida() <= 0 && a.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Mago " + m.getNome() + " foi campeão!!!");
                            }
                        }}
   
                }else if(personagem1 == "Mago"){
                    if(personagem2 == "Guerreiro"){
                        if(personagem3 == "Arqueiro")
                            while(m.getVida() > 0 && g.getVida() > 0 && a.getVida() > 0){
                                System.out.println("Round: " + round);
                                System.out.println("Oponente 1: " + m.getNome());
                                System.out.println("Oponente 2: " + g.getNome());
                                System.out.println("Oponente 3: " + a.getNome());
                                    
                                //turno do guerreiro (g)
                                int valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                int valorAtaque = g.atacar(valorDado, valorAtaque);
                                m.defender(valorAtaque);
                                a.defender(valorAtaque);

                                //turno do mago
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = m.atacar(valorDado);
                                g.defender(valorAtaque);
                                a.defender(valorAtaque);

                                //turno do Arqueiro
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = a.atacar(valorDado);
                                g.defender(valorAtaque);
                                m.defender(valorAtaque);

                                //round = round +1
                                round++;

                                if(g.getVida() <= 0 && a.getVida() <= 0){
                                    System.out.println("Mago " + m.getNome() + " foi campeão!!!" );
                                }else if(m.getVida() <= 0 && a.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Guerreiro " + g.getNome() + " foi campeão!!!");
                                }else if(m.getVida() <= 0 && g.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Arqueiro" + a.getNome() + " foi campeão!!!");
                    
                            }}

                    }else if(personagem2 == "Arqueiro"){
                        if(personagem3 == "Guerreiro")
                            while(m.getVida() > 0 && a.getVida() > 0){
                                System.out.println("Round: " + round);
                                System.out.println("Oponente 1: " + m.getNome());
                                System.out.println("Oponente 2: " + a.getNome());
                                System.out.println("Oponente 3: " + g.getNome());

                                //turno do arqueiro (a)
                                int valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                int valorAtaque = a.atacar(valorDado);
                                m.defender(valorAtaque);
                                g.defender(valorAtaque);

                                //turno do guerreiro (g)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = g.atacar(valorDado, valorAtaque);
                                a.defender(valorAtaque);
                                m.defender(valorAtaque);

                                //turno do mago (m)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = m.atacar(valorDado, valorAtaque);
                                a.defender(valorAtaque);
                                g.defender(valorAtaque);

                                //round = round +1
                                round++;

                                if(a.getVida() <= 0 && g.getVida() <= 0){
                                    System.out.println("Mago " + m.getNome() + " foi campeão!!!" );
                                }else if(m.getVida() <= 0 && a.getVida() < 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Guerreiro " + g.getNome() + " foi campeão!!!");
                                }else if(m.getVida() <= 0 && g.getVida() < 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Arqueiro " + a.getNome() + " foi campeão!!!");
                            }}}

                }else if(personagem1 == "Arqueiro"){
                    if(personagem2 == "Guerreiro"){
                        if(personagem3 == "Mago")
                            while (a.getVida() > 0 && g.getVida() > 0 && m.getVida() > 0) {

                                System.out.println("Round: " + round);
                                System.out.println("Oponente 1: " + a.getNome());
                                System.out.println("Oponente 2: " + g.getNome());
                                System.out.println("Oponente 3: " + m.getNome());
            
                                // turno do mago (m)
                                int valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                int valorAtaque = m.atacar(valorDado, valorDado);
                                a.defender(valorAtaque);
                                g.defender(valorAtaque);
            
                                // turno do arqueiro (a)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = a.atacar(valorDado, valorAtaque);
                                g.defender(valorAtaque);
                                m.defender(valorAtaque);

                                 // turno do guerreiro (g)
                                 valorDado = dado.nextInt(6);
                                 System.out.println("Valor do dado: " + valorDado);
                                 valorAtaque = g.atacar(valorDado, valorAtaque);
                                 a.defender(valorAtaque);
                                 m.defender(valorAtaque);
            
                                round++;

                                if (g.getVida() <= 0 && m.getVida() <= 0) {
                                    System.out.println("Arqueiro " + a.getNome() + " foi campeão!!!");
                                }else if (a.getVida() <= 0 && m.getVida() <= 0) {
                                    System.out.println("br.edu.iftm.rpgjava.classes.Guerreiro" + g.getNome() + " foi campeão!!!");
                                }else if (a.getVida() <= 0 && g.getVida() <= 0) {
                                    System.out.println("br.edu.iftm.rpgjava.classes.Mago" + m.getNome() + " foi campeão!!!");
                                }

                    if(personagem2 == "Mago"){
                        if(personagem3 == "Guerreiro")
                            while (a.getVida() > 0 && m.getVida() > 0) {
            
                                System.out.println("Round: " + round);
                                System.out.println("Oponente 1: " + a.getNome());
                                System.out.println("Oponente 2: " + m.getNome());
                                System.out.println("Oponente 3: " + g.getNome());
                    
                                // turno do mago (m)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = m.atacar(valorDado, valorDado);
                                a.defender(valorAtaque);
                                g.defender(valorAtaque);
                    
                                // turno do arqueiro (a)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = a.atacar(valorDado, valorAtaque);
                                m.defender(valorAtaque);
                                g.defender(valorAtaque);

                                // turno do guerreiro (g)
                                valorDado = dado.nextInt(6);
                                System.out.println("Valor do dado: " + valorDado);
                                valorAtaque = g.atacar(valorDado, valorAtaque);
                                m.defender(valorAtaque);
                                a.defender(valorAtaque);
                    
                                round++;
                                if (m.getVida() <= 0 && g.getVida() <= 0) {
                                    System.out.println("Arqueiro " + a.getNome() + " foi campeão!!!");
                                }else if (a.getVida() <= 0 && g.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Mago" + m.getNome() + " foi campeão!!!");
                                }else if (a.getVida() <= 0 && m.getVida() <= 0){
                                    System.out.println("br.edu.iftm.rpgjava.classes.Guerreiro" + g.getNome() + " foi campeão!!!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}}}

    
        
                    
              

