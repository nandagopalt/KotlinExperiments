package MethodReferences;

public class Player {
    private String name;
    private int rank;
    private double score;

    public Player(String name, int rank, double score) {
        this.name = name;
        this.rank = rank;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", score=" + score +
                '}';
    }
}
