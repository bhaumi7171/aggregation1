package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Array_Set {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			Set<Integer> ab=new HashSet<Integer>();
					ab.add(12);
					ab.add(13);
					ab.add(45);
							System.out.println(ab);
							ab.remove(1);
							System.out.println(ab);
							int length=ab.size();
							System .out.println(length);
							//System.out.println(ab.get(1));
							boolean n=ab.contains(45);
							System.out.println(n);
							Iterator it=ab.iterator();
							while(it.hasNext())
							{
							System.out.println(it.next());
				}
		}
	}

