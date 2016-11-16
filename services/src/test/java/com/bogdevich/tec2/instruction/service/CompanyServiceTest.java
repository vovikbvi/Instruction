package com.bogdevich.tec2.instruction.service;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bogdevich.tec2.instruction.dataacess.InstrDao;
import com.bogdevich.tec2.instruction.datamodel.Company;
import com.bogdevich.tec2.instruction.datamodel.Instr;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class CompanyServiceTest {

	@Inject
	public CompanyService companyService;

	@Inject
	public InstrService instrService;

	@Test
	public void testCompanyInsert() {
		Company company = new Company();
		company.setName("test-company");
		companyService.insert(company);

		Assert.assertNotNull(companyService.get(company.getId()));

	}

	@Test
	public void testInstr() {
		Instr instr = new Instr();
		instr.setName("test-name");
		instrService.insert(instr);

		Assert.assertNotNull(instrService.get(instr.getId()));
	}
}
