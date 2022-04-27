public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        //int bonus1 = service.calculate(20_000);
        //System.out.println("ОР: 1000, ФР: " + bonus1);

        //int bonus2 = service.calculate(5_000);
        //System.out.println("ОР: 250, ФР: " + bonus2);

        //int bonus3 = service.calculate(2_000);
        //System.out.println("ОР: 100, ФР: " + bonus3);
    }
}