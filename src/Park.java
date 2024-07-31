import java.util.ArrayList;
import java.util.List;

// Главный класс Park
public class Park {
    private List<Attraction> attractions;

    // Конструктор
    public Park() {
        attractions = new ArrayList<>();
    }

    // Метод для добавления аттракциона
    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    // Метод для отображения информации об аттракционах
    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    // Внутренний класс Attraction
    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        // Конструктор
        private Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + workingHours + ", Стоимость: " + price + " руб.";
        }
    }

   
    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Сесть на бутылку", "10:00 - 22:00", 300);
        park.addAttraction("Поесть жаренных гвоздей", "09:00 - 23:00", 250);
        park.addAttraction("Стать скуфом", "08:00 - 20:00", 100);

        System.out.println("Список аттракционов в парке:");
        park.displayAttractions();
    }
}