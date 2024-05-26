public class Main {
    public static void main(String[] args) {
        int check = 250;    // начальный счёт
        int cash = 1450;    // сумма пополнения
        int limit = 1000;   // Порог пополнения для бонусного начисления
        int bonus = 1;      // бонус
        int step = 100;     // шаг начисления бонуса
        int sum_bonus;      // Начисленный бонус
        int end_check;      // Итоговый счёт

        if (cash > limit) { // проверяем, превысила ли сумма пополнения порог
            sum_bonus = cash / step * bonus;
        } else {
            sum_bonus = 0;
        }
        end_check = check + cash + sum_bonus;
        System.out.println("Начальный счёт: " + check + " р.");
        System.out.println("Пополнение: " + cash + " р.");
        System.out.println("Бонус: " + sum_bonus + " р.");
        System.out.println("Итоговый счёт: " + end_check + " р.");
    }
}
