package Practice;

public class ValidIP {
	int count = 0;

	public static void main(String s[]) {
		ValidIP validIp = new ValidIP();
		validIp.convert("25525511135");
		System.out.println(validIp.count);
	}

	public String convert(String s) {

		int n = s.length();
		String sNew = s;
		for (int i = 1; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					sNew = sNew.substring(0, k) + "." + sNew.substring(k);
					sNew = sNew.substring(0, j) + "." + sNew.substring(j);
					sNew = sNew.substring(0, i) + "." + sNew.substring(i);
					count++;
					System.out.println(sNew);
					sNew = s;
				}
			}
		}

		return "";
	}

}
