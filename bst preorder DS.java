import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    TreeNode root;

    // Constructor for parameter to BST
    public Main(int rootData) {
        this.root = new TreeNode(rootData);
    }

    // Method for invoking inserting into the BST
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Method for same invocation but for value allocation
    private TreeNode insertVal(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        // Nested if()
        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else {
            root.right = insertVal(root.right, data);
        }
        return root;
    }

    // Traversal start()
    public void PreOrderTraversal() {
        PreOrderTraversal(root);
    }

    // Method for preorder traversal
    private void PreOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.println(root.data + " ");
            PreOrderTraversal(root.left);
            PreOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Invoke
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root value:");
        int rootValue = sc.nextInt();
        Main bst = new Main(rootValue);
        System.out.println("Enter number of nodes:");
        int numNode = sc.nextInt();
        // For loop
        for (int i = 0; i < numNode; i++) {
            System.out.println("Enter the element " + (i + 1) + ":");
            int nodeValue = sc.nextInt();
            bst.insert(nodeValue);
        }
        System.out.println("PreOrderTraversal:");
        bst.PreOrderTraversal();
    }
}
