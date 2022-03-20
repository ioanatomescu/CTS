package i;

public interface IPrintTasks {
//print
	boolean scan(String content);
	boolean printFromExternalDevice(String content);
	boolean print(String content);
	boolean openClose(boolean state);
	boolean bagdeAuth(String content);
	boolean fax(String content,String number);
	
	
}
