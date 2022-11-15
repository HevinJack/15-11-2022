package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		
		set.add("jack");
		set.add("kevin");
		set.add("sendhil");
		set.add("maaran");
		
		Iterator itr=set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
