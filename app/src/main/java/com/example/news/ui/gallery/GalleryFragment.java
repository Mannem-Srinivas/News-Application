package com.example.news.ui.gallery;

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

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery,container,false);
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);


        WebView webView = root.findViewById(R.id.webViewAljazeera);
        webView.loadUrl("https://www.aljazeera.com/");
        webView.setWebViewClient(new WebViewClient());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}