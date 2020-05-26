package mined.blockchain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ShaUtils {
	public static String calcolaHash(String precHash, long timeStamp, int nonce)
	{
		String strHash = precHash + timeStamp + nonce + "";
		String codificata = null;
		
		MessageDigest digest;
		
		
		try {
			digest = MessageDigest.getInstance("SHA-256");
			byte[] arrayBytes = digest.digest(strHash.getBytes(StandardCharsets.UTF_8));
		    codificata = Base64.getEncoder().encodeToString(arrayBytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return codificata;
			
	}

}
