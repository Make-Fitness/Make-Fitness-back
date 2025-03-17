package korit.com.make_fitness.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerState {
    private int stateId;
    private int customerId;
    private String statement;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
