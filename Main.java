package NestedClassPackage;
class CPU{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache(){
			return 4.3;
		}
	}
	protected class RAM{
		double memory;
		String manufacturer;
		double getClockSpedd(){
			return 5.5;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache = " +processor.getCache());
		System.out.println("Ram clock speed ="  +ram.getClockSpedd());

	}

}
