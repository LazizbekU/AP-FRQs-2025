## Question 3 Analysis  
### Competition / Competitor

This section contains my analysis of Question 3 (Arrays and ArrayLists):

### My initial approach during the exam
- I began by understanding how to use the `names` array to populate a `competitorList` with `Competitor` objects.
- I correctly used a `for` loop to iterate through the array and added each `Competitor` with a corresponding ID using `i + 1`.
- For the `buildMatches` method, I attempted to pair competitors from opposite ends of the list using two pointers, `start` and `end`.

### My revised solution after review
- I verified that the logic for skipping the first competitor in the case of an odd-length list was correct by setting `start = 1` if the list is odd.
- I confirmed that the loop correctly adds `Match` objects for each pair without overlapping.
- I ensured that edge cases, such as lists with fewer than 2 competitors, are handled implicitly without error (since the loop will not run if `start >= end`).

### Key concepts tested in this question
- Constructing and populating an `ArrayList` from an array
- Object instantiation within a loop
- Using two-pointer technique to build pairs from a list
- Handling even and odd sizes of data collections
- Creating and returning a list of custom objects

### What I learned from revisiting this problem
- Initializing class fields like `competitorList` inside constructors ensures proper encapsulation and setup.
- When working with pairings, using `start` and `end` pointers is a clean and effective strategy.
- Carefully analyzing list size parity (even or odd) is important to avoid out-of-bounds errors or skipped elements.
- Writing modular, well-named helper methods like `buildMatches()` makes code cleaner and easier to test.
