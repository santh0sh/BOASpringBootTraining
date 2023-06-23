package pack_10_ioc.pack_30_initcollection.pack30collection;

public class Client {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
    public String toString() {
        return String.format("\nClient:\t%s\n\t%s",
                this.name, this.address);
    }
}