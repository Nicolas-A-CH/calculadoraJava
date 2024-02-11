package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class calculadora {
    float num1, num2;
    List<Float> resultado = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public List<Float> getResultado() {
        return resultado;
    }

    public void setResultado(List<Float> resultado) {
        this.resultado = resultado;
    }

    public abstract float operacionDosNum();
    public abstract float opracionResNum();

    public float obtenerUltimoResultado() {
        if (!resultado.isEmpty()) { // Verifica si la lista no está vacía
            return resultado.get(resultado.size() - 1); // Obtiene el último elemento de la lista
        } else {
            System.out.println("La lista de resultados está vacía.");
            return Float.NaN; // Devuelve NaN (Not a Number) para indicar que no hay ningún resultado disponible
        }
    }
}