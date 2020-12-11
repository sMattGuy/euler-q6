
public class SumSquare{
	public static void main(String[] args){
		int sumSquare = 0;
		int squareSum = 0;
		for(int i=1;i<=100;i++){
			sumSquare+=i*i;
		}
		for(int i=1;i<=100;i++){
			squareSum+=i;
		}
		squareSum*=squareSum;
		int answer = squareSum-sumSquare;
		System.out.println("Answer:"+answer);
	}
}