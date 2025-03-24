package korit.com.make_fitness.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private int reservationId;
    private int customerId;
    private int classId;
    private LocalDateTime bookingDateTime;
    private String bookingStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
