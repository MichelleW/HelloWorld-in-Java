public class StringManipulatorTest{
   public static void main (String[] args){
    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.trimAndConcat("    Hello     ","     World    "); 

    String word = "Hello";
    // String subString = "llo";
    // String notSubString = "world";
    // Integer a = manipulator.getIndexOrNull(word, subString);
    // Integer b = manipulator.getIndexOrNull(word, notSubString);
    // System.out.println(a); // 2
    // System.out.println(b); // null
    

    String concatedWord = manipulator.concatSubstring("Hello", 1, 2, "world");
    System.out.println(concatedWord);  


  
  }


}