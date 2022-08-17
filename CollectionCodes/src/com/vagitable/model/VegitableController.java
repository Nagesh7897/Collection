package com.vagitable.model;

import java.util.LinkedList;
import java.util.List;

public class VegitableController {

	public static void main(String[] args) {
		
		List<Vagitable> list = new LinkedList<Vagitable>();
		list=VagitableData.VegCall();
		for(Vagitable v:list)
		{
			System.out.println(v.getId()+"   "+v.getName()+"    "+v.getDesc()+"   "+v.getPrice()+"    "+v.getQuantity());
		}
	}
}
