package MentorLesson12;

public class songMain {
    public static void main(String[] args) {

        Playlist playlist1 = new Playlist(3);
        Song song1 = new Song("Song 1", "Artist 1", 180);
        Song song2 = new Song("Song 2", "Artist 2", 240);
        Song song3 = new Song("Song 1", "Artist 1", 180);
        Song song4 = new Song("Song 2", "Artist 2", 240);

        playlist1.addSong(song1);
        playlist1.addSong(song2);

        playlist1.addSong(song3);
        playlist1.displaySongs();

    }
}
