package javaapplication4;
public class JavaApplication4 {
    public static void main(String[] args) {
        Taxi x = new Taxi("ILY143");
        x.run ("ur");
        x.printCurrentLocation();
        //x:____ , y:____
        x.book(1,1);
        //x.run("I am leaving on a taxi");
        System.out.println(x.reachedDestination());
        //false
    }
    
}
