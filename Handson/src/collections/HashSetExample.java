package collections;

import java.util.HashSet;

public class HashSetExample {

	
	public void HSExample()
	{
		
		HashSet<String> hash=new HashSet<String>();
		
		//HashSet<Data type> obj= new HashSet<data type>();
		{
			hash.add("a");
			hash.add("b");
			hash.add("c");
			hash.add("d");
			
			//for(DAta type obj: obj frm hashset)
			for(String obj2: hash)
				System.out.println("The elements in the hashset: "+obj2);
				
			System.out.println("The elements in the hashset: "+hash);
			System.out.println("The element b contains in the hash: "+hash.contains("b"));
			System.out.println("The element b contains in the hash: "+hash.contains("f"));
			System.out.println("The removal of hash element: "+hash.remove("a"));
			System.out.println(hash);
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSetExample obj=new HashSetExample();
obj.HSExample();

	}

}
