import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод и обработка двух чисел
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Оба числа равны");
        }

        System.out.println("Сложение: " + (num1 + num2));
        System.out.println("Вычитание: " + (num1 - num2));
        System.out.println("Умножение: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Деление: " + ((double) num1 / num2));
        } else {
            System.out.println("Ошибка: деление на ноль!");
        }

        // Ввод и сравнение строк
        scanner.nextLine(); // Очистка буфера
        System.out.println("Введите первую строку:");
        String line1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String line2 = scanner.nextLine();

        if (line1.equals(line2)) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Строки различны");
        }

        // Вывод четных чисел из массива
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные элементы массива:");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
