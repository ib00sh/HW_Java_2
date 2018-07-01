package Lesson_01;

public class Swim extends Obstacle {

    int lenght;

    public Swim(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lenght);
    }
}
