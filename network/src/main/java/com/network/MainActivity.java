package com.network;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String URL = "http://vk.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new CustomWebViewFragment())
                    .commit();
        }
    }

    public static class CustomWebViewFragment extends WebViewFragment {

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setRetainInstance(true);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View result = super.onCreateView(inflater, container, savedInstanceState);
            getWebView().getSettings().setJavaScriptEnabled(true);
            getWebView().getSettings().setSupportZoom(true);
            getWebView().getSettings().setBuiltInZoomControls(true);
            getWebView().setWebViewClient(new WebViewClient());
            getWebView().loadUrl(URL);
            return (result);
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
        }
    }
}
