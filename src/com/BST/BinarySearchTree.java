package com.BST;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node node1 = returnRootNode(node);
        System.out.println(node1.data);
        System.out.println(node1.left);
        System.out.println(node1.right);

        System.out.println("traversal");
        traversal(node1);
        System.out.println("");

        levelOrder(node1);
        System.out.println("");

        int i = countNodes(node1);
        System.out.println("hhhh"+i);
        System.out.println("hight tree  " +countHight(node1));
    }

    static int idx = -1;
    static Node returnRootNode(int []nodes) {
        idx++;

        if (nodes[idx] == -1 ){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = returnRootNode(nodes);
        newNode.right = returnRootNode(nodes);
        return newNode;
    }

    static void traversal (Node root) {
        if (root == null){
            return;
        }
        traversal(root.left);
        traversal(root.right);
        System.out.print(root.data);
    }
    static int countNodes (Node root) {
        if (root == null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return root.data+left+right;
    }

    static int countHight(Node root){
        if (root == null){
            return 0;
        }
        int left = countHight(root.left);
        int right = countHight(root.right);
        return Math.max(left, right)+1;
    }

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode != null){
                System.out.print(currNode.data);
                if (currNode.left != null){
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            } else {
                System.out.println();
                if (queue.isEmpty()){
                    break;
                } else {
                    queue.add(null);
                }
            }
        }

    }
}
