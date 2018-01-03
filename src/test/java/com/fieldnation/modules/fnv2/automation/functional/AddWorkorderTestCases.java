package com.fieldnation.modules.fnv2.automation.functional;

import static org.junit.Assert.*;

import java.io.IOException;

import com.fieldnation.modules.fnv2.FnV2Connector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class AddWorkorderTestCases extends AbstractTestCase<FnV2Connector> {

	public AddWorkorderTestCases() {
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
		java.lang.String workorder_model = null;
		assertEquals(getConnector().addWorkorder(workorder_model), expected);
	}

}