## Scope and Lifetime of Variables
The scope of a variable defines the section of the code in which the variable is visible. As a general rule, variables that are defined within a block are not accessible outside that block. The lifetime of a variable refers to how long the variable exists before it is destroyed. Destroying variables refers to deallocating the memory that was allotted to the variables when declaring it. 

#### Instance variables 
Instance variables are those that are defined within a class itself and not in any method or constructor of the class. They are known as instance variables because every instance of the class (object) contains a copy of these variables. The scope of instance variables is determined by the access specifier that is applied to these variables. The lifetime of these variables is the same as the lifetime of the object to which it belongs. Object once created do not exist for ever. They are destroyed by the garbage collector of Java when there are no more reference to that object. 

#### Argument variables 
These are the variables that are defined in the header of a constructor or a method. The scope of these variables is the method or constructor in which they are defined. The lifetime is limited to the time for which the method keeps executing. Once the method finishes execution, these variables are destroyed. 

#### Local variables 
A local variable is the one that is declared within a method or a constructor (not in the header). The scope and lifetime are limited to the method itself. 

# Please watch these videos ! 
[Java Variable Scope Tutorial - Youtube]( https://www.youtube.com/watch?v=Fy9TyaOdXOc)

[ #19 Java Variable Scope Theory: Object Oriented Java Tutorial For Beginners ](https://www.youtube.com/watch?v=AMB_o5G0Dm4 )

[ #20 Java Variable Scope Example: Java Tutorial For Beginners ] ( https://www.youtube.com/watch?v=aW-hCIJC-ms )
