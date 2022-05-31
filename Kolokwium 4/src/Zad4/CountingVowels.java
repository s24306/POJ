package Zad4;
import java.util.*;

public class CountingVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str = scanner.nextLine();
        System.out.println(countVowels(str));
    }

    public static HashMap<String, Integer> countVowels(String str){
        HashMap<String, Integer> vowelsMap = new HashMap<String, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == 'a' || letter == 'A') {
                if(!vowelsMap.containsKey("a")){
                    vowelsMap.put("a", 0);
                }
                vowelsMap.put("a", vowelsMap.get("a") + 1);
            } else if (letter == 'e' || letter == 'E') {
                if(!vowelsMap.containsKey("e")){
                    vowelsMap.put("e", 0);
                }
                vowelsMap.put("e", vowelsMap.get("e") + 1);
            } else if (letter == 'i' || letter == 'I') {
                if(!vowelsMap.containsKey("i")){
                    vowelsMap.put("i", 0);
                }
                vowelsMap.put("i", vowelsMap.get("i") + 1);
            } else if (letter == 'o' || letter == 'O') {
                if(!vowelsMap.containsKey("o")){
                    vowelsMap.put("o", 0);
                }
                vowelsMap.put("o", vowelsMap.get("o") + 1);
            } else if (letter == 'u' || letter == 'U') {
                if(!vowelsMap.containsKey("u")){
                    vowelsMap.put("u", 0);
                }
                vowelsMap.put("u", vowelsMap.get("u") + 1);
            }
        }

        return vowelsMap;
    }
}
