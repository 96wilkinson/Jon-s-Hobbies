package com.hobbies.arr;

import java.util.Arrays;
import java.util.List;

public class array {
	public static void main(String[] args) {
		String[] mattHobbies = {"Kayaking", "Traveling", "Pubs", "Gym"};
		String[] jamesHobbies = {"Magic"};
		String[] lizHobbies = {"Jogging", "Baking", "Swimming", "Flute", "Gym"};
		String[] tigsHobbies = {"dance","running","gym","baking","cooking"};
		String[] jonHobbies = {"football", "podcasting", "youtubing", "sopranos", "marvel"};
		String[] anthonyHobbies = {"Football", "Podcasts", "Climbing", "YouTube", "Gym"};
		List<String> tony = Arrays.asList(anthonyHobbies);
//		tony.add("Football");
//		tony.add("Climbing");
		String[] names = { "Tony","Tiggs","Jon","liz","James","Matt"};
		String[][] allHobbies = { mattHobbies, jamesHobbies,  lizHobbies,  tigsHobbies, jonHobbies, anthonyHobbies};
//		for (String i[] : allHobbies) {
//				for(String j : i) {
//					System.out.println(j);
//				}
//			System.out.println();
//
//			}
//		for(int i=0;i<tony.size();i++){
//		    System.out.println(tony.get(i));
		System.out.println(tony);
		} 
	}
//
}