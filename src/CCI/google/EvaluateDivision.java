package CCI.google;

import java.util.Calendar;
/*
 * Considers that the input will have just single characters
 * 
 */
public class EvaluateDivision {

	double[][] equationValue = new double[26][26];


	public static void main(String s[]) {
		
		EvaluateDivision eval = new EvaluateDivision();
		String[][] equations = {{"a", "b"}, {"b", "c"}, {"p", "q"}};
		double[] values = {1.5, 2.5, 5.0};
		
		String[][] queries = {{"a", "c"}, {"c", "b"}, {"p", "q"}, {"q", "p"}};
		double[] solution = eval.calcEquation(equations, values, queries);
		for(int i=0; i<solution.length; i++) {
			System.out.println(solution[i]);
		}
		
	}

	public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
		double[] answer = new double[queries.length];
		for (int i = 0; i < equations.length; i++) {
			
			equationValue[equations[i][0].charAt(0) - 'a'][equations[i][1].charAt(0) - 'a'] = values[i];
			equationValue[equations[i][1].charAt(0) - 'a'][equations[i][0].charAt(0) - 'a'] = 1/values[i];
			
		}
		
		for(int i=0; i<queries.length; i++) {
			boolean[] visited = new boolean[26];
			visited[i] = true;
			double value = calculateQueries(queries[i][0].charAt(0) - 'a', queries[i][1].charAt(0) - 'a', visited, 1);
			if(value ==0) {
				
				answer[i] = -1;
			}
			else {
				answer[i] = value;
			}
		}
		
		return answer;
	}
	
	public double calculateQueries(int start, int destination, boolean[] visited, double sum) {
		
		if(equationValue[start][destination] !=0)
			return sum * equationValue[start][destination];
		
		for(int i=0; i<26; i++) {	
			if(equationValue[start][i] > 0.0 && !visited[i]) {
				visited[i] = true;
				if(i == destination) {
					
					return  sum * equationValue[start][i];
				}
				
				return calculateQueries(i, destination, visited, sum * equationValue[start][i]);
			}
		}
		
		return 0.0;
		
	}

}
