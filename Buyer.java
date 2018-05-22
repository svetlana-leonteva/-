package ToGetCheese2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Buyer implements Runnable{
    private final String name;
    final String TAG = "GetCheese";
    
    public Buyer(String name) {
    	this.name = name;
    }

	public void run() {
		try {
	    for(int i = 1; i < 11; i++) {
	    	System.out.println(name + ": " + i + " получил сыр и ушел");
	    	Thread.sleep(100);
	    		    }
		} catch (InterruptedException ex) {
			Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
