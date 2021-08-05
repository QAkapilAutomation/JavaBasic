package collectionsbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArraylist {

	public static void main(String[] args) {
		List<String>ar=Collections.synchronizedList(new ArrayList<String>());
		
		ar.add("java");
		ar.add("php");
		ar.add("python");
		
		//add remove - we dont need explicit Synchronization 
		// To fetch//traverse the values from this list -- we have to use explicit Synchronization
		
		
		synchronized (ar) {
			
			Iterator<String>it=ar.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		
		// CopyOnWriteArrayList ---it is class > Thread safe already 
		
		CopyOnWriteArrayList<String>empName=new CopyOnWriteArrayList<String>();
		empName.add("Kapil");
		empName.add("Rahul");
		empName.add("Gaurav");
		
		
		
		

	}

}
