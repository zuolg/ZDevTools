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
public class AllAppBean extends BaseBean {

	/** 所有分类 */
	private List<AllAppTypeBean> data;

	public List<AllAppTypeBean> getData() {
		return data;
	}

	public void setData(List<AllAppTypeBean> data) {
		this.data = data;
	} 
	  
}
