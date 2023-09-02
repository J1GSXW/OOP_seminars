package sample2;

public class BaseCat {

}

class Cat extends BaseDog implements Animal{
    @Override
    public void jump() {
        System.out.println("Кошка прыгает");
    }
}
