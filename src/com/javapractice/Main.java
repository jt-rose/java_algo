package com.javapractice;

public class Main {

    public static void main(String[] args) {
	var LL = new LinkedList("Hello");
    LL.addTail("World");
    LL.addTail("NY");
    LL.addTail("TOKYO");
//    LL.removeHead();
//    LL.removeHead();
//    LL.reverse();
    System.out.println(LL.getNthFromEnd(2));
    System.out.println(LL.getNthFromEnd(1));
    System.out.println(LL.getNthFromEnd(0));
    System.out.println(LL.findMiddle());

    LL.addTail("PARIS");
    LL.addTail("BEIJING");
    System.out.println(LL.findMiddle());
    System.out.println(MStack.reverse("elephant"));
//    System.out.println(LL.contains("NY"));
//    System.out.println(LL.contains("TOKYO"));
//    System.out.println(LL.contains("???"));
    }
}
