/**
 * Created by Jiazhang_Liu on 4/24/2015.
 */
public abstract class Animal {
    String name;
    public Animal(String name) {this.name = name;}

    public String Name() {
        return name;
    }

    public abstract void cry();
}
