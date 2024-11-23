package example;

import example.manager.MenuManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
        Scanner sc = new Scanner(System.in);

        int answer;
        do {
            System.out.println("\nМеню:");
            System.out.println("1. Додати амуніцію");
            System.out.println("2. Підрахувати загальну вартість");
            System.out.println("3. Сортувати амуніцію за вагою");
            System.out.println("4. Знайти амуніцію за діапазоном ціни");
            System.out.println("5. Показати всю амуніцію");
            System.out.println("6. Видалити амуніцію");
            System.out.println("7. Довідка");
            System.out.println("0. Вихід");
            System.out.print("Оберіть опцію: ");

            answer = sc.nextInt();
            switch (answer) {
                case 1:
                    // manager.setCommand(new AddAmmunitionCommand());
                    break;
                case 2:
                    // manager.setCommand(new CalculateTotalCostCommand());
                    break;
                case 3:
                    // manager.setCommand(new SortByWeightCommand());
                    break;
                case 4:
                    // manager.setCommand(new FindByPriceRangeCommand());
                    break;
                case 5:
                    // manager.setCommand(new DisplayAllAmmunitionCommand());
                    break;
                case 6:
                    // manager.setCommand(new RemoveAmmunitionCommand());
                    break;
                case 7:
                    // manager.setCommand(new ShowHelpCommand());
                    break;
                case 0:
                    System.out.println("Вихід з програми...");
                    break;
                default:
                    System.out.println("Неправильний вибір, спробуйте знову.");
            }

            if (answer > 0 && answer <= 7) {
                manager.runCommand();
            }
        } while (answer != 0);

        sc.close();
    }
}
