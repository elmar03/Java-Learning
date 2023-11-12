package Lesson11;
public class TopicString {
    String str1;
    String str2;

    public TopicString(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

     String Concatenation(){
        return str1 + str2;
    }
    public void DisplayResults(){
        System.out.println("Based on the given words, your result is: " + Concatenation());
    }

}
