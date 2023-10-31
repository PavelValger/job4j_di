package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput {
    private final Scanner scanner = new Scanner(System.in);

    public void askStr(String question) {
        System.out.print(question);
        scanner.nextLine();
    }
}
