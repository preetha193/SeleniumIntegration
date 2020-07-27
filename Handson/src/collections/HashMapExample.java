package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public void hashfun()
	{
		HashMap <Integer, String> hash= new HashMap<Integer, String>();

		//to add elements in the hashmap, we use put
		hash.put(1, "one"); // this is called one entry
		hash.put(2, "two two");
		hash.put(3, "three");
		System.out.println("Hash elements: "+hash);

		//to make copy of the existing map instaed of putall, we can use clone
		Map<Integer, String> backup= new HashMap<Integer, String>();
		backup.putAll(hash);
		System.out.println("Hash map elements copied to backup map: " +backup);
		System.out.println(hash);
		System.out.println("Hash cloning"+hash.clone());
		System.out.println("Is backup map empty:?"+hash.isEmpty());
		// to check if a key is present or not
		System.out.println("is the key present: "+hash.containsKey(1));
		System.out.println("is the key present: "+hash.containsKey(10));
		System.out.println("is the key present: "+hash.containsValue("one"));
		System.out.println("is the key present: "+hash.containsValue("twenty"));
		System.out.println("is the key present: "+hash.get(2)); // display the value of the key "2"
		//to display only the key 
		System.out.println("To display only the keys: "+hash.keySet());
		System.out.println("To display only the values: "+hash.values());
		// to display complete entry set
		System.out.println("is the key present: "+hash.entrySet());
		



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMapExample obj=new HashMapExample();
		obj.hashfun();


	}

}
