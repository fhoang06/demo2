package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "infomation")
public class ExcelData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String data;
    private String nhafcungcapdichvukyc;
    private int customerid;
    private String anhgiattomattruoc;
    private String anhgiattomatsau;
    private String anhchandung;
    private String ketquaocrnattruoc;
    private LocalDateTime thoigianxuly;
    private String ketquaocrmatsau;
    private LocalDateTime thoigianxuly1;
    private String ketquasosanhmat;
    private LocalDateTime thoigianxuly2;
    private String dulieuocrmattruoc;
    private String dulieuocrmatsau;
    private String dulieusosanhkhuonmat;

    public ExcelData() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNhafcungcapdichvukyc() {
        return nhafcungcapdichvukyc;
    }

    public void setNhafcungcapdichvukyc(String nhafcungcapdichvukyc) {
        this.nhafcungcapdichvukyc = nhafcungcapdichvukyc;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getAnhgiattomattruoc() {
        return anhgiattomattruoc;
    }

    public void setAnhgiattomattruoc(String anhgiattomattruoc) {
        this.anhgiattomattruoc = anhgiattomattruoc;
    }

    public String getAnhgiattomatsau() {
        return anhgiattomatsau;
    }

    public void setAnhgiattomatsau(String anhgiattomatsau) {
        this.anhgiattomatsau = anhgiattomatsau;
    }

    public String getAnhchandung() {
        return anhchandung;
    }

    public void setAnhchandung(String anhchandung) {
        this.anhchandung = anhchandung;
    }

    public String getKetquaocrnattruoc() {
        return ketquaocrnattruoc;
    }

    public void setKetquaocrnattruoc(String ketquaocrnattruoc) {
        this.ketquaocrnattruoc = ketquaocrnattruoc;
    }

    public LocalDateTime getThoigianxuly() {
        return thoigianxuly;
    }

    public void setThoigianxuly(LocalDateTime thoigianxuly) {
        this.thoigianxuly = thoigianxuly;
    }

    public String getKetquaocrmatsau() {
        return ketquaocrmatsau;
    }

    public void setKetquaocrmatsau(String ketquaocrmatsau) {
        this.ketquaocrmatsau = ketquaocrmatsau;
    }

    public LocalDateTime getThoigianxuly1() {
        return thoigianxuly1;
    }

    public void setThoigianxuly1(LocalDateTime thoigianxuly1) {
        this.thoigianxuly1 = thoigianxuly1;
    }

    public String getKetquasosanhmat() {
        return ketquasosanhmat;
    }

    public void setKetquasosanhmat(String ketquasosanhmat) {
        this.ketquasosanhmat = ketquasosanhmat;
    }

    public LocalDateTime getThoigianxuly2() {
        return thoigianxuly2;
    }

    public void setThoigianxuly2(LocalDateTime thoigianxuly2) {
        this.thoigianxuly2 = thoigianxuly2;
    }

    public String getDulieuocrmattruoc() {
        return dulieuocrmattruoc;
    }

    public void setDulieuocrmattruoc(String dulieuocrmattruoc) {
        this.dulieuocrmattruoc = dulieuocrmattruoc;
    }

    public String getDulieuocrmatsau() {
        return dulieuocrmatsau;
    }

    public void setDulieuocrmatsau(String dulieuocrmatsau) {
        this.dulieuocrmatsau = dulieuocrmatsau;
    }

    public String getDulieusosanhkhuonmat() {
        return dulieusosanhkhuonmat;
    }

    public void setDulieusosanhkhuonmat(String dulieusosanhkhuonmat) {
        this.dulieusosanhkhuonmat = dulieusosanhkhuonmat;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ExcelData(int id,String data, String nhafcungcapdichvukyc, int customerid, String anhgiattomattruoc, String anhgiattomatsau, String anhchandung, String ketquaocrnattruoc, LocalDateTime thoigianxuly, String ketquaocrmatsau, LocalDateTime thoigianxuly1, String ketquasosanhmat, LocalDateTime thoigianxuly2, String dulieuocrmattruoc, String dulieuocrmatsau, String dulieusosanhkhuonmat) {
        this.id = id;
        this.data = data;
        this.nhafcungcapdichvukyc = nhafcungcapdichvukyc;
        this.customerid = customerid;
        this.anhgiattomattruoc = anhgiattomattruoc;
        this.anhgiattomatsau = anhgiattomatsau;
        this.anhchandung = anhchandung;
        this.ketquaocrnattruoc = ketquaocrnattruoc;
        this.thoigianxuly = thoigianxuly;
        this.ketquaocrmatsau = ketquaocrmatsau;
        this.thoigianxuly1 = thoigianxuly1;
        this.ketquasosanhmat = ketquasosanhmat;
        this.thoigianxuly2 = thoigianxuly2;
        this.dulieuocrmattruoc = dulieuocrmattruoc;
        this.dulieuocrmatsau = dulieuocrmatsau;
        this.dulieusosanhkhuonmat = dulieusosanhkhuonmat;
    }
}
