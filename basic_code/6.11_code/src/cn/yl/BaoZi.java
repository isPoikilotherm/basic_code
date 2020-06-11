package cn.yl;

public class BaoZi {
    private String pi;
    private String xian;
    private boolean state=false ;

    public BaoZi() {
    }

    public BaoZi(String pi, String xian, boolean state) {
        this.pi = pi;
        this.xian = xian;
        this.state = state;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
