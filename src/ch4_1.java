public class ch4_1 {
    public static void main(String[] args) {

        System.out.println("로또 번호를 출력합니다");
        for(int i=1; i<=6; i++)
        {
            int a;
            a = (int) (Math.random()*45)+1;
            System.out.printf("%d ", a);
        }
    }
}
