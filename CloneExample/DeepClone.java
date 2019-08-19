class Animal implements Cloneable{

    String name;
    String feet;

    public Object clone() throws CloneNotSupportedException{
        //Animal Dog = (Animal)super.clone();
        return super.clone();
    }
}

class DeepClone{
    public static void main(String args[]) throws CloneNotSupportedException{

        Animal dog = new Animal();
        dog.name = "dog";
        dog.feet = "2";

        Animal bird = (Animal)dog.clone();
        bird.name = "bird";

        dog.feet = "4";
        
        System.out.println("My " + bird.name + " has: " + bird.feet + " feet");
        System.out.println("My " + dog.name + " has: " + dog.feet + " feet");



    }
}