package test;

import java.util.regex.Pattern;

public class test {
	public static void main(String[] args) {
		String line = "  [[10, 20, 30, 40],[11, 21, 31, 41]]   ";
		String line2 = "10, 20, 30, 40],[11, 21, 31, 41]";
		System.out.println(line);
		
		Pattern pat = Pattern.compile("\\[(.*)\\]");
		line = line.trim();
		System.out.println(line);
		
		System.out.println(pat.matcher(line).matches());
		line = line.replaceAll("[\\[\\]\\s+]", "");
		System.out.println(line);
		System.out.println();
		String[] arr = line.split(",");
		for(String s : arr) {
			System.out.print(Integer.parseInt(s) + " ");
		}
	}
	
}

