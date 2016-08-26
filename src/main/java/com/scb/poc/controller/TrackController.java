package com.scb.poc.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scb.poc.model.TrackChannel;

@RestController
@RequestMapping("/v1")
public class TrackController {

	private Logger logger = LoggerFactory.getLogger(TrackController.class);

	@RequestMapping(value = "/track", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<Void> createTransfer(@RequestBody TrackChannel channel) {
		logger.info("Handing post api request");
		logger.info("Request Object: " + channel.toString());
		if ("IBANK".equalsIgnoreCase(channel.getChannelType())) {

		} else if ("CBOSS".equalsIgnoreCase(channel.getChannelType())) {

		} else if ("PRINT".equalsIgnoreCase(channel.getChannelType())) {

		} else if ("COURIER".equalsIgnoreCase(channel.getChannelType())) {

		}
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
}
