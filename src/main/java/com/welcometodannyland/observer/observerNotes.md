### Observer Pattern
> The observer pattern defines a one-to-many dependency between objects so that when one object changes state, all the
dependents are notified and updated automatically.

Here are the main points of this pattern:
<ol>
  <li>There needs to be a Subject and Observer interface</li>
  <ol>
    <li>The Subject interface needs methods that add, remove and notify the observer.</li>
    <li>The Observer interface needs a methods that update the observer.</li>
  </ol>
  <li>When the subject receives and update, it sends the state to the observers</li>
  <li>There are different variations of this pattern which can push and pull data</li>
</ol>