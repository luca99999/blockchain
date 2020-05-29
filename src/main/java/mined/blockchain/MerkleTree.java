package mined.blockchain;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class MerkleTree {

	static List<String> hashLeafTx = new ArrayList<String>();
	static List<String> hashNodesTx = new ArrayList<String>();
   
	
  public static String merkleHashRoot(List<Transazione> listaTx) {
    
	  int x = 0;
	   
	  // crea una lista degli hash delle foglie 
	  for(int i = 0; i < listaTx.size(); i++)
	  {
		  String shaBase64 = ShaUtils.calcolaHash(listaTx.get(i).toString());
		  hashLeafTx.add(shaBase64);
	  }
	  
	  
	  // crea  la lista degli hash dei nodi
	  while (x < hashLeafTx.size()) 
	  {
	      // left
	      String left = hashLeafTx.get(x).toString();
	      
	      x++;

	      // right se ultimo della lista l'hash è calcolato solo 
	      // sul left
	      String right = "";
	      
	      if (x != hashLeafTx.size()) {
	        right = hashLeafTx.get(x).toString();
	      }

	      String shaBase64 = ShaUtils.calcolaHash(left + right);
	      hashNodesTx.add(shaBase64);
	      
	      x++;
	   }
	  
	  String s = "";
	  
	  for(int j = 0; j < hashNodesTx.size(); j++)
	  {
		  s += hashNodesTx.get(j);
	  }
	   
	  
	  System.out.println("s = " + s);
	  String root = ShaUtils.calcolaHash(s);
	  
	  return root;
	
  }
  
  
    
}