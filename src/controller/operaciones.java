package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class operaciones implements OperacionesBasicas, OperacionesCientificas{
    public static List<Float> resultado = new ArrayList<>();

    Scanner leer = new Scanner(System.in);
    public float obtenerUltimoResultado() {
        if (!resultado.isEmpty()) { // Verifica si la lista no está vacía
            return resultado.get(resultado.size() - 1); // Obtiene el último elemento de la lista
        } else {
            System.out.println("La lista de resultados está vacía.");
            return Float.NaN; // Devuelve NaN (Not a Number) para indicar que no hay ningún resultado disponible
        }
    }
    public void limpiarResultado(){
        resultado.clear();
    }
    @Override
    public float sumarDosNum(float num1, float num2) {
        System.out.println("por favor digite un numero");
        num1 = leer.nextFloat();
        System.out.println("ingrese otro numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es:");
        resultado.add(num1 + num2);
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float sumarResNum(float num2) {
        System.out.println("el primer numero es " + obtenerUltimoResultado());
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la suma de " + obtenerUltimoResultado() + " + " + num2 + " es:");
        resultado.add(resultado.get(resultado.size()-1) + num2);
        return  resultado.get(resultado.size()-1);
    }

    @Override
    public float restarDosNum(float num1, float num2) {
        System.out.println("por favor digite un numero");
        num1 = leer.nextFloat();
        System.out.println("ingrese otro numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la resta de " + num1 + " - " + num2 + " es:");
        resultado.add(num1 - num2);
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float restarResNum(float num2) {
        System.out.println("el primer numero es " + obtenerUltimoResultado());
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la resta de " + obtenerUltimoResultado() + " - " + num2 + " es:");
        resultado.add(obtenerUltimoResultado() - num2);
        return resultado.get(resultado.size()-1);
    }

    @Override
    public float multiplicarDosNum(float num1, float num2) {
        System.out.println("por favor digite un numero");
        num1 = leer.nextFloat();
        System.out.println("ingrese otro numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la multiplicacion de " + num1 + " * " + num2 + " es:");
        resultado.add(num1 * num2);
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float multiplcarResNum(float num2) {
        System.out.println("el primer numero es " + obtenerUltimoResultado());
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la multiplicacion de " + obtenerUltimoResultado() +
                " * " + num2 + " es:");
        resultado.add(resultado.get(resultado.size()-1) * num2);
        return resultado.get(resultado.size()-1);
    }

    @Override
    public float dividirDosNum(float num1, float num2) {
        System.out.println("por favor digite un numero");
        num1 = leer.nextFloat();
        System.out.println("ingrese otro numero");
        num2 = leer.nextFloat();
        if (num2 == 0){
            do {
                System.out.println("lo siento, no es posible dividir entre 0, ingresa otro numero");
                System.out.println("por favor digite un numero");
                num1 = leer.nextFloat();
                System.out.println("ingrese otro numero");
                num2 = leer.nextFloat();
            }while (num2 == 0);
        }
        System.out.println("El resultado de la divicion de " + num1 + " / " + num2 + " es:");
        resultado.add(num1 / num2);
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float dividirResNum(float num2) {
        System.out.println("el primer numero es " + obtenerUltimoResultado());
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextFloat();
        if (num2 == 0){
            do {
                System.out.println("lo siento, no es posible dividir entre 0, ingresa otro numero");
                System.out.println("el primer numero es " + obtenerUltimoResultado());
                System.out.println("ingrese el segundo numero");
                num2 = leer.nextFloat();
            }while (num2 == 0);
        }
        System.out.println("El resultado de la divicion de " + obtenerUltimoResultado() +
                " / " + num2 + " es:");
        resultado.add(resultado.get(resultado.size()-1) / num2);
        return resultado.get(resultado.size()-1);
    }

    @Override
    public float porcentajeDosNum(float num1, float num2) {
        System.out.print("Ingrese el número del cual desea calcular el porcentaje: ");
        num1 = leer.nextFloat();

        // Solicitar al usuario que ingrese el porcentaje que desea calcular
        System.out.print("Ingrese el porcentaje que desea calcular: ");
        num2 = leer.nextFloat();

        // Calcular el porcentaje
        resultado.add ((num2 / 100) * num1);

        // Mostrar el resultado
        System.out.println(num2 + "% de " + num1 + " es: ");
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float porcentajeResNum(float num2) {
        System.out.print("El número del cual desea calcular el porcentaje es " + resultado.get(resultado.size() - 1));
        System.out.print("Ingrese el porcentaje que desea calcular: ");
        num2 = leer.nextFloat();

        // Calcular el porcentaje
        resultado.add ((num2 / 100) * resultado.get(resultado.size() - 1));

        // Mostrar el resultado
        System.out.println(num2 + "% de " + resultado.get(resultado.size() - 1) + " es: ");
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float raizCudradaDosNum(float num1) {
        System.out.println("por favor digite un numero");
        num1 = leer.nextFloat();
        System.out.println("El resultado de la raiz cuadrada de " + num1 + " es:");
        resultado.add((float) Math.sqrt(num1));
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float raizCuadradaResNum() {
        System.out.println("El resultado de la raiz cuadrada de " + resultado.get(resultado.size() - 1) + " es:");
        resultado.add((float) Math.sqrt(resultado.get(resultado.size() - 1)));
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float potenciaDosNum(float base, float exponente) {
        System.out.print("ingrese el numero base: ");
        base = leer.nextFloat();
        System.out.print("ingrese el exponente");
        exponente = leer.nextFloat();
        System.out.println("el resultado de " + base + " ^ " + exponente + " es: ");
        resultado.add((float) Math.pow(base,exponente));
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float potenciaResNum(float exponente) {
        System.out.print("el numero base es: " + resultado.get(resultado.size() - 1));
        System.out.print("ingrese el exponente");
        exponente = leer.nextFloat();
        System.out.println("el resultado de " + resultado.get(resultado.size() - 1) + " ^ " + exponente + " es: ");
        resultado.add((float) Math.pow(resultado.get(resultado.size() - 1),exponente));
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float senoDosNum(float angulo, float radianes) {
        System.out.print("Ingrese el ángulo en grados: ");
        angulo = leer.nextFloat();
        radianes = (float) Math.toRadians(angulo);
        System.out.println("El seno de " + angulo + " grados es: ");
        resultado.add((float) Math.sin(radianes));
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float senoResNum(float radianes) {
        System.out.print("el ángulo en grados es: " + resultado.get(resultado.size() - 1));
        radianes = (float) Math.toRadians(resultado.get(resultado.size() - 1));
        System.out.println("El seno de " + resultado.get(resultado.size() - 1) + " grados es: ");
        resultado.add((float) Math.sin(radianes));
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float cosenoDosNum(float num1) {
        return 0;
    }

    @Override
    public float cosenoResNum() {
        return 0;
    }

    @Override
    public float tangenteDosNum(float num1) {
        return 0;
    }

    @Override
    public float tangenteResNum() {
        return 0;
    }

    @Override
    public float factorialDosNum(float num1) {
        return 0;
    }

    @Override
    public float factorialResNum() {
        return 0;
    }
}
