public class DriverB extends Driver<Car>{
    public DriverB(String fullName, String driverLicense, int experience, Car car) {
        super(fullName, driverLicense, experience, car);
    }

    @Override
    public String toString() {
        return "B";
    }
}
