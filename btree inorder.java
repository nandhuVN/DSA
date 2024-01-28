import java.util.Scanner;

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

// Main class
public class Main {
    TreeNode root;

    // Constructor using Main class passing the parameter
    public Main(int rootData) {
        this.root = new TreeNode(rootData);
    }

    // Method for invoking insert
    public void insert(int data) {
        root = insertVal(root, data);
    }

    private TreeNode insertVal(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else if (data > root.data) {
            root.right = insertVal(root.right, data);
        }
        return root; // Return the updated root
    }

    // Order-wise allocate
    public void InOrder() {
        InOrderVal(root);
    }

    private void InOrderVal(TreeNode root) {
        if (root != null) {
            InOrderVal(root.left);
            System.out.print(root.data + " "); // Removed ln for a cleaner output
            InOrderVal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Root value: ");
        int rootValue = sc.nextInt();
        Main tree = new Main(rootValue);

        System.out.println("Enter the number of node value: ");
        int numNode = sc.nextInt();

        for (int i = 0; i < numNode; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            tree.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        tree.InOrder();
    }
}
