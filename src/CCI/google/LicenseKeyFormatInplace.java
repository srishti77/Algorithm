package CCI.google;

public class LicenseKeyFormatInplace {

	public static void main(String s[]) {

		LicenseKeyFormatInplace keyFormat = new LicenseKeyFormatInplace();
		String S = "--a-a-a-a-";
		System.out.println(keyFormat.licenseKeyFormatting(S, 2));

	}

	private String licenseKeyFormatting(String s, int key) {
		// TODO Auto-generated method stub
		s = s.replace("-", "");
		int OriginalK = key;
		for (int i = s.length() - 1; i >= 0; i--) {

			s = s.substring(0, i) + s.substring(i).toUpperCase();
			key--;

			if (key == 0 && i != 0) {
				s = s.substring(0, i) + "-" + s.substring(i);
				i--;
				key = OriginalK;
			}

		}
		if (!s.isEmpty() && s.charAt(0) == '-') {
			s = s.replaceFirst("-", "");
		}
		return s;
	}
}
