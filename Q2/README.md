# AP CSA FRQ – Question 2 Analysis

## Signature

This section contains my analysis of Question 2 (Class Design).

### My initial approach during the exam
- I started by writing the `getSignature()` method to return the first letter of `firstName` followed by a dash and then the `lastName`.
- I used `.substring()` and `.equals()` correctly but forgot to check for `null` on `firstName`, which could lead to a `NullPointerException`.

### My revised solution after review
- I updated the condition to check for both `null` and an empty string using:  
  `if (firstName == null || firstName.equals(""))`
- I confirmed that the `addSignature()` method handles all cases, including when the signature is already at the start or end of the text.

### Key concepts tested in this question
- String manipulation: using `.substring()` and `.equals()` to work with parts of strings
- Defensive programming: checking for `null` and other edge cases
- Method reuse: calling `getSignature()` from inside `addSignature()` to reduce duplication
- Control flow and conditional logic

### What I learned from revisiting this problem
- Always check for `null` before calling methods on an object to avoid runtime errors.
- Using helper methods can make logic cleaner and easier to maintain.
- Carefully handling edge cases, like empty strings or duplicate values, is essential for robust code.
- Writing and testing small parts of the code step by step helps prevent logic bugs.
