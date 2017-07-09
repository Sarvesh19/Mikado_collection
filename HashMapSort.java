/**
 * 
 */
package com.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Sarvesh
 * 
 */
public class HashMapSort {
	static void getSortedHashset() {
		Set<String> es = new HashSet<>();
		es.add("sa");
		es.add("lo");
		es.add("ppkpp");
		es.add("kjpp");
		es.add("tttkpp");
		es.add("g54pp");
		es.add("ggpp");
		es.add("jjpp");
		es.add("llliip");
		es.add("uukpp");
		es.add("d");
		es.add("15");
		es.add("-15");
		es.add("0.02");

		List<String> ok = new ArrayList<>(es);
		Collections.sort(ok, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Object && o2 instanceof Object) {
					return o1.toString().compareTo(o2.toString());
				}
				return 0;
			}
		});
		for (Object o : ok) {
			System.out.println(o);
		}
		System.out
				.println("--------------------------------------------------------");
		for (Object o : es) {
			System.out.println(o);
		}
	}

	private static void getSortedHashMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sarvesh", 1542);
		map.put("Parvesh", 42);
		map.put("Larvesh", 142);
		map.put("Qarvesh", 12);
		map.put("Aarvesh", 542);
		map.put("Zarvesh", -2);

		// ......START........ sort with key

		Map<String, Integer> map1 = new TreeMap<String, Integer>(map);
		Iterator<Map.Entry<String, Integer>> iterator1 = map1.entrySet()
				.iterator();
		while (iterator1.hasNext()) {
			Map.Entry<String, Integer> sort = iterator1.next();
			System.out.println(sort.getKey() + " " + sort.getValue());
		}
		// .......END..........

		// ........START.........Logic for sort using value
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
				map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				if (o1.getValue() > o2.getValue()) {
					return 1;
				} else if (o1.getValue() < o2.getValue()) {
					return -1;
				} else
					return 0;
			}
		});
		System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		for (Entry<String, Integer> sortedByVal : list) {
			System.out.println(sortedByVal.getValue() + " "
					+ sortedByVal.getKey());
		}
		System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwww");

		// Iterator<Object> iterator3 = list.iterator();
		//
		// while(iterator3.hasNext()){
		// Object ite = iterator3.next();
		// System.out.println(ite);
		// }
		// ........END.........Logic for sort using value

		System.out.println("..................................using iterator");
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			System.out.println(next.getKey() + " " + next.getValue());
		}
		System.out
				.println(".......................................using Map Entry EntrySet");
		for (Map.Entry<String, Integer> sortedEntry : map.entrySet()) {

			System.out.println(sortedEntry.getKey() + " "
					+ sortedEntry.getValue());
		}

		System.out
				.println("....................................................");

	}

	public static <T> void main(String[] args) {
		// getSortedHashset();
		getSortedHashMap();
	}
}
