package com.bogdevich.tec2.instruction.service;


import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bogdevich.tec2.instruction.datamodel.Company;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class CompanyServiceTest {

@Inject
public CompanyService companyService;
	
	@Test
	public void testCompanyInsert(){
		Company company = new Company();
		company.setName("test-company");
		
		Assert.assertNotNull(companyService.get(company.getId()));
		
	}
}
