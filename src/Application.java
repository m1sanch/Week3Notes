
public class Application {

  public static void main(String[] args) {
//   
//    int myNumber = 10;
//    int[] myArray = new int[6];
//    
//    //creates array right away
////    in[] mArray = new int[] {
////        1,2,3
////    }
//    myArray[0] = 1;
//    myArray[1] = 2;
//    myArray[2] = 3;
//    myArray[3] = 4;
//    myArray[4] = 5;
//    myArray[5] = 6;
    
//    for(int index = 0; index < myArray.length; index++) {
//    System.out.println(myArray[index]);
//    }
    
//    for(int[] number: myArray[]) {
//      System.out.println(number);
//    }
    
    
//    final int MAX_NUMBERS = 100;
//    //Create array that contains 100 even numbers
//    
//    int[] evenNumbers = new int[MAX_NUMBERS];
//    int number = 1;
//    int position = 0;
//    while (position < evenNumbers.length) {
//      if (position % 2 == 0) {
//        evenNumbers[position] = number;
//        position = position + 1;
//      }
//      number = number + 1;
//    }
// for (int even: evenNumbers) {
//   System.out.println(even);
// }
//    
    

  
//  public static boolean isDivisibleBy6(int numberToTest) {
//    return (numberToTest % 6 == 0);
//    }
//  }
 
  
  String[] names = new String[] {
  "George", "Brandon", "Zachery", "Victor", "Jeannette", "Chelsea", "Tyler", "Michael"
  };
  
  // lose position in enhanced for loop
  int index = 0;
  int totalCharacters = 0;
  for(String name: names) {
    System.out.println("[" + index + "]" + name + "(" + name.length() + ")");
    totalCharacters = totalCharacters + name.length();
    index++;
  }
  
  System.out.println("Total Characters: " + totalCharacters + " / " + names.length + " = " + ((float) totalCharacters / names.length));
}
  
  
  //adding new data to test
}
