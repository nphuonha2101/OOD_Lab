package music_management;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private String releaseDate;
    private String distributionLabel;
    private List<Music> musicList = new ArrayList<>();
    private FindMusicsStrategy findMusicsStrategy;
    private SortMusicsListStrategy sortMusicsListStrategy;

    public Album(String title, String releaseDate, String distributionLabel) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.distributionLabel = distributionLabel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDistributionLabel() {
        return distributionLabel;
    }

    public void setDistributionLabel(String distributionLabel) {
        this.distributionLabel = distributionLabel;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setFindMusicsStrategy(FindMusicsStrategy findMusicsStrategy) {
        this.findMusicsStrategy = findMusicsStrategy;
    }

    public void setSortMusicsListStrategy(SortMusicsListStrategy sortMusicsListStrategy) {
        this.sortMusicsListStrategy = sortMusicsListStrategy;
    }

    public List<Music> findMusic(String critical) {
        return findMusicsStrategy.findMusics(critical, this.musicList);
    }

    public List<Music> sortMusic() {
        return sortMusicsListStrategy.sortMusics(this.musicList);
    }

    public void addMusic(Music music) {
        this.musicList.add(music);
    }

    public List<Music> tenMusicsMostVisited() {
        List<Music> result = new ArrayList<>();

        for (int i = 0; i < musicList.size(); i++) {
            for (int j = 0; j < musicList.size() - 1; j++) {
                if (musicList.get(j).getVisitTimes() < musicList.get(j + 1).getVisitTimes()) {
                    Music temp = musicList.get(j);
                    musicList.set(j, musicList.get(j + 1));
                    musicList.set(j + 1, temp);
                }
            }

        }

        for (int i = 0; i < musicList.size(); i++) {
            if (result.size() > musicList.size() || result.size() > 10)
                break;
            result.add(musicList.get(i));
        }

        return result;
    }
}
