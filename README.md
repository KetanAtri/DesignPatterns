# DesignPatterns
Template implementation of Design Patterns learnt as part of Udemy course

<b> Solid Principles </b>
<ul>
    <li> Single Responsibility - There should only be one reason for a class to change </li>
    <li> Open-Closed Principle - Any component should be open for extension but closed for modification </li>
    <li> Liskov's Substitution - Using child class where base class is expected should not change behavior </li>
    <li> Interface Segregation - Clients should not be forced to depend on interfaces that they don't use </li>
    <li> Dependency Inversion - High level module should not depend on low-level module for implementation; both should 
    depend on abstractions. Abstractions should not depend on details but vice versa. </li>
</ul>

<b> Types of Design Patterns </b>
<ul>
    <li> Creational - Used for creation of objects </li>
    <li> Structural - Used for arrangement / composition of classes / objects </li>
    <li> Behavioral - Used to determine how the classes / objects communicate with each other </li>
</ul>

<b> Creational Design Patterns </b>
<ul>
    <li> Builder - Used for constructing objects that require multiple parameters / steps for initialization. It is
    possible to end up with partially initialized objects, build method needs to handle this case accordingly. </li>
    <li> Simple Factory - More of encapsulation than a design pattern; used when an object needs to be instantiated
    based on a condition. If decision gets too complex then "Factory Method" pattern should be used instead. </li>
    <li> Factory Method - Allows addition of new classes for creation without changing existing client code and factory
    implementation. Can lead to a large number of classes as there is a 1:1 relation between product and factory
    classes.</li>
</ul>

<b> Additional Notes </b>
<ul>
    <li> Importance of test cases - Unit test cases, like JUnit, help to make refactoring easier. Any changes in
    functionality can be easily detected by the unit test cases. </li>
    <li> Empty or dummy implementations are an indication of interface pollution </li>
</ul>
