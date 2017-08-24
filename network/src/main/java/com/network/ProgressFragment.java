package com.network;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class ProgressFragment extends Fragment {

    private static final String URL = "https://developer.android.com/index.html";
    TextView contentView;
    String contentText = null;
    WebView webView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress, container, false);
        contentView = (TextView) view.findViewById(R.id.content);
        webView = (WebView) view.findViewById(R.id.webView);

        if(contentText != null){
            contentView.setText(contentText);
            webView.loadData(contentText, "text/html; charset=utf-8", "utf-8");
        }

        Button btnFetch = (Button) view.findViewById(R.id.downloadBtn);
        btnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (contentText == null){
                    contentView.setText("Загрузка...");
//                    new ProgressTask().execute(URL);
                }
            }
        });
        return view;
    }
}