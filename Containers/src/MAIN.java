import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MAIN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is like a simple array with not that much functionality
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i=1; i<5; i++)
		{
			arrayList.add(new Integer(i));
		}
		
		// These lists have functionality out of the box such as size(), get()...
		System.out.println("arrayList size = " + arrayList.size());
		System.out.println("What is in index 1 ?  = " + arrayList.get(1));
		
		for(Integer tempInt: arrayList)
		{
			// Lets just print out ALL the values in arrayList
			System.out.println(tempInt);
		}
		
		///////////////////////////////////////////////////////////////////////
		
		// Linked list has mor functionality than arrayLists, but the base
		// calls are the same, like size(), get(), contains()
		List linkedList = new LinkedList();
		
		System.out.println("///////////////////////////////////////////////////////////////////////");
		
		///////////////////////////////////////////////////////////////////////
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Key1", "Value1");
		hashMap.put("Felix", "Lu");
		hashMap.put("Andrew", "Zhang");
		
		// Whats the size you say??
		System.out.println("Size of hashMap = " + hashMap.size());
		
		// Want to know if your map has your key?
		if (hashMap.containsKey("FELIX"))
		{
			System.out.println("FELIX is a key");
		}
		if (hashMap.containsKey("HAHAH"))
		{
			System.out.println("HAHA is a key");
		}
		
		// Find all the keys in your map?
		Set<String> keySet = hashMap.keySet();
		for (String key: keySet)
		{
			System.out.println(key);
		}
		
		// Can remove stuff from the hashMap
		hashMap.remove("FELIX");

	}

}
