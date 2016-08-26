package com.scb.poc.model;

public class TrackChannel {

	private String channelType;
	
	private TrackSystemDao track;

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public TrackSystemDao getTrack() {
		return track;
	}

	public void setTrack(TrackSystemDao track) {
		this.track = track;
	}
	public enum sourceType {
		IBANK, CBOSS, PRINT, COURIER
	}
}
