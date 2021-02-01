package sample;

public class Song {
    private String title;
    private String arist;
    private Double lengthInMinutes;
    private int releaseYear;

    public Song(String title, String arist, Double lengthInMinutes, int releaseYear) {
        this.title = title;
        this.arist = arist;
        this.lengthInMinutes = lengthInMinutes;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getArist() {
        return arist;
    }

    public Double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void printSongInfo(Song song){
        System.out.println("Song name: " + song.getTitle() + " by: " + song.getArist() + ", in the year " + song.getReleaseYear() + " runtime: " + song.getLengthInMinutes());
    }
}
