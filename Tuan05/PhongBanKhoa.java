package Tuan05;

import java.util.Scanner;

public class PhongBanKhoa {
    private String MaPhongBan, TenPhongBan;

    public PhongBanKhoa() {
    }

    public PhongBanKhoa(String Ma, String Ten) {
        this.MaPhongBan = Ma;
        this.TenPhongBan = Ten;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getTenPhongBan() {
        return TenPhongBan;
    }

    public void setTenPhongBan(String TenPhongBan) {
        this.TenPhongBan = TenPhongBan;
    }

    public void NhapPhongBan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma Phong Ban: ");
        this.MaPhongBan = sc.nextLine();
        System.out.print("Nhap Ten Phong Ban: ");
        this.TenPhongBan = sc.nextLine();
    }

    public void XuatPhongBan() {
        System.out.printf("%-10s%-10s", this.MaPhongBan, this.TenPhongBan);
    }
}
