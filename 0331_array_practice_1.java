import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];
		int iCount = 1;
		double dSum = 0.0;
		for(int i = 0; i < array.length; ++i)
		{
			iCount = i + 1;
			System.out.print("점수 " + iCount +"을 입력 하세요 : ");
			array[i] = sc.nextDouble();
			dSum += array[i];
		}
		sc.close();
		System.out.printf("입력한 점수들의 평균은 : " + "%.2f", (dSum / 10.0));
	}

}
