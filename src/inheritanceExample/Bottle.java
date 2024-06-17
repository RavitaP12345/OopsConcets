package inheritanceExample;

public class Bottle {
    String bottleName;
    String bottleType;
    String capacityInLiter;
    double price;

    public void initialize(String bottleName, String bottleType, String capacityInLiter, double price) {
        this.bottleName = bottleName;
        this.bottleType = bottleType;
        this.capacityInLiter = capacityInLiter;
        this.price = price;
    }

    public Bottle() {
    }
    public void printInfo(){
        System.out.println("name =>"+bottleName);
        System.out.println("bottleType===>"+bottleType);
        System.out.println("capacityInLiter===>"+capacityInLiter);
        System.out.println("price===>"+price);
    }
}
