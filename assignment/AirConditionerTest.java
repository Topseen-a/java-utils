public class AirConditionerTest{
    public static void main(String[] args){

        AirConditioner ac = new AirConditioner("Topseen");
        System.out.println(ac.getProductName());

        ac.setOn(true);
        System.out.println(ac.isOn());

        ac.setTemperature(16);
        System.out.println(ac.getTemperature());
    }
}
