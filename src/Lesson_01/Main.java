package Lesson_01;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Arrow",new Human("Боб"), new Cat("Барсик"), new Dog ("Бобик"));
        Course course = new Course(new Cross(4000), new Wall(10), new Swim(3));
        course.start(team);

        System.out.println("--------");
        team.showWin();






    }
}
