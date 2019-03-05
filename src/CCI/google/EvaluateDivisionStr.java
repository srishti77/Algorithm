package CCI.google;

import java.util.ArrayList;
import java.util.HashMap;

public class EvaluateDivisionStr {
	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	HashMap<String, ArrayList<Double>> mapValue = new HashMap<String, ArrayList<Double>>();

	public static void main(String s[]) {

		EvaluateDivisionStr eval = new EvaluateDivisionStr();
		// ["x1","x2"],["x2","x3"],["x3","x4"],["x4","x5"]
		String[][] equations = { { "x1", "x2" }, { "x2", "x3" }, { "x3", "x4" }, { "x4", "x5" } };
		double[] values = { 3.0, 4.0, 5.0, 6.0 };

		String[][] queries = { { "x1", "x5" }, { "x5", "x2" }, { "x2", "x4" }, { "x2", "x2" }, { "x2", "x9" },
				{ "x9", "x9" } };
		double[] solution = eval.calcEquation(equations, values, queries);
		for (int i = 0; i < solution.length; i++) {
			System.out.println(solution[i]);
		}

	}

	public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
		double[] answer = new double[queries.length];

		for (int i = 0; i < equations.length; i++) {
			String key = equations[i][0];
			System.out.println("Values: " + key);
			if (map.containsKey(key)) {

				ArrayList<String> list = map.get(key);
				list.add(equations[i][1]);

				ArrayList<Double> listValues = mapValue.get(key);
				listValues.add(values[i]); // Value

				mapValue.put(key, listValues);
				map.put(key, list);

			} else {

				ArrayList<String> list = new ArrayList<>();
				list.add(equations[i][1]);

				ArrayList<Double> listValues = new ArrayList();
				listValues.add(values[i]); // Value

				mapValue.put(key, listValues);
				map.put(key, list);
			}

			String key1 = equations[i][1];

			if (map.containsKey(key1)) {

				ArrayList<String> list = map.get(key1);
				list.add(equations[i][0]);

				ArrayList<Double> listValues = mapValue.get(key1);
				listValues.add(1 / values[i]); // Value

				mapValue.put(key1, listValues);
				map.put(key1, list);

			} else {

				ArrayList<String> list = new ArrayList<>();
				list.add(equations[i][0]);

				ArrayList<Double> listValues = new ArrayList();
				listValues.add(1 / values[i]); // Value

				mapValue.put(key1, listValues);
				map.put(key1, list);
			}
		}

		for (int i = 0; i < queries.length; i++) {
			ArrayList<String> visited = new ArrayList();
			visited.add(queries[i][0]);// = true;
			double value = calculateQueries(queries[i][0], queries[i][1], visited, 1);
			if (value == 0) {

				answer[i] = -1;
			} else {
				answer[i] = value;
			}
		}

		return answer;
	}

	private double calculateQueries(String start, String destination, ArrayList<String> visited, double sum) {
		// TODO Auto-generated method stub

		if (map.containsKey(start) && map.get(start).contains(destination)) {

			return sum * mapValue.get(start).get(map.get(start).indexOf(destination));
		}

		for (int i = 0; map.containsKey(start) && i < map.get(start).size(); i++) {
			String str = map.get(start).get(i);
			System.out.println("String is: " + str);
			if (!visited.contains(str)) {
				visited.add(str);// true;
				if (str == destination) {

					return sum * mapValue.get(start).get(i);
				}

				return calculateQueries(str, destination, visited, sum * mapValue.get(start).get(i));
			}
		}

		return 0.0;

	}
}
