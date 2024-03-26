package com.cloneinstagram.app.data;

public class Post {

    private int id;
    private  int postImage;

    private int mainImage;

    private String caption;

    private String postUserName;
    private String subTitle;
    private String likedText;

    private String commentText;

    public Post(int id, int postImage, int mainImage, String caption, String subTitle, String likedText, String commentText,String postUserName) {
        this.id = id;
        this.postImage = postImage;
        this.mainImage = mainImage;
        this.caption = caption;
        this.subTitle = subTitle;
        this.likedText = likedText;
        this.commentText = commentText;
        this.postUserName=postUserName;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getLikedText() {
        return likedText;
    }

    public void setLikedText(String likedText) {
        this.likedText = likedText;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}
