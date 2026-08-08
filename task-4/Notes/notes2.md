## java-basics-notes
(_type casting, packages, and others_)
---

learned about casting and packages

understood the importance of packages
wrote a code to see how packages are declared

---

Topics

1. **Remainder Operator (%):** How it differs from / and a code snippet checking for even/odd.
<br>
Modulo operator gives the remainder of a division operation where as division operator gives the quotient.
Example : 5/2=2 (quotient), 5%2=1 (remainder)

2. **Increment Operators:** Difference between y = x++ vs y = ++x, and why standalone usage is safer.
<br>
**Answer:**
y = x++; => use the value of x first then increment the value of x <br>
y = ++x; => increment the value of x first then use the value of x <br>
standalone usage is safer because it avoids the confusion between the two

3. **String Comparison Risk:** Why == shouldn't be used for Strings and what it physically checks in memory.
<br>
**Answer:**
'==' operator checks the refrences (memory addresses) of the strings whereas .equals() checks the actual values of the string. <br>
4. **Type Casting:** Explain implicit widening vs explicit narrowing (with a data-loss example).
<br>
**Answer:**
Implicit widening is when the compiler automatically converts a smaller data type to a larger data type. Example : int x = 10; long y = x; <br>
Explicit narrowing is when the programmer manually converts a larger data type to a smaller data type. Example : long x = 9.999; int y = (int) x;  // y == 9; it just removes the decimal part instead of rounding the number which cause data loss <br>

5. **Packages & Directory Structure:** How declaring package testpkg; affects compilation and execution paths from the CLI.
<br>
**Answer:**
Declaring package testpkg; in a java file affects the compilation and execution paths from the CLI. <br>
Example : 
If 
```
Package name : testpkg; 
Folder name : testpkg; 
javac testpkg/RollDice.java  
java testpkg.RollDice
```
