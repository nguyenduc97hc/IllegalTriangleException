import java.util.Scanner;

public class IllegalTriangleException {
    private static Exception e;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1");
        int a = sc.nextInt();
        System.out.println("Nhap canh 2");
        int b = sc.nextInt();
        System.out.println("Nhap canh 3");
        int c = sc.nextInt();

        try {
            if ((a < 0 || b < 0 || c < 0) || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
                throw (e);
            }else {
                System.out.println("La 3 canh mot tam giac");
            }

        } catch (Exception e) {
            System.out.println("Khong Phai 3 canh mot tam giac");
        }
    }
    }

