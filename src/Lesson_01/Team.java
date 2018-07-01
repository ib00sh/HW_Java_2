package Lesson_01;

public class Team {
    String titleGroup;
    Competitor[] members;

    public Team(String titleGroup, Competitor...members) {
        this.titleGroup = titleGroup;
        this.members = members;
    }

    public Competitor[] getMembers() {
        return members;
    }

    public void showWin(){
        for (Competitor m: members){
           if(m.isOnDistance())
            m.info();
           else {
               System.out.print("Не добрался до финиша ");
               m.info();

           }
        }
    }
}
