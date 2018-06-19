package Stringoperation;

public class operations {

	
	
	public static void main(String azzxsa[])
	{
// String reverse		
	String name="Wayne";
	
		for(int i=name.length()-1;i>=0;i--) 
		{
			
			char c=name.charAt(i);
			
			System.out.print(c);
			
		}
		System.out.println ();
//Reversing a sentence
		
		String sen="This is weird";
		
		String[] ss=sen.split(" ");
		
		for(int i=ss.length-1;i>=0;i--)
		{
			
				System.out.print(ss[i]+" ");
				
			
		}
		
		System.out.println();
		
	//Printing repeated character in an string
		
		
		String alpha="this is amazing";
		int count=0;
		for(int i=0;i<alpha.length();i++)
		{
			
			for(int j=i+1;j<alpha.length();j++)
			{
				
				
				if(alpha.charAt(i)==alpha.charAt(j))
				{		
					
					System.out.println(alpha.charAt(j));
					
			
			
					
					
				}
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
}
