package collections;

public class MyPojo implements Comparable<MyPojo> {

	String feild1;
	int feild2;

	public String getFeild1() {
		return feild1;
	}

	public void setFeild1(String feild1) {
		this.feild1 = feild1;
	}

	public int getFeild2() {
		return feild2;
	}

	public void setFeild2(int feild2) {
		this.feild2 = feild2;
	}

	public MyPojo(String feild1, int feild2) {
		super();
		this.feild1 = feild1;
		this.feild2 = feild2;
	}

	public MyPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyPojo [feild1=" + feild1 + ", feild2=" + feild2 + ", getFeild1()=" + getFeild1() + ", getFeild2()="
				+ getFeild2() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feild1 == null) ? 0 : feild1.hashCode());
		result = prime * result + feild2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPojo other = (MyPojo) obj;
		if (feild1 == null) {
			if (other.feild1 != null)
				return false;
		} else if (!feild1.equals(other.feild1))
			return false;
		if (feild2 != other.feild2)
			return false;
		return true;
	}

	@Override
	public int compareTo(MyPojo arg0) {
		// TODO Auto-generated method stub

		if (this.feild2 > arg0.feild2) {
			return 1;
		} else if (this.feild2 < arg0.feild2) {
			return -1;
		}

		return 0;
	}

}
