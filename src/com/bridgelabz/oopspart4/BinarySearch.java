package com.bridgelabz.oopspart4;

public class BinarySearch {
    Node root;
    BinarySearch()
    {
        root = null;
    }
    Node insertRec(Node node, int data)
    {
        /* If the tree is empty, return a new node */
        if (node == null) {
            this.root = new Node(data);
            return this.root;
        }

        /* Otherwise, recur down the tree */
        if (data <= node.data) {
            node.left = this.insertRec(node.left, data);
        }
        else {
            node.right = this.insertRec(node.right, data);
        }
        return node;
    }
    void inorderUtil(Node node)
    {
        if (node == null)
            return;

        inorderUtil(node.left);
        System.out.print("<-" + node.data + " ->");
        inorderUtil(node.right);
    }

    // Inorder traversal of the tree
    void inorder()
    {
        inorderUtil(this.root);
    }

    public void insert(int data)
    {
        this.root = this.insertRec(this.root, data);
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Binary Search");
        BinarySearch tree = new BinarySearch();

        /* Let us create following BST
              50
           /     \
          30      76
         */

        tree.insert(56);
        tree.insert(30);
        tree.insert(76);

        tree.inorder();

    }
}
