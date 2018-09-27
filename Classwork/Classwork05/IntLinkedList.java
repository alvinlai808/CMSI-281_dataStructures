/*
 * IntLinkedList contains methods to be called onto linked list data structures
 */

public class IntLinkedList {

   private Node head;
   private int  size;

  // the constructor
   IntLinkedList() {
      head = null;
      size = 0;
   }
   //-----------------------------------------------------------------
   public int getSize() {
      return size;
   }
   //-----------------------------------------------------------------
   public void prepend( int dataToAdd ) {
      Node currentHead = head;
      head = new Node( dataToAdd );
      head.next = currentHead;
      size++;
   }
   //-----------------------------------------------------------------
   private class Node {
      int data;            // remember this is an IntLinkedList
      Node next;           // here's the self-referential part

      // constructor
      Node( int d ) {
         data = d;
         next = null;
      }
   }
   //-----------------------------------------------------------------
   public Iterator getIteratorAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }
   //-----------------------------------------------------------------
   public class Iterator {
      private Node currentNode;

      Iterator() {
         currentNode = head;
      }

      public void next() {
         if( currentNode == null ) {
            return;
         } else {
            currentNode = currentNode.next;
         }
      }

      public boolean hasNext() {
         return ((currentNode != null) && (currentNode.next != null));
      }

      public int getCurrentInt() {
         return currentNode.data;
      }

      public Node getCurrentNode() {
         return currentNode;
      }
   }
   //-----------------------------------------------------------------
   // adds a node to the linked list that contains data at a given index
   public void insertAt( int index, int data ) {
      Iterator it = new Iterator();
      it = getIteratorAt( index - 1 );
      Node newNode = new Node( data );
      Node currentNode = it.getCurrentNode();
      newNode.next = currentNode.next;
      currentNode.next = newNode;
      size++;                   
   }
   //-----------------------------------------------------------------
   // removes a node from a given index
   public void removeAt( int index ) {
      Iterator it = new Iterator();
      it = getIteratorAt( index - 1 );
      Node currentNode = it.getCurrentNode();
      Node targetNode = currentNode.next.next;
      currentNode.next = targetNode;
      size--;
   }
}
