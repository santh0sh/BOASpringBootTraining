package setter_construct;

public class Address {
	private String careOf;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String pin;
	
	public void setCareOf(String careOf) {
		this.careOf = careOf;
	}
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Override
    public String toString() {
        return String.format("\nAddress:\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s",
                this.careOf, this.line1, this.line2, this.city, this.state, this.pin);
    }
}
