package com.example.androidtemplate.businmo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Kejian implements Parcelable {

	public Integer id;
	public String name;
	public String date;
	public String msg;
	public String img;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeValue(this.id);
		dest.writeString(this.name);
		dest.writeString(this.date);
		dest.writeString(this.msg);
		dest.writeString(this.img);
	}

	public Kejian() {
	}

	protected Kejian(Parcel in) {
		this.id = (Integer) in.readValue(Integer.class.getClassLoader());
		this.name = in.readString();
		this.date = in.readString();
		this.msg = in.readString();
		this.img = in.readString();
	}

	public static final Parcelable.Creator<Kejian> CREATOR = new Parcelable.Creator<Kejian>() {
		@Override
		public Kejian createFromParcel(Parcel source) {
			return new Kejian(source);
		}

		@Override
		public Kejian[] newArray(int size) {
			return new Kejian[size];
		}
	};
}
