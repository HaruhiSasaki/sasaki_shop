package com.example.demo;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Product_master {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String productcd; //商品コード

  private String syohinname; //商品名

  private String torokusya; //登録者

  private String torokupg; //登録プログラム

  private Timestamp torokudate; //登録日　t

  private String kosinsya; //更新者

  private Timestamp kosindate; //更新日

  private Integer version; //バージョン


  public String getProductcd() {
    return productcd;
  }

  public void setProductcd(String productcd) {
    this.productcd = productcd;
  }

public String getShohinname() {
	return syohinname;
}

public void setShohinname(String syohinname) {
	this.syohinname = syohinname;
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