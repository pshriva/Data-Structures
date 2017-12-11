package CMPE275;

import java.util.Date;

public class trainCapacity {
	long id;
	String trainNumber;
	String travelDate;
	int A;
	int B;
	int C;
	int D;
	int E;
	int F;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	public int getC() {
		return C;
	}
	public void setC(int c) {
		C = c;
	}
	public int getD() {
		return D;
	}
	public void setD(int d) {
		D = d;
	}
	public int getE() {
		return E;
	}
	public void setE(int e) {
		E = e;
	}
	public int getF() {
		return F;
	}
	public void setF(int f) {
		F = f;
	}
	public trainCapacity(long id, String trainNumber, String travelDate, int A_capacity, int B_capacity, int C_capacity, int D_capacity, int E_capacity, int F_capacity){
		this.id = id;
		this.travelDate = travelDate;
		this.trainNumber = trainNumber;
		this.A = A_capacity;
		this.B = B_capacity;
		this.C = C_capacity;
		this.D = D_capacity;
		this.E = E_capacity;
		this.F = F_capacity;
	}
}
