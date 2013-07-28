import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingVariablesDemoProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String[] keywordArray = {"this","protected","public","return","try","static","while","throw","throws","void","for","abstract","new","switch","synchronized","boolean","break","byte","case","catch","char","class","do","if","double","else","extends","final","finally","float","private","implements","import","instanceof","int","short","long","super"};
		String[] operatorArray = {"==","!=","=","+","-","/","%","*","++","--","!",">",">=","<","<=","&&","||","?:","~","<<",">>",">>>","&","^","|"};
		List<String> keywordList= new ArrayList<String>();
		List<String> operatorList= new ArrayList<String>();
		operatorList.addAll(Arrays.asList(operatorArray));
		keywordList.addAll(Arrays.asList(keywordArray));
		int keywordCount=0;
		int operatorCount=0;
		String filename="C:\\Users\\Shashir Bharadwaj\\workspace\\OfficeTrainingPrograms\\src\\Employee.java";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String readLine= null;
		while((readLine=br.readLine())!=null){
			String[] stringTokens = readLine.split("[\\s]+");
			for(int i=0;i<stringTokens.length;i++){
				String word=stringTokens[i];
				if(keywordList.contains(word)){
					keywordCount++;
				}
				if(operatorList.contains(word)){
					operatorCount++;
				}
			}
		}
		System.out.println("Keywords Count in program : "+keywordCount);
		System.out.println("Operators Count in program : "+operatorCount);

	}

}
