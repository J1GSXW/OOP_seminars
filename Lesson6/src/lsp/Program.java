package lsp;

import Homework6.Order;

import java.util.ArrayList;
import java.util.List;

public class Program {
    // Tип S будет подтипом T тогда и только тогда,
    // когда объекту oS типа S соответствует некий объект oT типа Т таким образом, что для всех программ P,
    // реализованных в терминах Т, поведение Р не будет меняться, если оТ заменить на оS.
    public static void main(String[] args) {
        Bird bird1 = new Bird(); // oT
        Bird bird2 = new Bird(); // oT
        Bird bird3 = new Bird(); // oT

        Duck duck1 = new Duck(); // oS
        Duck duck2 = new Duck(); // oS

        Pinguin pinguin = new Pinguin();

        List<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        birds.add(duck1);
        birds.add(duck2);
        birds.add(pinguin);

        processFly(birds);
    }

    /**
     * P
     * @param birds
     */
    public static void processFly(List<Bird> birds){
        for (Bird bird:birds) {
            if (bird.isCanFly())
                bird.fly();
        }
    }
}
