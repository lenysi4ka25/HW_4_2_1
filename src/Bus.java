public class Bus extends Transport implements Competing {

    private final String route;                    //маршрут

    private final int numberPassengers;             //количество пассажиров

    private final int maximumBaggageWeight;         //максимальный вес багажа

    private final int yearProductione;              //год выпуска

    protected Bus (String marka, String model, double engineVolume, String route, int numberPassengers, int maximumBaggageWeight, int yearProductione) {
        super(marka, model, engineVolume);
        this.route = route;
        this.numberPassengers = numberPassengers;
        this.maximumBaggageWeight = maximumBaggageWeight;
        this.yearProductione = yearProductione;
    }

    public String getRoute() {
        return route;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public int getMaximumBaggageWeight() {
        return maximumBaggageWeight;
    }

    public int getYearProductione() {
        return yearProductione;
    }

    @Override
    public void startMoving() {
        System.out.println(getMarka() + " - начать движение");
    }

    @Override
    public void spopMoving() {
        System.out.println(getMarka() + " - закончить движение");
    }

    @Override
    public String toString() {
        return super.toString() +
                " маршрут: " + route +
                ", количество пассажиров - " + numberPassengers +
                ", максимальный вес багажа - " + maximumBaggageWeight +
                ", год выпуска ТС -  " + yearProductione;
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобусу - " + getMarka() + " " + getModel() + " диагностика не требуется!");
        return true;
    }

    @Override
    public String pitStop() {
        System.out.println(getMarka() + " - заехать на Пит-Стоп");
        return getMarka();
    }

    @Override
    public String bestLapTime() {
        System.out.println(getMarka() + " - лушее время круга");
        return getMarka();
    }

    @Override
    public void maxSpeed() {
        System.out.println(getMarka() +  " - максимальная скорость");
    }

    /*@Override
    public String pitStop() {
        System.out.println(getMarka() + " - заехать на Пит-Стоп");
        return new String;
    }

    @Override
    public String bestLapTime() {
        System.out.println(getMarka() + " - лушее время круга");
        return new String;
    }

    @Override
    public int maxSpeed() {
        System.out.println(getMarka() +  " - максимальная скорость");
        return new int;
    }*/
}