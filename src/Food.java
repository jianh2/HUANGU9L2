public class Food {

    private String flavor;
    private double temperature;

    public Food(String flavor,double temperature){

        this.flavor = flavor;
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }
    public String  getflavor(){
        return flavor;
    }



}
