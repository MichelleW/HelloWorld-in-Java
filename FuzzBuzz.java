public class FuzzBuzz {
  public fuzzBuzz(int number) {
    if(number %3 ==0 && number %5 == 0){
      System.out.println("FuzzBuzz");
      } else if (number%3 ==0){
        System.out.println("Fuzz");
    } else if(number%5 == 0){
      System.out.println("Buzz");
    }
    else{
      System.out.println(number);
    
    }
    
  }
  
   
}
 