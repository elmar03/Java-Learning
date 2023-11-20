package MentorLesson15.Task2;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        System.out.println(musicPlayer.playMusic("Metallica, 'One'"));
        System.out.println(musicPlayer.playMusic("'Sultans of swing'","MP3"));
        System.out.println(musicPlayer.playMusic("'Dream on'",400));
    }
}
