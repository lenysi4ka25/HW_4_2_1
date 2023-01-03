import java.util.List;

public class Car extends Transport implements Competing {

    private final String colour;                    //цвет

    private final int numberSeats;                  //количество мест

    private final int maxSpeed;                     //максимальная скорость

    private final String countryManufacture;        //страна производства

    protected Car (String marka, String model, double engineVolume, String colour, int numberSeats, int maxSpeed, String countryManufacture) {
        super(marka, model, engineVolume);
        this.colour = colour;
        this.numberSeats = numberSeats;
        this.maxSpeed = maxSpeed;
        this.countryManufacture = countryManufacture;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCountryManufacture() {
        return countryManufacture;
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
        return  super.toString() +
                ", цвет - " + colour  +
                ", количество мест - " + numberSeats +
                ", максимальная скрость - " + maxSpeed +
                ", страна производства ТС -  " + countryManufacture;
    }

    @Override
    public boolean passDiagnostics() {
        return false;
    }

    @Override
    public String pitStop() {
        return getMarka() + " - заехать на Пит-Стоп";
    }

    @Override
    public String bestLapTime() {
        return getMarka() + " - лушее время круга";
    }

    @Override
    public void maxSpeed() {
        System.out.println(getMarka() +  " - максимальная скорость");
    }


}
