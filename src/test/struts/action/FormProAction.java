package test.struts.action;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class FormProAction implements Preparable, ModelDriven{
	//파라미터를 set 메서드로 받는다. 
	//request.getParameter("id")  ===>>> setId(String id) 
	//request.getAttribute("id", id); ===> getId();
	
	/*
	private String id;
	private String name;
	public void setId(String id) { this.id = id;}
	public void setName(String name) { this.name = name;}
	
	public String getId() {return id;}
	public String getName() {return name;}
	public int getNum() {return 777;}
	
	
	
	public String execute() {
		System.out.println("id=="+id);
		System.out.println("name=="+name);
		
		return "success";
	}
	
	*/
	
	private DTO dto = null; 
	
	public String execute() {
		System.out.println("execute()== id-"+dto.getId());
		return "success";
	}
	public Object getModel() {
		System.out.println("getModel()");
		return dto;
	}
	public void prepare() throws Exception {
		System.out.println("prepare()");
		dto = new DTO();
	}
}
