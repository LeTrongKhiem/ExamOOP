package Lab2_Extra;

import java.util.ArrayList;
import java.util.List;

public abstract class Tour {
	protected String ten;
	protected String mieuTa;
	protected int soNgay;
	protected double giaTien;
	List<DangKy> dsDK = new ArrayList<>();
	private TourNuocNgoai tourNN;

	public Tour(String ten, String mieuTa, int soNgay, double giaTien) {
		super();
		this.ten = ten;
		this.mieuTa = mieuTa;
		this.soNgay = soNgay;
		this.giaTien = giaTien;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMieuTa() {
		return mieuTa;
	}

	public void setMieuTa(String mieuTa) {
		this.mieuTa = mieuTa;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	public TourNuocNgoai getTourNN() {
		return tourNN;
	}

	public void setTourNN(TourNuocNgoai tourNN) {
		this.tourNN = tourNN;
	}
	public double getTienPhuThu() {
		return tourNN.getTienPhuThu();
	}

}
