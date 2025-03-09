import java.util.Scanner;

public class Main {
    int fechar = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Idade");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você é de maior");
        } else {
            System.out.println("Você é de menor");
        }
    }
}
