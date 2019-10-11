package com.kp.myboot.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "kp-producer")
		public interface KpProducerService {

		    @RequestMapping("/hello")
		    public String hello();
		    
		}