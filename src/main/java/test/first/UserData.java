package test.first;


public class UserData {
	
	private String name;
	private String password;
	
	boolean editable;
	
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	public String getName() { return name; }
	public void setName(String newValue) { name = newValue; }
	
	public String getPassword() { return password; }
	public void setPassword(String newValue) { password = newValue; }

	
	public UserData()
	{
		
	}
	
	public UserData(String name,String password)
	{
		this.name = name;
		this.password = password;
	}
}
