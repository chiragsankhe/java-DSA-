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
##  What are the different types of memory areas allocated by JVM?
-`Method Area:`
Stores class metadata, constants, static variables, and method code.
-` Heap: `
Used for dynamic memory allocation; stores objects and JRE classes.
-` Stack:`
Each thread has its own stack. It stores method call frames, local variables, and partial results.
-`Program Counter Register:`
A small memory area that holds the address of the currently executing Java bytecode instruction.
-`Native Method Stack:`
Stores data for native (non-Java) methods used in the application.
## What is JIT compiler?
`JIT (Just-In-Time) Compiler:`

A part of the JVM that improves the performance of Java applications by compiling bytecode into native machine code at runtime.
Converts frequently executed bytecode into machine code for faster execution.
Operates in parallel with the interpreter.




## . Difference between Heap and Stack Memory in java. And how java utilizes this.
```
Stack memory is the portion of memory that was assigned to every individual program.
And it was fixed. On the other hand, Heap memory is the portion that was not allocated to the java program
but it will be available for use by the java program when it is required, mostly during the runtime of the program.
```

## ♻️ What is Garbage Collection in Java?
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



