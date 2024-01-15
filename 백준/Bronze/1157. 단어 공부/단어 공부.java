import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] inputArray = br.readLine().toUpperCase().toCharArray();
		HashSet<Character> inputSet = new HashSet<Character>();
		HashMap<Character, Integer> countMap = new HashMap<>();
		
		for(char c : inputArray) {
			if(!inputSet.contains(c)) {
				inputSet.add(c);
				countMap.put(c, 1);
			} else {
				countMap.put(c, countMap.get(c) + 1);
			}
		}
		bw.write(findMax(countMap));
		br.close();
		bw.flush();
	}
	
	public static char findMax(HashMap<Character, Integer> countMap) {
		char result = ' ';
		int maxCount = 0;
		
		for(int count : countMap.values()) {
			if(count > maxCount) {
				maxCount = count;
			}
		}
		
		int countMax = 0;
		for(char key : countMap.keySet()) {
			if(countMap.get(key) == maxCount) {
				countMax++;
				result = key;
			}
		}
		return countMax > 1 ? '?' : result;
	}
}