package com.akarbowy.tagop.ui.posts.parts.comments;

import android.content.Context;
import android.net.Uri;
import android.text.Spannable;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.akarbowy.tagop.R;
import com.akarbowy.tagop.utils.ViewPropertiesUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CommentView extends LinearLayout {

    @BindView(R.id.drawee_avatar) SimpleDraweeView avatarView;
    @BindView(R.id.text_author) TextView authorView;
    @BindView(R.id.text_content) TextView contentView;
    @BindView(R.id.text_date) TextView dateView;
    @BindView(R.id.text_counter_votes) TextView votesView;

    public CommentView(Context context) {
        super(context);
        ButterKnife.bind(this, inflate(context, R.layout.item_comment, this));
        ViewPropertiesUtil.setLinkMovementMethod(contentView);
    }

    public void setAvatar(String url) {
        avatarView.setImageURI(Uri.parse(url));
    }

    public void setAuthor(String author) {
        authorView.setText(author);
    }

    public void setContent(Spannable author) {
        contentView.setText(author);
    }

    public void setDate(String date) {
        dateView.setText(date);
    }

    public void setVotes(String votes) {
        votesView.setText(votes);
    }
}