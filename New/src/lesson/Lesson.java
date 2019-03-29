package lesson;

public class Lesson {
    public static void main(String[] args) {

        // 立辟磊, void(府畔)

        // static
        LessonEx01 lesson1 = new LessonEx01();
        lesson1.disp();      // 0

        //  按眉积己 - 积己磊
        LessonEx01 lesson2 = new LessonEx01();
        lesson2.disp();      // 0

        System.out.println("======================");

        LessonEx01 lesson3 = new LessonEx01(1);
        lesson3.disp();      // 1

        // overloading
        int val1 = lesson1.plus();
        int val2 = lesson1.plus(3, 5);
        int val3 = lesson1.plus(3, 5, 1);
        System.out.println("val1 : " + val1);
        System.out.println("val2 : " + val2);
        System.out.println("val3 : " + val3);

    }
}