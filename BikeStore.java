
public class BikeStore {
    
    public Bike orderBike(String type)
    {
        Bike bike = createBike(type);
        bike.createBike();
        return bike;
    }

    private Bike createBike(String type)
    {
        if(type.equalsIgnoreCase("tricycle"))
        {
            return new Tricycle();
        }
        else if(type.equalsIgnoreCase("strider"))
        {
            return new Strider();
        }
        else if(type.equalsIgnoreCase("kids bike"))
        {
            return new KidsBike();
        }
        return null;
    }
}
