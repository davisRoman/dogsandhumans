# Intellij Debugging Quick Start Guide

![Debugging](img/debugging.gif)

## Introduction

Welcome! We're going to spend some time learning about the capabilities of the Intellij debugger. This will be time well spent so much so that future you will want to hop into a time machine propelled to 88mph, go back to today, and give you a BIG thank you for doing this. That's how useful this stuff will become.

Hey now! Then why didn't you just teach us this stuff on day 1 ?!

There's actually a very good reason for this. The role of the debugger is to amplify a programmer's debugging capabilties but certainly not to become a substitute for it. Just like a crippled person heavily relies on crutches, we should never allow the debugger to become your crutch so to speak. 

Your task ( if you choose to accept it ) is to develop enough skill such that you're able to manually step through a program in order to figure out the flow by yourself. Once you've reach this point, then by all means use the debugger as much as you want.

But remember, nothing can substitute good programming intuition!

Ok, so I'll step off my soap box now and end my mini rant.

## Debugging with dogs and humans

An example project has been prepared to help demonstrate various debugging features called "dogs and humans"

[dogs and humans](https://github.com/davisRoman/dogsandhumans)

### Setting our first breakpoint

You should initially see this:
<br />
<br />
![no breakpoint]( img/no_breakpoint.png )

Let's create a breakpoint on the first line our program which happens to be:
```java
Dog spark = new Dog("sparky");
```
You'll create a breakpoint by clicking to the very right of the line number. Once a red dot appears, then a breakpoint has been created as shown below.
<br />
<br />
![set breakpoint]( img/set_breakpoint.png )
<br />
</br />
Once you've got your breakpoint then you're ready to proceed. 

> *Definition* A `breakpoint` is an intentional stopping or pausing place in a program, put in place for debugging purposes. It is also sometimes simply referred to as a pause. More generally, a breakpoint is a means of acquiring knowledge about a program during its execution. During the interruption, the programmer inspects the test environment to find out whether the program is functioning as expected. 

### Fire up a debug session
You've created a breakpoint at this point but you're technically not debugging yet. 
We have to run our application in a special debug mode in order to get the ability to single step through the code line by line. You can do this by simply clicking on Run->Debug

![inititate debug session ]( img/Initiate_debug_session.png)
<br />
<br />
Alternatively, you can click on the bug icon on the lower left vertical bar to initiate a debug session.
<br />
<br />
![not_in_debug_session ]( img/not_in_debug_session.png)
<br />
<br />
Regardless of how which step you choose, you should now see the `Run` window as shown below. Go ahead and press `Enter`
<br />
<br />
![hit enter on main ] (img/hit_enter_on_main.png)

So this is what you should see as soon as you're in the debugg session. Your breakpoint now turns blue. 

#### A blue breakpoint signifies that it has NOT executed yet!

![ debug_session_started ](img/debug_session_started.png)
<br />
<br />
As you execute the program and declare variables, the `Variables` window will show you what variables the debugger is currently aware of. Please remember that only variables that are within scope will be shown. This is what your `Variables` window should look like at this very point in time.
<br />
<br />
![ variables_window ](img/variables_window.png )
<br />
<br />
## Debugging Features
### Step-over 
> *Definition* Step Over executes the procedure as a unit, and then steps to the next statement in the current procedure. Therefore, the next statement displayed is the next statement in the current procedure regardless of whether the current statement is a call to another procedure.

So let's go ahead and click on the step over icon. You can either click on the `FUNCTION` key + F8 on your mac
or click on Run -> Step Over
<br />
<br />
![ step_over ] (img/step_over.png)
<br />
<br />
Or click on the icon with the two circles stacked on top of eachother as shown below
<br />
<br />
![ step_over2 ] (img/step_over2.png)
<br />
<br />
So now we should see that our breakpoint has turned red indicating that the line just executed. If you look at the proceeding line, you'll notice that it has now turned blue indicating that it's the next line to be executed. Also notice the string "sparky : Dog@643" that just appeared next to our first line of code showing us the unique object id of our sparky object. This is the `inline debugging` feature of IntelliJ in action!
<br />
<br />
![ took_one_step ](img/took_one_step.png )
<br />
<br />
But hey now! Check out our `Variables` window. Do you notice anything different about it? It now shows us an object called sparky. If you click on its left arrow it will show us the contents of its private instance variable, name, that is currently set to sparky.  Do you also notice that that it says "Dog@643"? This is the unique object identifier that will become very handy in the future.
<br />
<br />
![ variables_window_with_sparky_object ](img/variables_window_with_sparky_object.png )
<br />
<br />
So why don't we take another step shall we ? Remember we want to `step over`
<br />
<br />
![ took_two_steps ](img/took_two_steps.png )
<br />
<br />
You'll now notice that the execution of our program moved forward one line and the inline dugger went ahead and showed us the unique object identifier for the Dog object called fido which happens to be 'Dog@645'
<br />
<br />
![ variables_window_with_sparky_and_fido_objects ](img/variables_window_with_sparky_and_fido_objects.png )
<br />
Now our `Variables` window shows us two objects that we can inspect. Cool right?

### Step-into
> *Definition* Almost identical to how the step-over feature works except that the difference is that if the statement is a call to a method, the next statement displayed is the first statement in the method.

So let's go ahead and click on the step into icon. You can either click on the `FUNCTION` key + F7 on your mac
or click on Run -> Step into

![Debugging_in_the_dog_class](img/Debugging_in_the_dog_class.png)
<br />
<br />
![variables_window_while_in_dog_class](img/variables_window_while_in_dog_class.png)
<br />
<br />
- So look at that! We ended up in the constructor of the Dog class. Does this make sense? We stepped into the declaration of the Dog object. ( Get it? Stepped into? ) Naturally, the first place we're taking to is the constructor. 
<br />
<br />
- Also pay special attention to the variables window which shows us that `name` equals `pluto`
because this was the value passed into our constructor 
<br />
<br />
- Can you figure out why this.name is set to null. 
<br />
<br />
- The answer is that technically we haven't executed the next line of code that sets this.name to pluto yet.
<br />
<br />
Remember, while in debug mode you're dictating when the cpu is allowed to take the next step. You really are in control!
<br />
So now let's take a few more steps in order to exit out of the constructor, go ahead and click on step over until you're out of the constructor and you should end up here.
<br />
<br />
![ took_two_steps ](img/took_two_steps.png )
<br />
<br />
At this point, take another step and you should end up here.
<br />
<br />
![stepping_past_pluto_object](img/stepping_past_pluto_object.png)
<br />
<br />
Great, now the pluto object has been created and given a unique identifier of `Dog@646`

## Frames ( aka Activation Records ) Window
![activation_records_window](img/activation_records_window.png)
<br />
- Your local variables are created inside what is called a frame (otherwise known as an activation record ) on a structure known as the stack where the most recently added object is the first one that is eligible to be removed. In real life, a stack can be thought of as a pile of plates. As we add plates to the top of the pile, we generally remove the most recently added plates until we reach the last plate that has been longest on the pile.
<br />
<br />
- These details will help you understand the `Frames` window shown above. It currently only contains a frame for the main method because the debugger is currently sitting in this method. However, every time we jump into a new method, a new frame is added to the top of the pile. This technique allows the cpu to dive into as many methods as necessary and then easily be able to unwind the stack and get back to where it initially started.
<br />
<br />
But don't take my word for it, let's see this in action!
<br />
<br />
Let's keep stepping over until we reach line #19. Are you there yet?
<br />
<br />
![getName_method_line_19](img/getName_method_line_19.png)
<br />
Once you reach line 19, go ahead and use `Step-into` to dive into the getName method
<br />
<br />
![getName_method_of_dog_class](img/getName_method_of_dog_class.png)
<br />
You're now in the getName method of the dog class but pay close attention to the frame window. What's different?
<br />
<br />
![getName_activation_record](img/getName_activation_record.png)
<br />
<br />
A new activation record (known as getName() ) has been created on top of the original record ( known as main() ) because we've now entered into a new method. `So what happened to the orignal record?` Did it suddenly get blown away? Of course not. It's still available however it's not currently active because we've now entered a new method with it's own set of local variables and as such its own activation record. Once we exit this method, its record is popped off the stack and we're now back on the original record that correspondes to main(). 
<br />
<br />
Alright so here is the real kicker. Do you see the up and down arrows in the diagram for the activation records? These arrows let you inspect past activation records in order to see what their current state was when the current method was called. 
The diagram below is a quick illustration of what it looks like when we call methods from main() and these methods subsequently call even more methods and how we're able to return back to main(). The methods called in the innermost region of the diagram have the shortest lifetime, because they're around for the least amount of time, where as the methods called the earliest ( towards the left ) have the longest lifetime.


<br />
![activationRecordsWithReturnAddress](img/activationRecordsWithReturnAddress.png)
<br />
Using the above knowledge, we can easily answer questions such as the following:
> Why did my method receive these funky parameters? And along those lines, what was the state of the parent method that called my method? 

This is super powerful when you start dealing with larger, more complex applications where the answer to the above kinds of questions won't be so clear.

## List all breakpoints

You're allowed to create as many breakpoints as you wish and in order to view a full list, simply click on:
```java
Run -> View Breakpoints
```
On the left hand side of the dialog all breakpoints in your project will be shown.

![ view breakpoints ] (img/breakpoint_menu.png)

You may also wish to deactivate a breakpoint and you can do this on this menu by simply unchecking it.

## Conditional breakpoints

As you become more and more proficient with breakpoints, you'll come to realize how nice it would be if breakpoints where a little smarter and were able to activate themselves based on certain criteria. Imagine an arraylist of 100 employee objects and realizing that as you iterate you always seem to have an issue with the 67th element. So the brute force method might be to single step 67 times but do you really want to do this? What if you make a modification and now you need to restart your debug session. Are you going to single step 67 times again? Hopefully by now you realized how much a pain in the ass this would be.

Enter conditional breakpoints...

On line 57 of the `dog and human` example, you'll see that john, an instance of human, invokes his OrderDogsTospeak() method. Any dogs that he previously adopted will be ordered to speak, easy enough right?

```java
sparky: 
~>woof,woof,woof,woof,woof,woof
fido: 
~>woof,woof,woof,woof
charlie: 
~>woof,woof,woof,woof,woof,woof,woof
pluto: 
~>woof,woof,woof,woof,woof
```

So here is what that looks like. We start with sparky and the number of woofs is a function of the number of characters in his name. Sparky has six letters in his name so six woofs are generated. The same pattern is repeated for all four dogs, sparky, fido, charlie and pluto.

Imagine that we wanted to set a breakpoint for charlie because we suspect a possible issue with the number of woofs that he produces.

So Let's set a breakpoint in the for loop located in the speak method. The variable i keeps track of the number of letters in a dogs name which corresponds to the number of woofs produced. We might as well stick a breakpoint here and set the condition such that our breakpoints stops when i is equal to 6. ( Remember we're looking for charlie, which happens to have 6 letters his name )
![ breakpoint in speak method ](img/breakpoint_in_speak_method.png)
<br />
<br />
We now need to set the correct condition otherwise this breakpoint activates every time the processor reaches it which is `NOT` what we want in this case. So let's go to Run -> View Breakpoints.
<br />
<br />
![ select_view_breakpoints ](img/select_view_breakpoints.png)
<br />
<br />
We'll now see a dialog box and all you need to do at this point is ensure that the breakpoint that we want is properly selected within the list of all breakpoints located on the left hand side. We'll now ensure that the condition option is selected and finally, we set our condition. In this case our condition is i=6.    Done!
<br />
<br />
![ set breakpoint condition ] (img/set_breakpoint_condition.png)
<br />
<br />
If you restart your debug session, you'll now see that we'll stop `ONLY` when our condition statement becomes true
ok, why don't we try this a different way. 
<br />
<br />

## Congratulations, you're now well on your way to becoming a debugging champion!
![ debuggin champion ] (img/chuck-norris-debugger-meme.jpg)

Ok, so let's try to look for charlie a different way. Instead of searching for the number of woofs that corresponds to the number of letters in his name. Let's look for the real charlie object. So in the OrderDogsToSpeak() method, we iterate through the list of dog objects that a human can have. Our breakpoint should activate when it reaches the object named “charlie” 

> How can we do this?

Lets start off by creating a breakpoint.

![ breakpoint_in_OrderDogToSpeak_method ](img/breakpoint_in_OrderDogToSpeak_method.png)

Click on Run -> View Breakpoints as before
<br />
<br />
![ select view breakpoints ](img/select_view_breakpoints.png)

This should look very familiar as before. Ensure that the correct breakpoint is select, enable the condition feature and set your condition. In this case, our condition is:
```java
currentDog.name.equals(“charlie”)
```
![ set conditional breakpoint for charlie ] (img/set_conditional_breakpoint_for_charlie.png)
### Done ! Easy right?

