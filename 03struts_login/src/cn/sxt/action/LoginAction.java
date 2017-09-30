package cn.sxt.action;

public class LoginAction {
	private String name;
	private String pwd;

	// 处理方法
	public String execute() {
		if ("siggy".equals(name) && "1111".equals(pwd)) {
			return "success";
		} else {
			return "failed";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
