package dsa.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.QueryExp;

public class Graph {

    static HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
    
    public static void addEdgeUnweighted(int src, int dest, int directed) {
        if(adjList.containsKey(src))
            adjList.get(src).add(dest);
        else{
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(dest);
            adjList.put(src, temp);
        }

        

        if(directed == 0){
            if(adjList.containsKey(dest))
                adjList.get(dest).add(src);
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(src);
                adjList.put(dest, temp); 
            }    
        }   
    }

    public static void print() {
        for(Integer src: adjList.keySet()){
            System.out.print("\n" + src + " -> ");
            for(Integer dest: adjList.get(src)){
                System.out.print(dest + " ");
            }

            
        }
        
    }

    public static void bfs(int src, HashMap<Integer, Boolean> visited, Queue<Integer> queue) {
        queue.add(src);
        visited.replace(src, false, true);
    
        while(! queue.isEmpty()){
            int front = queue.remove();
            System.out.print(front + ", ");

            for(Integer neighbor: adjList.get(front)){
                if(! visited.containsKey(neighbor)){
                    queue.add(neighbor);
                    visited.replace(neighbor, false, true);
                }
            }
        }

    }


    public static void dfs(int src, HashMap<Integer, Boolean> visited) {
        visited.replace(src, false, true);
        System.out.print(src + ", ");

        for(Integer neighbor: adjList.get(src)){
            if(visited.get(neighbor) == false)
                dfs(neighbor, visited);
        }
    }

    public static boolean isCyclicBFS(int start){
        boolean cyclic = false;

        HashMap<Integer, Boolean> visited = new HashMap<>();
        HashMap<Integer, Integer> parent =  new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.put(start, true);
        parent.put(start, -1);

        while(! queue.isEmpty()){
            int front = queue.remove();

            System.out.println("front = " + front);

            for(int neighbor: adjList.get(front)){
                if(visited.containsKey(neighbor) && neighbor != parent.get(front)) {
                    cyclic = true;
                    break;
                }
                else{
                    queue.add(neighbor);
                    visited.put(neighbor, true);
                    parent.put(neighbor, front);
                }
            }
        }

        return cyclic;
    }

    public static void main(String[] args) {
        // ------------ creating graph -------------
        // component 1
        // addEdgeUnweighted(0, 1, 0);
        // addEdgeUnweighted(1, 2, 0);
        // addEdgeUnweighted(1, 3, 0);
        // addEdgeUnweighted(2, 3, 0);
        // addEdgeUnweighted(2, 4, 0);
        // addEdgeUnweighted(3, 4, 0);
        
        // // component 2
        // addEdgeUnweighted(5, 6, 0);

        addEdgeUnweighted(0, 2, 0);
        addEdgeUnweighted(1,3,0);
        addEdgeUnweighted(2, 3, 0);
        addEdgeUnweighted(2, 4, 0);
        addEdgeUnweighted(3, 4, 0);

        print();


        int src = 0;
        
        // HashMap<Integer, Boolean> visited = new HashMap<>();
        // for(Integer node: adjList.keySet())
        //     visited.put(node, false);


        // -------------- bfs -------------
        // System.out.println("\nBFS");
        // Queue<Integer> queue = new LinkedList<>();

        // for(Integer node: adjList.keySet()){
        //     if(visited.get(node) == false)
        //         bfs(node, visited, queue);
        // }

        // ------------ dfs -----------
        // System.out.println("\nDFS");

        // for(Integer node: adjList.keySet()){
        //     if(visited.get(node) == false)
        //         dfs(node, visited);
        // }

        // ------------------ cycle detection ------------
        src = 0;
        System.out.println("is cycle present = " + isCyclicBFS(src));

        

        
    }
    
}
