class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

//class BTS{
//    public
//}


public class Binary {
    void inorder(Node root){
        if(root==null)
            return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    void preorder(Node root){
        if(root==null)
            return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    void posorder(Node root){
        if(root==null)
            return ;
        posorder(root.left);
        posorder(root.right);
        System.out.print(root.data+" ");


    }

    public static  void main(String args[]){
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        root.left.right.left=new Node(8);
//        root.right.right.left=new Node(9);
//        root.right.right.right=new Node(10);


        
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(3);
        root.right.left=new Node(7);
        root.right.right=new Node(6);
        root.left.left.right=new Node(9);
        root.left.left.right.left=new Node(1);
        root.right.right.left=new Node(8);

        Binary out=new Binary();
        out.inorder(root);
        System.out.println("<------Inorder output ");
        out.preorder(root);
        System.out.println("<------Preorder output ");
        out.posorder(root);
        System.out.println("<------Posorder output ");

    }
}
