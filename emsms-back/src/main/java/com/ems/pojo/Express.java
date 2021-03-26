package com.ems.pojo;

public class Express {
    private String emsId;
    private String emsAddr;
    private String emsName;
    private String emsPhone;
    private String emsMa;
    private String emsLocal;
    private int emsDelete;

    public Express() {
    }

    public Express(String emsId, String emsAddr, String emsName, String emsPhone, String emsMa, String emsLocal, int emsDelete) {
        this.emsId = emsId;
        this.emsAddr = emsAddr;
        this.emsName = emsName;
        this.emsPhone = emsPhone;
        this.emsMa = emsMa;
        this.emsLocal = emsLocal;
        this.emsDelete = emsDelete;
    }

    public String getEmsId() {
        return emsId;
    }

    public void setEmsId(String emsId) {
        this.emsId = emsId;
    }

    public String getEmsAddr() {
        return emsAddr;
    }

    public void setEmsAddr(String emsAddr) {
        this.emsAddr = emsAddr;
    }

    public String getEmsName() {
        return emsName;
    }

    public void setEmsName(String emsName) {
        this.emsName = emsName;
    }

    public String getEmsPhone() {
        return emsPhone;
    }

    public void setEmsPhone(String emsPhone) {
        this.emsPhone = emsPhone;
    }

    public String getEmsMa() {
        return emsMa;
    }

    public void setEmsMa(String emsMa) {
        this.emsMa = emsMa;
    }

    public String getEmsLocal() {
        return emsLocal;
    }

    public void setEmsLocal(String emsLocal) {
        this.emsLocal = emsLocal;
    }

    public int getEmsDelete() {
        return emsDelete;
    }

    public void setEmsDelete(int emsDelete) {
        this.emsDelete = emsDelete;
    }

    @Override
    public String toString() {
        return "Express{" +
                "emsId='" + emsId + '\'' +
                ", emsAddr='" + emsAddr + '\'' +
                ", emsName='" + emsName + '\'' +
                ", emsPhone='" + emsPhone + '\'' +
                ", emsMa='" + emsMa + '\'' +
                ", emsLocal='" + emsLocal + '\'' +
                ", emsDelete=" + emsDelete +
                '}';
    }
}
