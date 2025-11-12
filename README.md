# 🧠 Palindrome Checker – Task 3

### 📂 Package:
`task3`

### 💻 Language:
**Java**

---

## 📝 Overview
The **Palindrome Checker** is a Java-based console application designed to determine whether a given string is a palindrome or not.  
It includes multiple methods to reverse strings and verify palindromes efficiently using both simple and advanced approaches.

---

## 🚀 Features
- 🔁 Multiple string reversal techniques:
  - Using `StringBuilder`
  - Using character arrays
  - Using manual loops
- 🧩 Two-pointer optimized palindrome check
- 🧹 Cleans strings by removing non-alphanumeric characters and ignoring case if required
- 🧪 Built-in test cases for quick validation
- 🧭 Interactive console menu
- 🧠 Detailed analysis for each check

---

## ⚙️ How It Works
The program offers **4 main options** through a menu-driven interface:
1. ✅ **Check a single string**
2. 🧩 **Run predefined test cases**
3. 🔄 **Check multiple strings continuously**
4. 🚪 **Exit**

---

## 📘 Code Structure
## 🧩 Task3 Project Structure

```bash
task3/
│
├── PalindromeChecker.java       # Console-based Java program to check for palindromes
│
└── README.md                    # Project documentation
```

## PALINDROME CHECKER - TASK 3
## Created for Owl AI Internship

MENU OPTIONS:

Check a single string

Run predefined test cases

Check multiple strings

Exit
Choose an option (1-4): 2

### RUNNING PREDEFINED TEST CASES
"racecar" -> Palindrome
"A man a plan a canal Panama" -> Palindrome
"hello" -> Not Palindrome
"Madam" -> Palindrome
"Was it a car or a cat I saw?" -> Palindrome

Test Results: 7/10 passed


---

## 🧠 Key Methods

| Method | Description |
|--------|--------------|
| `reverseStringBuilder(String str)` | Reverses string using `StringBuilder`. |
| `reverseStringCharArr(String str)` | Reverses string using character swapping. |
| `reverseStringLoop(String str)` | Reverses string manually using a loop. |
| `cleanString(String str)` | Removes all non-alphanumeric characters and converts to lowercase. |
| `isPalindrome(String str, boolean ignoreCaseAndSpaces)` | Checks palindrome using reverse-and-compare method. |
| `isPalindromeTwoPointer(String str, boolean ignoreCaseAndSpaces)` | Checks palindrome using the two-pointer method. |
| `displayAnalysis(String original, boolean ignoreCaseAndSpaces)` | Displays a detailed analysis for the input string. |
| `runTestCases()` | Runs a set of predefined test cases. |

---

## 🛠️ Technologies Used

☕ **Java (JDK 17 or higher)**  
🧩 **Core Java Concepts (Strings, Loops, Arrays, OOP)**  
🧠 **DSA (Data Structures & Algorithms)**  
💻 **Eclipse / IntelliJ IDEA / VS Code**

---

## 🚀 Future Enhancements

✨ Add **GUI interface** using Swing or JavaFX  
📄 Add **file input/output support**  
🔍 Extend support for **numeric and symbol-based palindrome checks**  
🧪 Integrate **JUnit testing** for validation

---

## 🧪 Sample Execution (User Input Example)

Enter a string to check: Madam
Ignore case and spaces? (y/n): y

==================================================
PALINDROME ANALYSIS RESULTS

Original string: "Madam"
Processed string: "madam"
Reversed string: "madam"
Length: 5 characters

Reverse Method Comparison:
-> StringBuilder: "madam"
-> Manual: "madam"
-> Loop: "madam"

RESULT: "Madam" IS A PALINDROME!

Two-pointer verification: Consistent


---

## ✨ Author

**Akash Shetty**   
📧 akash.shetty.ec@gmail.com  
🏢 Created as part of **Owl AI Internship – Task 3**

---

