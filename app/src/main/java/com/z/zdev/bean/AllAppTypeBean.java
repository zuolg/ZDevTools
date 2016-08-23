package com.z.zdev.bean;

import java.util.List;

/**
 * @Project: HNCloud
 * @Title: UserBean.java
 * @Package com.linzi.hncloud.bean
 * @Description: TODO
 * @author zuolangguo
 * @date 2015年12月7日 上午10:59:17
 * @version V1.0
 */
public class AllAppTypeBean {

	/** 分类应用 */
	private List<AllAppChilBean> application;

	/** 分类 */
	private String type;

	public List<AllAppChilBean> getApplication() {
		return application;
	}

	public void setApplication(List<AllAppChilBean> application) {
		this.application = application;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
