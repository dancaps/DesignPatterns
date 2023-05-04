The strategy pattern defines a family of algorithms, encapsulates each one and makes them interchangeable. Strategy lets
the algorithm vary independently from clients that use it.

This example demostrates the following points.
1. There are 2 families of algorithms, which are grouped by using an interface. This encapsulates the algorithms under
a set of methods specific to that group.
    a. Flying
    b. Quacking
2. The individual algorithms, IFlyWithMyWings, FlyWithAJetpack, etc. are classes that implement their family interface.
The interface allows me to hide the algorithm implementation behind the common method.
3. The root abstract client class is the duck.
    a. The class contains references to the algorithm groups through the interface datatype.
    b. It also has setter methods to dynamically change the algorithm being used.
4. The program only worries about instantiating the subclass they want to use. In this example, that is the Mallard duck.
5. The program can modify the algorithms, in this case the way it flies and quacks in realtime.

Maintaining the code:
1. If there is a request to add a new algorithm, none of the existing code needs to change. Create a new class and
implement the algorithm group interface.
2. Adding a new subclass just extends the superclass and sets the proper algorithms.
