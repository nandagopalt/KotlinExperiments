package Logical;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String args[]) {
        String name = "Nandagopal";
        Map<Character, Integer> map = new HashMap<>();
        CharacterCount cc = new CharacterCount();
        //for (int c = 0; c < name.length(); c++) {
            // Todo
            //1. Iterate and get each char
            //2. create map
            //3. find the number of times each char repeating
            /*if (map.containsKey(name.charAt(c))) {
                int characterCountWithIncrement = map.get(name.charAt(c)) + 1;
                map.put(name.charAt(c), characterCountWithIncrement);
            } else {
                map.put(name.charAt(c), 1);
            }*/
            cc.countCharactersInString(name.toLowerCase());
        //}
        //System.out.println(map);
    }

    private void countCharactersInString(String name) {
        HashMap<Character, Integer> nameCountMap = new HashMap<>();
        for (int characterIndex = 0; characterIndex < name.length(); characterIndex++) {
            char character = name.charAt(characterIndex);
            if (nameCountMap.containsKey(character)) {
                int countOfCharacter = nameCountMap.get(character);
                countOfCharacter++;
                nameCountMap.put(character, countOfCharacter);
            } else {
                nameCountMap.put(character, 1);
            }
        }
        System.out.println(nameCountMap);
    }
}
