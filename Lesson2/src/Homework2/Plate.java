package Homework2;

public class Plate {
    private int food;

    public Plate(){
        this.food = 0;
    }
    public Plate(int food) {
        if (food < 0) {
            this.food = 0;
        }
        else {
            this.food = food;
        }
    }

    public int getFood() {
        return food;
    }


    public void addFood (int amount) {
        if (amount < 0){
            this.food = 0;
            System.out.println("Количество еды не может быть отрицательным\n");
        }
        else {
            this.food += amount;
            System.out.printf("В тарелку добавлено %d единиц еды, теперь в тарелке %d еды\n", amount, food);
        }
    }

    public boolean deleteFood (int amount) {
        if (this.food < amount){
            System.out.printf("В тарелке недостаточно еды для удаления, сейчас в тарелке %d еды\n", food);
            return false;
        }
        else {
            this.food -= amount;
            System.out.printf("Из тарелки удалено %d единиц еды, теперь в тарелке %d еды\n", amount, food);
            return true;
        }
    }

    public void info() {
        System.out.println("Количество еды в тарелке: " + food);
    }
}
