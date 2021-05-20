package aula04;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Aula04 {

    public void entrar() {
        Scanner h = new Scanner(System.in);
        double ps = 0;
        int men = 0;
        int women = 0;
        double hard = 0;
        double hards = 0;
        double maior = 0;
       
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua Altura:");
            double alt = h.nextDouble();
            System.out.println("Qual seu sexo? 1 - Homem / 2 - Mulher");
            int sx = h.nextInt();

            ps += alt;

            switch (sx) {
                case 1:
                    hards += alt;
                    men++;
                    break;
                case 2:
                    hard += alt;
                    women++;
                    break;
                default:
                    break;
            }
            if (maior < alt) {
                maior = alt;
            }

        }
        
        double altH = hards/men;
        double altM = hard/women;
        double resultado = ps / 3;
        DecimalFormat f = new DecimalFormat("###.00");
        System.out.println("A média das Alturas:" + f.format(resultado)+"\nAltura média dos Homens: "+ 
                f.format(altH)+"\nAltura média das mulheres: "+f.format(altM)+"\nMaior altura: "+f.format(maior));

    }

    public static void main(String[] args) {

        Aula04 c = new Aula04();
        Qst3 t = new Qst3();
        Mergesort merg = new Mergesort();
        int [] vetor = new int [50];
        Random r = new Random();
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = r.nextInt(100);
        }
        
       //média de altura entre homens e mulheres, e por sexo, maior altura
       c.entrar();
       
       //ordenação pelo método mergesort
       vetor = merg.ordenar(vetor);
     
       System.out.println(Arrays.toString(vetor));
        
        //ordenação de vetor em ordem crescente/ números pares/ maior e menor valor no vetor
       //valores entre 10 e 40/ consulta de valor dentro do vetor
        t.vetor();
    }

}
