package com.mycompany.proyectorepaso;

import java.util.Scanner;

public class ProyectoRepaso {

    public static void main(String[] args) {

        int numerodehojas = 0;
        double promedioAhorros = 4.5;
        String paletas = "gomitas";

//        if (promedioAhorros < 5 && promedioAhorros == 4.55 && paletas.equals("gomitas")) {
//            System.out.println("Se cumple la condición");
//        }else if(paletas.equals("gomitas222")){ 
//            System.out.println("Se cumple la segunda condicion");
//        }
//        else{
//            System.out.println("No se cumple");            
//        }
//        switch (paletas) {
//            case "gomitas":
//                System.out.println("Es una paleta de gomitas");
//                break;
//            
//            case "chocolate":
//                System.out.println("Es una paleta de chocolate");
//                break;
//                
//            default:
//                System.out.println("Es una paleta desconocida");
//        }
//        int numeros = 22;
//        
//        for (int i = 1; i <= numeros; i++) {
//            if(i%3==0){                
//              System.out.println("FIZZ " + i);   
//            }else if (i%5==0) {
//              System.out.println("BUZZ " + i);
//            }
//            else if(i%3==0 && i%5==0){
//                System.out.println("FIZZBUZZ " + i);
//            }else{
//                System.out.println(i);
//            }           
//        }
//        int notas[] = {4, 4, 4, 4, 1, 1, 2, 3, 5, 10}; //declarar los elementos del arreglo
//        int notas2[] = new int[8]; //declarar un arreglo vacio
//        notas2[0] = 3;
//        notas2[4] = 5;
//        
//        for (int i = 0; i < notas2.length; i++) {
//            System.out.println(notas2[i]);
//        }
//        
//        for (int i : notas2) {
//            System.out.println(i);
//        }
        int totalEmpresa = 2;
        String empleados[][] = new String[totalEmpresa][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < empleados.length; i++) { // Este for recorre las filas

            System.out.println("Ingresando datos empleados empresa " + (i + 1));

            for (int j = 0; j < empleados[i].length; j++) { // Este for recorre las columnas
                System.out.println("Ingrese datos del empleado" + (j + 1));
                empleados[i][j] = scanner.next();
            }

        }

        for (int i = 0; i < empleados.length; i++) { //informe de los datos que pido en la matriz

            System.out.println("Los empleados de la  empresa " + (i + 1) + "son:");

            for (int j = 0; j < empleados[i].length; j++) {
                System.out.println(empleados[i][j]);
            }

        }

    }
}
