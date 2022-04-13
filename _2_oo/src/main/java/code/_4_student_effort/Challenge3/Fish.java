package code._4_student_effort.Challenge3;

public class Fish extends Animal implements Pet {
    public String Name;
    protected Fish(String Name) {
        super(0);
        this.Name = Name;
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }
    @Override
    public void walk(){
        System.out.println("Fish can't walk");
    }
    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void setName(String setName) {
        this.Name = setName;
    }

    @Override
    public void Play() {
        System.out.println("Fish with name" + Name + "is playing");
    }

}
