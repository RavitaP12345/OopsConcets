package classObjectExample;

public class MainClass {
    public static void main(String[] args){
        Pen ballPen = new Pen("Fusion", "Blue", 5.0);
        Pen gelPen = new Pen("Zel", "Red", 5.0);
        ballPen.printInfo();
        gelPen.printInfo();

        Animal dog = new Animal();
        dog.initializeValues("tommy", "Grey");
        Animal cat = new Animal();
        cat.initializeValues("Puccy", "White");
        dog.printInfo();
        cat.printInfo();
    }
}
