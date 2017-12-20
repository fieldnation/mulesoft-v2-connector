package com.fieldnation.modules.fnv2.automation.functional;

import static org.junit.Assert.*;

import java.io.IOException;

import com.fieldnation.modules.fnv2.FnV2Connector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class RouteWorkorderTestCases extends AbstractTestCase<FnV2Connector> {

	public RouteWorkorderTestCases() {
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
	public void verify() throws IOException {
		java.lang.String expected = null;
		long workorder_id = 0;
		java.lang.String json_body = null;
		assertEquals(getConnector().routeWorkorder(workorder_id, json_body), expected);
	}

}