package Collections;
import java.util.ArrayList;
import java.util.List;
public class FruitListService3 {

		/**
		 * This method takes a string containing comma seperated fruit names and add unique fruit names ,ignoring the case to list
		 * @param fruitnames
		 * @return
		 */
		public static List<String> addFruitsToList(String fruitnames){
			List<String> fruitlist=new ArrayList<>();
			if(fruitnames==null || fruitnames.length()==0 ) {
				return fruitlist;
			}
			for(String fruit: fruitnames.split(",")) {
				boolean present=false;
				for(String fruitinlist:fruitlist) {
					if(fruitinlist.equalsIgnoreCase(fruit)) {
					//	if(fruitinlist.equals(fruit)) {

						present=true;
						break;
					}
				}
				if(!present) {
					fruitlist.add(fruit);
				}
			}
			return fruitlist;
		}
		
		public static int searchFruitInList(List<String> fruitlist, String searchfruit) {
			return fruitlist.indexOf(searchfruit);
		}
		
		public static int searchFruitInListIgnorecase(List<String> fruitlist, String searchfruit) {
			int indexoffruit=-1;
			for(int i=0;i<fruitlist.size();i++) {
				if(fruitlist.get(i).equalsIgnoreCase(searchfruit)) {
					
					indexoffruit=i;
					break;
				}
			}
			return indexoffruit;
		}
		public static void main(String[] args) {
			System.out.println(addFruitsToList("apple,apple,mango,Strawberry,Apple"));
		}
		
	}

