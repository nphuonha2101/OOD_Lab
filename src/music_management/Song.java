package music_management;

public class Song {
    private String title;
    private String lyric;
    private String artist;
    private String genre;

    public Song(String title, String lyric, String artist, String genre) {
        this.title = title;
        this.lyric = lyric;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song: " + this.title + ", Lyric: " + this.lyric + ", Artist: " + this.artist + ", Genre: " + this.genre;
    }
}
