public class Main {
    public static void main(String[] args) {
        int check = 250;    // начальный счёт
        int cash = 1450;    // сумма пополнения
        int limit = 1000;   // Порог пополнения для бонусного начисления
        int bonus = 1;      // бонус
        int step = 100;     // шаг начисления бонуса
        int sumBonus;      // Начисленный бонус
        int endCheck;      // Итоговый счёт

        if (cash > limit) { // проверяем, превысила ли сумма пополнения порог
            sumBonus = cash / step * bonus;
        } else {
            sumBonus = 0;
        }
        endCheck = check + cash + sumBonus;
        System.out.println("Начальный счёт: " + check + " р.");
        System.out.println("Пополнение: " + cash + " р.");
        System.out.println("Бонус: " + sumBonus + " р.");
        System.out.println("Итоговый счёт: " + endCheck + " р.");
    }
}
