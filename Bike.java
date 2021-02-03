public abstract class Bike {
    
    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public void createBike()
    {
        createFrame();
        addWheels();
        addPedals();
        getPrice();
    }

    private void createFrame()
    {
        System.out.println("Assembling "+name+" frame");
    }

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

    private void addPedals()
    {
        if(hasPedals)
        {
            System.out.println("Adding pedals");
        }
    }

    public void getPrice()
    {
        System.out.println("Price: $"+price);
    }
}
