package controller;

public class calculadora {
    float num1, num2, resultado;

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

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float sumar(){
        resultado = num1 + num2;
        return resultado;
    }

    public float restar(){
        resultado = num1 - num2;
        return  resultado;
    }

    public float multiplicar(){
        resultado = num1 * num2;
        return resultado;
    }

    public float dividir(){
        resultado = num1 / num2;
        return resultado;
    }
}
