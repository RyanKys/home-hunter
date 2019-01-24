package io.github.ryank.homehunter.cucumber.stepdefs;

import io.github.ryank.homehunter.HomehunterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HomehunterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
