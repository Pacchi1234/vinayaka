package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RewardAllocationControllerFilterApi extends genricUtilities {
	@Test
	public void getRewradAllocation() throws NumberFormatException, IOException {
		Testcase = 298;
		for (String rewardTypes : rewardType) {

			for (String statuse : RewardStatus) {
				response = RestAssured.get("/reward-service/v1/event/" + eventId + "/allocation/list?pageNo=" + page
						+ "&pageSize=" + size + "&rewardType=" + rewardTypes + "&status=" + statuse);
				genricUtilities.StatusCode();
				Testcase++;

			}
		}
	}
}