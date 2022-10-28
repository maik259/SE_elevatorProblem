public class Elv_States{
	public String Moving_up = "Moving up";
	public String Moving_down = "Moving down";
	private int current_Floor;
	private int dest_Floor;

	public Elv_States(int dest_Floor, int current_Floor) {
		this.current_Floor = current_Floor;
		this.dest_Floor = dest_Floor;
		
		while(this.dest_Floor > 5 && this.current_Floor != this.dest_Floor) {
			System.out.println(Moving_up);
			this.current_Floor += 1;
			System.out.println(this.current_Floor);
			arrive_atFloor();
		} 
		while(this.dest_Floor <= 4 && this.current_Floor != this.dest_Floor) {
			System.out.println(Moving_down);
			this.current_Floor -= 1;
			System.out.println("Current floor: " + this.current_Floor);
			arrive_atFloor();
		}
	
	}
	
	private void arrive_atFloor(){
		if(this.current_Floor == this.dest_Floor) {
			System.out.println("You have arrived!");
		}
	}
	
	
	
}
