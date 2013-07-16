import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WeatherProgramDemo {

	public static void main(String[] args) throws IOException
	{
		String filename = "weather.txt";
		Pattern pattern = Pattern.compile("([\\s]{2})[0-9]{2}[*\\s]{4}[0-9]{2}");
		int count=0;
		int maxDayCount=0;
		int minDayCount=0;
		int maxDayTemperature=0;
		int minDayTemperature=100;
		BufferedReader reader=null;
		try{
			try{
		FileReader fileReader = new FileReader(filename);
		 reader = new BufferedReader(fileReader);
		Scanner in = new Scanner(reader);
		while(in.hasNextLine()){
			String readLine = in.nextLine().trim();
			Matcher matcher = pattern.matcher(readLine);
			if(matcher.find()){
				String lineRead = matcher.group();
				lineRead=lineRead.replaceAll("[\\s*]+", " ");
				count++;
				String []editedLine=lineRead.split(" ");
				int maxTemp=Integer.parseInt(editedLine[1]);
				int minTemp=Integer.parseInt(editedLine[2]);
				int differenceTemp=maxTemp-minTemp;
				if(differenceTemp>maxDayTemperature)
				{
					maxDayTemperature=differenceTemp;
					maxDayCount=count;
				}
				else if(differenceTemp<minDayTemperature){
					minDayTemperature=differenceTemp;
					minDayCount=count;
				}
			}
		}
			} finally {
				if (reader != null) reader.close();
			}
		} catch (IOException ioe){
			ioe.printStackTrace();
		} 
		System.out.println("Maximum Temperature : " +maxDayTemperature+ " On Day : " +maxDayCount);
		System.out.println("Minimum Temperature : " +minDayTemperature+ "  On Day : " +minDayCount);
	}
}
