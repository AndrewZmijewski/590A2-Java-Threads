# 590A2-Java-Threads

Group members: Andrew Zmijewski

Each philosopher is represented by a Philosopher object. The Philosopher class extends the Thread class. The class contains five static boolean fields which indicate which philosophers are eating at any given time. They must be static because philosophers must be able to determine whether adjacent philosophers are eating. These fields essentially represent the forks. If one is true, that means that two forks are taken. I initially had five booleans directly representing forks, but that solution required changing two variables every time a philosopher starts eating. That made deadlocks much more likely. 

Philosophers begin in a thinking state, represented by an enum. They will all get hungry at a random interval of up to 10 seconds, at which point they enter a waiting state. If the two adjacent philosophers are not eating, they will immediately enter an eating state and their associated static boolean will become true. They will eat for a random interval of up to 5 seconds, then they will re-enter their thinking phase and reset their associated static boolean to false. If a philosopher can not eat, they will continue to check every second to see if they can now eat. 

My algorithm prevents deadlocks because a philosopher may only begin eating if neither adjacent philosopher is eating. The only possible way a deadlock could happen is if one philosopher determines that this is the case, and then an adjacent philosopher does exactly the same thing before the first philosopher can run the next line of code. I think this is incredibly unlikely. Similarly, starvation is technically possible. For example, philosopher 3 could continue waiting forever while philosopher 2 and 4 keep eating, but since it is all random, this is basically impossible. 

In your readme file for the zipfile, explain your design rationale. What features and structures are you using to represent the philosophers? To represent the table, the forks, the spaghetti? To represent eating phase of a philosophers "life"... the thinking phase?

What does your algorithm do to help prevent deadlocks and starvation? Are deadlocks and/or starvations still possible (and just improbable)?
