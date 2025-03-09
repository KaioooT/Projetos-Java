import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veja se o seu triângulo é isósceles, equilátero ou escaleno");
        System.out.println("Digite o lado 1");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o lado 2");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o lado 3");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }

        scanner.close();
    }
}