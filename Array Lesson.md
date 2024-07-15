# Arrays

An array is a data structure in computer science that allows you to store a collection of elements, such as integers, strings, or objects, under a single variable name. Each element in an array is identified by an index or a key, which represents its position in the collection. Arrays provide a way to store data in a contiguous block of memory, making it easy to access and manipulate elements based on their positions.

<p align="center">
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/0ae548ce-d74d-488e-a408-1417fe280b42"/>
</p>

▪ An array can be defined as a collection of variables of
the same type defined by a common name. <br>
▪ An array is a group of like-typed variables that are
referred to by a common name.  <br>
▪ Arrays of any type can be created and may/ have one
or more dimensions.  <br>
▪  A specific element in an array is accessed by its index.  <br>
▪ Arrays offer a convenient means of grouping related
information   <br>
▪ An array is a structure that holds multiple values of
the same type.  <br>
▪ The length of an array is established when the array
is created (at runtime).  <br>
▪ After creation, an array is a fixed-length structure.  <br>



# Array Declaration 

In data structures and algorithms, an array is a fundamental data structure used to store a collection of elements, each identified by an index or a key. It allows for efficient storage and retrieval of data, making it a crucial concept in computer science. Arrays are declared by specifying the data type of the elements they will store and their size, providing a structured way to organize and manipulate data in algorithms and programs. Understanding array declaration is essential for learners to develop strong problem-solving skills in various computational tasks.

<p align="center">
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/0cd78491-7a2a-48f3-b236-67e6357a6241"/>
</p>

In Java, array declaration involves specifying the data type and the size of the array. For example, int[] numbers = new int[5]; declares an integer array named numbers with a size of 5. This means it can store 5 integer values. Array declaration sets the foundation for creating and working with arrays in Java programs.



# Array Intialization 

In Java, array initialization involves assigning values to an array variable. This process populates the array elements with specific values, allowing data manipulation and retrieval. Arrays in Java can be initialized during declaration or afterward using curly braces {}. For example, int[] numbers = {1, 2, 3, 4, 5}; creates an integer array named numbers with values 1, 2, 3, 4, and 5. Alternatively, you can declare an array first and then assign values individually, such as int[] numbers = new int[5]; numbers[0] = 1; numbers[1] = 2; // .... Array initialization is fundamental for utilizing arrays in Java programs efficiently. <br>

<p align="center">
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/6c9776a2-a1d4-48ec-a51a-b0af753e306d"/>
</p>

An array is a kind of aggregate data type. A single ordinary variable (a "scalar") could be considered as a zero-dimensional array. A one-dimensional array is also known as a "vector". <br>

In Java, a reference to an array element is written similarly to other languages. For a multi-dimensional array, the syntax uses nested square brackets. For example, if `A` is the array name, accessing an element at indices `i`, `j`, and `k` would be written as `A[i][j][k]`. In Java, multi-dimensional arrays are created as arrays of arrays, allowing for flexible and efficient handling of N-dimensional data structures. <br>

Elements of an array are usually stored contiguously. Languages differ as to whether the leftmost or rightmost index varies most rapidly, i.e. whether each row is stored contiguously or each column (for a 2D array). <br>

Arrays are appropriate for storing data which must be accessed in an unpredictable order, in contrast to lists which are best when accessed sequentially. Array indices are integers, usually natural numbers, whereas the elements of an associative array are identified by strings. <br>


<p align="center">
Exercise  <br>
  <img src="https://github.com/SG-Hangaan/Data-Structures-and-Algorithm/assets/127215110/9720a956-d87d-4cdf-991b-fb3d5886d0eb"/>
</p>


In the realm of data structures, arrays and lists serve as fundamental containers. An array is a structured arrangement where objects are stored in a sequential order. These objects have no inherent relationships other than their order within the array. They are stored in a continuous memory space, allowing access through indices (such as array[2] to access the third element, which is 5 in array[2,3,5,7,1]). <br>

On the other hand, a list is also a container, but with a different organizational principle. Each object in a list, referred to as a node or slot, contains indicators pointing to other objects, forming a chain-like structure. Unlike arrays, the memory space in a list may not be continuous, allowing for more flexible data organization. Accessing elements in a list usually involves traversing from one object to another. For example, in a list |-2-3-5-7-1-|, to retrieve 5, you would need to navigate from the first object to the third object in the list. <br>

Understanding these distinctions is crucial in designing efficient algorithms and selecting appropriate data structures for specific computational tasks. <br>


# Associative Arrays and Related Data Structure

Java provides several other implementations of associative arrays and related data structures in its Collections Framework. 

**# HashMap:** is a data structure that implements an associative array, allowing you to store key-value pairs. <br>
It provides fast and efficient access to values based on their corresponding keys. Keys are unique within the map,  <br>
and they are used to retrieve associated values quickly. HashMap does not maintain any specific order of the elements.  <br>
It is part of the Java Collections Framework and is widely used for tasks where quick data retrieval and storage  <br>
of key-value pairs are essential.  <br>
 <br>
**# TreeMap:** is a SortedMap implementation based on a Red-Black tree. It maintains its entries in sorted order. <br>
This means that you can iterate over the keys in a sorted manner.  <br>
 <br>
**# LinkedHashMap:** maintains the insertion order of elements, unlike HashMap which does not guarantee any  <br>
specific order. It provides a predictable iteration order.  <br>
 <br>
**# HashTable:** is a synchronized version of HashMap. It's a legacy class and has been largely replaced by HashMap  <br>
in modern Java programming due to better performance of non-synchronized collections.  <br>
 <br>
**# ConcurrentHashMap:** is designed for concurrent use and allows multiple threads to modify the map <br>
safely, without blocking. It provides high concurrency for reads and allows a good level of <br>
concurrency for writes.  <br>
 <br>
Each of these classes provides different behaviors and trade-offs in terms of performance, <br>
ordering, and concurrency. The choice of which one to use depends on the specific requirements of your application.  <br>




















