package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*-   Define the below static methods in class `FruitsListService`:
       +addFruitsToList(String) : List<String>      
        - Should take a String input containing names of fruits separated by comma(see below), and return a List of the Fruit names
            "apple,mango,Cherry, APPLE, CHERRY,Cherry,apple ,Mango"
        - Should not add duplicate fruits to the list (Same fruit name in upper/lower/mixed should be also considered duplicates)

    +searchFruitInList(List<String>, String) : int
        - Should take a fruit list and fruit name to be searched as parameters
        - Should return the index of the fruit in the list, if it's found
        - Should return -1, if the fruit is not found
        - Should do a "case-sensitive" search   
                    
    +searchFruitInListIgnoreCase(List<String>, String) : int
        - Should take a fruit list and fruit name to be searched as parameters
        - Should return the index of the fruit in the list, if it's found
        - Should return -1, if the fruit is not found
        - Should do a "case-insensitive" search*/
public class FruitsListService {

	public static void main(String[] args) {
		System.out.print("Enter fruits separated by comma: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().replaceAll("\\s", "");
		String inputLower = input.toLowerCase();
		System.out.print("Enter fruit name to be searched: ");
		Scanner sc1 = new Scanner(System.in);
		String search = sc1.nextLine();
		String searchLower = search.toLowerCase();

		FruitsListService.addFruitsToList(inputLower);

		FruitsListService.searchFruitInList(input, search);

		FruitsListService.searchFruitInListIgnoreCase(inputLower, searchLower);
	}

	public static Set<String> addFruitsToList(String inputLower) {
		Set<String> fruits = new HashSet<String>(Arrays.asList(inputLower.split(",")));
		System.out.println("Fruits list (w/o duplicates)--> " + fruits);
		return fruits;

	}

	public static void searchFruitInList(String input, String search) {
		List<String> fruits = new ArrayList<String>(addFruitsToList("apple"));
		System.out.println("Fruits list (including Case sensitive duplicates)--> " + fruits);

		if (fruits.contains(search) == true) {
			System.out.println("Case sensitive search-->" + search + "'s Index is " + fruits.indexOf(search));
		} else {
			System.out.println("Case sensitive search-->" + search + " -1, Not found");
		}

	}

	public static void searchFruitInListIgnoreCase(String input, String searchLower) {
		List<String> fruits = new ArrayList<String>(Arrays.asList(input.split(",")));
		System.out.println("Fruits list (including Case sensitive duplicates)--> " + fruits);

		if (fruits.contains(searchLower) == true) {
			System.out.println(
					"Case insensitive search-->" + searchLower + " 's Index is " + fruits.indexOf(searchLower));
		} else {
			System.out.println("Case insensitive search-->" + searchLower + " -1, Not found");
		}

	}
}
