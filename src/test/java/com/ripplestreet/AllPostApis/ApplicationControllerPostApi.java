package com.ripplestreet.AllPostApis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.postApiutilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ApplicationControllerPostApi extends postApiutilities{
	@Test(groups="community-service")
	public void createApplication() throws IOException {
		Testcase=6;
		File file = new File(postApipath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("postApi");
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(4);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.post("http://ecs-activity-alb-1514376471.us-east-1.elb.amazonaws.com/community-service/v1/event/"+eventId+"/application");
		
	}

}
