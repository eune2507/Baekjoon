package B10800.q10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();

		int num[] = new int[26];
		for (int i = 0; i < num.length; i++) {
			num[i] = -1;
		}
		for (int i = 0; i < S.length(); i++) {
			if (num[S.charAt(i) - 97] == -1) {
				num[S.charAt(i) - 97] = i;
			}	
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}
