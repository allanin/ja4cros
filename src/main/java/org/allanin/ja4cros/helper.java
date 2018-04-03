import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class helper
{
 
	public static void checkRoot ()
	{

	try 
	{
	 Process p = Runtime.getRuntime().exec("id -u");
	 String account = helper.readAccount(p.getInputStream());
//	 debug: print id number for account
//	 System.out.println(account);

         if (account.equals("0"))
        {
         System.out.println("ja4cros should not be run as root.");
         System.exit(0);
        }

	}

	catch (Exception e)
	{
	 e.printStackTrace();
	}
	}


        public static String readAccount (InputStream input) throws Exception
        {

        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input)))
        {
         return buffer.lines().collect(Collectors.joining("\n"));
        }
        }

}
