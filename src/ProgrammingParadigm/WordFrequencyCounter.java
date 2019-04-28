package ProgrammingParadigm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {


    static Map<String , Long> countFrequency(List<String> words) {



        Map<String, Long> frequencyMap = new HashMap<>();


        for (String word: words){

            // imperative programming example

//            if (!frequencyMap.containsKey(word)){
//                frequencyMap.put(word, 0l);
//            }

            frequencyMap.putIfAbsent(word, 0l);


            Long oldCount = frequencyMap.get(word);
            frequencyMap.put(word, oldCount + 1);

            // declarative programming example

//            frequencyMap.merge(word, 1l, (oldValue, value) -> oldValue + value);

            // putIfAbsent = if !map.containsKey

        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World", "Bangladesh", "Dhaka", "Hello", "Java", "Lambda");

        Map<String, Long> wordFrequency = countFrequency(words);

        System.out.println(wordFrequency);

    }

}
