package com.retrofitapp;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Денис on 11.08.2017.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<PostModel> posts;

    public PostAdapter(List<PostModel> posts) {
        this.posts = posts;
    }

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position) {
        PostModel post = posts.get(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.post.setText(Html.fromHtml(post.getElementPureHtml(), Html.FROM_HTML_MODE_LEGACY));
        } else {
            holder.post.setText(Html.fromHtml(post.getElementPureHtml()));
        }
        holder.site.setText(post.getSite());
    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView post;
        TextView site;

        public ViewHolder(View itemVIew) {
            super(itemVIew);
            post = (TextView) itemView.findViewById(R.id.postitem_post);
            site = (TextView) itemView.findViewById(R.id.postitem_site);
        }
    }
}
