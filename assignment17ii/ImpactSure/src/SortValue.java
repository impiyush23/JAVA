import java.util.*;

public class SortValue{
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> hashMap = new HashMap<>();

        // some data for HashMap
        hashMap.put("Piyush", 16);
        hashMap.put("Chirag", 7);
        hashMap.put("Aashish", 10);
        hashMap.put("Shakib",18);
        hashMap.put("Anuj", 13);

        // sortByValue method called
        Map<String, Integer> sortedMap = sortByValue(hashMap);

        // Print the sorted HashMap
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        // Convert the HashMap entries to a List
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the List based on the values
        list.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        // Create a new LinkedHashMap to store the sorted values
        Map<String, Integer> result = new LinkedHashMap<>();

        // Put the sorted entries into the new LinkedHashMap
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        // Return the sorted HashMap
        return result;
    }
}
