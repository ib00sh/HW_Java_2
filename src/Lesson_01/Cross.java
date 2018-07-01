package Lesson_01;

public class Cross extends Obstacle {
    int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lenght);
    }
}


