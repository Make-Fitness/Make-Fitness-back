package korit.com.make_fitness.controller.advice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FieldError {
    private String field;
    private String message;
}