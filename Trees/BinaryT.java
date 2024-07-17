
public class BinaryT {

    // Making the Nodes
    static class Node {
        int data;
        Node left;
        Node right;
        // Making the Constructor

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

     static class BinaryTree{
        static int idx= -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void PreOrder(Node root){
        if(root==null){
            return;
        }
        // firstly print root node
        
        System.out.print(" "+root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    // PostOrder
    public static void PostOrder(Node root){
        if(root==null){
            return;
        }
        // firstly print root node
        
        
        PreOrder(root.left);
        PreOrder(root.right);
        System.out.print(" "+root.data);
    }

    // Inorder

    public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(" "+root.data);
        InOrder(root.right);

    }

    public static void main(String[] args) {
        int nodes[]={1,-1,2,3,-1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("It is preOrder ");
        PreOrder(root);
        System.out.println();
        System.out.println("It is postOrder ");
        PostOrder(root);
        System.out.println();
        System.out.println("It is InOrder ");
        InOrder(root);


    }
}
