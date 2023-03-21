public class Soup extends Food {
    private String meat;
    public Soup(String flavor, double temperature, String meat){
        super(flavor,temperature);
        this.meat = meat;
    }

    public void Stir(){
        System.out.println("You are stirring the soup");
    }


}
