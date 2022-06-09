package Logical;

import java.util.HashMap;

public class EachCharacterCount {
    public static void main(String args[]) {
        EachCharacterCount eachCharacterCount = new EachCharacterCount();
        System.out.println(eachCharacterCount.findCharacterCountInString("Welcome"));
    }

    private HashMap<Character, Integer> findCharacterCountInString(String name) {
        HashMap<Character, Integer> characterCountMap = new HashMap<>();
        int countOfCharacter = 0;
        for (int i = 0; i < name.length(); i++) {
            Character character = name.toLowerCase().charAt(i);
            if (characterCountMap.containsKey(character)) {
                countOfCharacter = characterCountMap.get(character);
                characterCountMap.put(character, countOfCharacter + 1);
            } else {
                characterCountMap.put(character, 1);
            }
        }
        return characterCountMap;
    }
}
