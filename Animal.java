package Interface;

public class Animal implements Dog,Cat,Cow{

    @Override
    public void food() {
        System.out.println("Eating Food");
    }

    @Override
    public void eat() {
        System.out.println("Eating Grass");
    }

    @Override
    public void gives() {
        System.out.println("Gives Milk");
    }

    @Override
    public void sound() {
        System.out.println("Sounds bark");
    }
}
