package nyc.c4q.davisroman;

/**
 * Created by davis on 4/14/15.
 */
public class Dog {

    private String name;

    public Dog(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void speak(){
        int i;

        System.out.print("~>");

        for ( i =0; i < name.length(); i ++){
            System.out.print("woof");

            if (i < name.length() - 1 ){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
