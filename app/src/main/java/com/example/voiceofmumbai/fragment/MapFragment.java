package com.example.voiceofmumbai.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.voiceofmumbai.R;

public class MapFragment extends Fragment
{
	public MapFragment()
	{

	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View view;
		view = inflater.inflate(R.layout.fragment_map,container,false);
		return view;
	}
}
