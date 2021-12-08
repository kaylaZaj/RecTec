package sample;

import sample.model.Aluno;
import sample.model.Carro;
import sample.model.Sorvete;
import sample.model.Veiculo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("XDF24");
        Veiculo veiculo2 = new Veiculo("JKI02");

        Random random = new Random();
        int velocidade1 = random.nextInt(11);
        int velocidade2 = random.nextInt(11);

        do {
            velocidade1 += 4;
            velocidade2 += 2;
        } while (velocidade1 <= 100 || velocidade2 <= 100);

        veiculo1.setVelocidade(velocidade1);
        veiculo2.setVelocidade(velocidade2);

        System.out.println(velocidade1);
        System.out.println(velocidade2);

        System.out.println("Vou tomar Sorvete");
        //objeto
        Sorvete sorvete1 = new Sorvete();
        sorvete1.setNome("Neve do Cambirela");
        sorvete1.setSabor("Flocos");
        sorvete1.setPreco(5.80);

        Sorvete sorvete2 = new Sorvete();
        sorvete2.setNome("Coco do Nordeste");
        sorvete2.setSabor("Coco");
        sorvete2.setPreco(6.70);

        Sorvete sorvete3 = new Sorvete();
        sorvete3.setNome("Napoleão");
        sorvete3.setSabor("Napolitano");
        sorvete3.setPreco(7.98);

        Sorvete sorvete4 =
                new Sorvete(
                            "Chocolate",
                        "Chocolate Amargo",
                        7.80

                );

        System.out.println(sorvete1);
        System.out.println(sorvete2);
        System.out.println(sorvete3);
        System.out.println(sorvete4);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Mario");
        aluno1.setCurso("Administração");
        aluno1.setSala("8-D");
        aluno1.setAno("3º");

        Aluno aluno2 =
                new Aluno(
                        "Luciana",
                        "Artes Plásticas",
                        "9-E",
                        "2º"
                );

        Aluno aluno3 =
               new Aluno(
                        "Lisa",
                        "Arquitetura",
                        "2-B",
                        "1º"
                );

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);

        Carro carro1 =
                new Carro(
                        "Celta",
                        "Chevrolet",
                        "Preto"
               );

        Carro carro2 =
                new Carro(
                        "Sandero",
                        "Renault",
                        "Branco"

        );

        Carro carro3 =
                new Carro(
                  "Uno",
                 "Fiat",
                  "Vermelho"
                );



    }
    }



