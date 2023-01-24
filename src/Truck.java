public class Truck extends Transport implements Competing {

    private final String downloadAddress;                    //адрес загрузки

    private final double maximumCargoVolume;             //максимальный объем груза

    private final double maximumCargoWeight;         //максимальный вес груза

    private final String downloadType;              //тип загрузки

    protected Truck (String marka, String model, double engineVolume, String downloadAddress, double maximumCargoVolume,
                     double maximumCargoWeight, String downloadType) {
        super(marka, model, engineVolume);
        this.downloadAddress = downloadAddress;
        this.maximumCargoVolume = maximumCargoVolume;
        this.maximumCargoWeight = maximumCargoWeight;
        this.downloadType = downloadType;
    }

    public String getDownloadAddress() {
        return downloadAddress;
    }

    public double getMaximumCargoVolume() {
        return maximumCargoVolume;
    }

    public double getMaximumCargoWeight() {
        return maximumCargoWeight;
    }

    public String getDownloadType() {
        return downloadType;
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
                ", адрес загрузки -  - " + downloadAddress  +
                ", максимальный объем груза - " + maximumCargoVolume +
                ", максимальный вес груза - " + maximumCargoWeight +
                ", тип загрузки ТС -  " + downloadType;
    }

    @Override
    public boolean passDiagnostics() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Грузовая машина " + getMarka() + " " + getModel() + " отремонтированная!");
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
        System.out.println(getMarka() +  " - максимальная скорость");;
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
