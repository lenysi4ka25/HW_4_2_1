import java.util.ArrayList;
import java.util.List;

public abstract class Transport {

    private String marka;   //марка
    private String model;   // модель

    private double engineVolume;  // объем двигателя

    private final List<Driver<?>> drivers = new ArrayList<>();

    protected Transport(String marka, String model, double engineVolume) {
        this.marka = marka;
        this.model = model;
        this.engineVolume = engineVolume;

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if (marka != null && !marka.isEmpty() && !marka.isBlank()) {
            this.marka = marka;
        } else {
            this.marka = "Информация не указана";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Информация не указана";
        }
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }

    public abstract void startMoving();  // метод начать движение

    public abstract void spopMoving();   //метод закончить движение

    @Override
    public String toString() {
        return    " марка - " + marka +
                ", модель - " + model +
                ", объем двигателя - " + engineVolume;
    }

    public abstract boolean passDiagnostics();
}