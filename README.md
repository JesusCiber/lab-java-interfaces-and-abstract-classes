# IntList Implementations

This project includes two dynamic array implementations: `IntArrayList` and `IntVector`.

## When to Use `IntArrayList` vs `IntVector`

- 🔹 **`IntArrayList`** 
- Is more memory-efficient when the list grows gradually or stays relatively small. 
- Its growth strategy increases capacity by **50%**, reducing memory overhead.

- 🔹 **`IntVector`** 
- Is more **performance-oriented** when you expect frequent insertions. 
- It **doubles** the capacity on each resize, which reduces the number of array copy operations, 
- at the cost of potentially using more memory.
