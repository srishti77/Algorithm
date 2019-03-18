package Practice;

public class EightPrison {
	public static void main(String s[]) {

		int array[] = {1,0,0,1,0,0,1,0};
		
		//0,0,1,1,1,1,1,0

		EightPrison prison = new EightPrison();
		
		int rem =0;
		int num = 1000000000;
		int count =0;
		while(rem <= 0) {
			rem = num % 8;
			if(rem == 0) {
				num = num/ 8;
				count++;
			}			
			else
				break;
		}

		array = prison.prisonAfterNDays(array, num);
		prison.print(array);
		
		
		
		System.out.println();
		int cells[] = prison.prisonAfterNDays(array, 8);
		
		
		prison.print(cells);	
	}
	
	public void print(int cells[]) {
		
		for(int i=0; i<8; i++) {
			System.out.print(cells[i]+ " ");
		}
	}

	public int[] prisonAfterNDays(int[] cells, int N) {

		
		for (int i = 0; i < N; i++) {
			int newCell[] = new int[8];
			for (int j = 1; j < 7; j++) {

				if ((cells[j - 1] == 0 && cells[j + 1] == 0) || (cells[j - 1] == 1 && cells[j + 1] == 1)) {
					
					newCell[j] = 1;
					
				}
				else {
					newCell[j] = 0;
				}
				
			}
			newCell[0] = 0;
			newCell[7] = 0;
			cells = newCell;
		}
		return cells;

	}
}
