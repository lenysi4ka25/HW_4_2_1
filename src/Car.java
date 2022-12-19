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

    }

    @Override
    public void spopMoving() {

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
    public String[] pitStop() {
        System.out.println(getMarka() + " - заехать на Пит-Стоп");
        return new String[0];
    }

    @Override
    public String[] bestLapTime() {
        System.out.println(getMarka() + " - лушее время круга");
        return new String[0];
    }

    @Override
    public int[] maxSpeed() {
        System.out.println(getMarka() +  " - максимальная скорость");
        return new int[0];
    }
}
