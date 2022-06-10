package Tuan05;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLC{
    private float ThuLaoGD;

    public GiaoVien(){
    }
    public GiaoVien(float ThuLaoGD, String Ten, String NgaySinh, float Luong, String NgayNhanViec, PhongBanKhoa PBK, String TrinhDo, String Nganh, String NoiDT) {
        super(Ten, NgaySinh, Luong, NgayNhanViec, PBK, TrinhDo, Nganh, NoiDT);
        this.ThuLaoGD = ThuLaoGD;
    }

    public float getThuLaoGD() {
        return ThuLaoGD;
    }

    public void setThuLaoGD(float ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    public void NhapGV(){
        super.NhapCLC();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Thu Lao: ");
        this.ThuLaoGD = sc.nextFloat();
    }
    
    public void XuatGV(){
        super.XuatCLC();
        System.out.printf("%-10f", this.ThuLaoGD);
    }
}
