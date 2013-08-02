import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;



public class CountingLinesInACode

{
	public static void main(String[] args) throws IOException {
	    System.out.println("Enter the path to your JAVA source file: ");
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String filename = null;
	   	        filename = br.readLine();
	        		String code = new Scanner(new File(filename)).useDelimiter("\\A").next();
	        		code = Pattern.compile("/\\*.*?\\*/|//.*?$", Pattern.MULTILINE | Pattern.DOTALL).matcher(code).replaceAll("");
	        		String[] s = Pattern.compile("\\S.*?$", Pattern.MULTILINE).split(code.trim());
	        		System.out.println(s.length);
	        	}
	        }