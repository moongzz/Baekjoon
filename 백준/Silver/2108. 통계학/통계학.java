import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int len = Integer.parseInt(br.readLine());
		ArrayList<Integer> inputList = new ArrayList<>();
		double total = 0;
		for(int i = 0; i < len; i++) {
			inputList.add(Integer.parseInt(br.readLine()));
			total += inputList.get(i);
		}
		int mode = findMode(inputList);
		Collections.sort(inputList);
		int mean = (int) Math.round(total/len);
		int median = inputList.get(len/2);
		int range = inputList.get(len-1)-inputList.get(0);
		
		bw.write(mean + "\n");
		bw.write(median + "\n");
		bw.write(mode + "\n");
		bw.write(range + "\n");
		
		br.close();
		bw.flush();
	}
	public static int findMode(ArrayList<Integer> inputList) {
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();
		for(int num : inputList) {
			int currentFrequency = frequencyMap.getOrDefault(num, 0) + 1;
			frequencyMap.put(num, currentFrequency);
		}
		ArrayList<Integer> modes = new ArrayList<>();
		int maxDuplicatedCount = 0;
		
		for(int num : frequencyMap.keySet()) {
			int currentFrequency = frequencyMap.get(num);
			
			if(maxDuplicatedCount <= currentFrequency) {
				if(maxDuplicatedCount < currentFrequency) {
					modes.clear();
				}
				modes.add(num);
				maxDuplicatedCount = currentFrequency;
			}
		}
		if(modes.size() >= 2) {
			Collections.sort(modes);
			return modes.get(1);
		} else {
			return modes.get(0);
		}
	}
}