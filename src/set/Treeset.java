package set;

import java.util.Iterator;
import java.util.TreeSet;


public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>set=new TreeSet<String>();
		
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
