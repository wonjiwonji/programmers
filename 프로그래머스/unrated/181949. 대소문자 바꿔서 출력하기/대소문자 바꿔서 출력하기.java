import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        char tmp;
        
        for(int i=0; i<a.length(); i++) {
            tmp = a.charAt(i);
            if(tmp<=90) {
                output += a.valueOf(tmp).toLowerCase();
            } else {
                output += a.valueOf(tmp).toUpperCase();
            }
        }
        System.out.println(output);
    }
}