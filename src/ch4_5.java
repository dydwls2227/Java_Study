import java.util.Scanner;

public class ch4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        while(true)
        {
            System.out.print("항목을 선택하세요. 1=걷기 2=팔굽혀펴기 3=턱걸이 4=자전거타기 5=출력 0=종료 >> ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("걸은 스텝수를 입력하세요 >> ");
                    int a = sc.nextInt();
                    sum1 += a;
                    break;
                case 2:
                    System.out.print("팔굽혀펴기 횟수를 입력하세요 >> ");
                    int b = sc.nextInt();
                    sum2 += b;
                    break;
                case 3:
                    System.out.print("턱걸이 횟수를 입력하세요 >> ");
                    int c = sc.nextInt();
                    sum3 += c;
                    break;
                case 4:
                    System.out.println("자전거타기 시간을 분으로 입력하세요 >> ");
                    int d = sc.nextInt();
                    sum4 += d;
                    break;
                case 5:
                    System.out.printf("운동현황: 겅기 %d보, 팔굽혀펴기 %d개, 턱걸이 %d개, 자전거타기 %d분",sum1,sum2,sum3,sum4);
                    break;
                case 0:
                    System.out.println("프로그램 종료.");
                    return;
            }
        }
    }
}
