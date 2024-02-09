package interfaz;

import controller.calculadora;

import java.util.Scanner;

public class vistaU {
    Scanner leer = new Scanner(System.in);
    calculadora objCalculadora = new calculadora(0, 0);
    byte opcion;
    char decision, Dborrado;

    public void interfazCalculadora() {
        System.out.println("Bienvenidos a la calculadora de Nicolas :)");
        do {
            System.out.println("Por favor indique que desea hacer");
            System.out.println("|1| Sumar");
            System.out.println("|2| Restar");
            System.out.println("|3| multiplicar");
            System.out.println("|4| Dividir");
            System.out.println("|0| Cerrar calculadora");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Usted a elegido la opcion de sumar");
                        System.out.println("por favor digite un numero");
                        objCalculadora.setNum1(leer.nextFloat());
                        System.out.println("ingrese otro numero");
                        objCalculadora.setNum2(leer.nextFloat());
                        System.out.println("El resultado de la suma de " + objCalculadora.getNum1() + " + " + objCalculadora.getNum2() + " es:");
                        System.out.println(objCalculadora.sumar());
                        System.out.println("¿desea continuar? Y/N");
                        decision = leer.next().charAt(0);
                        if (decision == 'Y' || decision == 'y'){
                            System.out.println("Decea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){

                            }
                        }
                    } while (decision == 'Y' || decision == 'y');
                    break;
                case 2:
                    System.out.println();
                    break;
            }
        } while (opcion != 0);
    }
}
