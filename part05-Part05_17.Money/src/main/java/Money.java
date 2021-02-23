
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        } else if (cents < 0) {
            euros--;
            cents = 100 + cents;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        }
        return this.euros < compared.euros;
    }
    
    public Money minus(Money decreaser) {
        boolean lessEuros = this.euros < decreaser.euros;
        boolean sameEuros = this.euros == decreaser.euros;
        boolean lessCents = this.cents < decreaser.cents;
        boolean sameCents = this.cents == decreaser.cents;
        
        
        if (lessEuros || (sameEuros && lessCents)) {
            return new Money(0, 0);
        }
        return new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);   
    }

}
