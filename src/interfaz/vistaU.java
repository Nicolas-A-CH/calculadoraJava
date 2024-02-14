package interfaz;

import controller.*;

import java.util.Scanner;

public class vistaU {
    Scanner leer = new Scanner(System.in);
    operaciones objOperaciones = new operaciones();
    byte opcion, Dcalculadora, opcionCien;
    char decision, Dborrado;
    boolean C = false;

    public void interfazCalculadora() {
        System.out.println("Bienvenidos a la calculadora de Nicolas");
        do {
            System.out.println("Que calculadora desea usar");
            System.out.println("|1| Calculadora basica");
            System.out.println("|2| Calculadora cientifica");
            System.out.println("|0| salir");
            Dcalculadora = leer.nextByte();
            switch (Dcalculadora) {
                case 1:
                    do {
                        System.out.println("Bienvenido a la calculadora basica");
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
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.sumarResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con la suma? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.sumarDosNum(0, 0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la suma? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.sumarResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con la suma? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 2:
                                do {
                                    System.out.println("Usted a elegido la opcion de restar");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.restarResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con la resta? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.restarDosNum(0, 0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la resta? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.restarResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con la resta? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 3:
                                do {
                                    System.out.println("Usted a elegido la opcion de multiplicar");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.multiplcarResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con la multiplicacion? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.multiplicarDosNum(0, 0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la multiplicacion? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.multiplcarResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con la multiplicacion? " + "Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 4:
                                do {
                                    System.out.println("Usted a elegido la opcion de dividir");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.dividirResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con la divicion? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.dividirDosNum(0, 0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la divicion? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.dividirResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con la divicion? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 5:
                                do {
                                    System.out.println("Usted a elegido la opcion de raiz cuadrada");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.raizCuadradaResNum());
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con la suma? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.raizCudradaDosNum(0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la suma? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.raizCuadradaResNum());
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con la suma? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 6:
                                do {
                                    System.out.println("Usted a elegido la opcion de porcentaje");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.porcentajeResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar obteniendo porcentajes? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.porcentajeDosNum(0,0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar obteniendo porcentajes? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.porcentajeResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar obteniendo porcentajes? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                        }
                    } while (opcion != 0);
                    break;
                case 2:
                    do {
                        System.out.println("Bienvenido a la calculadora cientiica");
                        System.out.println("Por favor indique que desea hacer");
                        System.out.println("|1| Potencia");
                        System.out.println("|2| Seno");
                        System.out.println("|3| Coseno");
                        System.out.println("|4| Tangente");
                        System.out.println("|5| Facotorial");
                        System.out.println("|0| Cerrar calculadora");
                        opcionCien = leer.nextByte();
                        switch (opcionCien) {
                            case 1:
                                do {
                                    System.out.println("Usted a elegido la opcion de potenciar");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.potenciaResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con la potencia? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.potenciaDosNum(0, 0, '0'));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la potencia? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.potenciaResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con la potencia? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 2:
                                do {
                                    System.out.println("Usted a elegido la opcion de seno");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.senoResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con el seno? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.senoDosNum(0, 0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la seno? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.senoResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con el seno? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 3:
                                do {
                                    System.out.println("Usted a elegido la opcion de coseno");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.cosenoResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con el coseno Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.cosenoDosNum(0, 0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con el coseno? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.cosenoResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con el coseno? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 4:
                                do {
                                    System.out.println("Usted a elegido la opcion tangente");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.tangenteResNum(0));
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con el tangente? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.tangenteDosNum(0, 0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con el tangente? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.tangenteResNum(0));
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con el tangente? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                            case 5:
                                do {
                                    System.out.println("Usted a elegido la opcion de factorial");
                                    if (C == true) {
                                        do {
                                            System.out.println(objOperaciones.factorialResNum());
                                            System.out.println("Desea borrar el calculo? Y/N");
                                            Dborrado = leer.next().charAt(0);
                                            if (Dborrado == 'N' || Dborrado == 'n') {
                                                C = true;
                                            } else {
                                                C = false;
                                                objOperaciones.limpiarResultado();
                                            }
                                            System.out.println("¿desea continuar con la factorial? Y/N");
                                            decision = leer.next().charAt(0);
                                        } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                    } else {
                                        System.out.println(objOperaciones.factorialDosNum(0));
                                        System.out.println("Desea borrar el calculo? Y/N");
                                        Dborrado = leer.next().charAt(0);
                                        if (Dborrado == 'N' || Dborrado == 'n') {
                                            C = true;
                                        } else {
                                            C = false;
                                            objOperaciones.limpiarResultado();
                                        }
                                        System.out.println("¿desea continuar con la factorial? Y/N");
                                        decision = leer.next().charAt(0);
                                        if ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y')) {
                                            do {
                                                System.out.println(objOperaciones.factorialResNum());
                                                System.out.println("Desea borrar el calculo? Y/N");
                                                Dborrado = leer.next().charAt(0);
                                                if (Dborrado == 'N' || Dborrado == 'n') {
                                                    C = true;
                                                } else {
                                                    C = false;
                                                    objOperaciones.limpiarResultado();
                                                }
                                                System.out.println("¿desea continuar con la factorial? Y/N");
                                                decision = leer.next().charAt(0);
                                            } while ((Dborrado == 'N' || Dborrado == 'n') && (decision == 'Y' || decision == 'y'));
                                        }
                                    }
                                } while (decision == 'Y' || decision == 'y');
                                break;
                        }
                    } while (opcionCien != 0);
                    break;
            }

        } while (Dcalculadora != 0);
        System.out.println("Adios amigo");
    }
}