package com.example.news.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.news.R;
import com.example.news.databinding.FragmentGalleryBinding;
import com.example.news.ui.bbc.HomeViewModel;

public class tv9Fragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tv9,container,false);
        //HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);


        WebView webView = view.findViewById(R.id.tv9);
        webView.loadUrl("https://tv9telugu.com/");
        webView.setWebViewClient(new WebViewClient());

        return view;
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
//    }
}