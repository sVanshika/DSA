package dsa.arrays;

public class UnionIntersection {
    public static int[] findUnion(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        int[] union = new int[n+m];
        int i=0, j=0, count=0, k=0;
        while(i<n && j<m){
            if(a[i] < b[j]){
                union[k] = a[i];
                i++;
                k++;
                count++;
            }
            else if(a[i] > b[j]){
                union[k] = b[j];
                j++;
                k++;
                count++;
            }
            else{
                union[k] = a[i];
                i++;
                j++;
                k++;
                count++;
            }
        }

        while(i<n){
            union[k] = a[i];
            i++;
            k++;
            count++;
        }

        while(j<m){
            union[k] = b[j];
            j++;
            k++;
            count++;
        }
        return union;
    }

    public static int[] findIntersection(int[] a, int[] b){
        int n1 = a.length, n2 = b.length;
        int[] intersection = new int[n1+n2];
        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            if(a[i] == b[j]){
                intersection[k] = a[i];
                i++;
                j++;
                k++;
            }
            else if(a[i] < b[j])
                i++;
            else
                j++;
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11};
        int[] b = {2,4,11,17};

        System.out.println("union");
        int[] union = findUnion(a,b);
        for(int x: union)
            System.out.print(x+" ");

        System.out.println("\nIntersection");
        int[] intersection = findIntersection(a,b);
        for(int i: intersection)
            System.out.print(i + " ");
    }
}
