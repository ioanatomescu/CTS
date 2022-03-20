package i.resolved;

public class CanonUltraPerformant implements IPrintTasks,IPrintScanner,
IFax, IAuthenticate{

	@Override
	public boolean bagdeAuth(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fax(String content, String number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scan(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean print(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean openClose(boolean state) {
		// TODO Auto-generated method stub
		return false;
	}

}
