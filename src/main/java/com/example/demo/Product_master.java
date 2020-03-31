package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Product_master {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String product; //商品コード

  private String shohinname; //商品名

  private String torokusya; //登録者

  private String torokupg; //登録プログラム

  private Integer torokudate; //登録日　t

  private String kosinsya; //更新者

  private Integer kosindate; //更新日

  private Integer vershion; //バージョン


  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

public String getShohinname() {
	return shohinname;
}

public void setShohinname(String shohinname) {
	this.shohinname = shohinname;
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

public Integer getTorokudate() {
	return torokudate;
}

public void setTorokudate(Integer torokudate) {
	this.torokudate = torokudate;
}

public String getKosinsya() {
	return kosinsya;
}

public void setKosinsya(String kosinsya){
	this.kosinsya = kosinsya;
}

public Integer getKosindate() {
	return kosindate;
}

public void setKosindate(Integer kosindate) {
	this.kosindate = kosindate;
}

public Integer getVershion() {
	return vershion;
}

public void setVershion(Integer version) {
	this.vershion = version;
}



}