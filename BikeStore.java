/**
 * A Bike Store
 * @author Connor Downey
 */
public class BikeStore {
    
    /**
     * Creates a Bike
     * @param type Type of bike
     * @return The completed bike
     */
    public Bike orderBike(String type)
    {
        Bike bike = createBike(type);
        bike.createBike();
        return bike;
    }

    /**
     * Creates the bike by calling the correct class
     * @param type Used to call the correct class
     * @return The completed bike
     */
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
