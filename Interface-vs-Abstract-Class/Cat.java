/**
 * Created by Jiazhang_Liu on 4/24/2015.
 */
public class Cat extends Animal implements Function{
    public Cat(String name) {
        super(name);
    }

    public void cry(){
        System.err.println("Miao!");
    }

    public void print() {
        System.err.println("Interface");
    }
}
