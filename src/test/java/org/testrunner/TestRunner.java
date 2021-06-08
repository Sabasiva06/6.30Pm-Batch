package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"org.stepdef" }, dryRun = false, monochrome = true, tags = { "@F1" })
public class TestRunner {

	public void sum() {
		System.out.println("Sum");
	}

	public void sub() {
		System.out.println("Sub");

	}

	public void div() {
		System.out.println("Div");

	}

	public void multiple() {
		System.out.println("Multiple");

	}
}
