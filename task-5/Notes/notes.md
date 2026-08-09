## java-basics-notes <br>(_Tricky Code Analysis & Output Prediction_)

**Case 1:** Independent if Statements vs. else if Chain

What will be printed when a = 81?

```java
public class OutputTest1 {
    public static void main(String[] args) {
        int a = 81;

        if (a > 33) System.out.println("not fail");
        if (a > 50) System.out.println("grade d");
        if (a > 60) System.out.println("grade c");
        if (a > 70) System.out.println("grade b");
        if (a > 80) System.out.println("grade a");
    }
}
```

**The Output will be :** 

```
not fail
grade d
grade c
grade b
grade a
```

Cause it is satisfying all the if statements <br>
when we use independent if statements, program will check all the if statements, not one.<br>
whereas in else if chain it will check only one if statement and then it will come out of the if-else if chain.


**Case 2:** Switch Fall-Through Behavior

What will be printed when choice = 2?

```java
public class OutputTest2 {
    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Option 1 Selected");
            case 2:
                System.out.println("Option 2 Selected");
            case 3:
                System.out.println("Option 3 Selected");
                break;
            case 4:
                System.out.println("Option 4 Selected");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
```

**The output will be :** 

```
Option 2 Selected
Option 3 Selected
```
Cause there is no break keyword in case 2 therefore it is printing the statements in the next cases too untill it hits the break keyword.<br>
**break** keyword is used to come out of the switch statement after fulfilment of the case.

