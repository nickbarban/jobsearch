package com.barban.jobsearch.cucumber.stepdefs;

import com.barban.jobsearch.JobsearchApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JobsearchApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
