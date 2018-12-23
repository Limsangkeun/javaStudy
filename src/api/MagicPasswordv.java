package api;

import java.util.Random;

public class MagicPasswordv {
	public static void main() {
		String s = "!@#$%^&*1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rand = new Random();
		int n;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<9; i++) {
			n = rand.nextInt(s.length());
			sb.append(s.charAt(n));
		}
		System.out.println(sb);
	}
}
