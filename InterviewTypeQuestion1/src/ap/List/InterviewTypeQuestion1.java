package ap.List;
/*
 * Question: Give 2 List.
 * List A= {5, 0, 3, 6, 0, 6}
 * List B= {4, 4, 6, 0, 0, 9, 8, 1}
 * Find(A,B) where A+B = 9 ,
 * Without using Nested loop & Without any duplicate like (a,b) , (a,b) 
 * but (a,b),(b,a) is allowed. 
 * Find TC & SC. */
import java.util.HashSet;
import java.util.Set;

public class InterviewTypeQuestion1 {

    public static void main(String[] args) {
    	// List type of Array A , B
        int[] a = {5, 0, 3, 6, 0, 6}; 
        int[] b = {4, 4, 6, 0, 0, 9, 8, 1};
        
     // HashSet to store unique elements of A
        Set<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }
        
     // HashSet to store result pairs
        Set<String> pairs = new HashSet<>(); 
        for (int num : b) {
            int complement = 9 - num; 
            // here calculate the complement for the current element in B
            
           // in 24 lines -> Check if complement exists in setA or not
            if (setA.contains(complement)) { 
                pairs.add("(" + complement + "," + num + ")"); 
                pairs.add("(" + num + "," + complement + ")"); 
             // Add pair (complement, num) & (num , complement)
            }
        }
        System.out.println(pairs);
       /*TC --> O(n+m) --> for size of A & B is n , m respectively 
        * iterating the loop & 
        * SC --> O(n+m)
        */
        
    }
}
