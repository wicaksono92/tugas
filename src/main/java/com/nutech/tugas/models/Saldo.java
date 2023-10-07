package com.nutech.tugas.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Saldo")
public class Saldo {
    @Id
    @GeneratedValue
    @UuidGenerator
    private String id;
    @Column(length = 50)
    private String idMerchan;
    @Column(length = 50)
    private int saldoAwal;
    @Column(length = 50)
    private int debit;
    @Column(length = 50)
    private int kredit;
    @Column(length = 50)
    private int saldoAkhir;
    @Column(length = 100)
    private String description;
    @UpdateTimestamp
    private LocalDateTime createdOn;


    public Saldo() {
    }

    public Saldo(String idMerchan, int saldoAwal, int debit, int kredit, int saldoAkhir, String description) {
        this.idMerchan = idMerchan;
        this.saldoAwal = saldoAwal;
        this.debit = debit;
        this.kredit = kredit;
        this.saldoAkhir = saldoAkhir;
        this.description = description;
    }

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getIdMerchan() {return idMerchan;}

    public String idMerchan() {
        return idMerchan;
    }

    public void setIdMerchan(String idMerchan) {this.idMerchan = idMerchan;}

    public int getSaldoAwal() {
        return saldoAwal;
    }

    public int saldoAwal() {
        return saldoAwal;
    }

    public void setSaldoAwal(int saldoAwal) {
        this.saldoAwal = saldoAwal;
    }

    public int getDebit() {
        return debit;
    }

    public int debit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getKredit() {
        return kredit;
    }

    public int kredit () { return kredit; }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public int getSaldoAkhir() {
        return saldoAkhir;
    }

    public int saldoAkhir() {
        return saldoAkhir;
    }

    public void setSaldoAkhir(int saldoAkhir) {
        this.saldoAkhir = saldoAkhir;
    }

    public String getDescription() {return description;}

    public String description() {
        return description;
    }

    public void setDescription(String description) {this.description = description;}

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}
