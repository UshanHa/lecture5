//Sadman Sakib Hassan


class Lecture05 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 05");

        // Self-Check Problems:
        // From Section 11.3:
        // 16. Write the code to declare a Map that associates people’s names with their
        // ages.
        // Add mappings for your own name and age, as well as those of a few friends or
        // relatives.


        //Answer:
        // Map of string, integer which stores name and age respectively.

Map<String,Integer> map = new HashMap<>();

map.put("X",21);

map.put("Y",28);

map.put("Z",25);




        // 18. What keys and values are contained in the following map after this code
        // executes?


        //Answer: The final keys and values are going to be:

keys: values

8: "Ocho"

50: "Fifty"

132: "OneThreeTwo"

79: "Seventy-nine"

50: "Forty-one"

28: "18"

        // Map<Integer, String> map = new HashMap<>();
        // map.put(8, "Eight");
        // map.put(41, "Forty-one");
        // map.put(8, "Ocho");
        // map.put(18, "Eighteen");
        // map.put(50, "Fifty");
        // map.put(132, "OneThreeTwo");
        // map.put(28, "Twenty-eight");
        // map.put(79, "Seventy-nine");
        // map.remove(41);
        // map.remove(28);
        // map.remove("Eight");
        // map.put(50, "Forty-one");
        // map.put(28, "18");
        // map.remove(18);

        // 19. Write the output produced when the following method is passed each of the
        // following maps:

        // public static void mystery(Map<String, String> map) {
        // Map<String, String> result = new TreeMap<>();
        // for (String key : map.keySet()) {
        // if (key.compareTo(map.get(key)) < 0) {
        // result.put(key, map.get(key));
        // } else {
        // result.put(map.get(key), key);
        // }
        // }
        // System.out.println(result);
        // }
        // {two=deux, five=cinq, one=un, three=trois, four=quatre}
        // {skate=board, drive=car, program=computer, play=computer}
        // {siskel=ebert, girl=boy, H=T, ready=begin, first=last, begin=end}
        // {cotton=shirt, tree=violin, seed=tree, light=tree, rain=cotton}


        //Answer:

        import java.util.*; 
class Main {
    public static void mapMystery1(Map<String, String> map){
        Map<String, String> result = new TreeMap<String, String>();
        for(String key : map.keySet()){
            if(key.compareTo(map.get(key)) < 0) {
                result.put(key,map.get(key));
            }
            else{
                result.put(map.get(key),key);
            }
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Map<String, String> test = new TreeMap<String, String>();
        test.put("siskel","ebert");
        test.put("girl","boy");
        test.put("heads","tails");
        test.put("ready","begin");
        test.put("first","last");
        test.put("begin","end");
        mapMystery1(test);

    }
}


        // Exercises:
        // 6. Write a method countUnique that accepts a list of integers as a parameter
        // and returns the number of unique integer values in the list.
        // Use a set as auxiliary storage to help you solve this problem. For example,
        // if a list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method
        // should return 5. The empty list contains 0 unique values.

        //Answer: 
        public int countUnique(List<Integer> list) {
    HashSet<Integer> set = new HashSet<Integer>();

    for(int n : list)
        set.add(n);

    return set.size();

        // 7. Write a method countCommon that accepts two lists of integers as
        // parameters and returns the number of unique integers that occur in both
        // lists.
        // Use one or more sets as storage to help you solve this problem. For example,
        // if one list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the
        // other list contains the values [–5, 15, 2, –1, 7, 15, 36], your method should
        // return 4 because the elements –1, 2, 7, and 15 occur in both lists.


        //Answer:
        def countCommon(list1,list2):
#CONVERT LISTS INTO SETS AND USE 'INTERSECTION' TO FIND THE COMMON ELEMENTS
return len(set(list1).intersection(set(list2)))


        // 8. Write a method maxLength that accepts a set of strings as a parameter and
        // that returns the length of the longest string in the list.
        // If your method is passed an empty set, it should return 0.

        //Answer: 
        public static int maxLength(ArrayList<String> list)

{

int maxLength = 0; 
for(String s: list) { 
if(s.length() > maxLength) { 
maxLength = s.length(); 
} 
} 
return maxLength; 
}

        // 9. Write a method hasOdd that accepts a set of integers as a parameter and
        // returns true if the set contains at least one odd integer and false
        // otherwise.
        // If passed the empty set, your method should return false.

      //Answer:
      package bjp_11;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class HasOdd 
{
    public static void main(String[] args) 
    {
        Set<Integer> set1 = Stream.of(0, 1, 2).collect(Collectors.toCollection(HashSet::new));
        Set<Integer> set2 = Stream.of(0, 2).collect(Collectors.toCollection(HashSet::new));
        System.out.println(hasOdd(set1));
        System.out.println(hasOdd(set2));
        
    }
    private static boolean hasOdd(Set<Integer> set)
    {
        for (Integer i : set)
        {
            if (i % 2 == 1) 
            {
                return true;
                
            }
            
        }
        return false;
        
    }
    
}


        

        // 10. Write a method removeEvenLength that accepts a set of strings as a
        // parameter and that removes all of the strings of even length from the set.


        //Answer:
        import java.util.ArrayList;

import java.util.Iterator;

public class Demo

{

public static void removeEvenLength(ArrayList<String> al)

{

Iterator<String> iterator = al.iterator();

while( iterator.hasNext() ) {

final String word = iterator.next();

if( word.length() % 2 == 0 ) {

iterator.remove();

}

}

}

public static void main(String[] args) {

ArrayList<String> al=new ArrayList<>();

al.add("I");

al.add("Sam");

al.add("am");

al.add("and");

al.add("do");

al.add("eggs");

al.add("green");

al.add("ham");

al.add("like");

al.add("not");

al.add("them");

System.out.println("Set of strings before removal :");

System.out.print(al);

System.out.println("\nSet of strings after removal :");

removeEvenLength(al);

System.out.print(al);

}

}
        
    }
}
