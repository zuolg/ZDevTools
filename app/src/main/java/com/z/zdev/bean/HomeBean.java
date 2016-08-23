package com.z.zdev.bean;

import java.util.List;

/**
 * 首页应用
 * 
 * @ClassName HomeBean
 * @Description TODO
 * @author zuolangguo
 * @date 2015年12月11日 上午11:37:20
 */
public class HomeBean extends BaseBean {

	/** 轮播图 */
	private List<AllAppChilBean> slide;
	// private String slide;

	/** 九宫格 */
	private List<AllAppChilBean> sudoku;
	// private String sudoku;

	public List<AllAppChilBean> getSlide() {
		return slide;
	}

	public void setSlide(List<AllAppChilBean> slide) {
		this.slide = slide;
	}

	public List<AllAppChilBean> getSudoku() {
		return sudoku;
	}

	public void setSudoku(List<AllAppChilBean> sudoku) {
		this.sudoku = sudoku;
	}
 

}
