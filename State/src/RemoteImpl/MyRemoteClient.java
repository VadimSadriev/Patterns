package RemoteImpl;

import abstracts.GumballMachineRemote;
import abstracts.MyRemote;
import main.GumballMachine;
import main.GumballMonitor;

import java.rmi.Naming;

/*provides a surrogate object, controlling access to another object*/
public class MyRemoteClient {

    public static void main(String[] args){
      String[] location = {"rmi://santafe.mightygumball.com/gumbballmachine"};

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i= 0; i< location.length; i++){
            try {
                GumballMachineRemote machine = (GumballMachineRemote)Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }

        for (int i =0 ; i<monitors.length;i++){
            monitors[i].report();
        }
    }


}
