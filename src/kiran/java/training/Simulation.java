package kiran.java.training;

import java.util.Random;

public class Simulation {
	
	private double minST;
	private double maxST;
	private double serviceTime;
	private double idleTime;
	
	public Simulation(){}
	public Simulation(double min,double max){
		this.minST = min;
		this.maxST = max;
		this.serviceTime = 0;
		this.idleTime =0;
	}
	
	public void setseviceTime(double serviceTime){
		this.serviceTime = serviceTime;
		System.out.println(serviceTime);
	}

	public void setidleTime(double idleTime){
		this.idleTime = idleTime;
		System.out.println(idleTime);
	}

	public double calcServiceTime(double random){
		return this.minST + (this.maxST-this.minST) * random;
	}
	
	public static double generateRandom(){
		Random random = new Random();
		double randomnum = random.nextDouble();
		return randomnum;
	}
	
	public static void main(String[] args){
		char eventType;
		double arrivalrand;
		double servicerandA = 0,servicerandB = 0;
		double idletimeA = 0,idletimeB = 0;
		double servicetimeA = 0,servicetimeB = 0;
		int countA = 0,countB = 0,clock = 0;
		
		System.out.println("arrivalrand\t\tarrival\t\tservicerandA\tservicetimeA\t\t\tidletimeA");
		while(countA < 50){
			arrivalrand = generateRandom();
			Simulation simA;
			Simulation simB;
			if(arrivalrand <=0.9){
				eventType = 'A';
				simA = new Simulation(3.445628284,5.54371716);
				servicerandA = generateRandom();
				servicetimeA = simA.calcServiceTime(servicerandA);
				idletimeA = idletimeA + (6-servicetimeA);
				simA.setidleTime(idletimeA);
				if(generateRandom()<=0.9){
					countA++;
				}	
			}else{
				eventType = 'B';
				simB = new Simulation(17.22814142,22.77185858);
				servicerandB = generateRandom();
				servicetimeB = simB.calcServiceTime(servicerandB);
				idletimeB = idletimeB + (6-servicetimeB);
				simB.setidleTime(idletimeB);
				if(generateRandom()<=0.9){
					countB++;
					System.out.println(countB);
				}
			}
			clock += 6;
			
			System.out.println(arrivalrand+"\t"+eventType+"\t"+servicerandA+"\t"+
			servicetimeA+"\t"+idletimeA);
		}	
		
		System.out.println(idletimeA + " : " +clock);
	}
}
