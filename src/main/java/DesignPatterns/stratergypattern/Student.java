package DesignPatterns.stratergypattern;

public abstract class Student {
    protected String name;
    protected SocialNetwork socialNetwork;

    public Student(String name) {
        this.name = name;
    }

    public abstract void useSocialNetwork();

    public void setSocialNetwork(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }
}
