package doo.gl.jooq.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserLimitDTO {

    private String id;
    private String userId;
    private String name;
    private Integer value;

    public static UserLimitDTO map(UserLimit limit) {
        return builder()
            .id(limit.getId())
            .userId(limit.getUser().getId())
            .name(limit.getName())
            .value(limit.getValue())
            .build();
    }

}
