package abstractExample;

public class AnimalExample extends AnimalAbstractClassExample{
    @Override
    public void initializeValues(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    @Override
    public void printInfo(){
        System.out.println("name=>"+name);
        System.out.println("color=>"+color);
        System.out.println("type=>"+type);
    }
}
