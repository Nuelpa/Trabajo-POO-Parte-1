import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        
        triangulo mitriangulo = new triangulo();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del triangulo");
        mitriangulo.lado = entrada.nextFloat();

        mitriangulo.perimetro = mitriangulo.lado * 3;

        mitriangulo.altura = ((mitriangulo.lado * Math.sqrt(3))/2);

        mitriangulo.area = ((mitriangulo.lado * mitriangulo.altura)/2);
        System.out.println("El perimetro del triangulo es: " + mitriangulo.perimetro + "\n" + "La altura del triangulo es: "
        + mitriangulo.altura + "\n" + "El area del triangulo es: " + mitriangulo.area);
    }
}


class triangulo{
    double lado;
    double perimetro;
    double altura;
    double area;
}