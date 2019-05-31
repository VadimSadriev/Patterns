package main;

/*State pattern Controls the change in the behavior of an object when its internal state changes. Outwardly,
        it looks like an object changes its class.*/
public class StateAndDeputyProgram {
    public static void main(String[] args){
        int count = 0;
        GumballMachine gumballMachine = null;
        if (args.length < 2){
            System.out.println("Gumball machine <name> <inventory>");
            System.exit(1);
        }
        count = Integer.parseInt(args[1]);

     try {
         gumballMachine = new GumballMachine(args[0],5);
     }
     catch (Exception ex){
         ex.printStackTrace();
     }

    GumballMonitor monitor = new GumballMonitor(gumballMachine);

    System.out.println(gumballMachine); // need to override ToString to show current state
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        monitor.report();
    }
}
