public class RemoveDuplicates {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList p = linkedList.next;
        while(p.next!=null){
            if(linkedList.value == linkedList.next.value){
                linkedList.next = linkedList.next.next;
            }
            p.next=p.next.next;
        }
        return linkedList;
    }
}
