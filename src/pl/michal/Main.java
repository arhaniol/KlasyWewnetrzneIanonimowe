package pl.michal;

import java.util.*;

public class Main {
    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }

    public interface GreetingModule {
        void sayHello();
    }

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzien dobry");
            }
        });

        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });

        Robot johan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("guten morgen");
            }
        });

        jan.saySomething();
        john.saySomething();
        johan.saySomething();
    }

    public static void task2() {
        List<String> wordList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Type 5 words:");
        for (int i = 0; i < 5; i++) {
            wordList.add(input.nextLine());
        }
        System.out.println("Lista przed sortowaniem:");
        printWordList(wordList);

        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("Lista po sortowaniu:");
        printWordList(wordList);
    }

    private static void printWordList(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

}
