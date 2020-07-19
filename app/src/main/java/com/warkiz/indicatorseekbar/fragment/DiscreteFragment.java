package com.warkiz.indicatorseekbar.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.warkiz.indicatorseekbar.R;
import com.warkiz.widget.ColorCollector;
import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.OnSeekChangeListener;
import com.warkiz.widget.SeekParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * created by zhuangguangquan on  2017/9/6
 */

public class DiscreteFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.discrete;
    }

    @Override
    protected void initView(View root) {

        IndicatorSeekBar seekBar = root.findViewById(R.id.seek_bar);
        List<Integer> highMarksArr = new ArrayList<>(Arrays.asList(0, 5, 10));
        seekBar.setTickHighMarksArrayInt(highMarksArr);
//        seekBar.setR2L(true);
        seekBar.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {
                Logger.getLogger("123").log(Level.INFO, "123");
            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {

            }
        });
        //customTickTexts
//        IndicatorSeekBar seekBar = root.findViewById(R.id.custom_text);
//        String[] arr = {"A", "a", "B", "b", "C", "c", "D"};
//        seekBar.customTickTexts(arr);
//
//        //tick_drawable
//        IndicatorSeekBar tick_drawable = root.findViewById(R.id.tick_drawable);
//        tick_drawable.setTickMarksDrawable(getResources().getDrawable(R.mipmap.ic_launcher));
//
//        //custom section color
//        IndicatorSeekBar sectionSeekBar = root.findViewById(R.id.custom_section_color);
//
//        sectionSeekBar.customSectionTrackColor(new ColorCollector() {
//            @Override
//            public boolean collectSectionTrackColor(int[] colorIntArr) {
//                //the length of colorIntArray equals section count
//                colorIntArr[0] = getResources().getColor(R.color.color_blue, null);
//                colorIntArr[1] = getResources().getColor(R.color.color_gray, null);
//                colorIntArr[2] = Color.parseColor("#FF4081");
//                colorIntArr[3] = Color.parseColor("#303F9F");
//                return true;//true if apply color , otherwise no change
//            }
//        });
//
//        //set listener
//        IndicatorSeekBar listenerSeekBar = root.findViewById(R.id.listener);
//        final TextView states = root.findViewById(R.id.states);
//        states.setText("states: ");
//        final TextView progress = root.findViewById(R.id.progress);
//        progress.setText("progress: " + listenerSeekBar.getProgress());
//        final TextView progress_float = root.findViewById(R.id.progress_float);
//        progress_float.setText("progress_float: " + listenerSeekBar.getProgressFloat());
//        final TextView from_user = root.findViewById(R.id.from_user);
//        from_user.setText("from_user: ");
//        final TextView thumb_position = root.findViewById(R.id.thumb_position);
//        thumb_position.setText("thumb_position: ");
//        final TextView tick_text = root.findViewById(R.id.tick_text);
//        tick_text.setText("tick_text: ");
//        listenerSeekBar.setOnSeekChangeListener(new OnSeekChangeListener() {
//            @Override
//            public void onSeeking(SeekParams seekParams) {
//                states.setText("states: onSeeking");
//                progress.setText("progress: " + seekParams.progress);
//                progress_float.setText("progress_float: " + seekParams.progressFloat);
//                from_user.setText("from_user: " + seekParams.fromUser);
//                thumb_position.setText("thumb_position: " + seekParams.thumbPosition);
//                tick_text.setText("tick_text: " + seekParams.tickText);
//            }
//
//            @Override
//            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {
//                states.setText("states: onStart");
//                progress.setText("progress: " + seekBar.getProgress());
//                progress_float.setText("progress_float: " + seekBar.getProgressFloat());
//                from_user.setText("from_user: true");
//            }
//
//            @Override
//            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {
//                states.setText("states: onStop");
//                progress.setText("progress: " + seekBar.getProgress());
//                progress_float.setText("progress_float: " + seekBar.getProgressFloat());
//                from_user.setText("from_user: false");
//            }
//        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        view.findViewById(R.id.indicator_container);

    }
}
