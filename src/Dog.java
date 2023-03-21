public class Dog extends Animal {
    private boolean hasBeenWalked;
    private double speed;

    public Dog(String name, int age, boolean vaccinated, double height, double speed) {
        super(name, age, vaccinated, height);
        this.speed = speed;
    }


    public void Walk() {
        System.out.println("I have been walked");
        hasBeenWalked = true;
    }

    public double getSpeed() {
        return speed;
    }

    public void chaseCat() {
        System.out.println("You are chasing the cat");
    }
}