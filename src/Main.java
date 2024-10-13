import java.util.Scanner;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int intNumber = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double floatNumber = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        scanner.nextLine();
        String stringInput = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean boolInput = scanner.nextBoolean();

        System.out.println("Виведення за допомогою println:");
        System.out.println("Ціле число: " + intNumber);
        System.out.println("Число з плаваючою точкою: " + floatNumber);
        System.out.println("Строка: " + stringInput);
        System.out.println("Логічне значення: " + boolInput);
        System.out.println();

        String template = "Ціле число: {0}, Число з плаваючою точкою: {1}, Строка: {2}, Логічне значення: {3}";
        String formattedMessage = MessageFormat.format(template, intNumber, floatNumber, stringInput, boolInput);
        System.out.println("Виведення за допомогою MessageFormat:");
        System.out.println(formattedMessage);

        String changedTemplate = "Строка: {2}, Логічне значення: {3}, Число: {0}, Число з плаваючою точкою: {1}";
        String changedFormattedMessage = MessageFormat.format(changedTemplate, intNumber, floatNumber, stringInput, boolInput);
        System.out.println("Змінений порядок аргументів:");
        System.out.println(changedFormattedMessage);
        System.out.println();

        System.out.println("Виведення за допомогою printf/format:");
        System.out.format("Ціле число (десяткова система): %d%n", intNumber);
        System.out.format("Ціле число (шістнадцяткова система): %x%n", intNumber);
        System.out.format("Ціле число (вісімкова система): %o%n", intNumber);
        System.out.format("Число з плаваючою точкою: %.2f%n", floatNumber);
        System.out.format("Строка з фіксованою шириною (20 символів): %-20s%n", stringInput);
        System.out.format("Логічне значення: %b%n", boolInput);
    }
}
