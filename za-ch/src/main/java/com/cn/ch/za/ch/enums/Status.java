package com.cn.ch.za.ch.enums;


public enum Status {
	SPRING,SUMMER,AUTUMN,WINTER;
	private String code;
	private String desc;

	public String getDesc(String code) {
		for (Status certiTypeEnum : values()) {
			if (certiTypeEnum.getCode().equals(code)) {
				return certiTypeEnum.getDesc();
			}
		}
		return null;
	}

	public static Status getCertiTypeEnum(String code) {
		for (Status certiTypeEnum : values()) {
			if (certiTypeEnum.getCode().equals(code)) {
				return certiTypeEnum;
			}
		}
		return null;
	}

	public final String getCode() {
		return this.code;
	}

	public final void setCode(String code) {
		this.code = code;
	}

	public final String getDesc() {
		return this.desc;
	}

	public final void setDesc(String desc) {
		this.desc = desc;
	}
	
	public static void main(String[] args) {
		System.out.println(Status.SPRING.getCode());
	}
}
