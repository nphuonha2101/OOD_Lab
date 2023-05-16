package music_management;

public class Music {
    private Song song;
    private String singer;
    private String path;
    private int visitTimes;

    public Music(Song song, String singer, String path, int visitTimes) {
        this.song = song;
        this.singer = singer;
        this.path = path;
        this.visitTimes = visitTimes;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(int visitTimes) {
        this.visitTimes = visitTimes;
    }

    @Override
    public String toString() {
        return "Music: " + this.song.toString() + "\n Singer: " + this.singer + "\n Path: " + this.path
                + "\n Visit Times: " + this.visitTimes + "\n";
    }
}
