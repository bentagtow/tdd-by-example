package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Franc {

    int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return amount == dollar.amount;

    }
}
