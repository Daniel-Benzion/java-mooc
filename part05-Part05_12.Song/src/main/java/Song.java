
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public String getArtist() {
        return artist;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDuration() {
        return durationInSeconds;
    }
    
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Song, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Song object
        Song comparedSong = (Song) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedSong.getName()) &&
            this.artist.equals(comparedSong.getArtist()) &&
            this.durationInSeconds == comparedSong.getDuration()) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

}
