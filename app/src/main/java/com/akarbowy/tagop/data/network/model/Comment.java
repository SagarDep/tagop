package com.akarbowy.tagop.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("id") @Expose public Integer id;
    @SerializedName("author") @Expose public String author;
    @SerializedName("author_avatar") @Expose public String authorAvatar;
    @SerializedName("date") @Expose public String date;
    @SerializedName("body") @Expose public String body;
    @SerializedName("source") @Expose public String source;
    @SerializedName("entry_id") @Expose public Integer entryId;
    @SerializedName("vote_count") @Expose public Integer voteCount;
    @SerializedName("user_vote") @Expose public Integer userVote;
    @SerializedName("embed") @Expose public Embed embed;
    @SerializedName("type") @Expose public String type;

    public Embed getEmbed() {
        return embed;
    }
}
