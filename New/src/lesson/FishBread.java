package lesson;


public class FishBread {
    String breadType;

    // ������
    public FishBread(){

    }

    public FishBread(String type) {
        breadType = type;
    }

    public void getBreadType() {
        System.out.println(breadType + "�� �ּ���");
    }

    public void sell(int num) {
        System.out.println(breadType + "���� " + num+"�� �Ⱦҽ��ϴ�");
    }

    public void podSell(int num) {
        System.out.println("�ϻ��� " + num + "�� �Ⱦҽ��ϴ�");
    }
    //
    public void cremeSell(int num) {
        System.out.println("ũ������ " + num + "�� �Ⱦҽ��ϴ�");
    }

    public void sell(String type, int num) {
        System.out.println(type + "���� " + num + "�� �Ⱦҽ��ϴ�");
    }

    public static void main(String[] args) {
        System.out.println("������ �ֹ��Ͻðڽ��ϱ�?");
        FishBread fb = new FishBread("��");
        fb.getBreadType();
        fb.sell(10);

        System.out.println("==============");

        FishBread fb2 = new FishBread();
        fb2.podSell(5);
        fb2.cremeSell(6);
        fb2.sell("��ä", 7);

    }
}