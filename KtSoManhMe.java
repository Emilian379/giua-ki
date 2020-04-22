
public class KtSoManhMe {
    public static boolean soNguyenTo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean soManhMe(int n) {
		for (int i = 2 ; i <= Math.sqrt(n); i++) {

			if (soNguyenTo(i) == true) {
				if (n % i == 0) {
					if (n % Math.pow(i, 2) == 0) {
						return true;
					}
				}
			}
		}
		return false;

	}
}