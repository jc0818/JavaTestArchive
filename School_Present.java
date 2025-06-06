import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;

    boolean present;

    public Student(String name, boolean present)
    {
        this.name = name;
        this.present = present;
    }
}


public class School_Present {
    static ArrayList<Student> stuArray =  new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;

        while(true)
        {
            prnInfo();
            n = sc.nextInt();
            if(n == 0)
            {
                System.out.println("Exit..... ");
                break;
            }
            selectMenu(sc,n);
        }


    }

    private static void prnInfo() {
        System.out.println("\nSchool Class Present Management Program");
        System.out.println("1. Add Student");
        System.out.println("2. Chage Student Present");
        System.out.println("3. Print All Student");
        System.out.println("4. Search Student");
        System.out.println("0. Exit This Program..");
        System.out.print("\nEnter Your Select >> ");
    }

    private static void selectMenu(Scanner sc,int n )
    {

        switch (n)
        {
            case 1:
                addStu(sc);
                break;
            case 2:
                chageStu(sc);
                break;
            case 3:
                printStuInfo();
                break;
            case 4:
                searchStu(sc);
                break;
            default:
                System.out.println("Problem to Your Input");
                break;
        }
    }

    private static void searchStu(Scanner sc) {
        String stuName;
        System.out.print("Input Student Name >> ");
        stuName = sc.next();

        for (Student student : stuArray) {
            if (stuName.equals(student.name)) {
                System.out.print("Student Name : " + student.name + " | ");
                if (student.present) {
                    System.out.print("Present\n\n");
                    return;
                } else {
                    System.out.print("Absence\n\n");
                    return;
                }
            }
        }

        System.out.println("Not Thing. \n\n");

    }


    private static void printStuInfo() {
        for (Student student : stuArray) {
            System.out.print("Student Name : " + student.name + " | ");
            if (student.present) {
                System.out.print("Present\n\n");
            } else {
                System.out.print("Absence\n\n");
            }
        }
    }

    private static void chageStu(Scanner sc) {
        String stuName;
        System.out.print("Input Student Name >> ");
        stuName = sc.next();

        for(int i = 0; i < stuArray.size(); i++)
        {
            if(stuName.equals(stuArray.get(i).name))
            {
                stuArray.get(i).present = !stuArray.get(i).present;
                return;
            }
        }

        System.out.println("Not Thing. \n\n");

    }

    private static void addStu(Scanner sc) {
        String stuName;
        boolean present;
        int check;
        System.out.print("Input Student Name >> ");
        stuName = sc.next();

        System.out.print("Input Student Present\n1 : Present\n2 : Absence\n >> ");
        check = sc.nextInt();

        for(int i = 0; i < stuArray.size(); ++i)
        {
            if(stuName.equals(stuArray.get(i).name))
            {
                System.out.println("This Name is Repeat.");
                return;
            }
        }
        if(check == 1 || check == 2)
        {
            if(check == 1)
            {
                present = true;
            }else
            {
                present = false;
            }

            stuArray.add(new Student(stuName,present));
        }else {
            System.out.println("Problem to Your Input");
        }
    }
}
