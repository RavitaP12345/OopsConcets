package abstractExample;

public class MainClass {
    public static void main(String[] args){
        AnimalExample dog = new AnimalExample();
        dog.initializeValues("Tommy", "Grey", "Street Dog");
        dog.printInfo();
        dog.printAnything();

    }
}
