package music_management;

import java.util.ArrayList;
import java.util.List;

public class SortMusicsWithName implements SortMusicsListStrategy {
    @Override
    public List<Music> sortMusics(List<Music> musicList) {
        List<Music> result = new ArrayList<>();

        for (int i = 0; i < musicList.size(); i++) {
            for (int j = 0; j < musicList.size() - 1; j++) {
                if (musicList.get(j).getSong().getTitle().compareTo(musicList.get(j + 1).getSong().getTitle()) > 0) {
                    Music temp = musicList.get(j);
                    musicList.set(j, musicList.get(j + 1));
                    musicList.set(j + 1, temp);
                }
            }
        }
        return result;
    }

}
