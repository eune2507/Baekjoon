package B1900.q1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String Number[] = str.split(" ");
		// 소수 1000 이하 숫자 1와 자기자신만 약수로 가짐
		int count = 0;

		for (int i = 0; i < N; i++) {
			int X = Integer.parseInt(Number[i]);
			for (int j = 2; j <= X; j++) {
				if (j == X) {
					count++;
				} else if (X%j==0) {
					break;
				} else {
					continue;
				}
			}
		}
		System.out.print(count);

	}

}
