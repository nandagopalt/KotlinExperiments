package DesignPatterns.stratergypattern;

public class IndianStudent extends Student {
    public IndianStudent(String name) {
        super(name);
        socialNetwork = new Facebook();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();
    }
}
