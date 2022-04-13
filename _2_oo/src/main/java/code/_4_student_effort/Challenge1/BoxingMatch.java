package code._4_student_effort.Challenge1;

public class BoxingMatch {

    private final Fighter Player1;

    private final Fighter Player2;

    public BoxingMatch(Fighter Player1, Fighter Player2){
        this.Player1 = Player1;
        this.Player2 = Player2;
    }

    public String fight(){
        while(Player1.health > 0 && Player2.health > 0){
            Player1.Attack(Player1);
            Player2.Attack(Player2);
        }
        if (Player1.health > Player2.health) {
            return Player1.Name;

        }
        else
            return Player2.Name;
    }

}

