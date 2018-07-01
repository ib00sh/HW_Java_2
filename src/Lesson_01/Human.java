package Lesson_01;

public class Human implements Competitor {

    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Human( String name) {

        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        active = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance){
            System.out.println(name + " справился с беговой дистанцией");
        }
        else {
            System.out.println( name + " не справился с беговой дистанцией");
            active = false;
        }

    }

    @Override
    public void swim(int dist) {
        if(dist <= maxSwimDistance){
            System.out.println(name + " справился с дистанцией по плаванью");
        }
        else {
            System.out.println( name + " не справился с дистанцией по плаванью");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight){
            System.out.println(name + " справился с высотой");
        }
        else {
            System.out.println(name + " не справился с высотой");
            active = false;
        }
    }

    @Override
    public void info() {
        System.out.println(name);

    }

    @Override
    public boolean isOnDistance() {
        return active;
    }
}
