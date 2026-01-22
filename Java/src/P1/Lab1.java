package P1;
import java.util.Scanner;
public class Lab1 {
    //1. WAP to insert 3 Numbers from the keyboard and find the Greater Number among 3 Numbers
    static int greaterNumber(int num1,int num2,int num3){
        int gr1 = Math.max(num1,num2);
        return Math.max(gr1,num3);
    }
    //2. WAP to find the odd numbers between 1 to 100 ,display the sum of them
    static int sumOfOddNumbers(){
        int oddSum = 0;
        int i = 1;
        while(i <= 100){
            if(i % 2 != 0){
                oddSum +=i;
            }
            i++;
        }
        return oddSum;
    }
    //3.WAP to find the largest and smallest number in the array
    static int largestNumber(int... nums){
        int large = Integer.MIN_VALUE;
        for(int num : nums){
            if(num>large){
                large = num;
            }
        }
        return large;
    }

    static int smallestNumber(int... nums){
        int small = Integer.MAX_VALUE;
        for(int num : nums){
            if(num<small){
                small = num;
            }
        }
        return small;
    }
    //4.WAP to find the number of characters in the given String,to reverse it and whether is it palindrome or not
    static int countCharacters(String str){
        return str.length();
    }
    static String reverseString(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
    static void isPalindromeNumber(String str){
           int num = Integer.parseInt(str);
           int reverseNum = Integer.parseInt(reverseString(str));
           if(num == reverseNum){
               System.out.println("It is a Palindrome Number");
           }else{
               System.out.println("Not a PalindromeNumber");
           }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number3 : ");
        int num3 = sc.nextInt();
        //1.
        System.out.println("The Greatest Number is " + greaterNumber(num1,num2,num3));
        //2.
        System.out.println("Sum of odd numbers between 1-100 is " + sumOfOddNumbers());
        //3.
        System.out.println("Largest Number : " + largestNumber(2,3,4,7));
        System.out.println("Smallest Number : " + smallestNumber(2,3,45,3,1));
        //4.
        String str = "345";
        System.out.println("Number of Characters in the String is  " + countCharacters(str));
        System.out.println("Reverse of the String is " + reverseString(str));
        isPalindromeNumber(str);
        //5.
        int sum = 0;
        for(int i = 0;i <args.length;i++){
            int num = Integer.parseInt(args[i]);
            sum += num;
        }
        System.out.println("Sum is " + sum);

    }
}
