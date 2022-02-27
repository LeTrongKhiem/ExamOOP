package Lab2_Extra;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class test {
	static List<KhachHang> dsKH = new ArrayList<KhachHang>();
	static List<Tour> dsTour = new ArrayList<Tour>();
	static List<DangKy> dsDK = new ArrayList<DangKy>();

	public static void main(String[] args) {

		KhachHang kh1 = new KhachHang("khiem", "0123567", "abc", "dsadas@gmail.com", 5, "atm");
		KhachHang kh2 = new KhachHang("khiem2", "0123567654", "dsdasd", "fsdvdcx@gmail.com", 6, "atm");
		KhachHang kh3 = new KhachHang("khiem3", "0123567654", "dsads", "bfdb @gmail.com", 8, "atm");
		KhachHang kh4 = new KhachHang("khiem4", "0123567444", "hgfhgf", "nnnnn@gmail.com", 9, "atm");
		dsKH.add(kh4);
		dsKH.add(kh3);
		dsKH.add(kh2);
		dsKH.add(kh1);

		Tour d1 = new TourTrongNuoc("DLat", "Đà lạt", 3, 550000.0);
		Tour d2 = new TourTrongNuoc("NTrang", " Nha trang", 4, 900000.0);
		Tour d3 = new TourTrongNuoc("PQ", "Phú Quốc", 4, 1250000.0);
		TourNuocNgoai o1 = new TourNuocNgoai("Thai", "HCM - Bangkok - Pattaya - Koh Island", 5, 3600000.0, "Thailand",
				500000.0);

		dsTour.add(o1);
		dsTour.add(d1);
		dsTour.add(d2);
		dsTour.add(d3);

		kh1.dangKy(d1);
		kh1.dangKy(d2);
		kh2.dangKy(d1);
		kh3.dangKy(d2);
		kh2.dangKy(o1);
		kh3.dangKy(o1);

//		System.out.println(tinhSoCho("DLat"));
		System.out.println(parseVND(tongThu("Thai")));
	}

	public static String parseVND(double number) {
		DecimalFormat format = new DecimalFormat("###,###,### VND"); // chuyen qua don vi tien te viet nam
		String priceS = format.format(number);
		return priceS;
	}

	public static int tinhSoCho(String tenTour) {
		int soCho = 0;
		for (KhachHang khachHang : dsKH) {
			for (DangKy tour : khachHang.getDsDK()) {
				if (tour.getTour().getTen().equals(tenTour)) {
					soCho += khachHang.getSoCho();
				}
			}
		}
		return soCho;
	}

	public static double tongThu(String tenTour) {
		double tien = 0;
		for (KhachHang khachHang : dsKH) {
			for (DangKy tour : khachHang.getDsDK()) {
				if (tour.getTour().getTen().equals(tenTour)) {
					if (tour.getTour() instanceof TourTrongNuoc) {
						tien = tinhSoCho(tenTour) * tour.getTour().getGiaTien();
					} else {
						tien = tinhSoCho(tenTour) * tour.getTour().getGiaTien() + tour.getTour().getTienPhuThu() * tinhSoCho(tenTour);
					}
				}
			}
		}
		return tien;
	}
}
