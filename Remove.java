public class Remove {

	public String check(String string) 
	{
		int n=string.length();
		String str="";
		if(n==0)
			str="";
		else if(n==1)
		{
			
			if(string.charAt(0)!='a')
			{
				str=str+string.charAt(0);
			}
		}
		
		else
		{
			if(string.charAt(0)=='a'&&string.charAt(1)=='a')
				str="";
			else if(string.charAt(0)=='a')
				str=str+string.charAt(1);
			else if(string.charAt(1)=='a')
			   str=str+string.charAt(0);
			else
				str=str+string.charAt(0)+string.charAt(1);
			str=str+string.substring(2,n);
		}
		return str;
		
	}

}