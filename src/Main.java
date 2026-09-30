public class Main {
    public static void main(String[] args) {

        UnknownObject object1 = new UnknownObject(2345, "08:00", "33.30,32.72", 1000, 200, "Північ", "Невідомий обʼєкт", "Радар"
        );

        DetectionEvent event1 = new DetectionEvent(8945, "08:00", "33.45,12.89", "Активно"
        );

        DetectionSource source1 = new DetectionSource(5970, "Перший радар", "Радар", "Жашків", "Активно"
        );

        Operator operator1 = new Operator(1560, "Тетяна Глухота", "Оператор", "tanyaVSC156", "Активно"
        );

        System.out.println(object1);

        System.out.println(event1);

        System.out.println(source1);

        System.out.println(operator1);

    }
}

