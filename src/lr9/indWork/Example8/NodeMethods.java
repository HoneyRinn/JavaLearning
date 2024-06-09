package lr9.indWork.Example8;

import lr9.indWork.Example5.ExampleList;

import java.util.Scanner;

public class NodeMethods {
    public Node Head = null;
    public Node Tail = null;
    Scanner in = new Scanner(System.in);
    String result = "";

    public void AddFirst(int value){
        Head = new Node(value, Head);
    }

    public void AddLast(int value){
        Node ref = Head;
        while (ref.next != null){
            ref = ref.next;
        }
        ref.next = new Node(value, null);
        Tail = ref.next;
    }

    public String returnNode(){
        String result = "";
        Node ref = Head;
        while (ref.next != ref){
            result += ref.value + " ";
            ref = ref.next;
        }
        return result;
    }

    public void createHead(int index){
        for (int i = index; i > 0; i--) {
            Head = new Node(in.nextInt(), Head);
        }
    }

    public void createTail(int index){

        Node ref = Tail;
        for (int i = 0; i < index; i++) {
            ref.next = new Node(in.nextInt(), null);
            ref = ref.next;
        }
        Tail = ref;
    }

    public void Remove(int index){
        Node ref = Head;
        for (int i = 0; i < index-1; i++) {
            ref = ref.next;
        }
        ref.next = ref.next.next;
    }

    public void Insert(int index, Node element){
        Node ref = Head;
        for (int i = 0; i < index-1; i++) {
            ref = ref.next;
        }

        element.next = ref.next;
        ref.next = element;
    }

    public void RemoveFirst(){
        Head = Head.next;
    }

    public void RemoveLast(){
        Node ref = Head;
        while(ref.next.next != null){
            ref = ref.next;
        }
        ref.next = null;
    }

    private Node crHeadRec(int n){
        if (n != 0) {
            Head = new Node(in.nextInt(), crHeadRec(n -1));
            return Head;
        } else return new Node(in.nextInt(), null);
    }

    public void createHeadRec(int index){
        Head = crHeadRec(index);
    }

    private Node crTailRec(int n){
        if (n != 0) {
            Head.next = new Node(in.nextInt(), crTailRec(n-1));
            return Head.next;
        } else return null;
    }

    public void createTailRec(int index){
        Head = crTailRec(index);
    }

    public String toStringRec(){
        if(Head.next != null) {
            result += Head.value + " " + toStringRec() + " ";
            Head = Head.next;
            return result;
        } else return String.valueOf(Head.value);
    }
}
