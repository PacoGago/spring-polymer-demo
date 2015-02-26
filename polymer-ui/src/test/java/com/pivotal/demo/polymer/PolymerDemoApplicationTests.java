package com.pivotal.demo.polymer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pivotal.demo.polymer.PolymerDemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PolymerDemoApplication.class)
@WebAppConfiguration
public class PolymerDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
