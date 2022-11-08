package atividade1;

import java.util.Random;

public class Matrix4x5 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][5];

        Random random = new Random(100);
        for (int i = 0; i < 4; i++) {
            for (int  j= 0;  j< 5; j++) {
                int valor = random.nextInt(100);
                matriz[i][j] = valor;
                if (i==1){
                    System.out.println("J= "+j+" - valor =  "+valor);
                }
            }
        }
        System.out.println("Resultado");
        for (int i = 0; i < 5; i++) {
            System.out.println("coluna= "+i+" - valor =  "+matriz[1][i]);
        }
    }
}
