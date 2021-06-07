package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) {
		String jsonData = "{\"languages\" : [{\"name\": \"Java\", \"description\":"
				+ " \" Java is a class-based high-level programming language that"
				+ " follows the OOPs concepts.\"},{\"name\": \"Javascript\","
				+ "\"description\": \"JavaScript is also a high-level, often "
				+ "just-in-time compiled, and multi-paradigm programming language."
				+ "\"},{\"name\": \"Python\",\"description\": \"Python is another "
				+ "high-level, interpreted and general-purpose programming language." + "\"}]}";

		// convert jsonData to JSONOBJECT
		JSONObject object = new JSONObject(jsonData);
		// Getting key from Jsonarray from the json array

		JSONArray array = object.getJSONArray("languages");
		// creating ArrayList
		ArrayList<Object> li = new ArrayList<Object>();
		if (array != null) {
			for (int i = 0; i < array.length(); i++) {
				li.add(array.get(i));
			}
		}

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
	}

}
