package code._4_student_effort.Challenge1;

public class Main {

  public static void main(String[] args) {
    Fighter Player1 = new Fighter("Mircea",80,150);
    Fighter Player2 = new Fighter("Marcel",50,100);
    BoxingMatch match1 = new BoxingMatch(Player1,Player2);
    String Winner = match1.fight();
    System.out.println(Winner);



  }
}
