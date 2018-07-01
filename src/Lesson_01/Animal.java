package Lesson_01;

public class Animal implements Competitor {

    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        onDistance = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance){
            System.out.println(type + " " + name + " справился с беговой дистанцией");
        }
        else {
            System.out.println(type + " " + name + " не справился с беговой дистанцией");
            onDistance = false;
        }

    }

    @Override
    public void swim(int dist) {
        if(dist <= maxSwimDistance){
            System.out.println(type + " " + name + " справился с дистанцией по плаванью ");
        }
        else {
            System.out.println(type + " " + name + " не справился с дистанцией по плаванью ");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight){
            System.out.println(type + " " + name + " справился с высотой");
        }
        else {
            System.out.println(type + " " + name + " не справился с высотой");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        System.out.println(type + " " + name );

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;

    }


}
