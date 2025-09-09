import java.util.HashMap;

public class Dsa {
    // check if two string arrays are equivalent
     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
         StringBuilder sb2=new StringBuilder();
         for(String s:word1){
            sb1.append(s);
         }
          for(String s:word2){
            sb2.append(s);
         }
         if(sb1.toString().equals(sb2.toString())){
            return true;
         }
         return false;

    }
    // fist occurence of substring
     public int strStr(String h, String n) {
       return h.indexOf(n);
    }
    // valid palindrome
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
    // length of last word
      public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
        return arr[arr.length-1].length();
    }
      public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        return check(x);
    }

    public static boolean check(int x){
        String s=new StringBuilder(Integer.toString(x)).reverse().toString();
        String s1=Integer.toString(x);
        return s.equals(s1);
    }

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
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else if(list2!=null){
                 temp.next=list2;
                 list2=list2.next;

            }
            temp=temp.next;
            }
            while(list1!=null){
                temp.next=list1;
                list1=list1.next;
                  temp=temp.next;
            }
             while(list2!=null){
                temp.next=list2;
                list2=list2.next;
                  temp=temp.next;
            }
        return dummy.next;
    }
     public ListNode reverseList(ListNode head) {
        // base case
        if(head==null||head.next==null){
            return head;
        }
        // samll problem
         ListNode ans=reverseList(head.next);
        // 
        ListNode x=head.next;
        x.next=head;
        head.next=null;
        return ans;
    }
      public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        // Set key=map.keySet();
        for(Integer i:map.keySet()){
            if(map.get(i)>=2){
                return true;
            }
        }
        return false;
    }
     public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1&&nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }

     public int maxProfit(int[] p) {
        int buy=p[0];
        int ans=0;
        for(int i=1;i<p.length;i++){
         if(p[i]<buy){
            buy=p[i];

         }
         ans=Math.max(ans,p[i]-buy);
        }
        
    return ans;
}

 public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int [] arr=new int [n+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
     }

     public int majorityElement(int[] nums) {
      int ans=nums[0];
      int freq=1;
      for(int i=1;i<nums.length;i++){
        if(freq==0){
            ans=nums[i];
        }
        if(ans==nums[i]) freq++;
        if(ans!=nums[i]) freq--;
      }
      return ans;
        
    }
     public int[] twoSum(int[] arr, int target) {
        int[] ans= new int[2];
         HashMap<Integer,Integer> map=new HashMap<>();
          map.put(arr[0],0);
         for(int i=1;i<arr.length;i++){

           if(map.containsKey(target-arr[i])){
            ans[0]=map.get(target-arr[i]);
            ans[1]=i;
            break;
               
           }
          map.put(arr[i],i);
           
       }
        return ans;
    }
    
      public boolean isHappy(int n) {
        if(n==1||n==7){
            return true;
        }
        if(n<10&&n!=1&&n!=7){
            return false;
        }
        String s=Integer.toString(n);
        int ans=0;
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            ans+=Math.pow(num,2);

        }
        return isHappy(ans);
    }
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1&&nums[i]!=nums[i+1]){
                nums[count]=nums[i];
                count++;
            }

        }
        nums[count]=nums[nums.length-1];
        count++;
        return count;
    }
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
    public int maxProfit(int[] p) {
        int buy=p[0];
        int ans=0;
        for(int i=1;i<p.length;i++){
            if(p[i]<buy){
                buy=p[i];

            }
            ans=Math.max(ans,p[i]-buy);
        }

        return ans;}
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int [] arr=new int [n+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public int majorityElement(int[] nums) {
        int ans=nums[0];
        int freq=1;
        for(int i=1;i<nums.length;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]) freq++;
            if(ans!=nums[i]) freq--;
        }
        return ans;

    }
    public int[] twoSum(int[] arr, int target) {
        int[] ans= new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],0);
        for(int i=1;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                ans[0]=map.get(target-arr[i]);
                ans[1]=i;
                break;

            }
            map.put(arr[i],i);

        }
        return ans;
    }
    public List<String> fizzBuzz(int n) {
        List<String> list =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");

            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    public boolean isPowerOfTwo(int n) {
        if(((n-1)&n)==0 && n>0){
            return true;
        }
        else{
            return false;
        }
    }
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String say=countAndSay(n-1);
        String result="";
        for(int i=0;i<say.length();i++){
            char c=say.charAt(i);
            int count=1;
            while(i<say.length()-1&&say.charAt(i)==say.charAt(i+1)){
                count++;
                i++;
            }
            result+=Integer.toString(count)+Character.toString(c);
        }
        return result;
    }

}
