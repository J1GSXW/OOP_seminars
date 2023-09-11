package Homework4;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    {
        fruits = new ArrayList<T>();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight(){
        float currentWeight = 0f;
        for (T fruit:fruits) {
            if (fruit != null)
                currentWeight += fruit.getWeight();
        }
        return currentWeight;
    }


    public<E extends Box> boolean compare(E compareBox){
        if(compareBox.getWeight() == this.getWeight())
            return true;
        else
            return false;
    }

    public void replaceFruit(Box<T> boxToRemove){
        for (int i = 0; i < fruits.size(); i++) {
            for (int j = 0; j < boxToRemove.fruits.size(); j++) {
                this.fruits.addAll(boxToRemove.fruits);
                boxToRemove.fruits.clear();
            }
        }
    }

    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
