import java.io.*;
import java.util.*;

public class potenciaDeDois {
	public static void main(String[] args) throws Exception
	{
	  Scanner x = new Scanner(new File("C:\\Users\\Maxxtro\\Downloads\\d12.txt"));
	  int c =0;
	  while(x.hasNext()) {
		  String a = x.next();
		  System.out.println(a);
		  c++;
		  if (c == 3) {
	    	break;
	    }
	  }
	  x.close();
	}
}
