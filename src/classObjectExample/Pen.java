package classObjectExample;

public class Pen {
    //Global Variable. There is no need to initialize with any values. these are automatically initialized with their default values.
    String name;
    String color;
    double price;
//Used constructor to initialize
    public Pen(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
//Default constructor
    public Pen() {
    }

    //Method to print the objects values;

    public void printInfo(){
        System.out.println("Name=>"+name+" Color=>"+color+" price=>"+price);
    }


}
