package Lesson_01;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle...obstacles) {
        this.obstacles = obstacles;
    }

    public void start(Team team){
        for(Competitor c: team.getMembers()){
            for(Obstacle o: obstacles){
                o.doIt(c);
                if(!c.isOnDistance()) break;
            }
        }
    }
}
