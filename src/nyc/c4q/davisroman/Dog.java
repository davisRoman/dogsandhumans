package nyc.c4q.davisroman;

/**
 * Created by davis on 4/14/15.
 */
public class Dog {

    String name;

    public Dog(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void speak(){

        System.out.print("~>");
        int i;
        int length = name.length();
        for ( i =0; i < length; i ++){
            System.out.print("woof");

            if (i < length - 1 ){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
