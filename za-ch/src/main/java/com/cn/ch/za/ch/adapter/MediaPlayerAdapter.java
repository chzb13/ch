package com.cn.ch.za.ch.adapter;

import java.awt.MultipleGradientPaint;

public class MediaPlayerAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaPlayerAdapter(String audioType){
		if("vlc".equals(audioType)){
			advancedMediaPlayer = new VlcPlayer();
		}else if("mp4".equals(audioType)){
			advancedMediaPlayer = new Mp4MediaPlayer();
		}
	}
	
	
	public void play(String audioType, String fileName) {
		if("vlc".equals(audioType)){
			advancedMediaPlayer.playVlc(fileName);
		}else if("mp4".equals(audioType)){
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
