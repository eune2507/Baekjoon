package B2800.q2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str [] = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		
		int day = (V-B)/(A-B);;
		if((V-B)%(A-B)!=0) {
			day++;
		}
		System.out.print(day);
		
	}
}
