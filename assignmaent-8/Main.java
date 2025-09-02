import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main {
// Write a Java program to count how many times a given substring occurs in a string.
// 7. Toggle Case of Characters
// Problem:
// Write a Java program to toggle the case of each character in a given string. Convert
// uppercase letters to lowercase and vice versa.
// 8. Compare Two Strings

// Problem:
// Write a Java program to compare two strings lexicographically (dictionary order) without
// using built-in compare methods.
// Example Input:
// String 1: "apple"
// String 2: "banana"

// Expected Output:
// "apple" comes before "banana" in lexicographical order
// 9. Find the Most Frequent Character
// Problem:
// Write a Java program to find the most frequent character in a string.
// Example Input:
// String: "success"

// Expected Output:
// Most Frequent Character: 's'

// 10. Remove a Specific Character from a String
// Problem:
// Write a Java program to remove all occurrences of a specific character from a string.
// Example Input:
// String: "Hello World"
// Character to Remove: 'l'

// Expected Output:
// Modified String: "Heo Word"

// 11. Write a Java program that accepts two strings from the user and checks if the two
// strings are anagrams of each other (i.e., whether they contain the same characters in any
// order).
// 12. Write a replace method in Java that replaces a given word with another word in a
// sentence:
    public static void main(String[] args) {
        
    }
    //count vowels and consonants in a string
    public static int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<right;i++){
            String temp=words[i];
            if(isvowel(temp.charAt(0))&&isvowel(temp.charAt(temp.length()-1))){
                count++;
            }
        }
        if(right<words.length){
             String temp=words[right];
             if(isvowel(temp.charAt(0))&&isvowel(temp.charAt(temp.length()-1))){
                count++;
             }
        }
        return count;
    }
    static boolean isvowel(char i){
        if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
            return true ;
        }
        return false;
    } 

    //reverse a string
      public void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length;i++){
            st.push(s[i]);
        }
         for(int i=0;i<s.length;i++){
            s[i]=st.pop();
        }

    }
    
 public boolean isPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);
              if(ch>=97&&ch<=122||ch>=65&&ch<=90||ch>=48&&ch<=57){
                if(ch>=65&&ch<=90){
                    ch=(char)(ch+32);
                    ans+=ch;
                }
                else{
                ans+=ch;}

              }
        }   
        return check(ans);
        
         }
    static  boolean check(String ans){
        StringBuilder sb=new StringBuilder();
        for(int i=ans.length()-1;i>=0;i--){
            sb.append(ans.charAt(i));
        }
        String temp=sb.toString();
        return temp.equals(ans);
    }
    //remove duplicates from a string
     public String removeDuplicateLetters(String s) {
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<s.length();i++){
            map.add(s.charAt(i));
        }
        ArrayList<Character> list=new ArrayList<>(map);
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        for(char i:list){
            sb.append(i);
        }
       return  sb.toString();

    }
    //find the longest word in a sentence
    public String longestWord(String[] words) {
        String ans="";
        for(String i:words){
            if(i.length()>ans.length()){
                ans=i;
            }
        }
        return ans;

            }
    //find substring occurrences
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.substring(i).startsWith(needle)){
                return i;
            }
        }
        return -1;
    }
    //toggle case of characters
    public String toggleCase(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){

        }
        return sb.toString();
    }
    //compare two strings
    public int compareStrings(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        int n=Math.min(n1,n2);
        for(int i=0;i<n;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2){
                return ch1-ch2;
            }
        }
        return n1-n2;
    }
    //find the most frequent character
    public char mostFrequentChar(String str) {
        int[] count=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            count[ch-'a']++;
        }
        int maxCount=0;
        char result=' ';
        for(int i=0;i<26;i++){
            if(count[i]>maxCount){
                maxCount=count[i];
                result=(char)(i+'a');
            }
        }
        return result;
    }
    //remove a specific character from a string
    public String removeCharacter(String str, char ch) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr!=ch){
                sb.append(curr);
            }
        }
        return sb.toString();
    }
    //check if two strings are anagrams

   public boolean isAnagram(String s, String t) {
        int n=s.length(),m=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
          if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
          }
          else{
            map.put(c,1);
          }
        }
        for(int i=0;i<n;i++){
             char c=t.charAt(i);
             if(map.containsKey(c)){
                 map.put(c,map.get(c)-1);
                 if(map.get(c)==0){
                    map.remove(c);
                 }
             }
             else{
                return false;
             }
        }
        return map.isEmpty();
    }
    // Write a replace method in Java that replaces a given word with another word in a sentence:
    public String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(words[i].equals(oldWord)){
                sb.append(newWord);
            }
            else{
                sb.append(words[i]);
            }
            if(i!=words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }   



}