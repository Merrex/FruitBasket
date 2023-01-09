package Objects;

import java.util.ArrayList;


public interface Bowl {

    //turn to class
    public ArrayList<Object> bowlContentList= new ArrayList<Object>();

    //Add
    public void add (Object object );
    public void add (ArrayList<Object> objectList );

    //Remove
    public void remove(Object object);
    public void removeAll();

    //Transfer
    public void transferAllContent(Bowl toBowl);//single parameter
    public void transferContent(Bowl fromBowl, Bowl toBowl, Object object);
    public void transferContent(Bowl fromBowl, Bowl toBowl, ArrayList<Object> objectList);

}
