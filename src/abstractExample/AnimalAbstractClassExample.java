package abstractExample;

public abstract class AnimalAbstractClassExample {

    String name;
    String color;
    String type;

    public abstract void initializeValues(String name, String color, String type);
    public abstract void printInfo();
    public void printAnything(){
        System.out.println("Anything...");
    }

}
