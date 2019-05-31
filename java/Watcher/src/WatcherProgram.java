import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WatcherProgram{
	JFrame frame;
	
	/*Pattern watcher defines dependency one to many between objects in such
	   a way that when the state of one object changes, all dependent objects
	   are  notificated and updated */
	public static void main(String[] args) {
		WatcherProgram example = new WatcherProgram();
		example.go();
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(90, 65, 30.4f);

		
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should i do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);
		frame.setSize(200, 200);
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Dont do it, you might regret it!");
			
		}
	}
	
	class DevilListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it");
			
		}
		
	}

}
