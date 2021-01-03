package com.legato;

import java.util.ArrayList;
import java.util.List;

public class CusDAO {
	private List<Cus> cuslist;
	public CusDAO() {
		cuslist = new ArrayList<Cus>();
		cuslist.add(new Cus(1 ,"shravika","hyd"));
	}
	public CusDAO(List<Cus> cuslist) {
		
		this.cuslist = cuslist;
	}
	public List<Cus> getCuslist() {
		return cuslist;
	}
	public void setCuslist(List<Cus> cuslist) {
		this.cuslist = cuslist;
	}
	
	public void addCus(Cus c) {
		cuslist.add(c);
	}
    public List<Cus> getCusDetails(){
	    return cuslist;
    }

}
