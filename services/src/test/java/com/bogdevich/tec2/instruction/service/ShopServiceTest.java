package com.bogdevich.tec2.instruction.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class ShopServiceTest extends AbstractTest{
	
	@Test
	public void testShopInsert(){
		Assert.assertNotNull(addShop());
	}

}
