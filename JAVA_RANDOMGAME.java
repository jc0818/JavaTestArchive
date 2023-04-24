import java.util.Scanner;//입력 함수 
import java.util.Random;//난수 설정 함수 임포트
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int RandomNumBer = r.nextInt(100);
        System.out.println(RandomNumBer);//테스트용 랜덤카운터 확인

        while(true) {
            int gameTry = 1;                                    //시도 회수 변수
            System.out.println("0~99의 수를 결정하였습니다. 맞추어 보세요");
            System.out.println("0~99");
            while (true) {
                int inputN;                                //입력 변수
                System.out.print(gameTry++ + ">>");
                inputN = s.nextInt();                        //숫자 입력 받음

                if (inputN == RandomNumBer) {                //정답조건
                    System.out.println("맞았습니다.");
                    System.out.print("다시하시겠습니까?(y/n)>>");
                    if (s.next().equals("y")) { //y 2번째 While문 나가기
                        break;
                    } else return;
                } else if (inputN > RandomNumBer) {            //입력 > Random
                    System.out.println("더 낮은 수입니다! ");
                } else if (inputN < RandomNumBer) {            //입력 < Random
                    System.out.println("더 높은 수입니다!");
                }
            }
        }
    }
}







