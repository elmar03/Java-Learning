package MentorLesson26.Example;

import MentorLesson26.Example.FuncInter;

public class Task {
    public static void main(String[] args) {
        FuncInter funcInter = (int x, int y)-> x+y;

        System.out.println(funcInter.test(5, 4));
    }
}
