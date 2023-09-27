package Prog3;


import java.util.*;


public class CustomLinklist<T>{


   private CustomNode head;


   public CustomNode getHead(){
       return this.head;
   }


   public void setHead(CustomNode head){
       this.head = head;
   }


   public CustomLinklist(){
       this.head = null;
   }


   public boolean isEmpty(){
       return getHead() == null;
   }


   public void addToTop(int element){
       setHead(new CustomNode<>(element,new LinkedList<>(),this.getHead()));
   }


   public void addElement(int key,T c){
       try{
           CustomNode<T> node = this.findKey(key);
           node.getList().addFirst(c);
       } catch (NoSuchElementException e) {
           this.addToTop(key);
           getHead().getList().addFirst(c);
       }
   }


   public CustomNode<T> findKey(int x){
       CustomNode<T> current = this.getHead();
       while (current != null){
           if(current.getElement() == x){
               return current;
           }
           current = current.getNext();
       }
       throw new NoSuchElementException();
   }


   public char getChar(int x){
       CustomNode node = findKey(x);
       LinkedList<Character> list = node.getList();
       Collections.shuffle(list);
       return list.getFirst();
   }


   private static class CustomNode<T>{
       private LinkedList list;


       private CustomNode next;


       private int element;


       public LinkedList getList() {
           return list;
       }


       public void setList(LinkedList list) {
           this.list = list;
       }


       public CustomNode getNext() {
           return next;
       }


       public void setNext(CustomNode next) {
           this.next = next;
       }


       public int getElement() {
           return element;
       }


       public void setElement(int element) {
           this.element = element;
       }




       public CustomNode(int element, LinkedList list, CustomNode next){
           this.element = element;
           this.list = list;
           this.next = next;
       }
   }
}
