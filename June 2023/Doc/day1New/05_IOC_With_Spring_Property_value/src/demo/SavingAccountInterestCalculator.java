package demo;

public class SavingAccountInterestCalculator implements InterestCalculator {

	private double roi=13;
	private int duration=4;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return (roi/100.0)*amt/duration;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}