
/**
 * Given an array of strings, group anagrams together.
 */

import java.util.*;

class Day6 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a list that holds a list of strings (the anagrams)
        List<List<String>> anagrams = new ArrayList<>();

        // create a hashmap
        HashMap<String, List<String>> map = new HashMap<>();

        // grab each string, create an array of chars, sort the chars in alphabetical
        // order,
        // concatenate the chars together. Example) "CDBA" = 'C', 'D', 'B', 'A' = 'A',
        // 'B', 'C','D' = "ABCD"
        for (String s : strs) {
            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String key = new String(sortedChars);

            // we use the ordered string as a key. first we put it into the list if it is
            // not in it.
            // then we compare every other string to the ordered string, if they have the
            // same
            // letters, then we can add that string to the list of strings with the same
            // order.
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            } else
                map.get(key).add(s);
        }

        anagrams.addAll(map.values());
        return anagrams;

    }
}