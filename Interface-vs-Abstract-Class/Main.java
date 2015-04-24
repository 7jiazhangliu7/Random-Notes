/**
 * Created by Jiazhang_Liu on 4/24/2015.
 */
public class Main {
    public static void main(String args[]) {
        // Animal a = new Animal("animal"); Error because Animal is abstract
        // Function f = new Function(); Error because interface cant create an object of itself
        // Function i = new Dog(""); Error because Dog extends Animal already
        
        Animal a = new Dog("Dog");
        a.cry(); // Wang!
        Animal a1 = new Cat("Cat");
        a1.cry(); // Miao!
        
        Function i = new Cow();
        i.print(); // Cow
    }
}
