package pl.michal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

    public static void task2(){
        List<String> wordList=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Type 5 words:");
        for(int i=0;i<5;i++){
            wordList.add(input.nextLine());
        }

        Collections.sort(wordList,/*Tu trzeba coś wstawic :)");
    }
}
