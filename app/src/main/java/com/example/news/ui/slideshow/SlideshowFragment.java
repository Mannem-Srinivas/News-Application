package com.example.news.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.news.R;
import com.example.news.databinding.FragmentSlideshowBinding;
import com.example.news.ui.bbc.HomeViewModel;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow,container,false);
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);


        WebView webView = root.findViewById(R.id.webViewCNN);
        webView.loadUrl("https://edition.cnn.com/");
        webView.setWebViewClient(new WebViewClient());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}