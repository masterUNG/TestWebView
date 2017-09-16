package appewtc.masterung.testwebview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Chaiwoot on 17/9/2560.
 */

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        WebView webView = getView().findViewById(R.id.webViewMain);
        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.loadUrl("http://androidthai.in.th");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
