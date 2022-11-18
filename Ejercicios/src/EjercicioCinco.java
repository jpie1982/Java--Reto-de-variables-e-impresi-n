import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5 - Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo. Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años y [Nombre Completo] es actualmente su dueño(a)");

        Scanner lectura = new Scanner(System.in);

        System.out.println("Cual es el nombre de tu mascota");
        String name = lectura.nextLine();

        System.out.println("Cual es la edad de tu mascota");
        int edad = lectura.nextInt();

        System.out.println("Cual es la raza de tu mascota");
        String raza = lectura.nextLine();

        System.out.println("Cual es el nombre completo de tu mascota");
        String minombre = lectura.nextLine();

        System.out.println( name +" es un(a) " + raza +", el cual, tiene " + edad +" años y " + minombre +" es actualmente su dueño(a)");
    }
}
