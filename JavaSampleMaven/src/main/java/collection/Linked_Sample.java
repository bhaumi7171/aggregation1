package collection;

import java.util.LinkedList;
import java.util.Iterator;

public class Linked_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				LinkedList<Integer> a=new LinkedList<Integer>();
				a.add(12);
				a.add(13);
				a.add(45);
						System.out.println(a);
						a.remove(1);
						System.out.println(a);
						int length=a.size();
						System.out.println(length);
						System.out.println(a.get(1));
						boolean n=a.contains(45);
						System.out.println(n);
						Iterator it=a.iterator();
						while(it.hasNext())
						{
						System.out.println(it.next());
			}
	}

}
