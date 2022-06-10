package Tuan05;

import java.util.Scanner;

public class NhanVienCLC extends NhanVien{
    private String TrinhDo, Nganh, NoiDT;

    public NhanVienCLC(){
    }

    public NhanVienCLC(String Ten, String NgaySinh, float Luong, String NgayNhanViec, PhongBanKhoa PBK, String TrinhDo, String Nganh, String NoiDT){
        super(Ten, NgaySinh, Luong, NgayNhanViec, PBK);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDT = NoiDT;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public String getNoiDT() {
        return NoiDT;
    }

    public void setNoiDT(String NoiDT) {
        this.NoiDT = NoiDT;
    }
    
    public void NhapCLC(){
        super.NhapNV();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Trinh Do: ");
        this.TrinhDo = sc.nextLine();
        System.out.print("Nhap Nganh: ");
        this.Nganh = sc.nextLine();
        System.out.print("Nhap Noi Dao Tao: ");
        this.NoiDT = sc.nextLine();
    }

    public void XuatCLC(){
        super.XuatNV();
        System.out.printf("%-10s%-10s%-10s", this.TrinhDo, this.Nganh, this.NoiDT);
    }
}
