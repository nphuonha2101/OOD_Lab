package music_management;

public class TestDrive {

    public static void main(String[] args) {

        Song atbm  = new Song("ATBE", "atbe", "MTP", "Ballad");
        Song mrmsc = new Song("MRMSC", "mrmsc", "MTP", "Pop/Ballad");
        Song cctvlc = new Song("CCTVLC", "cctvlc", "PMQ", "Ballad");
        Song hl = new Song("HL", "hl", "PMQ", "Ballad");

        Music atbmM = new Music(atbm, "MTP", "abc/atbe.mp3", 5);
        Music mrmscM = new Music(mrmsc, "MTP", "abc/mrmsc.mp3", 4);
        Music cctvlcM = new Music(cctvlc, "PMQ", "abc/cctvlc.mp3", 8);
        Music hlM = new Music(hl, "PMQ", "abc/hl.mp3", 4);

        Album album = new Album("Test Album", "16/04/2023", "NHA");
        album.addMusic(atbmM);
        album.addMusic(mrmscM);
        album.addMusic(cctvlcM);
        album.addMusic(hlM);

        album.setFindMusicsStrategy(new FindMusicWithSingerStrategy());

        System.out.println(album.findMusic("MTP"));

        album.setFindMusicsStrategy(new FindMusicWithNameStrategy());

        System.out.println(album.findMusic("CCTVLC"));

        album.setSortMusicsListStrategy(new SortMusicsWithName());

        System.out.println(album.sortMusic());

        System.out.println(album.tenMusicsMostVisited());

    }
}
