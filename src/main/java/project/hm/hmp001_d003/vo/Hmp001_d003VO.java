package project.hm.hmp001_d003.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("hmp001_d003VO") 
public class Hmp001_d003VO {
	private String pprod_id = "";
	private String pprod_name = "";
	private String pprod_price = "";
	private String pprod_desc = "";
	private String vvend_name = "";
	
	
	public String getPprod_id() {
		return pprod_id;
	}
	public void setPprod_id(String pprod_id) {
		this.pprod_id = pprod_id;
	}
	public String getPprod_name() {
		return pprod_name;
	}
	public void setPprod_name(String pprod_name) {
		this.pprod_name = pprod_name;
	}
	public String getPprod_price() {
		return pprod_price;
	}
	public void setPprod_price(String pprod_price) {
		this.pprod_price = pprod_price;
	}
	public String getPprod_desc() {
		return pprod_desc;
	}
	public void setPprod_desc(String pprod_desc) {
		this.pprod_desc = pprod_desc;
	}
	public String getVvend_name() {
		return vvend_name;
	}
	public void setVvend_name(String vvend_name) {
		this.vvend_name = vvend_name;
	}
	
	
}
