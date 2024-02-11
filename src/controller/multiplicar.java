package controller;

public class multiplicar extends calculadora{

    public multiplicar(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    public float operacionDosNum() {
        System.out.println("por favor digite un numero");
        num1 = leer.nextFloat();
        System.out.println("ingrese otro numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la multiplicacion de " + num1 + " * " + num2 + " es:");
        resultado.add(num1 * num2);
        return resultado.get(resultado.size() - 1);
    }

    @Override
    public float opracionResNum() {
        System.out.println("el primer numero es " + obtenerUltimoResultado());
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El resultado de la multiplicacion de " + obtenerUltimoResultado() +
                " * " + num2 + " es:");
        resultado.add(resultado.get(resultado.size()-1) * num2);
        return resultado.get(resultado.size()-1);
    }
}
