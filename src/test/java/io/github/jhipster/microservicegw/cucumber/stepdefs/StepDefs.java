package io.github.jhipster.microservicegw.cucumber.stepdefs;

import io.github.jhipster.microservicegw.JhSampleMicroserviceGwApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhSampleMicroserviceGwApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
