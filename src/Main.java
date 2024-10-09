import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Объявляем объект класса Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Считываем количество вливаемой воды и размеры ванночек
        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        // Инициализируем переменные для излишка воды и количества заполненных ванночек
        double restOfWater = 0;
        int countOfFilledBaths = 0;

        // Проверяем первую(верхнюю) ванночку
        if (x >= a) {
            // Если вливаем в ванночку больше, чем может поместиться
            // то ванночка заполнена и осталось x - a воды
            countOfFilledBaths++;
            restOfWater = x - a;

        }
        // Проверяем вторую ванночку
        if (x + restOfWater >= b) {
            // Если вливаем в ванночку больше, чем может поместиться,
            // то ванночка заполнена и осталось x + предыдущий ост. - b воды
            countOfFilledBaths++;
            restOfWater = x + restOfWater - b;
        } else {
            // Иначе вся вода осталась на этом уровне
            restOfWater = 0;
        }
        // Проверяем третью ванночку
        if (x + restOfWater >= c) {
            // Если вливаем в ванночку больше, чем может поместиться,
            // то ванночка заполнена и осталось x + предыдущий ост. - c воды
            countOfFilledBaths++;
            restOfWater = x + restOfWater - c;
        } else {
            // Иначе вся вода осталась на этом уровне
            restOfWater = 0;
        }
        // Проверяем последнюю ванночку
        if (x + restOfWater >= d)
            // Если вливаем в ванночку больше, чем может поместиться, то ванночка заполнена
            countOfFilledBaths++;

        // Выводим количество заполненных ванночек
        System.out.println(countOfFilledBaths);
    }
}

