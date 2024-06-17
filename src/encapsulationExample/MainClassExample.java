package encapsulationExample;

public class MainClassExample {
    public static void main(String [] args){
        EncapsulationClassExample encpt = new EncapsulationClassExample();
        encpt.setUserId(1);
        encpt.setUserName("Ravita");
        encpt.setMobileNumber("8978899089");
        encpt.setEmailId("ravita@yopmail.com");
        System.out.println(encpt.getEmailId()+" "+encpt.getUserId()+" "+encpt.getUserName()+" "+encpt.getMobileNumber());

    }
}
