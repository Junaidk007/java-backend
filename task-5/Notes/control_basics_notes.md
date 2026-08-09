## java-basics-notes <br> (_Documentation_) 

1. **Block Statements & Scope:** 
 What is a block statement? How does declaring a variable inside a block affect its memory lifecycle and accessibility outside the block?

    **Answer:** 
* **Block Statements:** Block statements are used to write code in a block , these are enclosed in curly braces `{}`. 
* **Memory lifecycle and accessibility:** Memory lifecycle of a variable inside a block is only inside the block , outside the block the variable is not accessible and its memory is deallocated . 

---

2. **Loop Selection Strategy:** 
In which scenario is a while loop preferred over a for loop, and vice versa? Give a real-world coding scenario for each. AND PROVIDE A ANALOGY FOR THIS.

    **Answer:** 
    while loop is preferred when the no.of itreation in not known or fixed whereas vice virsa in For loop.  
    Example :
    ```java
    // while loop
    while(left < right){
        // in this we don't know when left pointer will cross right pointer.
    }

    // for loop
    for(int i = 0; i < 10; i++){
        // in this we know when the loop will end.
    }
    ```

    **Analogy :**
    