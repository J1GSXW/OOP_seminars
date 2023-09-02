package sample2;

public class BaseDog {
}

class Dog extends BaseDog implements Animal{
    @Override
    public void jump() {
        System.out.println("Собака прыгает");
    }
}
