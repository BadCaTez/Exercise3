public class Main {

    public static void main(String[] args) {
        Puppy spyke = new Puppy("Spykem", 10, "aboba", "white");
        spyke.showName();
        spyke.barkPuppy();
        spyke.bitePuppy();
        spyke.jumpPuppy();
        spyke.runBall();
    }
}
class Animal{
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void showName (){
        System.out.println("Имя животного: " + name + "\nВозраст животного: " + age);
    }
}
class Puppy extends Animal {
    String breed;
    String color;
    public Puppy(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }
    public void showName(){
        System.out.println("Щенка зовут: " + name + "\nЕго возраст: " + age + "мес." + "\nПорода щенка: " + breed);
    }
    public void runBall(){
        System.out.println("Щенок " + name + " побежал за мячиком");
    }
    public void barkPuppy(){
        System.out.println("Щенок " + name + " пискляво лаит");
    }
    public void jumpPuppy(){
        System.out.println("Щенок " + name + " разбежавшись, прыгнул за палкой ");
    }
    public void bitePuppy(){
        System.out.println("Щенок " + name + " начал кусать тапки");
    }
}
