package com.jay.practice;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
public class FlattenBinaryToLinkedList {

    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node node = buildTree(arr);
        System.out.println(node.data);

        flattenToLinkedList(node);
        traversal(node);

    }
    static int idx = -1;
    static Node buildTree(int[] arr){
        idx++;
        if (arr[idx] == -1){
            return null;
        }

        Node root = new Node(arr[idx]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }

    static void flattenToLinkedList(Node root){
        Node curr = root;
        while (curr != null) {
            if (curr.left != null){
                Node pred = curr.left;
                while (pred.right != null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    static void traversal (Node root) {
        if (root == null){
            return;
        }
        System.out.print(root.data);

        traversal(root.left);
        traversal(root.right);
    }
}
