
/**
 * A class to represent a baked good
 *
 * @author Katie Emerson
 * @author Upskill Coding Bootcamp 2024
 * @version 1.16.2024
 */
public class BakedGood
{
    private String recipe;
    private String name;
    private double price;
    private int quantity;
    
    /**
     * Constructor for objects
     */
    public BakedGood(String name, String recipe, double price, int quantity) {
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity;
    }
    
    //modify quantity
    public void increaseQuantity(int count) {
        this.quantity+=count;
    }
    
    public String toString() {
        return "baked good: "+name+" ("+quantity+" @ "+this.price+ ")";
    }
    
    public static void main(String[] args) {
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 20, 0);
        //bake a dozen croissants
        croissant.increaseQuantity(12);
        System.out.println(croissant);
    }
}
