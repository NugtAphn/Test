
package Tuan05;

import java.util.Scanner;

public class NhanVien extends ConNguoi{
    private float Luong;
    private String NgayNhanViec;
    private PhongBanKhoa PBK;

    public NhanVien(){
    }

    public NhanVien(String Ten, String NgaySinh, float Luong, String NgayNhanViec, PhongBanKhoa PBK){
        super(Ten, NgaySinh);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }

    public String getNgayNhanViec() {
        return NgayNhanViec;
    }

    public void setNgayNhanViec(String NgayNhanViec) {
        this.NgayNhanViec = NgayNhanViec;
    }

    public PhongBanKhoa getPBK() {
        return PBK;
    }

    public void setPBK(PhongBanKhoa PBK) {
        this.PBK = PBK;
    }

    public void NhapNV(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Luong: ");
        this.Luong = sc.nextFloat();
        System.out.print("Nhap Ngay Nhan Viec: ");
        this.NgayNhanViec = sc.next();
        this.PBK = new PhongBanKhoa();
        this.PBK.NhapPhongBan();
    }

    public void XuatNV(){
        super.Xuat();
        System.out.printf("%-10f%-10s", this.Luong, this.NgayNhanViec);
        this.PBK.XuatPhongBan();
    }
}
