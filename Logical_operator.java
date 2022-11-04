import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Logical_operator {

	public static void main(String[] args) 
	{
	    int size = 10;

	    ArrayList<Integer> list = new ArrayList<Integer>(size);
	    for(int i = 1; i <= size; i++) 
	    {
	        list.add(i);
	    }

	    Random rand = new Random();
	    String buffer = "";
	    while(list.size() > 0) 
	    {
	        int index = rand.nextInt(list.size());
	        buffer += ","+list.remove(index);

	    }
	    JOptionPane.showMessageDialog(null, "Selected: "+buffer);
	}
}
