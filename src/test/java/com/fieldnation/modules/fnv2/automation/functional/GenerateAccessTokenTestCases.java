package com.fieldnation.modules.fnv2.automation.functional;

import static org.junit.Assert.*;

import com.fieldnation.modules.fnv2.FnV2Connector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class GenerateAccessTokenTestCases extends AbstractTestCase<FnV2Connector> {

	public GenerateAccessTokenTestCases() {
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
	java.lang.String expected=null;
	getConnector();
	assertEquals( getConnector().getTokenFromStore(),expected);
}

}