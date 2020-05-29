package mined.blockchain;

import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String [] args) {
	  
	    List<Transazione> TxList = new ArrayList<Transazione>();
	  
	    for(int x = 0; x < 10; x++)
	    {
	    	TxList.add(new Transazione(x));
	    }
	   	    
	    String s = MerkleTree.merkleHashRoot(TxList);
	   
	    System.out.println("Merkel Root : " + s);
	}
		

}
