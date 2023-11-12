package MentorLesson12;

import java.util.Arrays;
import java.util.Objects;

public class Playlist {
    private int size;
    private Song tracks[];
    private  int currentSize;

    public Playlist(int size) {
        tracks = new Song[size];
        currentSize =0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return size == playlist.size && currentSize == playlist.currentSize && Arrays.equals(tracks, playlist.tracks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, currentSize);
        result = 31 * result + Arrays.hashCode(tracks);
        return result;
    }


    public void addSong(Song song){
        if(currentSize< tracks.length){
            tracks[currentSize] = song;
            currentSize++;
        }else{
            System.out.println("Playlist is full");
        }
    }

    public void displaySongs() {
        for (int i = 0; i < tracks.length; i++) {
            System.out.println("Title: " + tracks[i].getTitle());
            System.out.println("Artist: " + tracks[i].getArtist());
            System.out.println("Duration: " + tracks[i].getDuration() + " seconds");
            System.out.println();
        }
    }
}
