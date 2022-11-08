package atividade2;

import java.util.Random;

public class MatrizSomaLinha {
    public static void main(String[] args) {
        int matriz[][] = new int[6][7];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            int soma=0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(i+"x"+j+" = "+matriz[i][j]);
                soma+=matriz[i][j];
            }
            System.out.println("Somatório de "+i+"= "+soma);
        }
    }
}
