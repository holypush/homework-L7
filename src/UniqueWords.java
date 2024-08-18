import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        // Создаем массив с набором слов
        String[] wordsArray = {
            "яблоко", "банан", "груша", "яблоко", "апельсин",
            "банан", "вишня", "груша", "вишня", "апельсин",
            "груша", "белый", "черный", "яблоко", "вишня",
            "манго", "манго", "манго", "Петр", "банан"
        };

        // Создаем коллекцию для хранения уникальных слов и их количества
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Обрабатываем массив слов
        for (String word : wordsArray) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и их количество
        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}