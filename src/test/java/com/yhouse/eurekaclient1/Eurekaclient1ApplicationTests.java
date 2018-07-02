package com.yhouse.eurekaclient1;

import com.yhouse.controller.TestRestful;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Eurekaclient1ApplicationTests {

	private MockMvc mvc;

	@Before
	public void  setUp(){
		mvc= MockMvcBuilders.standaloneSetup(new TestRestful()).build();
	}

}
