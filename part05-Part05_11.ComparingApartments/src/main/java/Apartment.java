
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return squares;
    }
    
    public int getPrice() {
        return princePerSquare * squares;
    }

    public boolean largerThan(Apartment compared) {
        return this.getSquares() > compared.getSquares();
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.getPrice() - compared.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.getPrice() > compared.getPrice();
    }
}
