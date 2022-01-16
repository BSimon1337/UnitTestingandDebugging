package week6videos;

import java.util.ArrayList;
import java.util.List;

public class debugging {

	public static void main(String[] args) {
		//debugging allows you to see the value of the variable and through one line of code at a time
		
		List<String> names = new ArrayList<>();
		addNames(names);
		int index =  findIndexOfName(names, "Sam");
		System.out.println(index);

	}

	private static int findIndexOfName(List<String> names, String string) {
		int index = -1;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals(names)) {
				index = i;
				break;
			}
		}return index;
	}

	private static void addNames(List<String> names) {
		names.add("Sam");
		names.add("Tommy");
		names.add("Hillary");
		names.add("Joan");
		
	}

}
