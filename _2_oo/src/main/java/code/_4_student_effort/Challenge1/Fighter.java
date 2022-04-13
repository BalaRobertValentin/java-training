package code._4_student_effort.Challenge1;

public class Fighter{

    public final String Name;
    public final int damagePerAttack;
    public int health;

    public Fighter(String Name, int damagePerAttack, int health){
        this.Name = Name;
        this.damagePerAttack = damagePerAttack;
        this.health = health;
    }

    public void Attack(Fighter opponent)
    {
        opponent.health = opponent.health - this.damagePerAttack;
    }
}
