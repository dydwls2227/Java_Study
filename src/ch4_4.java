import java.util.Scanner;

public class ch4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true)
        {
            System.out.println("----------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------");
            System.out.print("선택> ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("예금액> ");
                    int a = sc.nextInt();
                    sum += a;
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int b = sc.nextInt();
                    sum -= b;
                    break;
                case 3:
                    System.out.printf("잔고 > %d\n",sum);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}
