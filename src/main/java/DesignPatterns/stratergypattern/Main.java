package DesignPatterns.stratergypattern;

public class Main {
    public static void main(String[] args) {
        Student indianStudent1 = new IndianStudent("Indian 1");
        System.out.print("Indians are using : ");
        indianStudent1.useSocialNetwork();
        Student russianStudent1 = new RussianStudent("Russian 1");
        System.out.print("Russians are using : ");
        russianStudent1.useSocialNetwork();
        Student chineseStudent1 = new ChineseStudent("Chinese 1");
        System.out.print("Chinese are using : ");
        chineseStudent1.useSocialNetwork();
        System.out.print("Now using : ");
        chineseStudent1.setSocialNetwork(new Facebook());
        chineseStudent1.useSocialNetwork();
    }
}
