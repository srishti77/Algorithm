package CCI;

public class WordSearchInDict {
	
	public static void main(String s[]) {
		char[][] board = {
				{'a','b'},
				{'c','d'}
					};
		WordSearchInDict search = new WordSearchInDict();
		
		String word = "abcd";
		System.out.println(search.exist(board, word));
	}
	
	 public boolean exist(char[][] board, String word) {
	        int row = board.length;
	        int col  = board[0].length;
	       boolean flag = false;
	       label:  for(int i=0; i<row; i++){
	            for(int j=0; j< col; j++){
	                if(word.length() !=0){
	                  int index = word.indexOf(board[i][j]);
	                  if(index != -1 ) {
	                	  if(word.length() ==1 && index ==0) {
	                		  word = "";
	                		  flag = true;
	                		  break label;
	                	  }
	                	  word = word.substring(0, index)+word.substring(index+1, word.length());
	                	  flag = true;
	                  }
	                  else {
	                	  flag = false;
	                  }
	                }
	                else {
	                	break label;
	                }
	            }
	        }
	       
	       if(word.length() !=0)
	    	   flag =false;
	       return flag;
	    }
	
}
