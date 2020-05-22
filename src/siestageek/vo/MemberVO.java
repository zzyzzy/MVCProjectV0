package siestageek.vo;

// 회원정보 저장 클래스
public class MemberVO {
    private String mno;
    private String name;
    private String jumin;
    private String userid;
    private String passwd;
    private String zipcode;
    private String addr1;
    private String addr2;
    private String email;
    private String mobile;
    private String regdate;

    public MemberVO() {
    }

    public MemberVO(String mno, String name, String jumin, String userid, String passwd, String zipcode, String addr1, String addr2, String email, String mobile, String regdate) {
        this.mno = mno;
        this.name = name;
        this.jumin = jumin;
        this.userid = userid;
        this.passwd = passwd;
        this.zipcode = zipcode;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.email = email;
        this.mobile = mobile;
        this.regdate = regdate;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJumin() {
        return jumin;
    }

    public void setJumin(String jumin) {
        this.jumin = jumin;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

}
