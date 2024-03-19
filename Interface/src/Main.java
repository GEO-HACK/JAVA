
//interface is used to initialize a class as abstract
interface Animal{
    public void animalSound();//inteface method
    public void sleep();
}
//subclass of the class animal
class Pig implements Animal{
    public void animalSound(){
        //the body of the animal sound is represented
        System.out.println("The pig says :wee wee");
    }
    public void sleep(){
        //The body of the sleep is provided
        System.out.println("Zzzz!!!");
    }

}
public class Main {
    public static void main(String[] args) {

        Pig myPig = new Pig(); //creating a new object pig
        myPig.animalSound();
        myPig.sleep();

    }
}