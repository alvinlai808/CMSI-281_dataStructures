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

   // we've gotta have this to actually get things to compile
   public boolean insertValueAtIndex( int value, int index ) {
   //    if( index >= STARTING_SIZE ) {
   //       int[] expandList = new int[theList.length + STARTING_SIZE];
   //       for( int i = 0; i < theList.length; i++ ) {
   //          expandList[i] = theList[i];
   //          System.out.println( expandList[i] );
   //       }
   //       System.out.println( "----------");
   //    }

   //    return true;
   // }

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
      list.insertValueAtIndex( 999, 7 );
      System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 999
      // System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens

   }
}
