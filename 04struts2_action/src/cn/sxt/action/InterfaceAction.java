package cn.sxt.action;

import com.opensymphony.xwork2.Action;
//实现接口 好处：使得我们编写的代码更加规范
public class InterfaceAction implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("interface action");
		return SUCCESS;
	}

}
