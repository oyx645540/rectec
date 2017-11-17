package com.ym.traegergill.modelBean;
// Generated 2017-10-23 17:20:01 by Hibernate Tools 5.2.5.Final

import java.util.Date;

/**
 * RecipeShare generated by hbm2java
 */
public class RecipeShare implements java.io.Serializable {

	private Integer recipeShareid;
	private Integer uid;
	private String title;
	private String shareContent;
	private Integer recipeid;
	private String shareMainPic;
	private Integer sharePlatformid;
	private String sharePlatform;
	private String recipeShareTagList;
	private String link;
	private Date shareTime;

	public RecipeShare() {
	}

	public RecipeShare(Integer uid, String title, String shareContent, Integer recipeid, String shareMainPic,
			Integer sharePlatformid, String sharePlatform, String recipeShareTagList, String link, Date shareTime) {
		this.uid = uid;
		this.title = title;
		this.shareContent = shareContent;
		this.recipeid = recipeid;
		this.shareMainPic = shareMainPic;
		this.sharePlatformid = sharePlatformid;
		this.sharePlatform = sharePlatform;
		this.recipeShareTagList = recipeShareTagList;
		this.link = link;
		this.shareTime = shareTime;
	}

	public Integer getRecipeShareid() {
		return this.recipeShareid;
	}

	public void setRecipeShareid(Integer recipeShareid) {
		this.recipeShareid = recipeShareid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShareContent() {
		return this.shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}

	public Integer getRecipeid() {
		return this.recipeid;
	}

	public void setRecipeid(Integer recipeid) {
		this.recipeid = recipeid;
	}

	public String getShareMainPic() {
		return this.shareMainPic;
	}

	public void setShareMainPic(String shareMainPic) {
		this.shareMainPic = shareMainPic;
	}

	public Integer getSharePlatformid() {
		return this.sharePlatformid;
	}

	public void setSharePlatformid(Integer sharePlatformid) {
		this.sharePlatformid = sharePlatformid;
	}

	public String getSharePlatform() {
		return this.sharePlatform;
	}

	public void setSharePlatform(String sharePlatform) {
		this.sharePlatform = sharePlatform;
	}

	public String getRecipeShareTagList() {
		return this.recipeShareTagList;
	}

	public void setRecipeShareTagList(String recipeShareTagList) {
		this.recipeShareTagList = recipeShareTagList;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getShareTime() {
		return this.shareTime;
	}

	public void setShareTime(Date shareTime) {
		this.shareTime = shareTime;
	}

}
