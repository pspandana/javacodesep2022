package assignment4;

import java.lang.reflect.Array;

/*
 * Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
Output- Git, Github, Gitlab, GitBash
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combining_Two_Strings {

	public static void main(String[] args) {
		ArrayList<String>l1= new ArrayList<>(Arrays.asList("Git", "Github", "GitLab","GitBash", "Selenium", "Java", "Maven"));
		ArrayList<String>l2= new ArrayList<>();
		l2.add("Git");
		l2.add("GitLab");
		l2.add("GitBash");
		l2.add("Github");
		System.out.println("List 1: "+l1);
		System.out.println("List 2: "+l2);
		System.out.println("-------Getting the common elements from bith lists---------");
	l1.retainAll(l2);
	System.out.println(l1);
		
	}

}
