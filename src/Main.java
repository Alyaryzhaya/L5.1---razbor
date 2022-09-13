public class Main {

    public static void main(String[] args) {
// ЗАДАЧА ПРО БОНУСЫ (МИЛИ)

        // блок входных данных
        int price = 50000;

        // создаем объект
        BonusService service = new BonusService();

        // вызываем метод
        int bonus = service.calculate(price);

        System.out.println("Бонус: "  + bonus);


    }
}
