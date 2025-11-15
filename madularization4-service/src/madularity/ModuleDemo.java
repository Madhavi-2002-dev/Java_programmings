package madularity;

import java.util.List;

import madularity.sorting.algorithms.BubbleSort;

public class ModuleDemo {
	
	public List<String> sort(List<String> names){
		BubbleSort bubbleSort=new BubbleSort();
		return bubbleSort.sort(names);
	}
	

}
