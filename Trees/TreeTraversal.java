public class TreeTraversal {

    // 1. Definition of a Node (inner class)
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // 2. Your In-order Traversal Method
    public void inOrderTraversal(Node node) {
        // Base Case
        if (node == null) {
            return;
        }
        // Go Left
        inOrderTraversal(node.left);
        // Visit Root
        System.out.print(node.value + " ");
        // Go Right
        inOrderTraversal(node.right);
    }

    // 3. The main method to build the tree and test the traversal
    public static void main(String[] args) {
        // Create an object so we can call the method
        TreeTraversal traverser = new TreeTraversal();

        // Manually build the tree from our example:
        //       10
        //      /  \
        //     5    15
        //    /    /  \
        //   2    12  20
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println("In-order traversal of the tree is:");
        // Call the traversal method starting from the root node
        traverser.inOrderTraversal(root);
    }
}