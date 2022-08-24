package binary.tree;

public class NodeDepths {
    static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return nodeDepthsHelper(root,0);

    }
    static int nodeDepthsHelper(BinaryTree root,int depth){
        if(root == null) return 0;
        return depth+nodeDepthsHelper(root.left,depth+1)+nodeDepthsHelper(root.right,depth+1);
    }
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);
        root.left.right = new BinaryTree(5);
        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        System.out.println(nodeDepths(root));
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

}
