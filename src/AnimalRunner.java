public class AnimalRunner {
    public static void main(String args[]) {
        Cat c1 = new Cat("Jerry", 8, true, 6.3, 1.2);
        Dog d1 = new Dog("Spike", 9, false, 10.5, 30);
   System.out.println(c1.getClawLength());
     System.out.println(c1.getName());
       System.out.println(c1.getHeight());
         System.out.println(c1.getVaccinated());
           System.out.println(c1.getClawLength());
     c1.swim();
    c1.chaseMouse();
    c1.play();


     System.out.println(d1.getName());
       System.out.println(d1.getHeight());
         System.out.println(d1.getVaccinated());
        System.out.println(d1.getAge());
        System.out.println(d1.getSpeed());
     d1.swim();
d1.chaseCat();
    }

}
