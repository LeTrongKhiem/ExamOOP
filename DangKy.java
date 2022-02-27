package Lab2_Extra;

import java.util.ArrayList;
import java.util.List;

public class DangKy {
	private Tour tour;
	private List<KhachHang> dsKH = new ArrayList<>();
	private KhachHang kh;

	public DangKy(Tour tour, List<KhachHang> dsKH) {
		super();
		this.tour = tour;
		this.dsKH = dsKH;
	}

	public DangKy(Tour tour) {
		super();
		this.setTour(tour);
	}

	public DangKy() {
		super();
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public List<KhachHang> getDsKH() {
		return dsKH;
	}

	public void setDsKH(List<KhachHang> dsKH) {
		this.dsKH = dsKH;
	}

	public KhachHang getKh() {
		return kh;
	}

	public void setKh(KhachHang kh) {
		this.kh = kh;
	}

}
