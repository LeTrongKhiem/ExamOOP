package Lab2_Extra;

public class TourNuocNgoai extends Tour{
	private String quocGia;
	private double tienPhuThu;
	public TourNuocNgoai(String ten, String mieuTa, int soNgay, double giaTien, String quocGia, double tienPhuThu) {
		super(ten, mieuTa, soNgay, giaTien);
		this.quocGia = quocGia;
		this.tienPhuThu = tienPhuThu;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public double getTienPhuThu() {
		return tienPhuThu;
	}
	public void setTienPhuThu(double tienPhuThu) {
		this.tienPhuThu = tienPhuThu;
	}
	
	
	
	
}
