package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ob=new ArrayList<String>();
		ob.add("Kala");
		ob.add("Arya");
		ob.add("Shefeena");
		ob.add("Anu");
		ob.add("Kanchi");
		System.out.println(ob);
		for(String a:ob)
		{
			System.out.println(a);
		}
	}

}
