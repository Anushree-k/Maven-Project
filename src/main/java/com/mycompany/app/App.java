package com.mycompany.app;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
		System.out.println("Added one line of code to the file");
		System.out.println("Line added to check github actions");
		
		System.out.println("Testing commons-lang dependency");
		
		String input = "   devops engineer   ";
		System.out.println("Original String = " + input);
		
		String trimmed = StringUtils.trim(input);
		System.out.println("Trimmed String = " + trimmed);
		
		String upper = StringUtils.upperCase(trimmed);
		System.out.println("Uppercase: " + upper);
		
		
    }
}
