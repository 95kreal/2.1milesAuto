public class BonusMilesService {
    public int calculate(int price) {
        int bonus = price / 20;
        System.out.println("Сумма покупки: " + price + " руб.");
        System.out.println("Ваш бонус: " + bonus + " миль");
        return bonus;
    }
}
