public class IntLinkedListTester {

   public static void main( String[] args ) {
      IntLinkedList myList = new IntLinkedList();
      myList.prepend( 23 );
      myList.prepend( 19 );
      myList.prepend( 17 );
      myList.prepend( 13 );
      myList.prepend( 11 );
      myList.prepend(  7 );
      myList.prepend(  5 );
      myList.prepend(  3 );
      myList.prepend(  2 );
      IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
      myIt = myList.getIteratorAt( 3 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17

      //------------------------------------------------------------------------

      System.out.println( "-------------------------------------" );
      System.out.println( "TESTING removeAt()" );

      int index = 1;
      myList.removeAt( index );      // Expect: remove 23
      System.out.println( "Removed node at index " + index );

      index = 2;
      myList.removeAt( index );      // Expect: remove 17
      System.out.println( "Removed node at index " + index );

      index = 4;
      myList.removeAt( index );      // Expect: remove 11
      System.out.println( "Removed node at index " + index );
      
      System.out.println( "removeAt() TESTING COMPLETE" );
      System.out.println( "-------------------------------------" );

      //------------------------------------------------------------------------

      System.out.println( "UPDATED LINKED LIST: ");
      myIt = myList.getIteratorAt( 0 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 19
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23

      //------------------------------------------------------------------------

      System.out.println( "-------------------------------------" );
      System.out.println( "TESTING insertAt()" );

      index = 3;
      int data = 0;
      myList.insertAt( index, data );
      System.out.println( "Inserted node at index " + index + " with data " + data );

      index = 5;
      data = 5;
      myList.insertAt( index, data );
      System.out.println( "Inserted node at index " + index + " with data " + data );

      index = 6;
      data = 70;
      myList.insertAt( index, data );
      System.out.println( "Inserted node at index " + index + " with data " + data );

      index = 6;
      data = 70;
      myList.insertAt( index, data );
      System.out.println( "Inserted node at index " + index + " with data " + data );

      System.out.println( "insertAt() TESTING COMPLETE" );
      System.out.println( "-------------------------------------" );

      //------------------------------------------------------------------------

      System.out.println( "UPDATED LINKED LIST: ");
      myIt = myList.getIteratorAt( 0 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 0
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5

      //------------------------------------------------------------------------

   }
}
