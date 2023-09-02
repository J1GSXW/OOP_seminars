package sample3;

public class Cat extends BaseCat implements Runner {
    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

}

class BaseCat{

}
