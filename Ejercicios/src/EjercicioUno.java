import java.util.Scanner;
public class EjercicioUno {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        System.out.println("Ejercicio 1 - Realizar un programa el cual solicite su nombre y apellidos.");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        nombre  = lectura.nextLine();
        System.out.println("Cual es tu apellido");
        apellido  = lectura.nextLine();

        System.out.println("Tu nombre completo es :" +nombre+ " " +apellido);
    }
}
