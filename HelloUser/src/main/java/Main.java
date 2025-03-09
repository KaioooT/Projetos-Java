import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Your Language [1] English [2] Portugues");
        int lingua = scanner.nextInt();
        scanner.nextLine();

        switch (lingua) {
            case 1:
                System.out.println("Whats Your Name?");
                String name = scanner.nextLine();
                System.out.println("Hello " + name);
                break;
            case 2:
                System.out.println("Qual seu Nome?");
                String nome = scanner.nextLine();
                System.out.println("Olá " + nome);
                break;
            default:
                System.out.println("Invalid Language Selection");
        }
        scanner.close();
    }
}