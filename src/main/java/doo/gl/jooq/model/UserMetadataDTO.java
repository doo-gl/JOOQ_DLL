package doo.gl.jooq.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserMetadataDTO {

    private String id;
    private String userId;
    private String key;
    private String value;

    public static UserMetadataDTO map(UserMetadata metadata) {
        return builder()
            .id(metadata.getId())
            .userId(metadata.getUser().getId())
            .key(metadata.getKey())
            .value(metadata.getValue())
            .build();
    }

}
