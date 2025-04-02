package Hashmapcreactiojn;

 class Student {
	
	private int id;
	private String fname;
	private int sal;
	
	public Student(int id, String fname, int sal) {
		super();
		this.id = id;
		this.fname = fname;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return (id+" "+fname+" "+sal);	
		}


	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	

}
