package dto;

public class UserDto 
{
	private int id;
	private String username;
	private String password;
	private String fullname;
	private String email;
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(int id, String username, String password, String fullname, String email) 
	{
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
				+ ", email=" + email + "]";
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	
}
