import java.util.*;

public class Main{
    public static void main(String[] args) {

    List<String> wordList = new ArrayList<>();
    Map<String,Integer> wordMap = new HashMap<>();

    String[] words = { "массив", "набором", "слов", "слов", "должны", "должны", "повторяющиеся",
    "дубликаты", "список","уникальных", "слов", "которых","состоит","массив", "дубликаты", "повторяющиеся",
    "сколько", "раз", "повторяющиеся", "каждое", "слово"};
    
    for(String w: words) {
        wordList.add(w);
        wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
    }

    Set<String> uniqueWords = new HashSet<>(wordList);
    System.out.println("Уникальные слова:");
    for(String w: uniqueWords)
        System.out.println(w);

    System.out.println("\nВсе слова:");
    for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("\nТелефонная книга:");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров","1234");
        phoneBook.add("Петров","5678");
        phoneBook.add("Сидоров","1999");
        phoneBook.add("Иванов","9999");
        phoneBook.add("Иванов","0000");

        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
    }

}