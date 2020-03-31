package com.example.demo;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Maker_master {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String makercd; //メーカーコード

  private String makername; //メーカー名

  private String torokusya; //登録者

  private String torokupg; //登録プログラム

  private Timestamp torokudate; //登録日

  private String kosinsya; //更新者

  private String kosinpg; //更新プログラム

  private Timestamp kosindate; //更新日

  private Integer version; //バージョン


  public String getMakercd() {
    return makercd;
  }

  public void setMakercd(String makercd) {
    this.makercd = makercd;
  }

public String getMakername() {
	return makername;
}

public void setMakername(String makername) {
	this.makername = makername;
}

public String getTorokusya() {
	return torokusya;
}

public void setTorokusya(String torokusya) {
	this.torokusya = torokusya;
}

public String getTorokupg() {
	return torokupg;
}

public void setTorokupg(String torokupg) {
	this.torokupg = torokupg;
}

public Timestamp getTorokudate() {
	return torokudate;
}

public void setTorokudate(Timestamp torokudate) {
	this.torokudate = torokudate;
}

public String getKosinsya() {
	return kosinsya;
}

public void setKosinsya(String kosinsya){
	this.kosinsya = kosinsya;
}

public Timestamp getKosindate() {
	return kosindate;
}

public String getKosinpg() {
	return kosinpg;
}

public void setKosinpg(String kosinpg) {
	this.kosinpg = kosinpg;
}

public void setKosindate(Timestamp kosindate) {
	this.kosindate = kosindate;
}

public Integer getVersion() {
	return version;
}

public void setVershion(Integer version) {
	this.version = version;
}





}