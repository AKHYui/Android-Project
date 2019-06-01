package com.example.androidtemplate.businmo;

import android.os.Parcel;
import android.os.Parcelable;

public class Test implements Parcelable {
	
	public Integer id;
	public String type;
	public String type02;
	public String problem;
	public String answer;
	public String msg;
	public String aa;
	public String ab;
	public String ac;
	public String ad;
	public String img;

	// 用户选择的答案
	public String answerTemp;

	public String grade;

	public Test() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public String getAb() {
		return ab;
	}

	public void setAb(String ab) {
		this.ab = ab;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getAnswerTemp() {
		return answerTemp;
	}

	public void setAnswerTemp(String answerTemp) {
		this.answerTemp = answerTemp;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getType02() {
		return type02;
	}

	public void setType02(String type02) {
		this.type02 = type02;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Test{" +
				"id=" + id +
				", type='" + type + '\'' +
				", problem='" + problem + '\'' +
				", answer='" + answer + '\'' +
				", aa='" + aa + '\'' +
				", ab='" + ab + '\'' +
				", ac='" + ac + '\'' +
				", ad='" + ad + '\'' +
				", img='" + img + '\'' +
				", answerTemp='" + answerTemp + '\'' +
				", grade=" + grade +
				'}';
	}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeValue(this.id);
		dest.writeString(this.type);
		dest.writeString(this.type02);
		dest.writeString(this.problem);
		dest.writeString(this.answer);
		dest.writeString(this.msg);
		dest.writeString(this.aa);
		dest.writeString(this.ab);
		dest.writeString(this.ac);
		dest.writeString(this.ad);
		dest.writeString(this.img);
		dest.writeString(this.answerTemp);
		dest.writeString(this.grade);
	}

	protected Test(Parcel in) {
		this.id = (Integer) in.readValue(Integer.class.getClassLoader());
		this.type = in.readString();
		this.type02 = in.readString();
		this.problem = in.readString();
		this.answer = in.readString();
		this.msg = in.readString();
		this.aa = in.readString();
		this.ab = in.readString();
		this.ac = in.readString();
		this.ad = in.readString();
		this.img = in.readString();
		this.answerTemp = in.readString();
		this.grade = in.readString();
	}

	public static final Creator<Test> CREATOR = new Creator<Test>() {
		@Override
		public Test createFromParcel(Parcel source) {
			return new Test(source);
		}

		@Override
		public Test[] newArray(int size) {
			return new Test[size];
		}
	};
}
