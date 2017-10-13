package cn.sxt.action;

import com.opensymphony.xwork2.ActionSupport;
//继承ActionSupport 好处：可以继承一些ActionSupport实现的一些功能，如验证。（官方推荐使用）
public class ExtendsAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("extends action");
		return SUCCESS;
	}
}
