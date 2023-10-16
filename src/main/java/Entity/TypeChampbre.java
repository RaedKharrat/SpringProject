package Entity;

import lombok.Getter;

@Getter
public enum TypeChampbre {
    SINGLE("Single Room"),
    DOUBLE("Double Room"),
    TRIPLE("Triple Room");

    private final String description;

    TypeChampbre(String description) {
        this.description = description;
    }

}
