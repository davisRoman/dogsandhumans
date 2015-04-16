package nyc.c4q.davisroman;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by davis on 4/14/15.
 */
public class Human {
    private String name;
    private ArrayList<Dog> myDogs = new ArrayList<Dog>();

    public Human(String name){
        this.name = name;
    }

    void adoptDog(Dog dog){
        myDogs.add(dog);
    }

    int currentNumOfDogs(){
         return myDogs.size();
    }

    void listmydogs(){
        Iterator it = myDogs.iterator();

        while (it.hasNext()){

            Dog currentDog = (Dog)it.next();

            System.out.println(currentDog.getName());
        }
    }

    void OrderDogsTospeak(){
        Iterator it = myDogs.iterator();

        while (it.hasNext()){

            Dog currentDog = (Dog)it.next();

            System.out.println(currentDog.getName() + ": " );
            currentDog.speak();
        }
    }
}
