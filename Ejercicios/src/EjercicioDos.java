import java.util.Scanner;
public class EjercicioDos {
    public static void main(String[] args) {
            String nombre;
            String apellido;
            int edad;
            float estatura;
            System.out.println("Ejercicio 2 - Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.");
            Scanner lectura = new Scanner(System.in);
            System.out.println("Cual es tu nombre");
            nombre  = lectura.nextLine();
            System.out.println("Cual es tu apellido");
            apellido  = lectura.nextLine();
            System.out.println("Cual es tu edad");
            edad  = lectura.nextInt();
            System.out.println("Cual es tu apellido");
            estatura  = lectura.nextFloat();
            System.out.println("Tu nombre completo es " +nombre+ " " +apellido+ ",tu edad es: "+ edad+ " años y estas midiendo " +estatura+" mts");



    }
}
