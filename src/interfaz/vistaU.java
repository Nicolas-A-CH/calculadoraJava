package interfaz;

import controller.*;

import java.util.Scanner;

public class vistaU {
    Scanner leer = new Scanner(System.in);
    operaciones objOperaciones = new operaciones();
    byte opcion;
    char decision, Dborrado;
    boolean C = false;

    public void interfazCalculadora() {
        System.out.println("Bienvenidos a la calculadora de Nicolas :)");
        do {
            System.out.println("Por favor indique que desea hacer");
            System.out.println("|1| Sumar");
            System.out.println("|2| Restar");
            System.out.println("|3| multiplicar");
            System.out.println("|4| Dividir");
            System.out.println("|5| Raiz Cuadrada");
            System.out.println("|6| Porcentaje");
            System.out.println("|0| Cerrar calculadora");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Usted a elegido la opcion de sumar");
                        if (C == true){
                            do {
                                System.out.println(objOperaciones.sumarResNum(0));
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                    objOperaciones.limpiarResultado();
                                }
                                System.out.println("¿desea continuar con la suma? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objOperaciones.sumarDosNum(0,0));
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                                objOperaciones.limpiarResultado();
                            }
                            System.out.println("¿desea continuar con la suma? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objOperaciones.sumarResNum(0));
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
                                        objOperaciones.limpiarResultado();
                                    }
                                    System.out.println("¿desea continuar con la suma? Y/N");
                                    decision = leer.next().charAt(0);
                                } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                        == 'y'));
                            }
                        }
                    } while (decision == 'Y' || decision == 'y');
                    break;
                case 2:
                    do {
                        System.out.println("Usted a elegido la opcion de restar");
                        if (C == true){
                            do {
                                System.out.println(objOperaciones.restarResNum(0));
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                    objOperaciones.limpiarResultado();
                                }
                                System.out.println("¿desea continuar con la resta? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objOperaciones.restarDosNum(0,0));
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                                objOperaciones.limpiarResultado();
                            }
                            System.out.println("¿desea continuar con la resta? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objOperaciones.restarResNum(0));
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
                                        objOperaciones.limpiarResultado();
                                    }
                                    System.out.println("¿desea continuar con la resta? Y/N");
                                    decision = leer.next().charAt(0);
                                } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                        == 'y'));
                            }
                        }
                    } while (decision == 'Y' || decision == 'y');
                    break;
                case 3:
                    do {
                        System.out.println("Usted a elegido la opcion de multiplicar");
                        if (C == true){
                            do {
                                System.out.println(objOperaciones.multiplcarResNum(0));
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                    objOperaciones.limpiarResultado();
                                }
                                System.out.println("¿desea continuar con la multiplicacion? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objOperaciones.multiplicarDosNum(0,0));
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                                objOperaciones.limpiarResultado();
                            }
                            System.out.println("¿desea continuar con la multiplicacion? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objOperaciones.multiplcarResNum(0));
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
                                        objOperaciones.limpiarResultado();
                                    }
                                    System.out.println("¿desea continuar con la multiplicacion? " +
                                            "Y/N");
                                    decision = leer.next().charAt(0);
                                } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                        == 'y'));
                            }
                        }
                    } while (decision == 'Y' || decision == 'y');
                    break;
                case 4:
                    do {
                        System.out.println("Usted a elegido la opcion de dividir");
                        if (C == true){
                            do {
                                System.out.println(objOperaciones.dividirResNum(0));
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                    objOperaciones.limpiarResultado();
                                }
                                System.out.println("¿desea continuar con la divicion? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objOperaciones.dividirDosNum(0,0));
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                                objOperaciones.limpiarResultado();
                            }
                            System.out.println("¿desea continuar con la divicion? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objOperaciones.dividirResNum(0));
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
                                        objOperaciones.limpiarResultado();
                                    }
                                    System.out.println("¿desea continuar con la divicion? Y/N");
                                    decision = leer.next().charAt(0);
                                } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                        == 'y'));
                            }
                        }
                    } while (decision == 'Y' || decision == 'y');
                    break;
                case 5:
                    do {
                        System.out.println("Usted a elegido la opcion de raiz cuadrada");
                        if (C == true){
                            do {
                                System.out.println(objOperaciones.raizCuadradaResNum());
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                    objOperaciones.limpiarResultado();
                                }
                                System.out.println("¿desea continuar con la suma? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objOperaciones.raizCudradaDosNum(0));
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                                objOperaciones.limpiarResultado();
                            }
                            System.out.println("¿desea continuar con la suma? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objOperaciones.raizCuadradaResNum());
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
                                        objOperaciones.limpiarResultado();
                                    }
                                    System.out.println("¿desea continuar con la suma? Y/N");
                                    decision = leer.next().charAt(0);
                                } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                        == 'y'));
                            }
                        }
                    } while (decision == 'Y' || decision == 'y');
                    break;
                case 6:
                    do {
                        System.out.println("Usted a elegido la opcion de porcentaje");
                        if (C == true){
                            do {
                                System.out.println(objOperaciones.porcentajeResNum(0));
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                    objOperaciones.limpiarResultado();
                                }
                                System.out.println("¿desea continuar obteniendo porcentajes? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objOperaciones.potenciaDosNum(0,0));
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                                objOperaciones.limpiarResultado();
                            }
                            System.out.println("¿desea continuar obteniendo porcentajes? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objOperaciones.porcentajeResNum(0));
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
                                        objOperaciones.limpiarResultado();
                                    }
                                    System.out.println("¿desea continuar obteniendo porcentajes? Y/N");
                                    decision = leer.next().charAt(0);
                                } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                        == 'y'));
                            }
                        }
                    } while (decision == 'Y' || decision == 'y');
                    break;
            }
        } while (opcion != 0);
        System.out.println("Adios amigo");
    }
}