package lesson4.part2;



import java.util.HashMap;
import java.util.Map;

public class FromStringToMap {



    public static void FromStringToMap(String items) {

        Map<String, Integer> myMap = new HashMap<String, Integer>();
        int beginIndex = 0;
        int endIndex = beginIndex + 1;
        int i = 0;

        for (i = 0; i < items.length(); i++) {
            String key = items.substring(i + beginIndex, i + endIndex);
            Integer value =  items.split(key,-1).length-1;
            myMap.put(key, value);
            }
        for(Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey()+"   "+entry.getValue());


        }



    }


}

