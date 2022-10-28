import java.awt.Taskbar.State;

public class Elevator {
	public static int current_Floor = 5;
	int dest_Floor;
	
	public Elevator(int dest_floor){
		this.dest_Floor = dest_floor;
		System.out.println("*** Destination floor is: "+ dest_Floor);
		Elv_States State = new Elv_States(this.dest_Floor, current_Floor);
		State.toString();
	}

}
