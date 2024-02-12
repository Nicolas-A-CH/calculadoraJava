package controller;

public class porcentaje extends calculadora{
    public porcentaje(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    public float operacionDosNum() {
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
    public float opracionResNum() {
        System.out.print("El número del cual desea calcular el porcentaje es " + resultado.get(resultado.size() - 1));
        System.out.print("Ingrese el porcentaje que desea calcular: ");
        num2 = leer.nextFloat();

        // Calcular el porcentaje
        resultado.add ((num2 / 100) * resultado.get(resultado.size() - 1));

        // Mostrar el resultado
        System.out.println(num2 + "% de " + resultado.get(resultado.size() - 1) + " es: ");
        return resultado.get(resultado.size() - 1);
    }
}
