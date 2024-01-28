import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    //constructor
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    
}
 public  class Main{
    TreeNode root;
    //constructor for parameter to bst
    public Main(int rootData){
        this.root=new TreeNode(rootData);
    }
        //mthd fr invoke inserting bst
        public void insert(int data){
           root=insertVal(root,data); 
        }
        //mthd for same invoke but for value allocation
       private TreeNode insertVal(TreeNode root,int data){
            if(root==null){
                root=new TreeNode(data);
                return root;
            }
            //nested if()
            if(data<root.data){
                root.left=insertVal(root.left,data);
            }
            else{
                root.right=insertVal(root.right,data);
            }
            return root;
        }
        //Traversal start()
        public void InOrderTraversal(){
            InOrderTraversal(root);
        }
        //mthd for binary Tree 
        private void InOrderTraversal(TreeNode root){
            if(root!=null){
                InOrderTraversal(root.left);
                System.out.println(root.data+" ");
            }
        }

    public static void main(String[]args){
        //invoke
        Scanner sc=new Scanner(System.in);
        System.out.println("enter root value:");
        int rootValue=sc.nextInt();
        Main bst=new Main(rootValue);
        System.out.println("enter no of node:");
        int numNode=sc.nextInt();
        //forloop
        for(int i=0;i<numNode;i++){
            System.out.println("enter the element "+(i+1)+":");
            int nodeValue=sc.nextInt();
            bst.insert(nodeValue);
        }
        System.out.println("InOrderTraversal:");
        bst.InOrderTraversal();
        
        //TODO Auto-generated method stub 
        
    
    }
    
}