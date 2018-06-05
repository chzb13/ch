package com.cn.ch.za.ch.adapter;

public class AudioPlayer implements MediaPlayer{

	public void play(String audioType, String fileName) {
		if("mp3".equals(audioType)){
			System.out.println("play mp3 file name:"+fileName);
		}else if("mp4".equals(audioType) || "vlc".equals(audioType)){
			MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
			mediaPlayerAdapter.play(audioType, fileName);
		}else {
			  System.out.println("Invalid media. "+
			            audioType + " format not supported");
		}
		
	}

}
