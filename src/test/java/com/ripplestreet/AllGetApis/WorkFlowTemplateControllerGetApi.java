package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class WorkFlowTemplateControllerGetApi<E> extends genricUtilities {
	@Test(priority = 185, groups = "event-campaign-manager")
	public void getEventWorkflowTemplateByEventId() {
		// RestAssured.baseURI = baseURI;
		response = RestAssured.get("/event-campaign-manager/v1/event/" + eventId + "/workflowTemplate");
		Testcase = 185;

	}

	@Test(priority = 186, groups = "event-campaign-manager")
	public void getListOfWorkFlowTemplates() {
		response = RestAssured.get("/event-campaign-manager/v1/workflowTemplate/list");
		Testcase = 186;

	}

	@Test(priority = 187, groups = "event-campaign-manager")
	public void getStepFunctionByArn() {

		response = RestAssured
				.get("https://devapi-ecs.ripplestreet.com/event-campaign-manager/v1/workflowTemplate/getByTemplateId/"
						+ templateId + "?templateId=" + templateId);
		Testcase = 187;

	}
}
