public abstract class Driver < T extends Transport > {

    private final String fullName;              //ФИО водителя
    private final String driverLicense;         //наличие водительских прав (категория вод.удост.)
    private final int experience;            //стаж
    private final T car;

    protected Driver(String fullName, String driverLicense, int experience, T car) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
        this.car = car;
    }

    public void startMoving() {                                         //метод начать движение
        System.out.printf("Driver %s started moving", this.fullName);
        this.car.startMoving();
    }

    public void stopMoving() {
        System.out.printf("Driver %s stopped moving", this.fullName);       //метод остановиться
        this.car.startMoving();
    }

    public void refill() {                                              //метод заправить авто
        System.out.printf("Driver %s refilling the %s %s",
                this.fullName, this.car.getMarka(), this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return String.format(
                "Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.fullName,
                this.car.getMarka(),
                this.car.getModel());
    }
}

