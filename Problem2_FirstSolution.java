//1st problem
//Strategy pattern


public class Problem2_FirstSolution {

    public static void main(String[] args) {
        
        Car c = new Car();
        System.out.println("For car: ");
        System.out.println("Number of wheels: "+c.set_num_of_wheels());
        System.out.println("Number of passengers: "+c.set_num_of_passengers());
        System.out.println("Gas? "+c.has_gas());
        
        Plane p = new Plane();
        System.out.println("For plane:");
        System.out.println("Number of wheels: "+p.set_num_of_wheels());
        System.out.println("Number of passengers: "+p.set_num_of_passengers());
        System.out.println("Gas? "+p.has_gas());
    }   
}

interface Vehicle {
int set_num_of_wheels();
int set_num_of_passengers();
boolean has_gas();
}

class Car implements Vehicle{

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

class Plane implements Vehicle{
    
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
