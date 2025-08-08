package IO_Byte;

import java.io.Serializable;

public class Object implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int rno;
	String name;
	transient int std;
	
	public Object() {}

	public Object(int rno, String name, int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	public void dispData() {
		System.out.println(rno + "\t" + name + "\t" + std);
	}

}
