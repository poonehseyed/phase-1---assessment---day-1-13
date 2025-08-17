package model;

import java.time.LocalDate;
import java.util.List;

public class Member {

    private String id;
    private LocalDate registerDate;
    private Library libraryDetails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public Library getLibraryDetails() {
        return libraryDetails;
    }

    public void setLibraryDetails(Library libraryDetails) {
        this.libraryDetails = libraryDetails;
    }
}
