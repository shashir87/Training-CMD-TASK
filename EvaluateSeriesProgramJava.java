
public class EvaluateSeriesProgramJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sumOfSeries=0;
		int range=15;
		for(double i=1;i<=range;){
			sumOfSeries=sumOfSeries+(1/i);
			i=i+2;
		}
		System.out.println(sumOfSeries);
	}
}
