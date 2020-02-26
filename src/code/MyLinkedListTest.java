package code;



class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList array = new MyLinkedList(10);
        array.addFirst(11);
        array.addFirst(12);
        array.addFirst(13);
        array.addFirst(14);
        array.addFirst(15);

        array.add(4,9);
        array.add(5,90);
        array.printList();
    }
}