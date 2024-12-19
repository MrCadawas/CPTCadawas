import arc.*;

public class FinalCPTCadawas{
	public static void main(String[] args){
		Console con = new Console();
		con.println("Christmas is next week");
		con.println("Last day of school!!!!");
		con.println("Wait not... tomorrow is the last day of school!!!");
		String strTask;
		con.println("What will be your most important christmas task?");
		strTask = con.readLine();
		
		TextOutputFile taskfile = new TextOutputFile("xmastask.txt", true);
		taskfile.println(strTask);
		taskfile.close();

	}
}
