package lesson;

public class LessonEx01 {

    // Method Type : �Ϲ� method, main method, ������(Constructor)

    int tmpVal = 0;

    //  �⺻������ - ������ ����
    public LessonEx01() {
        System.out.println("�⺻������");
    }
    
    // ������
   public LessonEx01(int num) {
        System.out.println("�Ϲݻ�����");
        tmpVal = num;
    }
    public int disp() {
        System.out.println("static disp() ȣ��");
        System.out.println(tmpVal); // tmpVal 0
        return tmpVal;
    }
    public void calcuate() {

    }
    public int plus() {
        return 1;
    }
    public int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    public int plus(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
    public int plus(String num1, int num2) {
        return 0;
    }
    public static void main(String[] args) {
    	new LessonEx01();
//    	new LessonEx01(1);
    }

}