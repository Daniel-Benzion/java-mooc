
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Book)) {
            return false;
        }
        
        Book compBook = (Book) compared;
        
        if (this.name.equals(compBook.name) && this.publicationYear == compBook.publicationYear) {
            return true;
        }
        return false;
    }

}
