package controller;

public class raizCuadrada extends calculadora{

    public raizCuadrada(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    public float operacionDosNum() {
        System.out.println("por favor digite un numero");
        num1 = leer.nextFloat();
        System.out.println("El resultado de la raiz cuadrada de " + num1 + " es:");
        resultado.add((float) Math.sqrt(num1));
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float opracionResNum() {
        System.out.println("El resultado de la raiz cuadrada de " + resultado.get(resultado.size() - 1) + " es:");
        resultado.add((float) Math.sqrt(resultado.get(resultado.size() - 1)));
        return resultado.get(resultado.size() - 1);
    }
}
