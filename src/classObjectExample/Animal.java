package classObjectExample;

public class Animal {
    String name;
    String color;


    //Method to initialize the values.
    public void initializeValues(String name, String color){
        //This keyword is used to indicate the global variable of class.
        this.name = name;
        this.color = color;
    }
    public void printInfo(){
        System.out.println("name===>"+name+"   color====>"+color);
    }
}
