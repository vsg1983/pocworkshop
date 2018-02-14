package com.hbuget.system;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hbuget.vo.HbFamilyMember;
import com.hbuget.vo.HbUsers;

public class Java2Json {

	public static void main(String[] args) {
		Java2Json obj = new Java2Json();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		HbFamilyMember famMem = fetchObject();

		try {
			// Convert object to JSON string and save into a file directly
			//mapper.writeValue(new File("D:\\staff.json"), famMem);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(famMem);
			//System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(famMem);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private HbFamilyMember fetchObject() {

		HbFamilyMember famMemObj = new HbFamilyMember();
		famMemObj.setFamMemId("FAM-3121hb12");
		famMemObj.setNumOfChilds("5");
		HbUsers userObj = new HbUsers();
		userObj.setUserId("USR-3123873e");
		userObj.setPassword("test");
		userObj.setStatus("inactive");
		userObj.setUsername("test");
		famMemObj.setUsers(userObj);

		return famMemObj;

	}
}
