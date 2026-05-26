package com.uce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       /*String[] productos = {"Mouse", "Teclado", "Monitor", "Tarj. Gráfica", "Cables", "Cargadores"};
        double[] precios = {5.99, 8.92, 114.15, 568.91, 3.00, 22.00};
        int[] cantidades = new int [6];

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de cada producto: ");
        for (int i =0; i<precios.length; i++){
            System.out.println("Para " + productos[i] + " con precio $ "+ precios[i]);
            String input = scanner.nextLine();
            if(input == "exit"){
                System.exit(0);
            }else {
                cantidades[i] = Integer.parseInt(input);
            }
        }

        scanner.close();

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto:" + productos[i] + " Precio:" + precios[i] + " Cantidad: " + cantidades[i]);
        }

        for(int i=0; i<productos.length; i++){
            System.out.println("Ingrese el precio del producto: " + productos[i]);
                precios_cantidades[i][0] = scanner.nextDouble();
            
            System.out.println("Ingrese la cantidad del producto: " + productos[i]);
            precios_cantidades[i][1] = scanner.nextDouble();
        }*/

            int[][] bingo = new int[5][5];
            int players = 0;
            System.out.println("Welcome to Bingo!");
            System.out.println("Player" + (players+1) + " Draw Number: " + (int)(Math.random() * 100));
            for(int i=0; i<bingo.length; i++){
                for(int j=0; j<bingo[i].length; j++){
                    bingo[i][j] = (int)(Math.random() * 100);
                    System.out.print(bingo[i][j]+ " ");
                }
                System.out.println();
            }

            
 }
}