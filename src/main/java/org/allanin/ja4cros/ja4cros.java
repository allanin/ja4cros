public class ja4cros 
{
 
	public static void main (String[] args)
	{

	helper.checkRoot();

	String options = new java.util.Scanner( System.in ).nextLine();

	switch (options) 
		{
		 case "build":
		 System.out.println("build");
		 break;
		 case "download":
                 System.out.println("download");
                 break;
		 default:
		 usage.help();
		}
	}
}
