package MentorLesson14.task2;

public class LengthOfLastWord {
    String text;

    public LengthOfLastWord(String text) {
        this.text = text;
    }

    public void lengthOfLastWord(){
        System.out.println(text.length()- (text.lastIndexOf(" ")+1));
    }
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord("");
        lengthOfLastWord.lengthOfLastWord();

    }
}
