package com.springboot.demo.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时器的实现
 * 
 * @author 017220
 * @date 2018.5.18
 */
@Configuration
@EnableScheduling
public class MyTask {
	
	//秒  分  时  日  月  周  年
	@Scheduled(cron="0 0 0/1 * * *")
	public void task() {
		System.out.println("--------------------------");
		System.out.println("我是华丽的分割线！");
	}
	
}
