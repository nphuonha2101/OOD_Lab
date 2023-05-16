package music_management;
import java.util.List;
public interface FindMusicsStrategy {
    List<Music> findMusics(String critical, List<Music> musicList);
}
