import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("팩토리얼(for문)");//println은 출력 후 줄바꿈(알고리즘 공부할땐 비추)
        int i,j,Value = 0;
        int factorial=1;
        System.out.println("팩토리얼을 구할 수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        Value = sc.nextInt();
        System.out.println(Value+"!의 팩토리얼 식 ");
        
        for(j = Value; j >= 0; j--) { //팩토리얼 식 보여주기
            if (j >= 2) {
                System.out.print(j + " × ");
            } else if (j == 1) {
                System.out.println(j);
            }
        }
        for(i = 1; i <=Value; ++i) {//계산 결과 
            factorial = factorial * i;
        }
        System.out.print("factorial of "+factorial);
    }
}