package interfaz;

import controller.*;

import java.util.Scanner;

public class vistaU {
    Scanner leer = new Scanner(System.in);
    sumar objSumar = new sumar(0,0);
    restar objRestar = new restar(0,0);
    multiplicar objMultiplicar = new multiplicar(0,0);
    dividir objDividir = new dividir(0,0);
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
            System.out.println("|0| Cerrar calculadora");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Usted a elegido la opcion de sumar");
                        if (C == true){
                            do {
                                System.out.println(objSumar.opracionResNum());
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                }
                                System.out.println("¿desea continuar con la suma? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objSumar.operacionDosNum());
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                            }
                            System.out.println("¿desea continuar con la suma? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objSumar.opracionResNum());
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
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
                                System.out.println(objRestar.opracionResNum());
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                }
                                System.out.println("¿desea continuar con la resta? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objRestar.operacionDosNum());
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                            }
                            System.out.println("¿desea continuar con la resta? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objRestar.opracionResNum());
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
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
                                System.out.println(objMultiplicar.opracionResNum());
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                }
                                System.out.println("¿desea continuar con la multiplicacion? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objMultiplicar.operacionDosNum());
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                            }
                            System.out.println("¿desea continuar con la multiplicacion? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objMultiplicar.opracionResNum());
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
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
                                System.out.println(objDividir.opracionResNum());
                                System.out.println("Desea borrar el calculo? Y/N");
                                Dborrado = leer.next().charAt(0);
                                if (Dborrado == 'N' || Dborrado == 'n'){
                                    C = true;
                                }else{
                                    C = false;
                                }
                                System.out.println("¿desea continuar con la divicion? Y/N");
                                decision = leer.next().charAt(0);
                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y'));
                        }else {
                            System.out.println(objDividir.operacionDosNum());
                            System.out.println("Desea borrar el calculo? Y/N");
                            Dborrado = leer.next().charAt(0);
                            if (Dborrado == 'N' || Dborrado == 'n'){
                                C = true;
                            }else{
                                C = false;
                            }
                            System.out.println("¿desea continuar con la divicion? Y/N");
                            decision = leer.next().charAt(0);
                            if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision
                                    == 'y')) {
                                do {
                                    System.out.println(objDividir.opracionResNum());
                                    System.out.println("Desea borrar el calculo? Y/N");
                                    Dborrado = leer.next().charAt(0);
                                    if (Dborrado == 'N' || Dborrado == 'n'){
                                        C = true;
                                    }else{
                                        C = false;
                                    }
                                    System.out.println("¿desea continuar con la divicion? Y/N");
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