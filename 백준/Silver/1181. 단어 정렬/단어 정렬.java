import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		HashSet<String> words = new HashSet<>();
		for(int i = 0; i < count; i++) {
			words.add(br.readLine());
		}
		List<String> wordList = new ArrayList<>(words);
		Collections.sort(wordList, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		for(String word : wordList) {
			System.out.println(word);
		}
		br.close();
	}
}