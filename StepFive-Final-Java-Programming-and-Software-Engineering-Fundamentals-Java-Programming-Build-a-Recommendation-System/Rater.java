import java.util.ArrayList;

/***************************************************************************
 *  Name:    JIAN MA
 *
 *  Date: 2nd October 2021
 *
 *  Description:  -------------------STEP Three--------
 *                Create a new public interface named Rater. Add methods to
 *                this new interface by copying all the method signatures
 *                from the PlainRater class.
 *
 ***************************************************************************/

public interface Rater {
    public void addRating(String item, double rating);
    
    public boolean hasRating(String item);
    
    public String getID();
    
    public double getRating(String item);
    
    public int numRatings();
    
    public ArrayList<String> getItemsRated();
}
