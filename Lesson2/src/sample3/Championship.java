package sample3;

public class Championship {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Барсик", 1500, 300),
                new Cat("Персик", 1700, 220),
                new Robot("R2D2", 99999, 0),
                new Robot("C3PQ", 5000, 50),
                new Human("Пётр", 2500, 150),
                new Human("Василий", 3500, 320),
        };

        Obstracle[] obstracles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(250),
        };

        for (Runner runner: runners) {
            for (Obstracle obstracle: obstracles) {
                if(obstracle instanceof Track){
                    if (!runner.run(obstracle.getLength()))
                        break;
                }
                else if(obstracle instanceof Wall){
                    if (!runner.jump(obstracle.getHeight()))
                        break;
                }
            }

        }
    }
}
