interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Putting food into the gorilla's cage.");
            return true;
        }
        return false;
    }
    
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla: lather, rinse, repeat.");
    }
    
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla at your own risk!");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
