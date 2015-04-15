package nyc.c4q.davisroman;

public class Main {

    public static void main(String[] args) {
        // Let's create three dogs because we love dogs!
        Dog sparky=new Dog("sparky");
        Dog fido=new Dog("fido");
        Dog pluto=new Dog("pluto");

        System.out.println("");
        System.out.println("(Section #1) (╯°□°）╯︵ ┻━┻ ");
        System.out.println();

        // fakeDog is not a real dog because it doesn't
        // point to a real dog but rather the pluto dog object.
        Dog fakeDog = pluto;

        System.out.println("My name is: " + fakeDog.getName());

        // fakeDog now points to fido.
        // Remember fakeDog is not a real dog.
        fakeDog = fido;

        System.out.println("My name is: " + fakeDog.getName());


        System.exit(0);
        System.out.println();
        System.out.println("(Section #2) (╯°□°）╯︵ ┻━┻ "); // Flip all them tables
        System.out.println();

        // We might as well make a human because someone should feed the dogs, right?
        Human john = new Human("john");


        // John adopts two dogs
        john.adoptDog(sparky);
        john.adoptDog(fido);
        john.adoptDog(new Dog("charlie"));

        // Check how many dogs John currently has
        john.listmydogs();


        System.exit(0);
        System.out.println();
        System.out.println("(Section #3) (╯°□°）╯︵ ┻━┻ "); // Flip all them tables
        System.out.println();

        //John adopts another dog
        john.adoptDog(pluto);

        // John commands all of his lovable poochies to speak.
        john.OrderDogsTospeak();

        System.exit(0);
        System.out.println();
        System.out.println("(Section #4) (╯°□°）╯︵ ┻━┻ "); // Flip all them tables
        System.out.println();


        //We can't forget about our fake dog.
        //Let's ask the fakeDog to speak and reveal it's name
        System.out.println(fakeDog.getName());
        fakeDog.speak();

    }
}
