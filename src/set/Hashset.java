package set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>hs=new HashSet<String>();
		
		hs.add("Thakur");
		hs.add("Murmu");
		hs.add("Tamil");
		hs.add("Gopi");
		
		Iterator<String> itr=hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
