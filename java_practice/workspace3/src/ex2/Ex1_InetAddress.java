package ex2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Ex1_InetAddress implements Ex1_InetAddressInter{

	private InetAddress[] ar;
	@Override
	public void searchDomain(String ns) throws UnknownHostException {
		// TODO Auto-generated method stub
		ar = InetAddress.getAllByName(ns);
	}

	@Override
	public ArrayList<String> getDomainList() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		for(InetAddress e: ar) {
			list.add(e.getHostAddress());
		}
		return list;
	}

	
}
