package ca.ulaval.ima.tp2.ui.abacus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ca.ulaval.ima.tp2.R;

public class fragment_abacus extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_abacus, container, false);
        final SeekBar seek_bar_1 = root.findViewById(R.id.seekBar1);
        final TextView seek_bar_1_value = root.findViewById(R.id.seekBar1Value);
        final SeekBar seek_bar_2 = root.findViewById(R.id.seekBar2);
        final TextView seek_bar_2_value = root.findViewById(R.id.seekBar2Value);
        final SeekBar seek_bar_3 = root.findViewById(R.id.seekBar3);
        final TextView seek_bar_3_value = root.findViewById(R.id.seekBar3Value);
        seek_bar_3.setEnabled(false);

        seek_bar_1_value.setText(" " + (seek_bar_1.getProgress() + 1));
        seek_bar_1.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        seek_bar_1_value.setText(" " + (i + 1));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );

        seek_bar_2_value.setText(" " + (seek_bar_2.getProgress() + 2));
        seek_bar_2.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        seek_bar_2_value.setText(" " + (i + 2));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        seek_bar_3_value.setText(" " + (seek_bar_2.getProgress() + 2));


        return root;
    }
}