public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car(120, 50.0, 4);
        myCar.start();           
        myCar.displayFuel();     
        myCar.honk();            

        System.out.println();

        
        Bicycle myBike = new Bicycle(20, 0.0, true);
        myBike.start();          
        myBike.displayFuel();    
        myBike.ringBell();       

        
        
        

        
        myCar.setSpeed(130);
        System.out.println("Updated car speed: " + myCar.getSpeed());
    }
}

