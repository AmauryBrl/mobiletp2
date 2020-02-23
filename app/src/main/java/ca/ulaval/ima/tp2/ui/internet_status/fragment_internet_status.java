package ca.ulaval.ima.tp2.ui.internet_status;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ca.ulaval.ima.tp2.R;

public class fragment_internet_status extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_internet_status, container, false);
        final ImageView image1 = root.findViewById(R.id.image1);
        final Button button1 = root.findViewById(R.id.button1);
        final TextView textWifi = root.findViewById(R.id.textWifi);

        button1.setOnClickListener(new View.OnClickListener() {
              public void onClick(View v) {
                  image1.setImageResource(R.drawable.red_button_internet);
                  ConnectivityManager manager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
                  boolean is3g = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)
                          .isConnectedOrConnecting();
                  boolean isWifi = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
                          .isConnectedOrConnecting();
                  if (isWifi) {
                      textWifi.setText("WIFI");
                      image1.setImageResource(R.drawable.green_button_internet);
                  }
                  else if (is3g) {
                      textWifi.setText("3G/LTE");
                      image1.setImageResource(R.drawable.green_button_internet);
                  }
                  else {
                      textWifi.setText("Aucune connexion");
                      image1.setImageResource(R.drawable.red_button_internet);
                  }
              }
         });

        return root;
    }
}