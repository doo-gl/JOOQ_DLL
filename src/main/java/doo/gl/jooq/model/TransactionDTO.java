package doo.gl.jooq.model;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {

    private String id;
    private String userId;
    private ZonedDateTime creationDate;
    private String currencyCode;
    private long amount;
    private String type;
    private String state;

}
