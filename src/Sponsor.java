public class Sponsor {

    private final String nameSponsor;

    private final int amount;

    public Sponsor(String nameSponsor, int amount) {
        this.nameSponsor = nameSponsor;
        this.amount = amount;
    }

    public String getNameSponsor() {
        return nameSponsor;
    }

    public int getAmount() {
        return amount;
    }

    public void raceSponsor() {
        System.out.printf("Спонсор \"%s\" пронспонсировал заезд %d%n", nameSponsor, amount);
    }

    @Override
    public String toString() {
        return nameSponsor + ", проспонсировал заезд на сумму: " + amount + " рублей.";
    }
}
