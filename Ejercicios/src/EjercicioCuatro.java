import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
    String ciudad;
    String pais;
        System.out.println("Ejercicio 4 - Realizar un programa el cual solicite el nombre de una ciudad capital y el país. Al finalizar debe imprimir en pantalla el siguiente mensaje \"La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cual es tu Ciudad");
        ciudad = lectura.nextLine();
        System.out.println("Cual es tu Pais");
        pais  = lectura.nextLine();
        System.out.println("\"La ciudad " +ciudad+", es la capital del país " +pais);
    }
}
