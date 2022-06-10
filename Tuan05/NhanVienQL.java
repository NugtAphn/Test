
package Tuan05;

import java.util.Scanner;

public class NhanVienQL extends NhanVienCLC{
    private float PhuCapCV;

    public NhanVienQL(){
    }

    public NhanVienQL(float PhuCapCV, String Ten, String NgaySinh, float Luong, String NgayNhanViec, PhongBanKhoa PBK, String TrinhDo, String Nganh, String NoiDT) {
        super(Ten, NgaySinh, Luong, NgayNhanViec, PBK, TrinhDo, Nganh, NoiDT);
        this.PhuCapCV = PhuCapCV;
    }

    public float getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(float PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }

    public void NhapQL(){
        super.NhapCLC();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Phu Cap: ");
        this.PhuCapCV = sc.nextFloat();
    }

    public void XuatQL(){
        super.XuatCLC();
        System.out.printf("%-10f", this.PhuCapCV);
    }
}
