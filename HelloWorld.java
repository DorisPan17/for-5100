public class HelloWorld {
    private String greeting = "Hello, World!";

    public HelloWorld() {
    }
    public HelloWorld(String customizableGreeting){
        this.greeting = customizableGreeting;
    }
    public void greet()
    {
        System.out.println(greeting);
    }

    public void changeGreeting(String newGreeting){
        this.greeting = newGreeting;
        System.out.println(greeting);
    }

    public static void main (String args[])
    {
        HelloWorld helloworld;
        helloworld = new HelloWorld ();
        helloworld.greet () ;
        helloworld.changeGreeting("hi");

        HelloWorld helloWorld2 = new HelloWorld("hihihi");
        helloWorld2.greet();
    }
}
