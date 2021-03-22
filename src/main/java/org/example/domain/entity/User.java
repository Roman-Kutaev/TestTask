package org.example.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @NonNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int id;
    private String fio = "Test Testov";

}
