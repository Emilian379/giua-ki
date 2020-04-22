import java.util.Scanner;

public class NhapXuat {
	
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Xac Dinh So Manh Me");
		final Scanner scan = new Scanner(System.in);
		System.out.print("Vui long nhap so: ");
        final int n = scan.nextInt();
        System.out.println("Cac so manh me nho hon: ");
		for (int i = 1 ; i <= n; i ++) {
			if (KtSoManhMe.soManhMe(i)== true) {
                System.out.println(i);
            }
    }
}
}
