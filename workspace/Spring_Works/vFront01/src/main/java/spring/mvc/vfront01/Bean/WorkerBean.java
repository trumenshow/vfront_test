package spring.mvc.vfront01.Bean;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.type.Alias;

@Alias("worker")
public class WorkerBean {

	private String num;
	private String name;
	private String phone;
	private String rank;
	private String email;
	
	

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setField(String key,HttpServletRequest request){
		switch (key) {
		case "email": email=request.getParameter(key);
			break;
		case "phone": phone=request.getParameter(key); break;
		case "num": num=request.getParameter(key); break;
		case "name" : name=request.getParameter(key); break;
		case "rank" : rank=request.getParameter(key); break;
		default:
			break;
		}
	}
	
	
}
