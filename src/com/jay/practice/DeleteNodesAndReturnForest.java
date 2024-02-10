package com.jay.practice;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.jay.practice.FlattenBinaryToLinkedList.buildTree;

public class DeleteNodesAndReturnForest {
    public static void main(String[] args) {

        int arr[] = {1,2,3, -1,-1,-1,4,-1,-1};
        int isDelete[] = {2,3};
        Node node = buildTree(arr);
        traversal(node);
        System.out.println(":::::: "+node.data);

        List<Node> nodes = delNodes(node, isDelete);
        nodes.forEach(System.out::println);
    }
    static void traversal (Node root) {
        if (root == null){
            return;
        }
        traversal(root.left);
        traversal(root.right);
        System.out.print(root.data);
    }
    public static List<Node> delNodes(Node root, int[] to_delete) {
        List<Node> afterNodes = new ArrayList<>();
        Set<Integer> deleteSets = new HashSet<>();
        for (Integer sets: to_delete) {
            deleteSets.add(sets);
        }
        deleteNode(root, afterNodes, deleteSets);
            if (!deleteSets.contains(root.data)){
                afterNodes.add(root);
            }
        return afterNodes;
    }

    private static Node deleteNode(Node root, List<Node> afterNodes, Set<Integer> deleteNodes) {
        if(root == null){
            return null;
        }


        deleteNode(root.left,afterNodes, deleteNodes);
        deleteNode(root.right, afterNodes, deleteNodes);
        if (deleteNodes.contains(root.data)){
            if (root.left != null){
                afterNodes.add(root.left);
            }
            if (root.right != null){
                afterNodes.add(root.right);
            }
            return null;
        }
        return root;
    }
}
