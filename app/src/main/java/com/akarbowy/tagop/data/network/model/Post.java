package com.akarbowy.tagop.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {
    @SerializedName("id") @Expose public Integer id;
    @SerializedName("author") @Expose public String author;
    @SerializedName("author_avatar") @Expose public String authorAvatar;
    @SerializedName("date") @Expose public String date;
    @SerializedName("body") @Expose public String body;
    @SerializedName("source") @Expose public String source;
    @SerializedName("url") @Expose public String url;
    @SerializedName("comments") @Expose public List<Comment> comments;
    @SerializedName("vote_count") @Expose public int voteCount;
    @SerializedName("embed") @Expose public Embed embed;
    @SerializedName("comment_count") @Expose public int commentCount;

    public Embed getEmbed() {
        return embed;
    }
}
