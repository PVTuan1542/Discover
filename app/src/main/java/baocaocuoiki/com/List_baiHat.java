package baocaocuoiki.com;

public class List_baiHat {
    private int anh;
    private String ten;
    private String casi;
    private String top;

    public List_baiHat(int anh, String ten) {
        this.anh = anh;
        this.ten = ten;
    }

    public List_baiHat(int anh, String ten, String casi, String top) {
        this.anh = anh;
        this.ten = ten;
        this.casi = casi;
        this.top = top;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
