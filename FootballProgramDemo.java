import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Dinesh
 * Date: 7/18/13
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class FootballProgramDemo {
    public static void main(String[] args) throws IOException
    {
        String filename = "football.txt";
        int maxGoal=0;
        int minGoal=100;
        String nameOfTheTeam="";
        String nameOfMinTeam="";
        Pattern pattern = Pattern.compile("([\\s]{2})[0-9]{2}[*\\s]{4}[0-9]{2}");
        String regexForName="[.][\\s]{1}[aA-zZ]*";
        String regexForGoals="[\\d]{2}[\\s]{2}-[\\s]{2}[\\d]{2}";
        BufferedReader reader=null;
        try{
            try{

                FileReader fileReader = new FileReader(filename);
                reader = new BufferedReader(fileReader);
                Scanner in = new Scanner(reader);
                while(in.hasNextLine()){
                    String readLine = in.nextLine().trim();
                    Pattern goalPattern = Pattern.compile(regexForGoals);
                    Matcher goalMatcher = goalPattern.matcher(readLine);
                    Pattern namePattren = Pattern.compile(regexForName);
                    Matcher nameMatcher = namePattren.matcher(readLine);
                    if(goalMatcher.find()) if (nameMatcher.find()) {
                        String name = nameMatcher.group();
                        String goals = goalMatcher.group();
                        goals = goals.replaceAll("[\\s-]+", " ");
                        name = name.replaceAll("[\\s.]", " ");
                        String[] teamName = name.split(".");
                        String[] goalsScored = goals.split(" ");
                        int maximumGoal = Integer.parseInt(goalsScored[0]);
                        int mininimumGoal = Integer.parseInt(goalsScored[1]);
                        int differenceInGoal = Math.abs(maximumGoal - mininimumGoal);
                        if (differenceInGoal > maxGoal) {
                            maxGoal = differenceInGoal;
                            nameOfTheTeam = name;

                        } else if (differenceInGoal < minGoal) {
                            minGoal = differenceInGoal;
                            nameOfMinTeam = name;
                        }
                    }
                }

            } finally {
                if (reader != null) reader.close();
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        System.out.println("Minimum Goals : " +minGoal+ " by : " +nameOfMinTeam);
        System.out.println("Maximum Goals : " +maxGoal+ "  by : " +nameOfTheTeam);
    }
}







