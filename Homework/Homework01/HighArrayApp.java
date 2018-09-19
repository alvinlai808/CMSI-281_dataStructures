/*
 * Main function that tests methods for high-level array interface
 */

public class HighArrayApp {

   public static void main( String[] args ) {
      int maxSize = 100;
      HighArray arr = new HighArray( maxSize );

      arr.insert(77);
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      // test getMax()
      System.out.println( "TESTING getMax() METHOD");
      
      arr.display();
      System.out.println( arr.getMax() );
      System.out.println( "Adding values..." );
      arr.insert(100);
      arr.insert(1);
      arr.insert(101);
      arr.insert(150);
      arr.insert(59);
      arr.insert(200);
      arr.display();
      System.out.println( arr.getMax() );
      System.out.println( "getMax() TEST COMPLETE");
      System.out.println( "---------------------------------" );

      // test delete()
      System.out.println( "TESTING delete() METHOD");

      arr.delete(77);
      arr.delete(99);
      arr.delete(44);
      arr.delete(55);
      arr.delete(22);
      arr.delete(88);
      arr.delete(11);
      arr.delete(00);
      arr.delete(66);
      arr.delete(33);
      arr.delete(101);
      arr.delete(150);
      arr.delete(59);
      arr.delete(200);
      arr.delete(100);
      arr.display();
      System.out.println( "delete() TEST COMPLETE");
      System.out.println( "---------------------------------" );

      // test find()
      System.out.println( "TESTING find() METHOD"); 

      int searchKey = 1;
      System.out.println( "Search Key = " + searchKey );
      if( arr.find( searchKey ) ) {
         System.out.println( "Found " + searchKey );
      } else {
         System.out.println( "Can't find " + searchKey );
      }

      searchKey = 4;
      System.out.println( "Search Key = " + searchKey );
      if( arr.find( searchKey ) ) {
         System.out.println( "Found " + searchKey );
      } else {
         System.out.println( "Can't find " + searchKey );
      }

      searchKey = 6;
      System.out.println( "Search Key = " + searchKey );
      if( arr.find( searchKey ) ) {
         System.out.println( "Found " + searchKey );
      } else {
         System.out.println( "Can't find " + searchKey );
      }

      System.out.println( "Deleting value: " + searchKey );
      if( arr.find( searchKey ) ) {
         System.out.println( "Found " + searchKey );
      } else {
         System.out.println( "Can't find " + searchKey );
      }

      System.out.println( "find() TEST COMPLETE");
      System.out.println( "---------------------------------" );       

      // test noDups()
      System.out.println( "TESTING noDups() METHOD");  
      System.out.println( "Adding values..." );    
      arr.insert(1);
      arr.insert(1);
      arr.insert(2);
      arr.insert(2);
      arr.insert(2);
      arr.insert(3);
      arr.insert(4);
      arr.insert(4);
      arr.insert(5);
      arr.insert(5);
      arr.insert(6);
      arr.display();
      arr.noDups();
      arr.display();
      System.out.println( "noDups() TEST COMPLETE");
      System.out.println( "---------------------------------" );      

   }
}
