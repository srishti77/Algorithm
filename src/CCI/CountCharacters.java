import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CountCharacters {

	public static void main(String args[]) {
		String line = null;
		int count = 0;
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\User\\Documents\\cover.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(file));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
				count = count + line.length();
				// System.out.println(line.length());

			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
