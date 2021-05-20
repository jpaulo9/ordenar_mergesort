package aula04;

import java.util.Random;
import java.util.Scanner;

public class Qst3 {

    Scanner q = new Scanner(System.in);

    public void vetor() {
        System.out.println("Definir tamanho do vetor:");
        int tam = q.nextInt();
        Random r = new Random();
        int[] vetX = new int[tam];

        int c = 0;
        for (int i = 0; i < tam; i++) {
            vetX[i] = r.nextInt(tam);

            if (vetX[i] > 10 && vetX[i] < 40) {
                c++;
            }

        }
        int[] vetY = new int[c];
        int contadorY = 0;
        for (int i = 0; i < tam; i++) {
            if (vetX[i] > 10 && vetX[i] < 40) {
                vetY[contadorY] = vetX[i];
                contadorY++;
            }

        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam - 1; j++) {
                if (vetX[j] > vetX[j + 1]) {
                    int tmp = vetX[j + 1];
                    vetX[j + 1] = vetX[j];
                    vetX[j] = tmp;
                }
            }
        }
        int w = 0;
        for (int i = 0; i < tam; i++) {
            if (vetX[i] % 2 == 0) {
                w++;
            }
            for (int j = 0; j < c - 1; j++) {
                if (vetY[j] > vetY[j + 1]) {
                    int tmp = vetY[j + 1];
                    vetY[j + 1] = vetY[j];
                    vetY[j] = tmp;
                }
            }
        }
        int[] vetW = new int[w];
        int contW = 0;
        for (int i = 0; i < tam; i++) {
            if (vetX[i] > 0) {
                if (vetX[i] % 2 == 0) {
                    vetW[contW] = vetX[i];
                    contW++;
                }
            }

        }

        System.out.println("Menor valor: " + vetX[0]);
        System.out.println("Maior valor: " + vetX[vetX.length - 1]);

        for (int i = 0; i < vetX.length; i++) {
            System.out.print(vetX[i] + " ");
        }
        System.out.print("");

        System.out.println("\n\nValores entre 10 e 40....");
        for (int i = 0; i < vetY.length; i++) {
            System.out.print(vetY[i] + " ");
        }

        System.out.println("\n");

        System.out.println("qntd de números Pares:" + w);
        System.out.println("São eles...");
        for (int i = 0; i < vetW.length; i++) {
            System.out.print(vetW[i] + " ");

        }
        System.out.println("");
        System.out.println("Digite o valor que deseja enconctrar??");
        int psq = q.nextInt();
        int achado = 0;
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            if (vetX[i] == psq) {
                achado = vetX[i];
                cont++;
            }

        }
        if (cont == 0) {
            System.out.println("Valor não existente!!!");
        } else {
            System.out.println("Valor encontrado---" + achado + "---");
        }
    }

//    public static void main(String[] args) {
//        new Qst3().vetor();
//    }

}
