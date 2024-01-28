import java.util.ArrayList;
import java.util.List;
class Graph{
    private int numVertices;
    private int List<List<Integer>>AdjacencyList;
    //constructor
    public Graph(int numVertices){
        numVertices=numVertices;
        this.AdjacencyList=new ArrayList<>(numVertices);
        //loop for no.of vertex
        for(int i=0;i<numVertices;i++){
            this.AdjacencyList.add(new ArrayList<>)
        }
        public void addEdges(int source,int destination){
            //undirected Graph
             this.AdjacencyList=get(soure).add(destination);
             this.AdjacencyList=get(destination).add(source);
        }
        //mthd for graphvalue
        public void GraphPrint(){
            System.out.println("graph value: ");
            //loop for checking the adjacent with near vertex
            for(int i=0;i<numVertices;i++){
                System.out.println("vertex: "+i+"=");
                //foreach loop for encapsulation
                for(Integer near:AdjacencyList.get(i));
                System.out.println(near+" ");
            }
            System.out.println();
        }
    }
}
//main class
public class ListArray{
    public static void main(String args[]){
        //object subclass graph
        Graph grp =new Graph(5);
        //edges 
        grp.addEdges(1,3);
        grp.addEdges(0,2);
        grp.addEdges(1,4);
        grp.addEdges(0,4);
        grp.addEdges(2,3);
        //invoking the graph mthd
        grp.GraphPrint();
        
    }
}