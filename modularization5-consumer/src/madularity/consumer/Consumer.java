package madularity.consumer;

import java.lang.System.Logger;
import java.util.List;

import madularity.ModuleDemo;

public class Consumer {
	
	private static final Logger logger=
			System.getLogger(Consumer.class.getName());
	
	
	public static void main(String[] args) {
		ModuleDemo util=new ModuleDemo();
		List<String> sorted=util.sort(List.of("ranga","ravi","adams","eva"));
		logger.log(Logger.Level.INFO, sorted.toString());
	}

}
