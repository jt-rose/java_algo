package com.javapractice;

public class Main {

    public static void main(String[] args) {
//	var LL = new LinkedList("Hello");
//    LL.addTail("World");
//    LL.addTail("NY");
//    LL.addTail("TOKYO");
//    LL.removeHead();
//    LL.removeHead();
//    LL.reverse();
//    System.out.println(LL.getNthFromEnd(2));
//    System.out.println(LL.getNthFromEnd(1));
//    System.out.println(LL.getNthFromEnd(0));
//    System.out.println(LL.findMiddle());
//
//    LL.addTail("PARIS");
//    LL.addTail("BEIJING");
//    System.out.println(LL.findMiddle());
//    System.out.println(MStack.reverse("elephant"));
//    var encTestA = "((hello [John] and <Wendy>, I see you are {talking}))";
//    var invalidEnc = "((hello [John] and <Wendy>, I see you are talking}))";
//    System.out.println(MStack.hasBalancedEnclosures(encTestA));
//    System.out.println(MStack.hasBalancedEnclosures(invalidEnc));
//    System.out.println(LL.contains("NY"));
//    System.out.println(LL.contains("TOKYO"));
//    System.out.println(LL.contains("???"));

//        var stack = new NStack(new int[]{1, 2, 3});
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        stack.push(9);
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());

        var q = new MQueue(new int[]{1,2,3});
        System.out.println(q.getQueue());
        q.reverse();
        System.out.println(q.getQueue());
    }
}
