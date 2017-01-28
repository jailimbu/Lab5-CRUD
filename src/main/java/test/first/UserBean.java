package test.first;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


import test.first.UserData;

@Named("user") // or @ManagedBean(name="user")
@SessionScoped

public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	
	public String getName() { return name; }
	public void setName(String newValue) { name = newValue; }
	
	public String getPassword() { return password; }
	public void setPassword(String newValue) { password = newValue; }
	
	private static final List<UserData> dataList = 
			new ArrayList<UserData>(Arrays.asList(
			
			new UserData("Ram", "Ram Password"),
			new UserData("Shyam", "Shyam Password"),
			new UserData("Hari", "Hari Password"),
			new UserData("Ganga", "Ganga Password"),
			new UserData("Harry", "Harry Password")
		));
	
	public List<UserData> getData()
	{
		return dataList;
	}
	
	public String editUser(UserData item)
	{
		item.setEditable(true);
		return null;
	}

	public String saveUser() {
	    
		for (UserData user : dataList){
			user.setEditable(false);
		}
		
		return null;
		
	}
	
	
	public String deleteUser(UserData deleteItem) {

		dataList.remove(deleteItem);
		return null;
	}
	
	
	public String addUser() {
		UserData user = new UserData();
		
		user.setName(this.name);
		user.setPassword(this.password);
		user.editable = false;
		dataList.add(user);
		return null;
	}
}
