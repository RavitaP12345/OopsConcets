package inheritanceExample;

public class MainClassExample {
    public static void main(String [] args){

        WaterBottle waterBottle = new WaterBottle();
        waterBottle.initialize("Pani", "Water bottle", "2", 20.0);
        waterBottle.waterBottleIntro();
        waterBottle.printInfo();
    }
}
