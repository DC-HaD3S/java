package java1;

import java.util.*;

public class CollectionsEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List <String> item=new ArrayList()
				;
						item.add("shoe");
						Collections.addAll(item,"fruit","bat","toy");
						for(String it:item) {
							System.out.println(it);
	}

}
