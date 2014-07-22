package com.example.reloj;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AnalogClock;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class PlainColor extends Fragment {
	private static final String PLAIN_COLOR_FRAG_ARG_COLOR = "color";
private static final String PLAIN_COLOR_FRAG_ARG_ALPHA = "alpha";

int color = Color.GREEN;
View view = null;
AnalogClock clock = null;
Bundle viewRecreateState = new Bundle();

public static PlainColor newInstance(int color) {
	PlainColor frag = new PlainColor();
  Bundle frag1Args = new Bundle();
  frag1Args.putInt(PLAIN_COLOR_FRAG_ARG_COLOR, color);
  frag.setArguments(frag1Args);
  frag.setRetainInstance(true);
  return frag;
}
@Override
public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  this.color = (getArguments() != null) ? getArguments().getInt(PLAIN_COLOR_FRAG_ARG_COLOR) : Color.RED;
}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
  view = inflater.inflate(R.layout.reloj, container, false);
  clock = (AnalogClock) view.findViewById(R.id.relojanalogico);
  clock.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
      vanishClock();
    }
  });
  //If bundle comes from system to recreate saved state put in property
  //to be available to restoreClockState
  if (savedInstanceState != null)
    viewRecreateState.putAll(savedInstanceState);
  restoreClockState();
  view.setBackgroundColor(color);
  return view;
}

@Override
public void onDestroyView() {
  viewRecreateState.putFloat(PLAIN_COLOR_FRAG_ARG_ALPHA, clock.getAlpha());
  super.onDestroyView();
}
private void restoreClockState() {
  float alpha = 1.0f;
  if (viewRecreateState != null && 
      viewRecreateState.containsKey(PLAIN_COLOR_FRAG_ARG_ALPHA))
    alpha = viewRecreateState.getFloat(PLAIN_COLOR_FRAG_ARG_ALPHA);
  clock.setAlpha(alpha);
}
public void startAnimationOnClock() {
  Animation anim = AnimationUtils.loadAnimation(getActivity(), 
      android.R.anim.fade_out);
  clock.startAnimation(anim);
}
public void vanishClock() {
  if (clock.getAlpha() < 0.4f)
    clock.setAlpha(1.0f);
  else
    clock.setAlpha(clock.getAlpha() - .2f);
}
@Override
public void onSaveInstanceState(Bundle outState) {
  outState.putFloat(PLAIN_COLOR_FRAG_ARG_ALPHA, clock.getAlpha());
  super.onSaveInstanceState(outState);
}
}
