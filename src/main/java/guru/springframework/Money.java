package guru.springframework;

public class Money {
    int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;

    }

}
