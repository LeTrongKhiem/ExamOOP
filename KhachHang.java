package Lab2_Extra;

import java.util.ArrayList;
import java.util.List;

public class KhachHang {
	private String ten;
	private String dienThoai;
	private String diachi;
	private String email;
	private int soCho;
	private String httt;
	private List<Tour> dsTour = new ArrayList<Tour>();
	private List<DangKy> dsDK = new ArrayList<DangKy>();

	public List<DangKy> getDsDK() {
		return dsDK;
	}

	public void setDsDK(List<DangKy> dsDK) {
		this.dsDK = dsDK;
	}

	public KhachHang(String ten, String dienThoai, String diachi, String email, int soCho, String httt) {
		super();
		this.ten = ten;
		this.dienThoai = dienThoai;
		this.diachi = diachi;
		this.email = email;
		this.soCho = soCho;
		this.httt = httt;
	}

	public KhachHang() {
		super();
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSoCho() {
		return soCho;
	}

	public void setSoCho(int soCho) {
		this.soCho = soCho;
	}

	public String getHttt() {
		return httt;
	}

	public void setHttt(String httt) {
		this.httt = httt;
	}

	@Override
	public String toString() {
		return "KhachHang [ten=" + ten + ", dienThoai=" + dienThoai + ", diachi=" + diachi + ", email=" + email
				+ ", soCho=" + soCho + ", httt=" + httt + "]";
	}

	public List<Tour> getDsTour() {
		return dsTour;
	}

	public void setDsTour(List<Tour> dsTour) {
		this.dsTour = dsTour;
	}

	public void dangKy(Tour tour) {
		dsDK.add(new DangKy(tour));
	}

}
