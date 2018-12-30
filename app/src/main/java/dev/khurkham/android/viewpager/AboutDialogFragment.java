package dev.khurkham.android.viewpager;




import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

/**
 * Main Activity. Inflates main activity xml.
 */
public class AboutDialogFragment extends DialogFragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Button btnOK;
        View view = inflater.inflate(R.layout.activity_about, container, false);
        getDialog().setTitle("Font Tai For Oppo");
        btnOK = (Button)view.findViewById(R.id.btnOk);
        btnOK.setOnClickListener(this);
        return view;




    }


    //Dialog
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnOk);
        dismiss();
    }




}

