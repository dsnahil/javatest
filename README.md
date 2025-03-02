# Leader, Stock, and Subset Algorithms

## Overview
This project contains three Java programs implementing different algorithms:
1. **Leader Algorithm**: Finds and prints the leader elements in an array.
2. **Stock Algorithm**: Determines the maximum profit that can be obtained from stock prices.
3. **Subset XOR Algorithm**: Computes the XOR of XORs of all subsets of a given set.

## Project Structure
The project consists of the following classes:

- `leader`: Identifies leader elements in an array.
- `stock`: Determines the maximum profit from a given set of stock prices.
- `subset`: Computes the XOR of XORs of all subsets of a given set.

## Algorithm Descriptions

### Leader Algorithm (`leader` Class)
**Description:**
- A leader is an element that is greater than all elements to its right.
- The program iterates through the array to find such elements.

**Example Input & Output:**
```java
Input: [7, 10, 4, 10, 6, 5, 2]
Output: 10, 6, 5, 2
```

### Stock Algorithm (`stock` Class)
**Description:**
- This program determines the maximum profit that can be achieved by buying and selling stocks.
- It finds the minimum stock price and the maximum profit possible from that point.

**Example Input & Output:**
```java
Input: [7, 1, 5, 3, 6, 4]
Output: Max. profit is: 5
```

### Subset XOR Algorithm (`subset` Class)
**Description:**
- If the set has only one element, it prints that element as the XOR result.
- Otherwise, it returns `0` because the XOR of XORs of all subsets of a set of size `n > 1` is always `0`.

**Example Input & Output:**
```java
Input: [1, 2, 3]
Output: XOR of XOR's of all subsets is 0
```

## How to Run the Programs
1. Ensure you have **Java** installed.
2. Compile and run each program separately using the following commands:

```sh
javac leader.java
java leader

javac stock.java
java stock

javac subset.java
java subset
```

## Issues & Improvements
- The `stock` class is missing the `String[] args` parameter in `main()`.
- The `leader` class has redundant checks and could be optimized.
- The `subset` class should implement a dynamic approach for larger sets.

## Contributions
Feel free to submit pull requests for optimizations and bug fixes!

## License
This project is open-source and available for contributions.
