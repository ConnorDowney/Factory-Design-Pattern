/**
 * A Bike
 * @author Connor Downey
 */
public abstract class Bike {
    
    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Abstract method for creating the bike
     */
    public void createBike()
    {
        createFrame();
        addWheels();
        addPedals();
        getPrice();
    }

    /**
     * Message for creating the frame
     */
    private void createFrame()
    {
        System.out.println("Assembling "+name+" frame");
    }

    /**
     * Message for adding wheels
     */
    private void addWheels()
    {
        if(numWheels!=0)
        {
            if(hasTrainingWheels)
            {
                System.out.println("Adding training wheels");
            }
            else
            {
                System.out.println("Adding "+numWheels+" wheel(s)");
            }
        }
    }

    /**
     * Message for adding pedals
     */
    private void addPedals()
    {
        if(hasPedals)
        {
            System.out.println("Adding pedals");
        }
    }

    /**
     * Message for price
     */
    public void getPrice()
    {
        System.out.println("Price: $"+price);
    }
}
