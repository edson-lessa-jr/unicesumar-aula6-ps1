package atividade3;

import java.util.Random;

public class MatrizSomaColuna {
    public static void main(String[] args) {
        int matriz[][] = new int[6][7];
        Random random = new Random();
        int somatorio[] = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                somatorio[j]+=matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < somatorio.length; i++) {
            System.out.print(somatorio[i]+" ");
        }
    }
}
