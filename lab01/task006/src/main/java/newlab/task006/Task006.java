/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package newlab.task006;

/**
 *
 * @author New Ameen Computer
 */
public class Task006 {

    public static void main(String[] args) {
       char[] word={'r','a','d','a','r'};
    int left=0;
    int right=word.length-1;
    boolean isPalindrome=true;
    while (left<=right){
    if(word[left] != word[right]){
        isPalindrome=false;
        break;
    }
    left++;
            right--;
} 
    if(isPalindrome){
        System.out.println("this is palindrome");
    } else{
        System.out.println("this is not palindrome");
    }
    }
    }
    
