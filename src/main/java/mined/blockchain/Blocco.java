package mined.blockchain;

import java.util.ArrayList;

public class Blocco {
	private long timestamp;
	private String thisHash;
	private String precHash;
	private String merkleRadice;
	private String nonce;
	private ArrayList<Transazione> listaTx = new ArrayList<Transazione>();
	
	public long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getThisHash() {
		return thisHash;
	}
	
	public void setThisHash(String thisHash) {
		this.thisHash = thisHash;
	}
	
	public String getPrecHash() {
		return precHash;
	}
	
	public void setPrecHash(String precHash) {
		this.precHash = precHash;
	}
	
	public String getNonce() {
		return nonce;
	}
	
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	
	@Override
	public String toString() {
		return "Blocco [timestamp=" + timestamp + ", thisHash=" + thisHash + ", precHash=" + precHash
				+ ", merkleRadice=" + merkleRadice + ", nonce=" + nonce + "]";
	}

	
}
