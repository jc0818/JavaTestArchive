import java.util.HashMap;
import java.util.Scanner;

public class Main{
    static HashMap<String,Integer> Menu = new HashMap<String,Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true)
        {
            printInfo();
            num = sc.nextInt();
            if(num == 0)
            {
                System.out.println("종료합니다.");
                break;
            }
            checkCase(sc,num);
        }
        sc.close();
    }

    private static void checkCase(Scanner sc,int num) {
        switch (num)
        {
            case 1:
                insertMenu(sc);
                break;
            case 2:
                modifyMenuPrice(sc);
                break;
            case 3:
                deleteMenu(sc);
                break;
            case 4:
                printAllMenu();
                break;
            case 5:
                searchSpecificMenu(sc);
                break;
            default:
                System.out.println("그런 번호는 없다. \n");
                break;
        }
    }

    private static void searchSpecificMenu(Scanner sc) {
        String MenuName;
        System.out.print("검색 하실 음식을 입력하세요 : ");
        MenuName = sc.next();
        if(Menu.containsKey(MenuName))
        {
            System.out.println(MenuName + "," + Menu.get(MenuName) + "\n");
        }else {
            System.out.println("그런 음식 없음\n");
        }

    }

    private static void printAllMenu() {
        int indexNum = 0;
        for(String key : Menu.keySet())
        {
            int value = Menu.get(key);
            indexNum += 1;
            System.out.println(indexNum + " : " + key + "," + value);
        }
    }

    private static void deleteMenu(Scanner sc) {
        String MenuName;

        System.out.print("삭제하실 음식 이름을 입력 해주세요. : ");
        MenuName = sc.next();

        if(Menu.containsKey(MenuName))
        {
            Menu.remove(MenuName);
            System.out.print("삭제완료! \n");
        }else {
            System.out.println("그런 음식 없음\n");
        }

    }

    private static void modifyMenuPrice(Scanner sc) {
        String MenuName;
        int resetPrice;
        printAllMenu();

        System.out.print("가격 수정 하실 음식을 선택해주세요. : ");
        MenuName = sc.next();

        if(Menu.containsKey(MenuName))
        {
            System.out.println("가격 수정 : ");
            resetPrice = sc.nextInt();
            Menu.replace(MenuName,resetPrice);
            System.out.println("수정이 완료 되었습니다. \n");
        }else {
            System.out.println("그런 음식 없음\n");
        }

    }

    private static void insertMenu(Scanner sc) {
        String sProduct;
        int iPrice;

        System.out.print("상품 이름 입력: ");
        sProduct = sc.next();
        System.out.print("상품 가격 입력: ");
        iPrice = sc.nextInt();


            if(Menu.containsKey(sProduct))//존재 하면
            {
                System.out.println("\""+sProduct +"\" 은 이미 존재하여 메뉴를 등록 할 수 없습니다.\n ");

            }else {
                Menu.put(sProduct,iPrice);
                System.out.println("추가 되었습니다. \n");
            }

    }


    public static void printInfo()
    {
        System.out.println("카페 메뉴 관리 프로그램");
        System.out.println("1. 메뉴 등록");
        System.out.println("2. 메뉴 가격 수정 ");
        System.out.println("3. 메뉴 삭제");
        System.out.println("4. 전체 메뉴 출력");
        System.out.println("5. 특정 메뉴 검색 ");
        System.out.println("0. 종료\n");
        System.out.print("사용자 입력 >> ");
    }
}
