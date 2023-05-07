### Observer Pattern
> The observer pattern defines a one-to-many dependency between objects so that when one object changes state, all the
dependents are notified and updated automatically.

Here are the main points of this pattern:
<ol>
  <li>There needs to be a Subject and Observer interface.</li>
  <ol>
    <li>The Subject interface needs methods that add, remove and notify the observer.</li>
    <li>The Observer interface needs a method that updates the observer.</li>
  </ol>
  <li>When the subject receives an update, it sends the state to the observers.</li>
  <li>There are different variations of this pattern, which can push and pull data.</li>
</ol>

In this example, I have done the following:
<ol>
  <li>I created the interfaces for the subject, the observer and a display.</li>
  <li>There is a concrete Data class which implements the subject interface.</li>
    <ol>
      <li>The class holds the observers in a linked list and implements the observer methods.</li>
      <li>It has a setData() method which simulates getting new data. This method calls the notify method.</li>
      <li>The notify method pushes all the data to the observers through the update method. It's not ideal but it 
demostrates the point of the pattern.</li>
    </ol>
  <li>There is a concrete Data1Display class which implements the observer and display interface.</li>
    <ol>
      <li>The concrete display class is only concerned with the data1 data.</li>
      <li>When the data is sent to the update method it updates the data and calls the display method.</li>
      <li>The display method is a simple println.</li>
    </ol>
</ol>