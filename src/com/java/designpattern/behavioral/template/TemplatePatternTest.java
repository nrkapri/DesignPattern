package com.java.designpattern.behavioral.template;

import java.util.ArrayList;
import java.util.List;

public class TemplatePatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<BaseWorker> workers = new ArrayList<BaseWorker>();
		
		
		workers.add(new Manager());
		workers.add(new Developer());
		workers.add(new BusinessAnalyst());
		workers.add(new Tester());
		
		for (BaseWorker w: workers )
			w.wakeup();
	}

}
