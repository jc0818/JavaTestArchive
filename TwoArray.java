import java.util.Scanner;

public class TwoArray {

    public static void main(String[] args) {
        int[][] iArrayZ = new int[2][5];
        int[] iCheckArrayZ = new int[10]; // 빈도 체크용
        Scanner sc = new Scanner(System.in);

        System.out.println("0~9 사이 숫자로 10개를 입력하세요 (2행 x 5열)");

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print("[" + i + "][" + j + "] 위치 입력: ");
                int input = sc.nextInt();

                if (input < 0 || input >= 10) {
                    System.out.println("0~9 사이 숫자만 입력하세요. 다시 입력하세요.");
                    j--; // 같은 자리 다시 입력
                } else {
                    iArrayZ[i][j] = input;
                    iCheckArrayZ[input]++; // 빈도 증가
                }
            }
        }

        sc.close();

        System.out.println("\n저장된 2차원 배열 출력:");
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print("[" + iArrayZ[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("\n빈도 배열 출력:");
        for (int i = 0; i < 10; ++i) {
            System.out.print("[" + iCheckArrayZ[i] + "] ");
        }

        System.out.println("\n\n중복된 숫자:");
        for (int i = 0; i < 10; ++i) {
            if (iCheckArrayZ[i] >= 2) {
                System.out.print("[" + i + "] ");
            }
        }

        System.out.println("\n\n한 번도 입력되지 않은 숫자:");
        for (int i = 0; i < 10; ++i) {
            if (iCheckArrayZ[i] == 0) {
                System.out.print("[" + i + "] ");
            }
        }

        System.out.println("\n");
    }
}
