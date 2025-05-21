## Question 1 Analysis  
### Dog Walking Company

This section contains my analysis of Question 5 (Conditionals and Loops):

### My initial approach during the exam
- I used the `walkDogs` method to determine how many dogs could be walked at a given hour by checking availability from `company.numAvailableDogs(hour)`.
- I attempted to cap the number of walked dogs by `maxDogs` but initially made a logic error by returning `available` in both branches of the `if` statement.
- For `dogWalkShift`, I looped from `startHour` to `endHour`, calculating pay for each hour based on dogs walked and included bonuses under certain conditions.

### My revised solution after review
- I fixed the `walkDogs` method to return the smaller of `available` and `maxDogs` using either an `if-else` or `Math.min`.
- Verified that the bonus pay of $3 is correctly added if the number of walked dogs equals `maxDogs` or if the hour is between 9 and 17 inclusive.
- Confirmed the total pay is summed correctly over the shift hours.

### Key concepts tested in this question
- Conditional logic to cap values and apply bonuses
- Looping over a range of hours to accumulate pay
- Using method calls (`company.numAvailableDogs(hour)`) within other methods
- Arithmetic calculations involving multiplication and addition

### What I learned from revisiting this problem
- Always double-check conditional branches to ensure all paths return the correct values.
- Using helper methods to handle specific tasks (like `walkDogs`) keeps code modular and easier to maintain.
- Combining multiple conditions in an `if` statement allows for flexible bonus pay rules.
- Careful iteration over ranges is essential for accumulating totals in payroll-like calculations.

