package MentorLesson15.Task2;

public class MusicPlayer {

    public String playMusic(String songName){

        return songName + " is being played.";
    }

    public String playMusic(String songName,String format){

        return songName + " is being played in "+format+" format";
    }

    public String playMusic(String songName,int bitrate){

        return songName + " with the bitrate of "+bitrate+" kbps";
    }
}
