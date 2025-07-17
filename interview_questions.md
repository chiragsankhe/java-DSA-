## 1. What is Java? 
```
1. Java is a high-level, object-oriented programming language.

+ It's platform-independent — write once, run anywhere using JVM.

+ Java is used for web, mobile (Android), desktop, and enterprise apps.

+ It supports OOP principles like inheritance, polymorphism, etc.

+ Java code is compiled to bytecode (.class) and run by the JVM.
```
## 2  Why is Java a platform independent language?
```
Java language was developed so that it does not depend on any hardware or software because the compiler compiles the code and then converts it to platform-independent byte code which can be run on multiple systems.

The only condition to run that byte code is for the machine to have a runtime environment (JRE) installed in it.
```

## 3. Why is Java not a pure object oriented language?
```
Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and
 hence it is not a pure object oriented language.
```
## 4.pure object-oriented programming

+ A pure object-oriented programming (OOP) language is one where everything is treated as an object, including primitives like integers, characters, and booleans. 
+ In such languages, all functionalities are performed through objects, and there is no distinction between primitive and non-primitive types.

#### 5.Characteristics of Pure OOP Languages:
- `Everything is an Object:` Even primitive data types and functions are treated as objects.
- `Encapsulation:` Data and methods are bundled together.
- `Inheritance:` Objects can inherit properties and behaviors from other objects.
- `Polymorphism:` The ability to define methods in different forms.
- `Abstraction:` Objects hide the internal implementation details.
- `No Standalone Functions:` All functions are part of some object.
#### 6.Examples of Pure Object-Oriented Languages:
- `Smalltalk:` Considered the closest to a pure object-oriented language because everything, including control structures and numbers, is an object.
- `Ruby:` Treats everything as an object but is slightly less strict than Smalltalk.
#### 7.Why Java is Not Pure:
Java is considered not purely object-oriented because:

It includes primitive data types (e.g., int, char, boolean) that are not objects.
It allows for static methods, which are not part of an object.
Some operations, like arithmetic (+, -, etc.), are not method calls on objects.
#### 8. Why Pure OOP is Rare:
+Pure OOP languages can sometimes be inefficient or overly restrictive for certain tasks, like mathematical computations, where using primitive types directly is faster. 
+ As a result, most modern OOP languages, like Java and Python, are a mix of object-oriented and procedural programming styles to balance efficiency with OOP principles.

## 10. JDK , JRE ,JVM

### 🧠 Definitions First
|Term|	Full Form|	Purpose|
|------|-------|---------|
|JDK|	Java Development Kit	|Tools to write, compile, and run Java code|
|JRE|	Java Runtime Environment|	Environment to run Java applications|
|JVM	|Java Virtual Machine|	Converts bytecode into machine code (platform-specific)|

### 🔁 Step-by-Step Java Program Execution
#### ✅ Step 1: Write Code
You write code in a `.java` file.
```sh
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
``
####✅ Step 2: Compile using JDK (javac)
```sh
javac Hello.java
```
+ This converts` .java `→ `Hello.class` (Bytecode)

#### ✅ Step 3: Run using JVM (via JRE)

+ java Hello

+ JVM inside JRE takes Hello.class

+ It translates bytecode → machine code

+ Executes on your OS (Windows/Linux/Mac)

#### 🔄 Relationship Diagram
```sh
       You (Developer)
             ↓
        [JDK] 👨‍💻
     ┌─────────────┐
     │ javac       │  ← Compiles .java to .class (Bytecode)
     └─────────────┘
             ↓
        [JRE] 🎯
     ┌─────────────┐
     │   JVM       │  ← Runs .class files
     └─────────────┘
             ↓
     Your Program Runs ✔
```

### 🚀 Execution Flow in One Line:
```
.java → [JDK: javac] → .class → [JRE: JVM] → machine code → output
```

## 11. Heap memory and stack memory
### 🟩 Heap Memory – "Big Storage Area"
#### ✅ What goes into Heap?
+ All objects

+ Instance variables (from new)

+ Classes like Student` s = new Student();`

### 🔁 Shared by all threads.
### ❌ Garbage collected:
+ When no reference to an object exists, it's eligible for garbage collection.

📌 Example:
```
Student s1 = new Student(); // s1 (in stack), new Student() (in heap)
```
### 🟦 Stack Memory – "Method & Variable Area"
#### ✅ What goes into Stack?
+ Local variables (int x = 10)

+ Method calls (each method has its own frame)

+ Reference variables (not objects themselves)

### 🔁 One stack per thread (not shared)
#### ⛔ Automatically deleted after method call ends
📌 Example:
```
public void show() {
    int a = 5;         // 'a' is in stack
    Student s = new Student(); // 's' in stack, object in heap
}
```
### 🔄 Diagram (Mental Model)
```
JVM Memory
├── Stack (Thread 1)
│   ├── Method: main()
│   │   ├── int x = 10;
│   │   ├── Student s1 → 📍
│
├── Heap
│   ├── 📍 Student object (s1)
│   ├── 📍 String object

```

## 12.♻️ What is Garbage Collection in Java?
Garbage Collection is a process in Java that:

+ ✅ Automatically removes objects from memory `(heap)`  that are no longer being used — so you don’t have to delete them manually.

### 👀 Real-World Analogy:
+ Imagine you're working on a desk.

+ You keep important things (in use) in front of you.

+ Old papers (you no longer need) are thrown into the trash.

+ Garbage Collector is like the cleaner who comes and removes that trash for you — automatically.

### 🛠️ How it works (Step-by-Step)
You create an object:
```
Student s = new Student();
```
+ JVM stores it in `heap`  memory.

+ When the object is no longer used:
```
s = null;  // Now object has no reference
```
+ Java's Garbage Collector (GC) detects it and removes it from heap to free memory.

### 🔍 When does GC run?
+ Automatically by the JVM

You can request it manually:

🧪 Example:
```
public class Demo {
    public static void main(String[] args) {
        Student s = new Student(); // Object created in heap
        s = null;                  // Now it's garbage
        System.gc();               // Request GC
    }
}
```
### ✅ Which objects are garbage?
 Any object that:

+ Has no reference pointing to it

+ Is not reachable from any part of the code


# 🟢 Basic Java Variable & Data Type Questions
## 13. What is a variable in Java?
Answer:
+ A variable is a name given to a memory location used to store data. It can hold different types of values depending on its data type.

## 14. What are the types of variables in Java?
Answer:

Local variables – Declared inside methods.

Instance variables – Non-static variables declared in a class.

Static variables – Declared using static keyword, shared among all objects.

## 15. What is a data type in Java?
Answer:
A data type defines what kind of data a variable can hold, like integers, decimals, characters, etc.

## 16. What are the two categories of data types in Java?
Answer:

+ `Primitive data types`  – int, float, char, boolean, etc.

+ `Non-primitive` (Reference) data types – String, Arrays, Objects, Classes, etc.

## 17. List all 8 primitive data types in Java.
|Data Type|	Size	|Example|
|----------|-----|---------|
|byte	|1 byte|	127|
|short	|2 bytes	|32000|
|int	|4 bytes	|100000|
|long|	8 bytes	|1234567890L|
|float	|4 bytes|	3.14f|
|double	8 bytes	|3.14159|
|char|	2 bytes|	'A'|
|boolean|	1 bit|	true/false|

## 🟡 Intermediate Questions
### 18. What is the default value of primitive data types?
Answer:

|Type|	Default Value|
|-----|-----|-------|
|int|	0|
|boolean|	false|
|char	|'\u0000'|
|Object|	null|

### 19. What is the difference between float and double?
Answer:

+ float: 4 bytes, less precision (3.14f)

+ double: 8 bytes, more precision (3.1415926535)

### 20. What is typecasting in Java?
Answer:
+ Typecasting is converting one data type into another.

+ `Implicit1` (Widening) – smaller → larger (e.g., `int` to` double`)

+ `Explicit` (Narrowing) – larger → smaller (e.g., `double` to` int`)
```
int a = 10;
double b = a;          // Widening
int c = (int) b;       // Narrowing
```

### 21. Can we store char in an int?
Answer:
Yes, because char is internally stored as a Unicode integer value.
```
char ch = 'A';
int num = ch;   // num will be 65
```
## 🔴 Advanced & Tricky Questions
### 22. Can a local variable have a default value?
Answer:
+ ❌ `No`. Local variables must be initialized before use, or you'll get a compile-time error.

### 23. What is the size of a boolean in Java?
Answer:
+ Technically, it uses 1 bit, but the JVM uses 1 byte for storage (cannot address less than 1 byte in memory).

### 24. Can you store a float value in a long variable directly?
Answer:
No. You need explicit casting:
```
float f = 10.5f;
long l = (long) f;  // Narrowing conversion
```
### 25. Is String a primitive data type?
Answer:
+ ❌ No. String is a non-primitive (reference) type. It is a class in Java.

### 26. What is the range of int in Java?
Answer:
+ int is 4 bytes → range is:
+ -2,147,483,648 to 2,147,483,647


## 26. 🔥 List of Useful Java Escape Sequences
|Escape Sequence|	Description|	Example Output|
|---------------|-------------|--------------|
| \n	|New Line	| Moves to next line|
| \t	|Tab (horizontal space)|	Adds a tab space|
| \\	|Backslash |(\)	Prints \|
| \"	|Double quote (")|	Prints "Text"|
| \'	|Single quote (')	|Prints 'Text'|
| \b	|Backspace|	Deletes one character (varies)|
| \r	|Carriage return (rarely used)|	Moves to start of the line|

🧪 Example Code:
```
public class EscapeDemo {
    public static void main(String[] args) {
        System.out.println("Line1\nLine2");
        System.out.println("Tabbed\tText");
        System.out.println("Quote: \"Hello Chirag\"");
        System.out.println("Backslash: \\Java\\DSA");
    }
}
```
## 27 Operations 

### 🔹 1. Arithmetic Operations
These perform basic math operations.

|Operator|	Meaning|	Example|
|-------|----------|----------|
| + |	Addition|	a + b|
| - |	Subtraction	|a - b|
| *	| Multiplication	|a * b| 
| / |	Division	|a / b| 
| % |	Modulus |	a % b|

### 🔹 2. Relational / Comparison Operations
Used to compare two values.

|Operator	|Meaning	|Example|
|-------|-----------|---------|
| == | 	Equal to | 	a == b  |
| !=  |Not equal to | 	a != b |
| >	  | Greater than	 | a > b  |
| <	 | Less than | 	a <  b  |
| >=	 | Greater than or equal to	 | a >= b | 
| <=	 | Less than or equal to	 | a<= b |

### 🔹 3. Logical Operations
Used to combine multiple conditions.

| Operator| 	Meaning| 	Example| 
|----------|------|-----------|
|&& |	Logical AND |	a > 5 && b < 10 |
`		`
| !	 | Logical NOT | 	!(a > 5) | 

🔹 4. Assignment Operations
Used to assign values to variables.

|Operator | 	Meaning | 	Example |
| =	 |Assignment  |	a = 10 | 
| += | 	Add and assign| 	a += 5 → a = a + 5 |
| -= | 	Subtract and assign|	a -= 5|
| *= | 	Multiply and assign|	a *= 2|
| /= |	Divide and assign|	a /= 2|
| %=	| Modulus and assign|	a %= 3|

🔹 5. Unary Operations
Operate on a single operand.

|Operator|	Meaning|	Example|
|------|---------|---------|
|+|	Unary plus|	+a|
|-	|Unary minus|	-a|
|++	|Increment|	a++, ++a|
|--	|Decrement	|a--, --a|
|!	|Logical NOT|	!true|

### 🔹 6. Bitwise Operations
Operate on bits and perform bit-by-bit operations.

|Operator	| Meaning	| Example| 
|&|	Bitwise AND|	a & b|
| `	` | 	Bitwise OR  |  |
| ^ |	Bitwise XOR| 	a ^ b| 
| ~	| Bitwise Complement| 	~a|
| <<	| Left shift	| a << 2 |
| >>| 	Right shift| 	a >> 2| 
| >>>| 	Unsigned right shift| 	a >>> 2| 

## 28✅ Ternary Operator Syntax:
```
condition ? expression_if_true : expression_if_false;
```
🔰 Example: Check if a person is eligible to vote
```
public class TernaryExample {
    public static void main(String[] args) {
        int age = 20;

        String result = (age >= 18) ? "✅ Eligible to vote" : "❌ Not eligible to vote";

        System.out.println(result);
    }
}
```
#### 🧠 Explanation:
+ (age >= 18) is the condition.

+ If it's true, it returns "✅ Eligible to vote".

+ If it's false, it returns "❌ Not eligible to vote".

The result is stored in the variable result and then printed.

🧪 Another Example: Find the maximum of two numbers
```
public class MaxExample {
    public static void main(String[] args) {
        int a = 10, b = 15;

        int max = (a > b) ? a : b;

        System.out.println("Maximum is: " + max);
    }
}
```

## 29.🔍 What is instanceof?
The instanceof operator checks whether an object is an instance of a specific class or implements a specific interface.

✅ Syntax:
```
object instanceof ClassName
```
Returns true if object is an instance of ClassName, otherwise false.

### 🔰 Example: Animal 🐾 - Dog 🐶 - Cat 🐱
```
class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting

        // Check object type
        System.out.println("a instanceof Animal: " + (a instanceof Animal)); // true
        System.out.println("a instanceof Dog: " + (a instanceof Dog));       // true
        System.out.println("a instanceof Cat: " + (a instanceof Cat));       // false
    }
}
```
🧠 Explanation:
+ a is a reference of type Animal pointing to a Dog object.

+ a instanceof Animal → ✅ true (because Dog is an Animal)

+ a instanceof Dog → ✅ true (because it’s actually a Dog)

+ a instanceof Cat → ❌ false (because it’s not a Cat)

### 💡 Real Use Case: Safe Downcasting
+ Use instanceof to safely type cast an object.

```
if (a instanceof Dog) {
    Dog d = (Dog) a;  // safe downcasting
    System.out.println("Dog object found!");
}
```
+ This avoids ClassCastException at runtime.

❌ Without instanceof (Dangerous):
```
Dog d = (Dog) a; // May throw ClassCastException if 'a' is not actually a Dog
```
### 📦 Bonus: instanceof with interfaces
```
interface Drawable {}

class Circle implements Drawable {}

public class InterfaceCheck {
    public static void main(String[] args) {
        Drawable d = new Circle();
        System.out.println(d instanceof Circle);     // true
        System.out.println(d instanceof Drawable);   // true
    }
}
```

# Candition statement 

### ✅ 30 . What is a conditional statement in Java?
Answer:
+ Conditional statements in Java are used to make decisions based on certain conditions.
+ These statements execute different blocks of code depending on whether a condition is true or false.
+ Examples include if, if-else, if-else if, switch, and the ternary operator.

### ✅ 31. What's the difference between if and if-else?
Answer:

+ `if`  executes a block only if the condition is true.

+ `if-else1` provides an alternative block to execute when the condition is false.
```
if (x > 10) {
    // only runs if x > 10
} else {
    // runs if x <= 10
}
```
### ✅ 32. When do you use if-else if-else ladder?
Answer:
Use it when you have multiple conditions to check one after another.
```
if (score >= 90) {
    // Grade A
} else if (score >= 75) {
    // Grade B
} else {
    // Grade C
}
```
## ✅ 33. What is a nested if statement?
Answer:
An if statement inside another if. It's used when one condition depends on another.
```
if (age >= 18) {
    if (hasID) {
        System.out.println("You can vote.");
    }
}
```

### ✅ 34. What is the switch statement in Java?
Answer:
+ The switch statement allows you to test a variable against multiple values.
```
int day = 2;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid day");
}
```
### ✅ 35. Can we use switch with String in Java?
Answer:
_+ ✅ Yes, from Java 7 onwards, switch supports String.

```
String role = "admin";

switch(role) {
    case "admin": System.out.println("Welcome Admin!"); break;
    case "user": System.out.println("Welcome User!"); break;
    default: System.out.println("Unknown role");
}
```
### ✅ 36. Can a condition be more than one line in an if statement?
Answer:
Yes. Complex conditions using logical operators (&&, ||, !) are allowed.
```
if (age >= 18 && hasLicense && !isSuspended) {
    System.out.println("You can drive.");
}
```
### ✅ 37. What happens if you forget the break in a switch case?
Answer:
+ It causes fall-through, meaning the code continues executing the next cases until it hits a break or the end of the switch block.

### ✅ 38. Can we write if without curly braces {}?
Answer:
+ `Yes, but only one statement can be executed. For multiple statements, {} is required.
```
if (x > 10)
    System.out.println("X is big");  // okay
// Not okay:
//     System.out.println("Line 1");
//     System.out.println("Line 2");

```

# loop 

### 🔁 What is a Loop in Java?
+ A loop is used to execute a block of code repeatedly as long as a condition is true.

### ✅ Types of Loops in Java:
###  1.` for loop `
  Used when you know how many times you want to run the loop.
```
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}
```
🧠 Output:
```
i = 1  
i = 2  
i = 3  
i = 4  
i = 5
```
### 2. `while loop` 
Used when you don’t know how many times you want to run the loop, but only need a condition.
```
int i = 1;
while (i <= 5) {
    System.out.println("i = " + i);
    i++;
}
```
### 3. do-while loop
Like while, but it executes at least once, even if the condition is false.
```
int i = 1;
do {
    System.out.println("i = " + i);
    i++;
} while (i <= 5);
```
### 4. for-each loop (Enhanced for loop)
Used to iterate over arrays or collections.
```
int[] numbers = {10, 20, 30};

for (int num : numbers) {
    System.out.println(num);
}
```
### ⛔ Loop Control Statements:
#### 🔹 break
Stops the loop entirely.
```
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i); // prints 1, 2
}

```
#### 🔹 continue
Skips the current iteration and continues with the next.
```
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i); // prints 1, 2, 4, 5
}
```
📦 Real-World Example: Sum of numbers from 1 to 10
```
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
```
System.out.println("Sum = " + sum); // Output: Sum = 55



### ✅ Basic Interview Questions on Loops
### 39. What are the different types of loops in Java?
Answer:

+ for loop – used when the number of iterations is known.

+ while loop – used when the number of iterations is unknown, but condition-based.

+ do-while loop – same as while, but executes at least once.

+ for-each loop – used to iterate through arrays or collections.

### 40. What is the difference between while and do-while loop?
Answer:

|while loop| 	do-while loop |
|--------|-----------|
|Condition is checked before loop body|	Condition is checked after loop body|
|May never execute if condition is false |	Executes at least once, even if condition is false|
```
int x = 10;

while (x < 5) {
    System.out.println("This won't print");
}

```
```
do {
    System.out.println("This will print once");
} while (x < 5);
```
### 41. How does the for-each loop work in Java?
Answer:
+ The enhanced for loop (for-each) is used to iterate over arrays and collections without using an index.
```
int[] nums = {10, 20, 30};
for (int n : nums) {
    System.out.println(n);
}
```
It doesn't allow you to modify elements or access index directly.

### 42. What is an infinite loop? How to avoid it?
Answer:
An infinite loop is a loop that never terminates because its condition always evaluates to true.
```
while (true) {
    System.out.println("Infinite");
}
```
#### Avoid it by:

+ Ensuring proper condition

+ Updating loop variable

+ Adding a break condition when needed

### 43. What is the use of break and continue in loops?
Answer:

+ `break1` : Exits the loop immediately.

+ `continue` : Skips the current iteration and proceeds to the next.
```
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);  // prints 1, 2, 4, 5
}
```

## 44. What will be the output of this code?
```
int i = 1;
while (i++ < 3) {
    System.out.print(i + " ");
}
```
Answer:
```
Output: 2 3
```
Explanation:

1st iteration: i = 2 (prints 2)

2nd iteration: i = 3 (prints 3)

Loop stops when i++ < 3 becomes false


🔧 What is a Function (Method) in Java?
A function (or method) in Java is a block of code that performs a specific task. It can be called multiple times to reuse logic and avoid code duplication.

# function 

###  ✅ Types of Methods in Java:
Type	Description
+ `Predefined Methods`	Built-in, like System.out.println()
+ `User-defined Methods	` Created by the programmer

### 🧱 Basic Structure of a Method:
```
returnType methodName(parameters) {
    // code block
    return value;
}
```
🔰 Example: Simple Method
```
public class MyClass {

    // user-defined method
    static void greet() {
        System.out.println("Hello, Chirag!");
    }

    public static void main(String[] args) {
        greet();  // calling the method
    }
}
```
### ⚙️ Method with Parameters and Return Value
```
public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Sum = " + result);
    }
}
```

### 🔷 1. What is a static method in Java?
+ A static method belongs to the ` class itself`, not the object.
+ You can call it without creating an object.

✅ Example:
```
public class Demo {
    static void greet() {
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
        greet();  // ✅ No need to create an object
    }
}
```
🧠 Key Points:
```
Use ClassName.methodName() or just methodName() from inside main.
```
Common use: main() method is static!

### 🔶 2. What is a non-static method in Java?
+ A non-static method belongs to an object, not the class.
+ You must create an object to call it.

✅ Example:
```
public class Demo {
    void sayHi() {
        System.out.println("Hi from non-static method!");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();  // ✅ object creation
        obj.sayHi();            // calling non-static method
    }
}
```

### ❓ Can a static method access a non-static method?
+ ✅ Yes — but only by creating an object of the class.
Because:

+ static methods belong to the class

 +non-static methods belong to the object (instance)

+ So inside a static method like main(), you cannot directly access non-static methods or variables.

🔧 Example
```
public class Demo {

    // non-static method
    void show() {
        System.out.println("Non-static method called");
    }

    // static method
    public static void main(String[] args) {
        // Cannot call show(); directly ❌

        // ✅ Create an object to call non-static method
        Demo obj = new Demo();
        obj.show();  // Now it's valid ✅
    }
}
```


## 45: What is the difference between static and non-static methods?
Answer:

|Feature|	Static Method |	Non-Static Method|
|-------|-------------|-----------------------|
|Belongs| to	Class|	Object|
|Called by|	ClassName.method()|	object.method()|
|Object needed?	|❌ No|	✅ Yes|
|Example	|main(),  utility methods |	getName(), display() etc.|






###  46. What is public in Java?
+ public is an access modifier — it means the class or method is accessible from anywhere.

✅ Example:
```
public class Car {
    public void start() {
        System.out.println("Car started");
    }
}
```
You can use start() method from any other class or package if the method is public.

###  47. What is private in Java?
+ private means the method/variable is only accessible inside the same class. No other class can access it directly.

✅ Example:
```
public class Secret {
    private void secretMessage() {
        System.out.println("This is private");
    }

    public static void main(String[] args) {
        Secret s = new Secret();
        s.secretMessage(); // ✅ Allowed here
    }
}
```
```
public class Outside {
    public static void main(String[] args) {
        Secret s = new Secret();
        // s.secretMessage(); ❌ Error: not accessible here
    }
}
```

###  48. Can a static method access non-static variables or methods?
Answer:
❌ No, not directly.
✅ But you can access them by creating an object.

```
class Demo {
    int x = 10;
    static void show() {
        // System.out.println(x); ❌ error
        Demo d = new Demo();      // ✅
        System.out.println(d.x);
    }
}
```
### ✅ 49. Can private methods be accessed outside the class?
Answer:
❌ No.
They can only be accessed within the same class.
```
class Secret {
    private void show() {
        System.out.println("Private");
    }

    public static void main(String[] args) {
        Secret s = new Secret();
        s.show();  // ✅ allowed here
    }
}
```
### ✅ 50. What is an object in Java? How is it created?
Answer:
An object is an instance of a class. You create it using the new keyword.
```
class Dog {
    void bark() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(); // Object created
        d.bark();
    }
}
```
### 52. Difference between class and object?
### Class	Object
+ Blueprint/template	Instance of a class
+ No memory until object created	Takes memory when created
+ Example: Car	Car c1 = new Car();

### ✅ 52. What happens if you call a non-static method from static without object?
Answer:
+ You get a compile-time error:

```
Non-static method cannot be referenced from a static context.
```
### ✅ 53. Can a constructor be static?
Answer:
+ ❌ No.
+ Constructors are used to create objects, and static methods belong to the class, not instances.
+ So it doesn't make sense for constructors to be static.

# Array

### 54🧠 What is an Array in Java?
+ An array is a collection of elements of the same data type stored in a contiguous block of memory.

+ Think of it like a row of lockers 📦 where each locker holds one value.

✅ Array Syntax in Java
```
datatype[] arrayName = new datatype[size];
```
📌 Example:
```
int[] numbers = new int[5]; // creates array of 5 integers
```
You can also initialize it directly:
```
int[] numbers = {10, 20, 30, 40, 50};
```
### 🔁 Accessing Array Elements
Arrays are zero-indexed (starts at index 0).

```
System.out.println(numbers[0]); // 10
numbers[2] = 100;
```
        // Change value at index 2
✅ Full Example
```
public class MyArray {
    public static void main(String[] args) {
        int[] marks = {95, 88, 76, 64, 100};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }
    }
}
```
### 55. ✅ Types of Arrays in Java
+ `One-dimensional array` 
→ int[] arr = new int[5];

+ `Two-dimensional array`  (matrix)
→ int[][] matrix = new int[3][3];

+ Multidimensional arrays
→ Like 3D or more, rarely used directly.


### 56. What is the default value of an array element in Java?
Depends on type:

+ int → 0

+ boolean → false

+ String or objects → null

### 57. How to find the length of an array?
```
int[] arr = {1, 2, 3};
System.out.println(arr.length); // Output: 3
```
### 58. Can you increase the size of an array?
+ ❌ No. Java arrays are fixed size.
+ ✅ But you can use ArrayList to handle dynamic resizing.

### 59. How to sort an array?
```
import java.util.Arrays;

int[] arr = {5, 1, 3, 2};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
```
// [1, 2, 3, 5]
### 60.. What is the difference between array and ArrayList?
|Feature	|Array|	ArrayList|
|-----------|----------|----------|
|Size	| Fixed	DynamicType	Can be primitive |	Only objects|
|Performance| 	Faster |	Slightly slower|
|Methods| 	Limited |Rich (add, remove) |

