# Linked List Operations

This directory contains implementations of fundamental linked list operations in Java.

## Files Overview

| File | Description |
|------|-------------|
| **CountNodes.java** | Counts the total number of nodes in a linked list |
| **Traversal.java** | Traverses and prints all elements in a linked list |
| **Sorting.java** | Implements bubble sort on a linked list |
| **Searching.java** | Linear search with position tracking |
| **Insertion.java** | Insert at beginning, end, and specific position |
| **Updation.java** | Update node values by searching for specific data |
| **Reverselist.java** | Reverses the entire linked list |
| **Deletion.java** | Delete from beginning, end, and by value |

## Time Complexities

| Operation | Time Complexity |
|-----------|----------------|
| Count Nodes | O(n) |
| Traversal | O(n) |
| Sorting (Bubble Sort) | O(n²) |
| Searching | O(n) |
| Insertion (End) | O(n) |
| Insertion (Beginning) | O(1) |
| Updation | O(n) |
| Reversal | O(n) |
| Deletion (Beginning) | O(1) |
| Deletion (End) | O(n) |

## How to Run

Compile and run any file using:
```bash
javac FileName.java
java FileName
```

Example:
```bash
javac CountNodes.java
java CountNodes
```

## Node Structure

All implementations use the same basic Node class:
```java
static class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```
