package com.fieldnation.modules.fnv2.automation.functional;

import static org.junit.Assert.*;

import com.fieldnation.modules.fnv2.FnV2Connector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class UpdatePayTestCases extends AbstractTestCase<FnV2Connector> {

	public UpdatePayTestCases() {
		super(FnV2Connector.class);
	}

	@Before
	public void setup() {
		// TODO
	}

	@After
	public void tearDown() {
		// TODO
	}

	@Test
	public void verify() throws Exception {
		java.lang.String expected = null;
		int workorder_id = 0;
		java.lang.String json_body = null;
		assertEquals(getConnector().updatePay(workorder_id, json_body), expected);
	}

}