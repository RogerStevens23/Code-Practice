package CodingBatPracticeClasses;

public class String1 {
	
	/* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	helloName("Bob") → "Hello Bob!"
	helloName("Alice") → "Hello Alice!"
	helloName("X") → "Hello X!"*/
	public static String helloName(String name) {
		return "Hello "+name+"!";
	}
	
	/* Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	makeAbba("Hi", "Bye") → "HiByeByeHi"
	makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	makeAbba("What", "Up") → "WhatUpUpWhat"*/
	
	public static String makeAbba(String a, String b) {
		return a+b+b+a;
	}
	
	/* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
	makeTags("i", "Yay") → "<i>Yay</i>"
	makeTags("i", "Hello") → "<i>Hello</i>"
	makeTags("cite", "Yay") → "<cite>Yay</cite>"*/
	
	public static String makeTags(String tag, String word) {
		/*
		 * StringBuilder r = new StringBuilder("");
		 * r.append("<").append(tag).append(">").append(word).append("</").append(tag).
		 * append(">");
		 */
		return "<"+tag+">"+word+"</"+tag+">";
	}
}