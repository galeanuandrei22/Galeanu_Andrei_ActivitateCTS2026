import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SlotContext aparat = new SlotContext();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Comnezi: 1. Adauga credit | 2. Da bet | 3. Iesi");

        while(running) {
            System.out.println("\nIntroduceti comanda: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    aparat.insertCoin();
                    break;
                case "2":
                    aparat.pressSpin();
                    break;
                case "3":
                    System.out.println("Castigurle au fost transferate! Felicitari jucatorule!");
                    running = false;
                    break;
                default:
                    System.out.println("Comanda invalida! Foloseste 1 2 sau 3");
            }
        }
        scanner.close();
    }
}
