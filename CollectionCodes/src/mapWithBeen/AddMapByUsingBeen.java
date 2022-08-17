package mapWithBeen;

import java.util.HashMap;
import java.util.Map;

public class AddMapByUsingBeen {

	public static void main(String[] args) {
		
		Map<Integer, Model> map=new HashMap<>();
		
		Model model=new Model();
		model.setA(10);
		model.setB(20);
		
		map.put(1, model);
		for(Map.Entry entry : map.entrySet() )
		{
			Model abc;
			abc= (Model) entry.getValue();
			System.out.println(abc.getA()+abc.getB());
		}

	}

}
