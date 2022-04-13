package code._4_student_effort.Challenge3;

public class Cat extends Animal implements Pet {

    private String Name;

    public Cat(String Name){
        super(4);
        this.Name = Name;
    }
    @Override
    public void eat() {
        System.out.println("Cat with " + legs + "legs is eating");
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
        System.out.println("Cat with name" + Name + "is playing");
    }
}
