package com.fieldnation.modules.fnv2.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.fieldnation.modules.fnv2.automation.functional.AddWorkorderTestCases;
import com.fieldnation.modules.fnv2.automation.functional.AssignWorkorderTestCases;
import com.fieldnation.modules.fnv2.automation.functional.AutoDispatchWorkorderTestCases;
import com.fieldnation.modules.fnv2.automation.functional.GenerateAccessTokenTestCases;
import com.fieldnation.modules.fnv2.automation.functional.GetTokenDetailsTestCases;
import com.fieldnation.modules.fnv2.automation.functional.PublishWorkorderTestCases;
import com.fieldnation.modules.fnv2.automation.functional.RouteWorkorderTestCases;
import com.fieldnation.modules.fnv2.automation.functional.UpdatePayTestCases;
import com.fieldnation.modules.fnv2.automation.functional.UpdateScheduleTestCases;
import com.fieldnation.modules.fnv2.FnV2Connector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({ AddWorkorderTestCases.class, AssignWorkorderTestCases.class, AutoDispatchWorkorderTestCases.class, GenerateAccessTokenTestCases.class, GetTokenDetailsTestCases.class, PublishWorkorderTestCases.class, RouteWorkorderTestCases.class, UpdatePayTestCases.class, UpdateScheduleTestCases.class })

public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite() {
		ConnectorTestContext.initialize(FnV2Connector.class);
	}

	@AfterClass
	public static void shutdownSuite() {
		ConnectorTestContext.shutDown();
	}

}