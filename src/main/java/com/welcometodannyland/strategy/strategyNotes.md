### Strategy Pattern
> The strategy pattern defines a family of algorithms, encapsulates each one and makes them interchangeable. Strategy lets
the algorithm vary independently of clients that use it.

This example demonstrates the following points:
<ol>
  <li>There are 2 families of algorithms, which are grouped by using an interface. This encapsulates the algorithms under
a set of methods specific to that group.</li>
  <ol>
    <li>Flying</li>
    <li>Quacking</li>
  </ol>
  <li>The individual algorithms, IFlyWithMyWings, FlyWithAJetpack, etc. are classes that implement their family 
interface. The interface allows me to hide the algorithm implementation behind the common method.</li>
  <li>The root abstract client class is the duck.</li>
  <ol>
    <li>The class contains references to the algorithm groups through the interface datatype.</li>
    <li>It also has setter methods to dynamically change the algorithm being used.</li>
  </ol>
  <li>The program only worries about instantiating the subclass they want to use. In this example, that is the 
Mallard duck.</li>
  <li>The program can modify the algorithms, in this case the way it flies and quacks in realtime.</li>
</ol>



Maintaining the code:
<ol>
  <li>If there is a request to add a new algorithm, none of the existing code needs to change. Create a new class and
implement the algorithm group interface.</li>
  <li>Adding a new subclass just extends the superclass and sets the proper algorithms.</li>
</ol>
