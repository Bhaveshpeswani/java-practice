public class Method {

    //Create A Full Throttle Method 
    public void fullThrottle(){
        System.out.println("This car is going as fast as it can! ");

    }

    //Create a speed() method  and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is : " + maxSpeed);
    }

    //Inside main, call the method on myCar object
    public static void main(String[] args){
        Method myCar = new Method();
        myCar.fullThrottle();
        myCar.speed(100);

    }
}