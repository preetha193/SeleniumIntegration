package string;

public class StringExamples {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Preetha Selvaraj";
		int number=3;
		System.out.println(name.replace(" ", "")); // replace the space in between the words
		System.out.println(name.charAt(1)); //r
		System.out.println(name.length()); //16 including space
		System.out.println(name.equals("Arul")); //false
		System.out.println(name.equalsIgnoreCase("Karthik")); //false
		System.out.println(name.isEmpty()); //false
		System.out.println(name.isBlank()); //false
		System.out.println(name.contains("x")); //false
		System.out.println(name.charAt(1)); //r
		System.out.println(name.substring(1)); //reetha Selvaraj
		System.out.println(name.substring(2, 10)); //eetha Se includes starting index of position 2 and till 9
		System.out.println(name.replace("Selvaraj", "Karthik")); //Preetha Karthik
		System.out.println(name.indexOf(4)); 
		System.out.println(name.indexOf("X")); //=-1 since "X" is not available
		System.out.println(name.indexOf("e")); // 2 //"e" is in second postion. p=0, r=1,e=2
		System.out.println(name.indexOf("r", 5)); //13 from position 5, search for the letter "r" so it is 13
		System.out.println(name.indexOf("raj", 4)); //starting from 4th position, searching for "raj" and it starts from 13th position
		System.out.println(String.valueOf(4)); //convert this number as string, num can be any data type[int,float] already 
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.replaceAll("\\s", ""));
		System.out.println(name.join("-", "Preetha","Selvaraj"));

		String split="Is,this,a,gud,approach";
		String [] splittedString=split.split(","); //it is returning a string array so we are assigning to a variable with string array
		//using for each loop to display the splitted string
		for(String string:splittedString)
			
		{
			System.out.println(string);

		}





	}

}
