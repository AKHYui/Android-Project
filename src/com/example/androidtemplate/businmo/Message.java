package com.example.androidtemplate.businmo;

import java.io.Serializable;

public class Message implements Serializable {
	
	public Integer id;
	public String tiwen;
	public String huifu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTiwen() {
		return tiwen;
	}

	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}

	public String getHuifu() {
		return huifu;
	}

	public void setHuifu(String huifu) {
		this.huifu = huifu;
	}
}
