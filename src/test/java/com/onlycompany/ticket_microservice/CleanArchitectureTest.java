package com.onlycompany.ticket_microservice;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.onlycompany.ticket_microservice")
public class CleanArchitectureTest {

    private final JavaClasses classes = new ClassFileImporter().importPackages("com.onlycompany.ticket_microservice");

    @Test
    public void controllersShouldNotDependOnRepositories() {
        ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..controllers..")
                .should().dependOnClassesThat().resideInAPackage("..repositories..")
                .check(classes);
    }

    @Test
    public void controllersShouldOnlyAccessServices() {
        ArchRuleDefinition.classes()
                .that().resideInAPackage("..controllers..")
                .should().onlyHaveDependentClassesThat().resideInAnyPackage("..services..", "..exceptions..")
                .check(classes);
    }

    @Test
    public void servicesShouldNotDependOnControllers() {
        ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..services..")
                .should().dependOnClassesThat().resideInAPackage("..controllers..")
                .check(classes);
    }

    @Test
    public void servicesShouldOnlyAccessRepositoriesAndModels() {
        ArchRuleDefinition.classes()
                .that().resideInAPackage("..services..")
                .should().onlyHaveDependentClassesThat()
                .resideInAnyPackage("..repositories..", "..models..", "..exceptions..")
                .check(classes);
    }

    @Test
    public void noCyclicDependenciesBetweenPackages() {
        SlicesRuleDefinition.slices().matching("com.onlycompany.ticket_microservice.(*)..")
                .should().beFreeOfCycles()
                .check(classes);
    }
    @Test

    public void repositoriesShouldNotDependOnServicesOrControllers() {
        ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..repositories..")
                .should().dependOnClassesThat().resideInAnyPackage("..services..", "..controllers..")
                .check(classes);
    }

    @Test
    public void modelsShouldNotDependOnOtherLayers() {
        ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..models..")
                .should().dependOnClassesThat().resideInAnyPackage("..repositories..", "..services..", "..controllers..")
                .check(classes);
    }
}
