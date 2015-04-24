/**
 * Created by Jiazhang_Liu on 4/24/2015.
 */
public abstract class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void cry(){
        System.err.println("Wang!");
    }
}
