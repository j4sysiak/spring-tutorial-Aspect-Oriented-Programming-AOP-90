package pl.jaceksysiak.spring.aop;

public class Machine implements IMachine{

	@Override
	public void start() {
		System.out.println("Machine starting ...");
		
	}

}
