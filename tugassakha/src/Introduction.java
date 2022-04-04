public class Introduction {
    int personAge;
   public Introduction(String name) {
      
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
      personAge = age;
   }

   public int getAge( ) {
      System.out.println("Person age is :" + personAge );
      return personAge;
   }

   public static void main(String []args) {
      
      Introduction Intro = new Introduction( "Faras Sakha Muhammad Santoso" );

     
      Intro.setAge( 18 );

     
      Intro.getAge( );

      
      System.out.println("Variable Value :" + Intro.personAge );
   }
}