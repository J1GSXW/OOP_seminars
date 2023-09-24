package lsp;

public class Pinguin extends Bird{

    public Pinguin(){
        canFly = false;
        flySpeed = 0;
    }

    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать");
//        System.out.println("Пингвин не умеет летать\n");
    }
}
