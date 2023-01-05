import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<Car> savelii = new Mechanic<> ("Савелий", "Белов", "Рога и копыта");
        Mechanic <Transport> ivan = new Mechanic<>("Иван", "Маслеников", "Лада");
        Sponsor megafon = new Sponsor("Мегафон", 10_000_000);
        Sponsor lada = new Sponsor("Лада", 9_000_000);

        Bus ikarus = new Bus("Икарус", "263", 20, "Санкт-Петербург - Псков",
                100, 1870, 2005);
        ikarus.addDriver ((new DriverD("Афанасьев Сергей Анатольевич", "категория D", 40, ikarus)));
        ikarus.addMechanic(ivan);
        ikarus.addSponsor(megafon);

        Bus kia = new Bus("Киа", "Grandbird", 11, "Санкт-Петербург - Великий Новгород",
                40, 1200, 2014);
        Bus daf = new Bus("DAF", "MB", 6, "Санкт-Петербург - Сестрорецк",
                54, 1200, 2009);
        Bus vektor = new Bus("Вектор", "Next", 5, "Санкт-Петербург - Кириши",
                25, 500, 2020);

        Car volvo = new Car("Volvo", "S60", 2, "белый", 5, 195, "Швеция");
        volvo.addDriver((new DriverB("Зайцев Констнатин Анатольевич", "категория В", 10, volvo)));
        volvo.addMechanic(savelii);
        volvo.addSponsor(megafon, lada);

        Car toyota = new Car("Toyota", "Camry", 3.2, "черный", 5, 210, "Россия");
        Car kiaOptima = new Car("Kia", "Optima", 2, "синий", 5, 190, "Россия");
        Car honda = new Car("Honda", "Civic", 1.6, "черный", 5, 180, "Мексика");
        Truck man = new Truck("MAN", "TGL", 4.6, "Парнас",
                25, 3500, "верхняя");
        Truck volkswagen = new Truck("Volkswagen", "Crafter", 2, "Кушелевка",
                10, 1200, "задняя, боковая");
        volkswagen.addDriver ((new DriverC("Николаев Алексей Александрович", "категория С", 30, volkswagen)));
        volkswagen.addMechanic(savelii);
        volkswagen.addSponsor(lada);

        Truck ford = new Truck("Ford", "Transporter", 2, "Шушары",
                12, 1500, "задняя, боковая");
        Truck citroen = new Truck("Citroen", "Jump", 2, "морской порт",
                11, 1500, "задняя, боковая");
        DriverB categoryB = new DriverB("Зайцев Константин Анатольевич", "категория В", 10, volvo);
        DriverC categoryC = new DriverC("Николаев Алексей Александрович", "категория С", 30, man);
        DriverD categoryD = new DriverD("Афанасьев Сергей Анатольевич", "категория D", 40, daf);

        System.out.println("Домашнее задание № 1 и № 2");
        System.out.println(ikarus);
        System.out.println(kia);
        System.out.println(daf);
        System.out.println(vektor);
        System.out.println(volvo);
        System.out.println(toyota);
        System.out.println(kiaOptima);
        System.out.println(honda);
        System.out.println(man);
        System.out.println(volkswagen);
        System.out.println(ford);
        System.out.println(citroen);
        ikarus.pitStop();
        ikarus.bestLapTime();
        ikarus.maxSpeed();
        kia.pitStop();
        kia.bestLapTime();
        kia.maxSpeed();
        daf.pitStop();
        daf.bestLapTime();
        daf.maxSpeed();
        vektor.pitStop();
        vektor.bestLapTime();
        vektor.maxSpeed();
        volvo.pitStop();
        volvo.bestLapTime();
        volvo.maxSpeed();
        toyota.pitStop();
        toyota.bestLapTime();
        toyota.maxSpeed();
        kiaOptima.pitStop();
        kiaOptima.bestLapTime();
        kiaOptima.maxSpeed();
        honda.pitStop();
        honda.bestLapTime();
        honda.maxSpeed();
        man.pitStop();
        man.bestLapTime();
        man.maxSpeed();
        volkswagen.pitStop();
        volkswagen.bestLapTime();
        volkswagen.maxSpeed();
        ford.pitStop();
        ford.bestLapTime();
        ford.maxSpeed();
        citroen.pitStop();
        citroen.bestLapTime();
        citroen.maxSpeed();
        citroen.startMoving();
        citroen.spopMoving();
        volvo.startMoving();
        volvo.spopMoving();
        daf.startMoving();
        daf.spopMoving();
        System.out.println("Домашнее задание №3 и №4");
        System.out.println(categoryB);
        System.out.println(categoryC);
        System.out.println(categoryD);
        passDiagnostics(ikarus, kia, daf, vektor,
                volvo, toyota, kiaOptima, honda,
                man, volkswagen, ford, citroen);
        System.out.println("Домашка: введение в коллекции, списки и очереди");

        List <Transport> transports = List.of(ikarus, volvo, volkswagen);

        for (Transport transport : transports) {
            printInfo(transport);
        }

    }


    private static void printInfo(Transport transport) {
        System.out.println(" ");
        System.out.println("Информация по автомобилю " + transport.getMarka() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
    }


    public static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            passDiagnosticsTransport(transport);
        }
    }

    private static void passDiagnosticsTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getMarka()+ " " + transport.getModel() + " - не прошел диагностику!");
            }
        } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }