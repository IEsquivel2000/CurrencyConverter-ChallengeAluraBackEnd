package com.aluracursos.conversormonedas;

import java.util.Scanner;

public class Menu {
    private Conversor converter;
    private Scanner scanner;

    public Menu(Conversor converter){
        this.converter = converter;
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        boolean exit = false;
        while (!exit) {
            //Impresion del menu
            System.out.println("\n\n\nBienvenido a Currency Converter Challenge");
            System.out.println("By: IEsquivel");

            System.out.println("****************************************");
            System.out.println("**** Tabla de conversion de monedas ****");
            System.out.println("****************************************");
            System.out.println("----------------------------------------\n");
            System.out.println("**** 1) Dolar               -->     Peso Mexicano  ****");
            System.out.println("**** 2) Peso Mexicano       -->     Dolar ****");
            System.out.println("**** 3) Dolar               -->     Peso argentino ****");
            System.out.println("**** 4) Peso Argentino      -->     Dolar ****");
            System.out.println("**** 5) Dolar               -->     Real Brasileño ****");
            System.out.println("**** 6) Real Brasileño      -->     Dolar ****");
            System.out.println("**** 7) Dolar               -->     Bolivar Venezolano ****");
            System.out.println("**** 8) Bolivar Venezolano  -->     Dolar ****");
            System.out.println("**** 9) Salir  ****");
            System.out.println("****************************************\n");
            System.out.println("Seleccione la opcion que desee:");

            int option = scanner.nextInt();
            //switch para las diferentes opciones disponibles dependiendo de la opcion elegida por el usuario
            switch (option){
                case 1:
                    System.out.println("Ingrese la cantidad en dolares a convertir\n");
                    double amount1 = scanner.nextDouble();
                    double conversionRate1 = converter.getConversionRate("USD", "MXN");
                    System.out.println(amount1 + " USD equivale a= " + (amount1 * conversionRate1) + " MXN");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en pesos mexicanos a convertir\n");
                    double amount2 = scanner.nextDouble();
                    double conversionRate2 = converter.getConversionRate("MXN", "USD");
                    System.out.println(amount2 + "MXN equivale a= " + (amount2 * conversionRate2) + "USD");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en dolares a convertir\n");
                    double amount3 = scanner.nextDouble();
                    double conversionRate3 = converter.getConversionRate("USD", "ARS");
                    System.out.println(amount3 + " USD equivale a= " + (amount3 * conversionRate3) + " ARS");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en pesos Argentinos a convertir\n");
                    double amount4 = scanner.nextDouble();
                    double conversionRate4 = converter.getConversionRate("ARS", "USD");
                    System.out.println(amount4 + " ARS equivale a= " + (amount4 * conversionRate4) + " USD");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad en dolares a convertir\n");
                    double amount5 = scanner.nextDouble();
                    double conversionRate5 = converter.getConversionRate("USD", "BRL");
                    System.out.println(amount5 + " USD equivale a= " + (amount5 * conversionRate5) + " BRL");
                    break;
                case  6:
                    System.out.println("Ingrese la cantidad en reales brasileños a convertir\n");
                    double amount6 = scanner.nextDouble();
                    double conversionRate6 = converter.getConversionRate("BRL", "USD");
                    System.out.println(amount6 + " BRL equivale a= " + (amount6 * conversionRate6) + " USD");
                    break;
                case  7:
                    System.out.println("Ingrese la cantidad en dolares a convertir\n");
                    double amount7 = scanner.nextDouble();
                    double conversionRate7 = converter.getConversionRate("USD", "VES");
                    System.out.println(amount7 + " USD equivale a= " + (amount7 * conversionRate7) + " VES");
                    break;
                case  8:
                    System.out.println("Ingrese la cantidad en Bolivar Venezolano a convertir\n");
                    double amount8 = scanner.nextDouble();
                    double conversionRate8 = converter.getConversionRate("VES", "USD");
                    System.out.println(amount8 + " VES equivale a= " + (amount8 * conversionRate8) + " USD");
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida");
            }
        }
        System.out.println("\n\nUn gusto, nos vemos pronto");
    }

    public Conversor getConverter() {
        return converter;
    }

    public void setConverter(Conversor converter) {
        this.converter = converter;
    }
}

