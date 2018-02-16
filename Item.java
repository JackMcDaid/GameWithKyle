
/**
 * It's an Item
 * 
 * @author JM and KA
 * @version 2/16/2018
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String name;
    private String desc;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        // initialise instance variables
        name="Basic";
        desc="Basic";
    }
    public Item(String name, String desc){
        this.name=name;
        this.desc=desc;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param
     * @return
     */
    public void observe(){
        System.out.println();
        System.out.println("This appears to be: "+name);
        System.out.println(desc);
    }
}
