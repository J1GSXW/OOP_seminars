package Homework2;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;

    public Cat(String name){
        this(name, 0);
        this.satiety = false;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (plate.deleteFood(this.appetite)){
            System.out.printf("%s съел %d еды из тарелки\n", this.name, this.appetite);
            satiety = true;
        }
        else {
            System.out.println(name + " не стал кушать т.к еды недостаточно\n");
            satiety = false;
        }
    }
}
