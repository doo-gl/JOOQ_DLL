package doo.gl.jooq.model;

import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String id;
    private String username;
    private Set<UserMetadataDTO> metadata;
    private Set<UserLimitDTO> limits;

    public static UserDTO map(User user) {
        return builder()
            .id(user.getId())
            .username(user.getUsername())
            .limits(user.getLimits().stream().map(UserLimitDTO::map).collect(Collectors.toSet()))
            .metadata(user.getMetadata().stream().map(UserMetadataDTO::map).collect(Collectors.toSet()))
            .build();
    }

}
