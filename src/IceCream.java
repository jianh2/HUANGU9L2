public class IceCream extends Food{
private String coneType;
    public IceCream(String flavor, double temperature, String coneType){
        super(flavor,temperature);
        this.coneType = coneType;
    }

    public String getConeType(){
        return coneType;
    }
}
