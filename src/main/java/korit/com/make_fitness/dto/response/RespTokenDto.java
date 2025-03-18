package korit.com.make_fitness.dto.response;

import korit.com.make_fitness.entity.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RespTokenDto {
    private String type;
    private String name;
    private String token;

    private String nickname;
    private String roleName;

    public User toUser() {
        return User.builder()
                .nickname(nickname)
                .roleName(roleName)
                .build();
    }
}
