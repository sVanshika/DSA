package dsa.arrays;

import java.util.ArrayList;

public class Merge3Sorted {

    public static ArrayList<Integer> merge2(int[] a, int[] b, int[] c) {
        ArrayList<Integer> merged  = new ArrayList<>();
        
        int i=0, j=0, k=0;

        while(i<a.length && j<b.length && k<c.length){
            if(a[i] == b[j] && b[j] == c[k]){
                merged.add(a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i] < b[j])
                i++;
            else if(b[j] < c[k])
                j++;
            else
                k++;
        }

        return merged;
    }

    public static ArrayList<Integer> merge(int[] a, int[] b, int[] c) {
        ArrayList<Integer> merged  = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        int i=0, j=0;
        int n1=a.length, n2=b.length, n3=c.length;

        while(i<n1 && j<n2){
            if(a[i] == b[j]){
                temp.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j])
                i++;
            else 
                j++;
        }

        System.out.println("temp=");
        temp.forEach(x->System.out.println(x));

        i=0;
        j=0;

        while(i<temp.size() && j<n3){
            System.out.println("i="+i+" temp[i]="+temp.get(i) + " j="+j+" c[j]="+c[j]);
            if(temp.get(i) == c[j]){
                System.out.println("putting");
                merged.add(c[j]);
                i++;
                j++;
                
            }
            else if(temp.get(i) < c[j])
                i++;
            else
                j++;
        }

        return merged;

        
    }

    public static void main(String[] args) {
        int[] a = {1,5,10,20,40,80};
        int[] b = {6,7,20,80,100};
        int[] c = {3,4,15,20,30,70,80,120};

        ArrayList<Integer> merged = merge2(a,b,c);

        merged.forEach(i -> System.out.println(i));
    }
    
}
