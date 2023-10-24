# Introduction to Data Structure

# DATA STRUCTURES

The structural representation of logical relationships between elements of data. The building blocks of a program. A way to store and organize data in order to facilitate the access and modifications. The method of representing of logical relationships between individual data elements related to the solution of a given problem.

# PEMDAS 
stands for P- Parentheses, E- Exponents, M-Multiplication, D- Division, A- Addition, and S- Subtraction. <br>

- used to mention the order of operations to be followed while solving expressions having multiple operations.


# STACK

**LIFO** - is an abbreviation for last in, first out. It is a
method for handling data structures where the first
element is processed last and the last element is processed
first.

**FILO** - an acronym for first in, first out (the first in is
the first out) is a method for organizing the manipulation
of a data structure (often, specifically a data buffer) where
the oldest (first) entry, or "head" of the queue, is processed
first.

<p align="center">
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/a50fcee8-b422-482d-80ba-17a146d4f893"/>
</p>

# Queue 

- is an abstract data structure,
somewhat similar to Stacks. Unlike stacks, a queue is
open at both its ends. One end is always used to insert data
(enqueue) and the other is used to remove data (dequeue).
Queue follows First-In-First-Out methodology, i.e., the
data item stored first will be accessed first.

<p align="center">
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/0c3f3632-84f5-4c9d-8f29-972d566b99c7"/>
</p>

# TYPES OF DATA STRUCTURE



**PRIMITIVE DATA STRUCTURE**
- These are the basic data structures and are directly
operated upon by the machine instructions, which is in a
primitive level <br>
Includes: byte , short , int , long , float , double ,
boolean and char.


**NON- PRIMITIVE DATA STRUCTURE**
- It is a more sophisticated data structure emphasizing on
structuring of a group of homogeneous (same type) or
heterogeneous (different type) data items <br>
Includes: String, Arrays and Classes (you will learn
more about these in a later chapter).


# Three steps in refinement process:

Mathematical Model - Informal Algorithm <br>
Formal Language – Pseudo-Language Program <br>
Data Structure - Java Program <br>


# Algorithm

It is a step-by-step finite sequence of instructions, to solve a well-defined computational problem. To solve any complex real-life problem.

# Characteristic of Algorithm
Finiteness, Definiteness, Clearly specified/expected output , Clearly specified input, Effectiveness.  

The choice of a particular algorithm depends on following
performance analysis and measurements:


- **TIME COMPLEXITY** - an algorithm or a program is the
amount of time it needs to run to completion. The exact
time will depend on the implementation of the algorithm,
programming language, optimizing the capabilities of the
compiler used, the CPU speed, other hardware
characteristics/specifications and so on. <br>
- **SPACE COMPLEXITY**- Analysis of space complexity of an
algorithm or program is the amount of memory it needs,
to run to completion.<br>
- **INPUT SIZES** - (the input number, or its number of bits,
length of input string, number of cells in an input array,
etc.).<br>
- **COMPUTATIONAL COMPLEXITY** - relative efficiency for
large input sizes.<br>


# BIG OH

Definition: f(n) is in O(g(n)), denoted f(n) E O(g(n)), if
order of growth of f(n) < order of growth of g(n) (within
constant multiple), i.e., there exist positive constant c and
non-negative integer n0 such that f(n) < c g(n) for every n > n0.


<p align="center">
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/dc025164-f266-4267-80d2-75811f6c6b0f"/>
</p>


# Illustration of Big Oh

<p align="center">
<img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/59819cb7-82e0-401c-95e8-56f1c461dfa2"/>
</p>

# Expressing Algorithm
Algorithms can be expressed in many kinds of notation,
including:
• Natural languages <br>
• Pseudocode <br>
• Flowcharts <br>
• Programming Languages <br>

# PSEUDOCODE
Pseudocode is an informal program design technique that uses English words, lacks formal syntactical rules, imitates real code but cannot be compiled or executed, and avoids specific computer language keywords.



# Some keywords That Should be used:
**For looping and selection, the keywords that are to be
used include:**

* Do While...EndDo <br>
* Call ... with (parameters) <br>
* Do Until...Enddo Call <br>
* Call Case... EndCase Return <br>
* Return If...Endif When <br>

**As verbs, use the words:** <br>

* Generate, Compute, Process Set, Reset, Increment,
Compute, Calculate, Ado, Sum, Multiply, ... Print,
Display, Input, Output, Edit. <br>

# PSEUDOCODE EXAMPLES

Original Program Specification:
Write a program that will display if the entered student's
grade is passed of failed. Passing grade is 70. <br>
<p align="center">
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/4b6fcd1f-7173-4ad4-8f62-ebf473e20139"/>
</p>


