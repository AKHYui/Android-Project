package com.example.androidtemplate.businmo;

import android.os.Parcel;
import android.os.Parcelable;

public class Xinwen implements Parcelable {
	
	public Integer id;
	public String name;
	public String msg;

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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeValue(this.id);
		dest.writeString(this.name);
		dest.writeString(this.msg);
	}

	public Xinwen() {
	}

	protected Xinwen(Parcel in) {
		this.id = (Integer) in.readValue(Integer.class.getClassLoader());
		this.name = in.readString();
		this.msg = in.readString();
	}

	public static final Parcelable.Creator<Xinwen> CREATOR = new Parcelable.Creator<Xinwen>() {
		@Override
		public Xinwen createFromParcel(Parcel source) {
			return new Xinwen(source);
		}

		@Override
		public Xinwen[] newArray(int size) {
			return new Xinwen[size];
		}
	};
}
