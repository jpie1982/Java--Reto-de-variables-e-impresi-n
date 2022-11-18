import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {

        System.out.println("Ejercicio 3 - Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre. Al finalizar debe imprimir en pantalla el siguiente mensaje \"Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre]");
        String nombre;
        String apellido;
        String madre;
        String padre;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        nombre  = lectura.nextLine();
        System.out.println("Cual es tu apellido");
        apellido  = lectura.nextLine();
        System.out.println("Cual es nombre de tu madre");
        madre  = lectura.nextLine();
        System.out.println("Cual es nombre de tu padre");
        padre  = lectura.nextLine();

        System.out.println("Yo " +nombre+ " " +apellido+ " soy hijo de "+madre+ " y de "+padre);
    }
}
