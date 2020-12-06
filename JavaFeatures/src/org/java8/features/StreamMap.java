package org.java8.features;

import java.util.*;
import java.util.stream.*;

public class StreamMap {
	public static <K, V> Stream<Map.Entry<K, V>> convertMapToStream(Map<K, V> map) {

		return map

				.entrySet()

				.stream();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees to you need to enter:");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of" + (i + 1));
			int j = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			map.put(j, str);
		}
		Stream<Map.Entry<Integer, String>> stream = convertMapToStream(map);
		System.out.println("Stream: " 
                + Arrays.toString(stream.toArray()));

	}

}
