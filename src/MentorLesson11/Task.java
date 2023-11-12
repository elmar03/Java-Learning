package MentorLesson11;

public class Task {

    public static void main(String[] args) {
        String text = "runforestrun";
        String word = "run";

        //System.out.println(text.indexOf("forest"));
        //System.out.println(text.lastIndexOf("run"));

        System.out.println(text.substring(text.indexOf("run")+word.length(),text.lastIndexOf("run")));

    }
}
