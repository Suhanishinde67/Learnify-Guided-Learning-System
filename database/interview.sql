CREATE DATABASE IF NOT EXISTS interview;
use interview;
create table login(username varchar(25), password varchar(25));

create table user(document varchar(25), Id varchar(50), age varchar(50), name varchar(50), gender varchar(50), country varchar(50), phone varchar(50), email varchar(50));

create table faculty(name varchar(25), age varchar(50), gender varchar(50), id varchar(50), degree varchar(50), email varchar(50), phone varchar(50), salary varchar(50), status varchar(50), location varchar(50));

CREATE TABLE login(username VARCHAR(25) PRIMARY KEY, password VARCHAR(25));
ALTER TABLE login 
MODIFY username VARCHAR(25) 
COLLATE utf8mb4_bin;

CREATE TABLE Adminlogin(username VARCHAR(25) PRIMARY KEY, password VARCHAR(25));
INSERT INTO Adminlogin VALUES ('Admin', 'admin123');
ALTER TABLE Adminlogin
MODIFY username VARCHAR(25)
COLLATE utf8mb4_bin;

CREATE TABLE Facultylogin(username VARCHAR(25) PRIMARY KEY, password VARCHAR(25));
INSERT INTO Facultylogin VALUES ('Tejaswini', 'tejaswini123');
ALTER TABLE Facultylogin
MODIFY username VARCHAR(25)
COLLATE utf8mb4_bin;

CREATE TABLE top100Codes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question VARCHAR(255),
    difficulty VARCHAR(20),
    platform VARCHAR(50),
    url VARCHAR(500)
);

INSERT INTO top100Codes(question, difficulty, platform, url) VALUES
('Two Sum','Easy','LeetCode','https://leetcode.com/problems/two-sum/'),
('Add Two Numbers','Medium','LeetCode','https://leetcode.com/problems/add-two-numbers/'),
('Longest Substring Without Repeating Characters','Medium','LeetCode','https://leetcode.com/problems/longest-substring-without-repeating-characters/'),
('Median of Two Sorted Arrays','Hard','LeetCode','https://leetcode.com/problems/median-of-two-sorted-arrays/'),
('Longest Palindromic Substring','Medium','LeetCode','https://leetcode.com/problems/longest-palindromic-substring/'),
('Zigzag Conversion','Medium','LeetCode','https://leetcode.com/problems/zigzag-conversion/'),
('Reverse Integer','Medium','LeetCode','https://leetcode.com/problems/reverse-integer/'),
('String to Integer (atoi)','Medium','LeetCode','https://leetcode.com/problems/string-to-integer-atoi/'),
('Palindrome Number','Easy','LeetCode','https://leetcode.com/problems/palindrome-number/'),
('Regular Expression Matching','Hard','LeetCode','https://leetcode.com/problems/regular-expression-matching/'),

('Container With Most Water','Medium','LeetCode','https://leetcode.com/problems/container-with-most-water/'),
('Integer to Roman','Medium','LeetCode','https://leetcode.com/problems/integer-to-roman/'),
('Roman to Integer','Easy','LeetCode','https://leetcode.com/problems/roman-to-integer/'),
('Longest Common Prefix','Easy','LeetCode','https://leetcode.com/problems/longest-common-prefix/'),
('3Sum','Medium','LeetCode','https://leetcode.com/problems/3sum/'),
('3Sum Closest','Medium','LeetCode','https://leetcode.com/problems/3sum-closest/'),
('Letter Combinations of a Phone Number','Medium','LeetCode','https://leetcode.com/problems/letter-combinations-of-a-phone-number/'),
('4Sum','Medium','LeetCode','https://leetcode.com/problems/4sum/'),
('Remove Nth Node From End of List','Medium','LeetCode','https://leetcode.com/problems/remove-nth-node-from-end-of-list/'),
('Valid Parentheses','Easy','LeetCode','https://leetcode.com/problems/valid-parentheses/'),

('Merge Two Sorted Lists','Easy','LeetCode','https://leetcode.com/problems/merge-two-sorted-lists/'),
('Generate Parentheses','Medium','LeetCode','https://leetcode.com/problems/generate-parentheses/'),
('Merge k Sorted Lists','Hard','LeetCode','https://leetcode.com/problems/merge-k-sorted-lists/'),
('Swap Nodes in Pairs','Medium','LeetCode','https://leetcode.com/problems/swap-nodes-in-pairs/'),
('Reverse Nodes in k-Group','Hard','LeetCode','https://leetcode.com/problems/reverse-nodes-in-k-group/'),
('Remove Duplicates from Sorted Array','Easy','LeetCode','https://leetcode.com/problems/remove-duplicates-from-sorted-array/'),
('Remove Element','Easy','LeetCode','https://leetcode.com/problems/remove-element/'),
('Implement strStr()','Easy','LeetCode','https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/'),
('Divide Two Integers','Medium','LeetCode','https://leetcode.com/problems/divide-two-integers/'),
('Substring with Concatenation of All Words','Hard','LeetCode','https://leetcode.com/problems/substring-with-concatenation-of-all-words/'),

('Next Permutation','Medium','LeetCode','https://leetcode.com/problems/next-permutation/'),
('Longest Valid Parentheses','Hard','LeetCode','https://leetcode.com/problems/longest-valid-parentheses/'),
('Search in Rotated Sorted Array','Medium','LeetCode','https://leetcode.com/problems/search-in-rotated-sorted-array/'),
('Find First and Last Position of Element','Medium','LeetCode','https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/'),
('Search Insert Position','Easy','LeetCode','https://leetcode.com/problems/search-insert-position/'),
('Valid Sudoku','Medium','LeetCode','https://leetcode.com/problems/valid-sudoku/'),
('Sudoku Solver','Hard','LeetCode','https://leetcode.com/problems/sudoku-solver/'),
('Count and Say','Medium','LeetCode','https://leetcode.com/problems/count-and-say/'),
('Combination Sum','Medium','LeetCode','https://leetcode.com/problems/combination-sum/'),
('Combination Sum II','Medium','LeetCode','https://leetcode.com/problems/combination-sum-ii/'),

('First Missing Positive','Hard','LeetCode','https://leetcode.com/problems/first-missing-positive/'),
('Trapping Rain Water','Hard','LeetCode','https://leetcode.com/problems/trapping-rain-water/'),
('Multiply Strings','Medium','LeetCode','https://leetcode.com/problems/multiply-strings/'),
('Wildcard Matching','Hard','LeetCode','https://leetcode.com/problems/wildcard-matching/'),
('Jump Game II','Medium','LeetCode','https://leetcode.com/problems/jump-game-ii/'),
('Permutations','Medium','LeetCode','https://leetcode.com/problems/permutations/'),
('Permutations II','Medium','LeetCode','https://leetcode.com/problems/permutations-ii/'),
('Rotate Image','Medium','LeetCode','https://leetcode.com/problems/rotate-image/'),
('Group Anagrams','Medium','LeetCode','https://leetcode.com/problems/group-anagrams/'),
('Pow(x, n)','Medium','LeetCode','https://leetcode.com/problems/powx-n/'),

('N-Queens','Hard','LeetCode','https://leetcode.com/problems/n-queens/'),
('Maximum Subarray','Medium','LeetCode','https://leetcode.com/problems/maximum-subarray/'),
('Spiral Matrix','Medium','LeetCode','https://leetcode.com/problems/spiral-matrix/'),
('Jump Game','Medium','LeetCode','https://leetcode.com/problems/jump-game/'),
('Merge Intervals','Medium','LeetCode','https://leetcode.com/problems/merge-intervals/'),
('Insert Interval','Medium','LeetCode','https://leetcode.com/problems/insert-interval/'),
('Length of Last Word','Easy','LeetCode','https://leetcode.com/problems/length-of-last-word/'),
('Spiral Matrix II','Medium','LeetCode','https://leetcode.com/problems/spiral-matrix-ii/'),
('Permutation Sequence','Hard','LeetCode','https://leetcode.com/problems/permutation-sequence/'),
('Rotate List','Medium','LeetCode','https://leetcode.com/problems/rotate-list/'),

('Unique Paths','Medium','LeetCode','https://leetcode.com/problems/unique-paths/'),
('Unique Paths II','Medium','LeetCode','https://leetcode.com/problems/unique-paths-ii/'),
('Minimum Path Sum','Medium','LeetCode','https://leetcode.com/problems/minimum-path-sum/'),
('Plus One','Easy','LeetCode','https://leetcode.com/problems/plus-one/'),
('Add Binary','Easy','LeetCode','https://leetcode.com/problems/add-binary/'),
('Text Justification','Hard','LeetCode','https://leetcode.com/problems/text-justification/'),
('Sqrt(x)','Easy','LeetCode','https://leetcode.com/problems/sqrtx/'),
('Climbing Stairs','Easy','LeetCode','https://leetcode.com/problems/climbing-stairs/'),
('Simplify Path','Medium','LeetCode','https://leetcode.com/problems/simplify-path/'),
('Edit Distance','Hard','LeetCode','https://leetcode.com/problems/edit-distance/'),

('Set Matrix Zeroes','Medium','LeetCode','https://leetcode.com/problems/set-matrix-zeroes/'),
('Search a 2D Matrix','Medium','LeetCode','https://leetcode.com/problems/search-a-2d-matrix/'),
('Sort Colors','Medium','LeetCode','https://leetcode.com/problems/sort-colors/'),
('Minimum Window Substring','Hard','LeetCode','https://leetcode.com/problems/minimum-window-substring/'),
('Combinations','Medium','LeetCode','https://leetcode.com/problems/combinations/'),
('Subsets','Medium','LeetCode','https://leetcode.com/problems/subsets/'),
('Word Search','Medium','LeetCode','https://leetcode.com/problems/word-search/'),
('Largest Rectangle in Histogram','Hard','LeetCode','https://leetcode.com/problems/largest-rectangle-in-histogram/'),
('Maximal Rectangle','Hard','LeetCode','https://leetcode.com/problems/maximal-rectangle/'),
('Partition List','Medium','LeetCode','https://leetcode.com/problems/partition-list/'),

('Scramble String','Hard','LeetCode','https://leetcode.com/problems/scramble-string/'),
('Merge Sorted Array','Easy','LeetCode','https://leetcode.com/problems/merge-sorted-array/'),
('Gray Code','Medium','LeetCode','https://leetcode.com/problems/gray-code/'),
('Subsets II','Medium','LeetCode','https://leetcode.com/problems/subsets-ii/'),
('Decode Ways','Medium','LeetCode','https://leetcode.com/problems/decode-ways/'),
('Reverse Linked List II','Medium','LeetCode','https://leetcode.com/problems/reverse-linked-list-ii/'),
('Restore IP Addresses','Medium','LeetCode','https://leetcode.com/problems/restore-ip-addresses/'),
('Binary Tree Inorder Traversal','Easy','LeetCode','https://leetcode.com/problems/binary-tree-inorder-traversal/'),
('Unique Binary Search Trees','Medium','LeetCode','https://leetcode.com/problems/unique-binary-search-trees/'),
('Validate Binary Search Tree','Medium','LeetCode','https://leetcode.com/problems/validate-binary-search-tree/');
INSERT INTO top100Codes (question, difficulty, platform, url) VALUES
('Same Tree','Easy','LeetCode','https://leetcode.com/problems/same-tree/'),
('Symmetric Tree','Easy','LeetCode','https://leetcode.com/problems/symmetric-tree/'),
('Binary Tree Level Order Traversal','Medium','LeetCode','https://leetcode.com/problems/binary-tree-level-order-traversal/'),
('Maximum Depth of Binary Tree','Easy','LeetCode','https://leetcode.com/problems/maximum-depth-of-binary-tree/'),
('Construct Binary Tree from Preorder and Inorder Traversal','Medium','LeetCode','https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/'),
('Construct Binary Tree from Inorder and Postorder Traversal','Medium','LeetCode','https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/'),
('Binary Tree Level Order Traversal II','Medium','LeetCode','https://leetcode.com/problems/binary-tree-level-order-traversal-ii/'),
('Convert Sorted Array to Binary Search Tree','Easy','LeetCode','https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/'),
('Convert Sorted List to Binary Search Tree','Medium','LeetCode','https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/'),
('Balanced Binary Tree','Easy','LeetCode','https://leetcode.com/problems/balanced-binary-tree/');

CREATE TABLE cn_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT,
    answer TEXT
);

INSERT INTO cn_questions (question, answer) VALUES
('What is a Computer Network?', 'A computer network is a collection of interconnected devices that share resources.'),
('What is OSI Model?', 'It is a 7-layer architecture used for network communication.'),
('What is TCP/IP?', 'A protocol suite used for communication over the internet.'),
('What is IP Address?', 'A unique identifier assigned to each device on a network.'),
('What is DNS?', 'DNS converts domain names into IP addresses.'),
('Difference between TCP and UDP?', 'TCP is reliable; UDP is faster but unreliable.'),
('What is a Router?', 'A device that connects different networks.'),
('What is a Switch?', 'A device that connects devices within a LAN.'),
('What is Firewall?', 'A system that protects a network from unauthorized access.'),
('What is Bandwidth?', 'Maximum data transfer rate of a network.'),
('What is Latency?', 'Time delay in data transmission.'),
('What is Packet Switching?', 'Data is divided into packets and sent independently.'),
('What is MAC Address?', 'A unique hardware address assigned to a device.'),
('What is VPN?', 'A secure connection over a public network.'),
('What is HTTP?', 'Protocol used to transfer web pages.');
ALTER TABLE cn_questions 
MODIFY question TEXT NOT NULL,
MODIFY answer TEXT NOT NULL;
WHERE id = 19;


CREATE TABLE dbms_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL
);

INSERT INTO dbms_questions (question, answer) VALUES
('What is DBMS?', 'DBMS stands for Database Management System, used to manage databases efficiently.'),
('What is a Database?', 'A structured collection of data stored electronically.'),
('What is SQL?', 'Structured Query Language used to manage databases.'),
('What is Primary Key?', 'A unique identifier for each record in a table.'),
('What is Foreign Key?', 'A key used to link two tables together.'),
('What is Normalization?', 'Process of organizing data to reduce redundancy.'),
('What is Denormalization?', 'Process of adding redundancy to improve performance.'),
('What is Index?', 'A data structure that improves query performance.'),
('What is Transaction?', 'A unit of work performed on a database.'),
('What is ACID Properties?', 'Atomicity, Consistency, Isolation, Durability properties of transactions.'),
('What is ER Model?', 'Entity Relationship model used for database design.'),
('What is Join?', 'Used to combine rows from multiple tables.'),
('What is View?', 'A virtual table based on SQL query.'),
('What is Stored Procedure?', 'Precompiled SQL statements stored in database.'),
('What is Trigger?', 'A procedure that runs automatically on certain events.');

CREATE TABLE os_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL
);

INSERT INTO os_questions (question, answer) VALUES
('What is an Operating System?', 'An Operating System is system software that manages hardware and software resources.'),
('What is a Process?', 'A process is a program in execution.'),
('What is a Thread?', 'A thread is the smallest unit of execution within a process.'),
('What is Scheduling?', 'Scheduling is the method by which processes are assigned CPU time.'),
('What is Deadlock?', 'A situation where processes are unable to proceed because each is waiting for the other.'),
('What is Paging?', 'A memory management scheme that eliminates the need for contiguous allocation.'),
('What is Virtual Memory?', 'A technique that allows execution of processes without complete memory allocation.'),
('What is Context Switching?', 'Switching the CPU from one process to another.'),
('What is Semaphore?', 'A synchronization tool used to control access to shared resources.'),
('What is Multithreading?', 'Running multiple threads within a single process.'),
('What is Kernel?', 'Core component of OS that manages system resources.'),
('What is File System?', 'A method for storing and organizing files on storage devices.'),
('What is Fragmentation?', 'Wastage of memory due to inefficient allocation.'),
('What is Swapping?', 'Moving processes between main memory and secondary storage.'),
('What is IPC?', 'Inter Process Communication allows processes to communicate with each other.');

CREATE TABLE oops_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL
);

INSERT INTO oops_questions (question, answer) VALUES
('What is OOP?', 'Object-Oriented Programming is a programming paradigm based on objects and classes.'),
('What is a Class?', 'A class is a blueprint for creating objects.'),
('What is an Object?', 'An object is an instance of a class.'),
('What is Encapsulation?', 'Wrapping data and methods into a single unit and restricting access.'),
('What is Inheritance?', 'A mechanism where one class acquires properties of another class.'),
('What is Polymorphism?', 'Ability of a method to perform different tasks based on input.'),
('What is Abstraction?', 'Hiding internal details and showing only functionality.'),
('What is Constructor?', 'A special method used to initialize objects.'),
('What is Method Overloading?', 'Same method name with different parameters.'),
('What is Method Overriding?', 'Redefining a method in subclass.'),
('What is Interface?', 'A collection of abstract methods.'),
('What is Abstract Class?', 'A class that cannot be instantiated and may contain abstract methods.'),
('What is this keyword?', 'Refers to current object instance.'),
('What is super keyword?', 'Refers to parent class object.'),
('What is final keyword?', 'Used to restrict modification.');


CREATE TABLE cf_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL
);

INSERT INTO cf_questions (question, answer) VALUES
('What is a Computer?', 'A computer is an electronic device that processes data and performs tasks.'),
('What is Hardware?', 'Physical components of a computer like CPU, keyboard, and monitor.'),
('What is Software?', 'Programs and applications that run on a computer.'),
('What is CPU?', 'Central Processing Unit, the brain of the computer.'),
('What is RAM?', 'Random Access Memory used for temporary storage during processing.'),
('What is ROM?', 'Read Only Memory used for permanent storage.'),
('What is Input Device?', 'Devices used to give input to the computer like keyboard and mouse.'),
('What is Output Device?', 'Devices used to display output like monitor and printer.'),
('What is Operating System?', 'Software that manages hardware and software resources.'),
('What is Memory?', 'Component used to store data and instructions.'),
('What is Data?', 'Raw facts and figures.'),
('What is Information?', 'Processed data that is meaningful.'),
('What is Storage Device?', 'Device used to store data like hard disk or pen drive.'),
('What is Bit?', 'Smallest unit of data in computer.'),
('What is Byte?', 'Group of 8 bits.');

CREATE TABLE java_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL
);

INSERT INTO java_questions (question, answer) VALUES
('What is Java?', 'Java is a high-level, object-oriented programming language.'),
('What is JVM?', 'Java Virtual Machine that runs Java bytecode.'),
('What is JDK?', 'Java Development Kit used for developing Java applications.'),
('What is JRE?', 'Java Runtime Environment used to run Java programs.'),
('What is OOP in Java?', 'Programming paradigm based on objects and classes.'),
('What is Inheritance?', 'Mechanism where one class acquires properties of another.'),
('What is Polymorphism?', 'Ability to perform multiple functions using same method.'),
('What is Abstraction?', 'Hiding internal details and showing only functionality.'),
('What is Encapsulation?', 'Wrapping data and methods together.'),
('What is Exception Handling?', 'Handling runtime errors using try-catch blocks.'),
('What is Multithreading?', 'Running multiple threads simultaneously.'),
('What is Interface?', 'A collection of abstract methods.'),
('What is Array?', 'Collection of elements of same type.'),
('What is String?', 'A sequence of characters in Java.'),
('What is final keyword?', 'Used to restrict modification.');

CREATE TABLE python_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL
);

INSERT INTO python_questions (question, answer) VALUES
('What is Python?', 'Python is a high-level, interpreted programming language.'),
('What is an Interpreter?', 'Executes code line by line.'),
('What is a List?', 'A collection of ordered and mutable elements.'),
('What is a Tuple?', 'An ordered but immutable collection.'),
('What is Dictionary?', 'A collection of key-value pairs.'),
('What is Function?', 'Reusable block of code.'),
('What is Lambda Function?', 'Anonymous function defined using lambda keyword.'),
('What is OOP in Python?', 'Programming using classes and objects.'),
('What is Inheritance?', 'Acquiring properties of another class.'),
('What is Exception Handling?', 'Handling runtime errors using try-except.'),
('What is Module?', 'A file containing Python code.'),
('What is Package?', 'Collection of modules.'),
('What is Indentation?', 'Defines block structure in Python.'),
('What is Dynamic Typing?', 'Variable type is decided at runtime.'),
('What is PIP?', 'Python package installer.');

CREATE TABLE webtech_questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL
);

INSERT INTO webtech_questions (question, answer) VALUES
('What is Web Technology?', 'Web technology refers to tools and techniques used to communicate between devices over the internet.'),
('What is HTML?', 'HTML is the standard markup language used to create web pages.'),
('What is CSS?', 'CSS is used to style and design web pages.'),
('What is JavaScript?', 'JavaScript is a scripting language used to make web pages interactive.'),
('What is HTTP?', 'HTTP is a protocol used for communication between client and server.'),
('What is HTTPS?', 'Secure version of HTTP using encryption.'),
('What is a Web Browser?', 'Software used to access and view websites.'),
('What is a URL?', 'Uniform Resource Locator used to access resources on the web.'),
('What is Frontend?', 'Part of website users interact with.'),
('What is Backend?', 'Server-side logic and database handling.'),
('What is Responsive Design?', 'Design approach to make websites work on all devices.'),
('What is API?', 'Application Programming Interface for communication between systems.'),
('What is DOM?', 'Document Object Model represents HTML structure.'),
('What is Session?', 'Temporary data stored on server for a user.'),
('What is Cookie?', 'Small data stored on client side.');

create table ratings(text1 varchar(50), text2 varchar(50));
insert into ratings values('Best Application', 'More Codes');

CREATE DATABASE interview;


CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(15),
    password VARCHAR(50)
);