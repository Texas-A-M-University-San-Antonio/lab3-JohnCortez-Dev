[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/NXTXJD70)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20440378)
# Programming Fundamentals CSCI 1436
## Programming Fundamentals I

Lab Assignment #3

Due date: The evening BEFORE next lab, at 11:59 pm

## Lab Assignment Instructions

### Task Overview
For this lab only, the Java file is already created for you, named `InClass3_FirstName_LastName.java`. Replace FirstName and LastName with your actual name, and do the same in the class header on Line 10. **Note:** In future labs, you will be responsible for creating the `.java` file yourself, including writing the correct class and method headers. This is an important skill for building your own programs from scratch.

**Example:** If your name is John Smith, create `InClass3_John_Smith.java`

## In-Class/Lab 3 Instructions

### Purpose
A real estate agent wants to track the value of homes over a period of time. Tracking these values will require calculating the compound interest of the initial value of those homes. This program will emphasize the following concepts:

- Using numeric data types and operations
- Using the Math class’s pow method

---

### In-Class 3: Math.pow() Example
A major component of this program is the use of the pow method in calculating compound interest. To better understand how exponentiation works in Java, let’s consider another program that relies on this method. This program will request the length of the side of a cube as user input and calculate both the volume and surface area of that cube.

**Note:** In programming, the carat symbol (`^`) is often used in math as a shorthand for "to the power of" (for example, `side^3` means "side cubed" when reading). However, in Java, the `^` operator does NOT perform exponentiation—it is actually the bitwise XOR operator. To calculate powers, you must use `Math.pow`. For example, `Math.pow(side, 3)` calculates the cube of the side, and `Math.pow(side, 2)` calculates the square.

This cube example will help you practice using `Math.pow` before applying it to compound interest calculations.


**Instructions:**
For the In-Class activity, write a short Java program that uses `Math.pow(a, b)` to calculate values based on user input. Focus on practicing how to use this method for different calculations.

**Example program flow:**

```
Please enter the length of the side of the cube: 5
The volume of the cube is 125
The surface area of the cube is 150
```

---

### Lab 3: Compound Interest Calculation

**Task:**
Create a new Java project titled either `CompoundInterest_FirstName_LastName` or `Lab3_FirstName_LastName`. You must include comments describing key parts of this program.

**Requirements:**
- Prepare your application to write statements in the `main` method.
- Import and declare a Scanner to accept input from the keyboard.
- Declare the following four variables:
   - A variable of type `double` for the initial value of the home
   - A variable of type `int` for the number of elapsed years
   - A variable of type `double` for the interest rate
   - A variable of type `double` for the final value of the home
- Prompt the user to input the initial value of the home and assign it using Scanner.
- Prompt the user to input the number of elapsed years and assign it using Scanner.
- Prompt the user to input the interest rate and assign it using Scanner.
   - **Hint:** If the double data type uses `nextDouble`, what would the int data type use?
- Convert the interest rate from a percentage to a decimal (e.g., 6% = 0.06).
- Calculate the final value of the home using the formula for compound interest:

   `A = P * (1 + r)^t`

   Where:
   - `P` = initial value
   - `t` = number of elapsed years
   - `r` = interest rate (as a decimal)
   - `A` = final value

   - **Order of operations:** Addition first, then power, then multiplication.
- Display a message that includes the final value to the user.

**Example program flow:**

```
Please enter the initial value of the home: 200000
Please enter the number of elapsed years: 25
Please enter the interest rate: 6
The final value of the home is: 858488.46
```

---

### Criteria
- Comments describing this program (5 points)
- Importing and declaring the Scanner (10 points)
- Each of the four variable declarations (12 points total)
- Each request for the user’s inputs (24 points total)
- Converting the percentage to a decimal (3 points)
- Calculation for the final value of the home (30 points)
- Output of the final value (16 points)

---

### Screenshots
Please upload at least one screenshot of your console output. You can use the example input to show the correct corresponding output, or use your own input.


### Troubleshooting Common Issues
- **Compilation errors:** For this lab, ensure you have `import java.util.Scanner;` at the top, all variables (like initial value, years, interest rate, and final value) are declared, and every statement ends with a semicolon. Check for missing curly braces in your `main` method.
- **No output or missing prompt:** Make sure you use `System.out.print()` or `System.out.println()` for every user prompt and result. If nothing appears, confirm your code is inside the `main` method and not commented out.
- **Incorrect calculation:** For the compound interest, use `A = P * Math.pow(1 + r, t)` and convert the interest rate to a decimal (e.g., 6% becomes 0.06). Double-check variable names and order of operations.
- **Wrong filename/class name:** Your file and class should be named exactly as instructed (e.g., `Lab3_FirstName_LastName.java`), using your real name. The class name inside the file must match the filename.
- **Typos:** Carefully check for spelling, capitalization, and punctuation errors, especially in variable names and method calls like `Scanner` and `System.out.println`.

## Commit Your Changes
### Step 1. Use VS Code's Source Control panel:
   - Click the Source Control icon in the left sidebar
   - Type a commit message describing your changes
   - Click "Commit" then "Sync Changes" to push your code

### Step 2: Verify Submission
After pushing your changes, visit your assignment repository on GitHub Classroom. Confirm that your latest code and commit message appear, and that your files are named correctly. Check the "Actions" tab to see if your code passed the autograding tests.

### Step 3: Submit to Blackboard Assignment
Once you have verified your submission on GitHub Classroom, copy the URL of your assignment repository and submit this GitHub repository link to Blackboard as confirmation that you are DONE.

**InClass3.java (Participation points):**
Full credit is awarded for completing and submitting the in-class exercise, regardless of output or minor errors.

**Keep going!** By Lab 3, you’re building real confidence with programming logic and problem-solving. You’ve got the fundamentals down, so trust your skills and keep practicing. If you run into challenges, ask questions—each step brings you closer to mastering these tools for the rest of the course.

**Important:** Do NOT edit or tamper with any test files (such as Lab3Test.java or InClass3Test.java). These files are used for autograding and checking your work. In future labs, if test files appear to be modified, you may be contacted to verify the integrity of your submission.