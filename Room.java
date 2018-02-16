import java.util.*;
/**
 * It's a rooom
 * 
 * @author JM and KA 
 * @version 0.01
 */
public class Room
{
    // instance variables - replace the example below with your own
    private String desc;
    private String name;
    private Arraylist<Item> roomInven = new Arraylist<Item>;
    private int xPos;
    private int yPos;

    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        // initialise instance variables
        desc="";
        name="";
        xPos=0;
        yPos=0;
    }
    public Room(String name, String desc, int xPos, int yPos, ArrayList<Item> roomInven)
    {
        this.name=name;
        this.desc=desc;
        this.xPos=xPos;
        this.yPos=yPos;
        this.roomInven=roomInven;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public enter()
    {
        System.out.println(desc);
    }
}
