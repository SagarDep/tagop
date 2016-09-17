package com.akarbowy.tagop.ui.posts.parts.counters.comments;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;

import com.akarbowy.tagop.network.model.Comment;

import java.util.List;

import timber.log.Timber;

public class CommentsViewer implements DialogInterface.OnKeyListener {

    private Builder builder;
    private CommentViewerView viewer;
    private AlertDialog dialog;

    protected CommentsViewer(Builder builder) {
        this.builder = builder;
        createDialog();
    }

    public void show() {
        if (!builder.comments.isEmpty()) {
            dialog.show();
        } else {
            Timber.e("Comments list cannot be empty! Viewer ignored.");
        }
    }

    private void createDialog() {
        viewer = new CommentViewerView(builder.context);
        viewer.setComments(builder.comments);

        dialog = new AlertDialog.Builder(builder.context, android.R.style.Theme_Translucent_NoTitleBar)
                .setView(viewer)
                .setOnKeyListener(this)
                .create();
    }

    @Override
    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK &&
                event.getAction() == KeyEvent.ACTION_UP &&
                !event.isCanceled()) {
                dialog.cancel();

        }
        return true;
    }

    public static class Builder {

        private Context context;
        private List<Comment> comments;

        public Builder(Context context, List<Comment> comments) {
            this.context = context;
            this.comments = comments;
        }

        public CommentsViewer build() {
            return new CommentsViewer(this);
        }

        public CommentsViewer show() {
            CommentsViewer dialog = build();
            dialog.show();
            return dialog;
        }
    }
}