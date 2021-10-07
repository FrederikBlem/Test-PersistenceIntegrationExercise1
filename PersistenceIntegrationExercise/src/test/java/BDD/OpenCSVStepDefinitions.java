package BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OpenCSVStepDefinitions {

    private final String filePath = "C:\\SOFT2\\Test\\Exercises\\Test-PersistenceIntegrationExercise1\\PersistenceIntegrationExercise\\PersistenceLog.csv";
    private File originalFile = new File(filePath);
    private File csvFile;
    private final List<List<String>> Lines = new ArrayList<>();


    //region READ FILE
    @Given("I have a CSV file")
    public void i_have_a_csv_file() {
        // Write code here that turns the phrase above into concrete actions
        csvFile = new File(filePath);
        assertTrue(csvFile.isFile());
    }
    @When("The file is opened")
    public void the_file_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(csvFile.canRead());
    }
    @Then("I get to read information from the file")
    public void i_get_to_read_information_from_the_file() {
        // Write code here that turns the phrase above into concrete actions
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    filePath));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        assertEquals(originalFile.getAbsolutePath(), csvFile.getAbsolutePath());
        assertEquals(originalFile.length(), csvFile.length());
    }
    //endregion READ FILE


    //region UPDATE FILE
    @Given("I write updates to the CSV file")
    public void i_write_updates_to_the_csv_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I save the file after updating")
    public void i_save_the_file_after_updating() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the file changes persist")
    public void the_file_changes_persist() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    //endregion UPDATE FILE
}
