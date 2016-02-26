public class Worksheet3c
{
public static void main(String [] args)
  {
        //PART 1
    String name = "is Ali Baba";
    System.out.println("My name " + name); // My name is Ali Baba
    String test = "abcdefghijcklamen";
    System.out.println(test.length()); // 17
    System.out.println(test.charAt(7)); // g
    String test2 = "abcdefgxcvthg";
    System.out.println(test.substring(5)); //efgxcvthg
    System.out.println("abc123\ndef456"); // abc123\ndef456
    System.out.println("abc678\\ndef7777"); //abc678\\ndef7777 ?
    String test3 = "Hello Bilgi";
    String test4 ;
    test4 = test3.toUpperCase();
    
    System.out.println(test4); // HELLO BILGI
    System.out.println("10 + 2 = " + (10 + 2)); // 12
    System.out.println("10 + 2 = " + 10 + 2); // 102

       //PART 2
    System.out.println("PART 2 PART 2 PART 2");
    int a=50;
    int b=-5;
    System.out.println(a>b); //true
    System.out.println(a>=b); //true
    System.out.println(a<b); //false
    System.out.println(a<=b); //false
    System.out.println(a==b); //false
    System.out.println(a!=b); //true
    
    // can you execute following statements, explain if you can't*
    
    System.out.println(a==b); //should be ==
    System.out.println(a>=b); //should be >=
    System.out.println(a<=b); //should be <=
    System.out.println(a!=b);//should be !=
    
    //wrong syntaxes on all 4 above 
    
    boolean flag= a<=b; //flag is false
    System.out.println(flag); //false
    int flag2= a*b; //flag2 is -250
    System.out.println(flag2); //-250
    boolean flag3= a<b; //flag3 is false
    System.out.println(flag3); //false
    
    //What output will be produced by the following code?*
    
    int extra = 10;
    if (extra < 10)
    System.out.println("small"); 	
    else if (extra == 10)
    System.out.println("medium");
    else
    System.out.println("large");
    // set extra to different numbers such -100, 5 different numbers and execute again.*

    //PART 3 RESULT TEST
    int testing = sumNumbers (3 , 13 , 33);
    System.out.println(testing);



  }
       //PART 3
    public static int sumNumbers (int x, int y, int z) {
    System.out.println("PART 3 PART 3 PART 3");
    int sum;
    if (((z<y) && (y<x)) || (x<y) && (y<z)) {
    sum = z + x;
     }
    else if (((y<x) && (x<z)) || (z<x) && (x<y)) {
    sum = z + y; 
     }
    else {
    sum = x + y;
     }
    return sum;
 
}
  }
                                                         
