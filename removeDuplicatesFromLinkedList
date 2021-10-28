import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		HashSet<Integer> numbers = new HashSet<Integer>();
	
		LinkedList previous = null;
		LinkedList head = linkedList;
		
		while (linkedList.next != null) {

			if (numbers.contains(linkedList.value)) {
				if(linkedList.next != null) {
					linkedList = linkedList.next;
					previous.next = linkedList;	
				}
				else {
					previous.next = null;
					linkedList = previous;
				}				
			}
			else {
				numbers.add(linkedList.value);
			}
			if(linkedList.next != null) {
				previous = linkedList;
				linkedList = linkedList.next;	
			}		
		}

		return head;
	}
}
