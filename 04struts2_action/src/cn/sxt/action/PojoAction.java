package cn.sxt.action;
//pojo类好处：自定义一个普通的java类即可，不具有侵入性
public class PojoAction {
	public String execute() {
		System.out.println("pojo action");
		return "success";
	}
}
