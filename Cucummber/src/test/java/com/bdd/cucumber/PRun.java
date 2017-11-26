package com.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Siva\\eclipse-workspace\\Cucummber\\features",
glue="stepdef", plugin= {"html:target/cucumber-html-report"})
public class PRun {

}
