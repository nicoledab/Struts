package test.struts.action;

public class HelloAction {

	
	  public String execute() {
		  System.out.println("HelloAction-execute() ");
		  return "success";
	  }
	  
	  public String add() {
		  System.out.println("HelloAction- add()");
		  return "success";
	  }
}
