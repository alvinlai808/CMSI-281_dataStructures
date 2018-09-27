/*
 * IntQueue contains methods to be called onto queues
 * Also contains tests for the methods
 */

public class IntQueue {

   IntLinkedList myQueue;

   IntQueue() {
      myQueue = new IntLinkedList();         // constructor
   }

   public void push( int itemToPush ) {
      myQueue.prepend( itemToPush );
   }

   public int peek() throws IllegalArgumentException {
      if( myQueue.getSize() == 0 ) {
         throw new IllegalArgumentException( "The queue is empty" );
      } else {
         return myQueue.getIteratorAt( myQueue.getSize() - 1 ).getCurrentInt();     // we use the iterator
      }
   }

   public void pop() throws IllegalArgumentException {
      if( myQueue.getSize() == 0 ) {
         throw new IllegalArgumentException( "The queue is empty" );
      } else if( myQueue.getSize() == 1 ) {
         myQueue = new IntLinkedList();
      } else {
         myQueue.removeAt( myQueue.getSize() - 1 );
      }
   }

   public static void main( String[] args ) {
      IntQueue testQueue = new IntQueue();
      testQueue.push( 19 );
      testQueue.push( 23 );
      testQueue.push( 29 );
      testQueue.push( 31 );
      testQueue.push( 37 );
      testQueue.push( 41 );
      testQueue.push( 43 );
      testQueue.push( 47 );
      testQueue.push( 51 );
      testQueue.push( 57 );

      System.out.println( "***** TESTING IntQueue.java *****");

      System.out.println( "Peeking top item: expecting 19");
      System.out.println( "Top item: " + testQueue.peek() );
      System.out.println( "Removing top: expected top is 23" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 29" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 31" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 37" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 41" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 43" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 47" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 51" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expected top is 57" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "Removing top: expecting error" );
      testQueue.pop();
      System.out.println( "Updated top: " + testQueue.peek() );
      System.out.println( "------------------------");

      System.out.println( "***** TESTING COMPLETE *****");
   }
}
            
