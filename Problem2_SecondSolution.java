//2nd problem
//Template pattern

public class Problem2_SecondSolution {
    public static void main(String[] args){
    Vehicle c = new Car();
    System.out.println("For car:");
    c.info();
    System.out.println("\nFor plane:");
    Vehicle p = new Plane();
    p.info();
    }
}

abstract class Vehicle {
   abstract int set_num_of_wheels();
   abstract int set_num_of_passengers();
   abstract boolean has_gas();

   //template method
   public final void info(){
       System.out.println("Number of wheels: "+set_num_of_wheels());
       System.out.println("Number of passengers: "+set_num_of_passengers());
       System.out.println("Has gas? "+has_gas());
   }
}

class Car extends Vehicle{

    int numW = 4;
    int numP = 4;
    
    @Override
    public int set_num_of_wheels(){
        return numW;
    }
    
    @Override
    public int set_num_of_passengers(){
        return numP;
    }
    
    @Override
    public boolean has_gas(){
        return true;
    }
}

class Plane extends Vehicle{
    
    int numW = 8;
    int numP = 150;
    
    @Override
    public int set_num_of_wheels(){
        return numW;
    }
    
    @Override
    public int set_num_of_passengers(){
        return numP;
    }
    
    @Override
    public boolean has_gas(){
        return false;
    }
}
