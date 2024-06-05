# Design and Analysis of Algorithms (DAA) - Third Semester

Welcome to the repository for Design and Analysis of Algorithms (DAA) programs for the third semester. This repository contains implementations of various fundamental algorithms that are crucial for understanding the design and analysis of efficient algorithms.

## Table of Contents

- [Binary Search](#binary-search)
- [Floyd's Algorithm](#floyds-algorithm)
- [Heap Sort](#heap-sort)
- [Longest Common Subsequence](#longest-common-subsequence)
- [Minimum Spanning Tree - Kruskal's Algorithm](#minimum-spanning-tree---kruskals-algorithm)
- [Minimum Spanning Tree - Prim's Algorithm](#minimum-spanning-tree---prims-algorithm)
- [Multistage Graph](#multistage-graph)
- [Merge Sort](#merge-sort)
- [Non-Recursive Algorithms](#non-recursive-algorithms)
- [Optimal Binary Search Tree](#optimal-binary-search-tree)
- [QuickSort](#quicksort)
- [Recursive Algorithms](#recursive-algorithms)

## Binary Search

Binary Search is a divide-and-conquer algorithm that finds the position of a target value within a sorted array. It repeatedly divides the search interval in half.

## Floyd's Algorithm

Floyd's Algorithm, also known as the Floyd-Warshall algorithm, is used for finding the shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).

## Heap Sort

Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It divides the input into a sorted and an unsorted region, and it iteratively shrinks the unsorted region by extracting the largest element and moving that to the sorted region.

## Longest Common Subsequence

The Longest Common Subsequence (LCS) problem is finding the longest subsequence common to all sequences in a set of sequences. It is a classic computer science problem, the basis of data comparison and file diff algorithms.

## Minimum Spanning Tree - Kruskal's Algorithm

Kruskal's Algorithm is a greedy algorithm that finds a minimum spanning tree for a connected weighted graph. This means it finds a subset of the edges that form a tree including every vertex, where the total weight of all the edges in the tree is minimized.

## Minimum Spanning Tree - Prim's Algorithm

Prim's Algorithm is another greedy algorithm that finds a minimum spanning tree for a weighted undirected graph. It starts with a single vertex and grows the spanning tree one edge at a time by adding the cheapest possible connection from the tree to another vertex.

## Multistage Graph

A Multistage Graph is a directed graph in which the nodes can be divided into multiple stages such that each edge connects nodes from one stage to the next stage only. This algorithm is used to find the shortest path in such graphs.

## Merge Sort

Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, sorts them, and then merges the sorted halves. It is known for its efficiency and stability.

## Non-Recursive Algorithms

Non-recursive algorithms are iterative implementations of algorithms that are typically recursive. This section contains non-recursive versions of various algorithms to demonstrate how recursion can be replaced with iteration.

## Optimal Binary Search Tree

An Optimal Binary Search Tree is a binary search tree constructed in a way that the cost of searching for frequently accessed elements is minimized. This algorithm finds the most cost-effective way to build a binary search tree.

## QuickSort

QuickSort is a divide-and-conquer algorithm that picks an element as a pivot and partitions the array around the pivot. There are different versions of QuickSort that pick pivot in different ways.

## Recursive Algorithms

Recursive algorithms solve problems by calling themselves with a subset of the original problem. This section includes recursive implementations of various algorithms.

---
## Getting Started

To run these programs, you'll need to have Java installed on your machine. Clone this repository and navigate to the directory containing the program you want to run. Compile and execute the program using the Java compiler and runtime.

### Example Commands:

```bash
git clone https://github.com/kailashkiradu/Design-and-analysis-of-algorithm.git
cd Design-and-analysis-of-algorithm

# Compile the Binary Search program
javac BinarySearch.java

# Run the Binary Search program
java BinarySearch
