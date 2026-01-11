public class AirConditioner{
    boolean isOn;
    int temperature = 24;
    
    public void turnOn(){
        isOn = true;
    }
    
    public void turnOff(){
        isOn = false;
    }

    public boolean isOn(){
        return isOn;    
    }

    public int getTemperature(){
        return temperature;
    }
    
    public void increaseTemp(){
        if (temperature < 30){
            temperature++;
        }
    }

    public void decreaseTemp(){
        if (temperature > 16){
            temperature--;
        }
    }
}
