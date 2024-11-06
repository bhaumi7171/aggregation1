package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(13);
		a.add(45);
				System.out.println(a);
				a.remove(1);
				System.out.println(a);
				int length=a.size();
				System.out.println(length);
				System.out.println(a.get(0));
				boolean n=a.contains(13);
				System.out.println(n);
				Iterator it=a.iterator();
				while(it.hasNext())
				{
				System.out.println(it.next());
	}

}
}
