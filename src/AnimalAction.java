class Animal {
    static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(getClass().getSimpleName() + " пробежал " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println(getClass().getSimpleName() + " проплыл " + distance + " м");
    }
}

class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(getClass().getSimpleName() + " пробежал " + distance + " м");
        } else {
            System.out.println(getClass().getSimpleName() + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println(getClass().getSimpleName() + " проплыл " + distance + " м");
        } else {
            System.out.println(getClass().getSimpleName() + " не может проплыть " + distance + " м");
        }
    }
}

class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private boolean isFull;

    public Cat() {
        super();
        this.isFull = false;
    }

    public void eat(int foodAmount) {
        if (Bowl.foodInBowl >= foodAmount) {
            Bowl.foodInBowl -= foodAmount;
            isFull = true;
        }
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(getClass().getSimpleName() + " пробежал " + distance + " м");
        } else {
            System.out.println(getClass().getSimpleName() + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getClass().getSimpleName() + " не умеет плавать");
    }
}

class Bowl {
    static int foodInBowl = 0;

    public static void addFood(int amount) {
        if (amount > 0) {
            foodInBowl += amount;
        }
    }
}

// Пример использования:
public class AnimalAction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat pusy = new Cat();
        Dog meat = new Dog();
        dog.run(1000);
        dog.swim(5);
        pusy.run(150);
        meat.run(450);
        
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        Bowl.addFood(14); // добавляем еду
        for (Cat cat : cats) {
            cat.eat(5); // каждый кот кушает
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + (cats[i].isFull() ? " сыт" : " голоден"));
        }

        System.out.println("Всего создано животных: " + Animal.animalCount);
    }
}
