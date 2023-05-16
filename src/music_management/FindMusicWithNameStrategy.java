package music_management;

import java.util.ArrayList;
import java.util.List;

public class FindMusicWithNameStrategy implements FindMusicsStrategy {

    @Override
    public List<Music> findMusics(String critical, List<Music> musicList) {
        List<Music> result = new ArrayList<>();
        for (Music music : musicList
        ) {
            if (music.getSong().getTitle().equalsIgnoreCase(critical))
                result.add(music);
        }
        return result;
    }
}
