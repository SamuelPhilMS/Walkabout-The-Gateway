package org.launchcode.walkabout.models.dto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.launchcode.walkabout.models.AbstractEntity;
import org.launchcode.walkabout.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Entity
public class UserJournal{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String journalEntry;
    private String journalLocation;
    private final String journalDate;

   /* private String journalEntry;
    private String journalLocation; */

    public String getJournalEntry() {
        return journalEntry;
    }

    public void setJournalEntry(String journalEntry) {
        this.journalEntry = journalEntry;
    }

    public String getJournalLocation() {
        return journalLocation;
    }

    public void setJournalLocation(String journalLocation) {
        this.journalLocation = journalLocation;
    }

    @Override
    public String toString(){
        return journalEntry;
    }

    /* @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Id;
    private String journalEntry;
   private String journalLocation;

   private String journalDate; */

    public UserJournal(int id, String journalEntry, String journalLocation, String journalDate) {
        Id = id;
        this.journalEntry = journalEntry;
        this.journalLocation = journalLocation;
        this.journalDate = journalDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getJournalDate() {
        return journalDate;
    }

    /*@NotBlank(message = "Please add the journal entry.")
    @Min(1)
    private String journalEntry;

    @NotBlank(message = "Please add the journal location.")
    @Min(3)
    private String journalLocation;

    @NotNull(message = "Please add the journal date.")
    private static LocalDateTime journalDate;

    public UserJournal(Integer Id, String journalEntry, String journalLocation, LocalDateTime journalDate) {
        Id = Id;
        this.journalEntry = journalEntry;
        this.journalLocation = journalLocation;
        UserJournal.journalDate = journalDate;
    }

    @Autowired
    public UserJournal() {}

    public int getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }


    public String getJournalEntry() {
        return journalEntry;
    }

    public void setJournalEntry(String journalEntry) {
        this.journalEntry = journalEntry;
    }

    public String getJournalLocation() {
        return journalLocation;
    }

    public void setJournalLocation(String journalLocation) {
        this.journalLocation = journalLocation;
    }

    public LocalDateTime getJournalDate() {
        return journalDate;
    }

    public void setJournalDate(LocalDateTime journalDate) {
        UserJournal.journalDate = journalDate;
    }

    public String toString(){
        return getId() + journalEntry + journalLocation + journalDate;
    } */

   @GetMapping("/userjournal")
    public UserJournal createNewJournalEntry(Integer Id, String journalEntry, String journalLocation, String journalDate){
        UserJournal tempJournal = new UserJournal(Id, journalEntry, journalLocation, journalDate);
        System.out.println(tempJournal);
        return tempJournal;
    };

    /* @GetMapping("/userjournal")
    public String newJournal(Model model) {
        model.addAttribute("journal", journalEntry);
        return "newJournal.html";
    } */

}
