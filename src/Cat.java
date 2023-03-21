public class Cat extends Animal {
    private boolean hasPlayedWith;
    private double clawLength;
    public Cat(String name, int age, boolean vaccinated, double height, double clawLength){
        super(name,age,vaccinated,height);
        this.clawLength = clawLength;
    }
    public void play(){
        System.out.println("I am playing");
        hasPlayedWith = true;
    }

    public double getClawLength(){
        return clawLength;
    }

    public void chaseMouse(){
        System.out.println("You are chasing a mouse");
    }
}
