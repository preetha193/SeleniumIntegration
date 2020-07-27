package apiHandson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;

public class GetCall {


	public void getMethod() throws IOException
	{
		//1.Create object for URL class
		URL url=new URL("http://dummy.restapiexample.com/api/v1/employees"); //create obj for URL class and import java.net and pass the url.
		//2.open the URL connection and store it in its parent class which is nothing but httpURLConnection
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		//3. Set the request type say get or post
		connection.setRequestMethod("GET");
		//4. connect [optional] but as per procedure
		connection.connect();
		
		////5. Get the status code from the connection object and print
		int statusCode=connection.getResponseCode();

		System.out.println("Status code is: " +statusCode);
		//6. Get the response message and print
		String message=connection.getResponseMessage();
		System.out.println("Response Message: "+message);
		//7. Read the response i.e printing the entire json response, 
		//using getInputStream , getInputStream is a method and use "inputStream" object to store the content 
		InputStream inputStream=connection.getInputStream();
		//8. Create an input stream reader for reading the response body
		//to read the response content from inputStream, we use inputStreamReader object
		InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
		//9. Create a bufferedReader and pass the input stream reader
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		//Declare a string variable this should be used to read each line
		String line;
		//StringBuffer is mutable StringBuffer to append, reverse, replace, concatenate and manipulate Strings or sequence of characters. 
		StringBuffer buffer=new StringBuffer(); //StringBuffer performance will be speed.. compared to string.
		//10. Read the lines using readLine()
		while((line=bufferedReader.readLine())!=null)
		{
			buffer.append(line); // we should not print any stmt inside the loop 
			//so we create stringBuffer object and use that to print the entire response. 
		}//11.Read the lines until end of the page
		//12. StringBuffer is created and stores the lines read inside the loop
		//13. Print the buffer
		System.out.println(buffer);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetCall obj=new GetCall();
		obj.getMethod();
		
	}
	
	

}
