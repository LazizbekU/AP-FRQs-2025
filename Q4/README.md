## Question 4 Analysis  
### SumOrSameGame

This section contains my analysis of Question 4 (2D Arrays and Logic):

### My initial approach during the exam
- I began by constructing the 2D array `puzzle` in the constructor and used nested `for` loops to fill it with random integers between 1 and 9.
- For the `clearPair` method, I started scanning the array from the given `(row, col)` position, checking each cell for a match that either has the same value or adds up to 10 with the target value.

### My revised solution after review
- I verified the use of `(i == row) ? col + 1 : 0` to correctly skip the starting cell during the first row of the search.
- I confirmed that the method only clears the **first valid match**, and that both matched values are set to `0`.
- I ensured that the method returns `true` only if a valid match is found and cleared, and `false` otherwise.

### Key concepts tested in this question
- 2D array traversal using nested loops
- Random value generation and array initialization
- Logical conditionals using `==` and arithmetic comparison
- Understanding how to scan part of a 2D array and skip specific cells
- In-place mutation of a data structure

### What I learned from revisiting this problem
- When scanning a 2D array starting from a given position, careful handling of the inner loop's starting index is crucial.
- Combining logical conditions effectively (`==` and `+`) can reduce unnecessary checks and make code more readable.
- Updating array values directly in the 2D structure can be done safely once the logic is clearly defined and edge cases are considered.
- Structuring code in small, testable methods like `clearPair()` helps isolate behavior and simplifies debugging.

