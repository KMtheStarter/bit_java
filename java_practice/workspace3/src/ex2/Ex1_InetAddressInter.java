package ex2;

import java.net.UnknownHostException;
import java.util.ArrayList;

public interface Ex1_InetAddressInter {

	public void searchDomain(String ns) throws UnknownHostException;
	public ArrayList<String> getDomainList();
}
