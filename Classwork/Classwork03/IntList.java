/*
 * This program is able to perform various operations on a list
 */

import java.util.stream.*;

public class IntList implements IntListInterface {
   private int[] theList;
   private int   size;

   private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

   public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
      theList = new int[STARTING_SIZE];
      size = 0;
   }

   public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
      if( size == 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
      } else if( index > size ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
      } else if( index < 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too small");
      } else {
         return theList[index];
      }
   }

   public boolean append( int valueToAdd ) throws ArrayIndexOutOfBoundsException {
      if( size < theList.length ) {
         theList[size] = valueToAdd;
         size++;
         return true;
      } else {
         throw new ArrayIndexOutOfBoundsException( "There's not enough space in the list!" );
      }
   }

   // inserts any given value at any given index
   public boolean insertValueAtIndex( int value, int index ) throws ArrayIndexOutOfBoundsException {
      if( index < 0 ) {                                  // check if index is within bounds
         throw new ArrayIndexOutOfBoundsException( "index is out of bounds" );
      } 
      // else if( index == 0 ) {
      //    prepend( value );
      // } 
      else if( index >= STARTING_SIZE ) {                // check if index is within bounds
         int[] expandList = new int[theList.length + STARTING_SIZE];

         for( int i = 0; i < theList.length; i++ ) {     // copy values of theList into new list
            expandList[i] = theList[i];
         }

         theList = IntStream.of( expandList ).toArray(); // save expanded list to theList

         for( int i = index; i < theList.length; i++ ) { // shift elements to right of index
            theList[i + 1] = theList[i]; 
         }

         theList[index] = value;                         // insert value
         size++;

      } else {                                           // if index already in bounds
         for( int i = index; i < theList.length; i++ ) { // shift elements to right of index
            theList[i + 1] = theList[i]; 
         }

         theList[index] = value;                         // insert value
         size++;
         return true;
      }
      return false;
   }

   // check if an index is within bounds of the list
   public boolean checkIndex( int index ) {
      if( index >= 0 && index < theList.length ) {
         return true;
      }
      return false;
   }

   public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
      int value;
      if( size == 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
      } else if( index > size ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
      } else if( index < 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too small");
      } else {
         value = theList[index];
         holeFiller( index );
      }
      return value;
   }

   private void holeFiller( int index ) {
      for( int i = index; i < size - 1; i++ ) {
         theList[i] = theList[i+1];
      }
      size--;
   }

   public static void main( String[] args ) {
      IntList list = new IntList();
      list.append( 2 );
      list.append( 3 );
      list.append( 5 );
      list.append( 7 );
      System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
      list.append( 11 );
      list.append( 13 );
      list.append( 17 );
      list.append( 19 );
      System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
      System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
      System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
      list.insertValueAtIndex( 999, 9 );
      System.out.println( list.getValueAtIndex( 9 ) );      // should return the value 999
      // System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens

   }
}
