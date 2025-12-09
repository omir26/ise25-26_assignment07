package de.seuhd.campuscoffee.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;

/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto (
    @Nullable Long id,
    @Nullable LocalDateTime createdAt,
    @Nullable LocalDateTime updatedAt,

    @NotNull Long authorId,
    @NotNull Long posId,
    @NotBlank String review,
    @Nullable Boolean approved



) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
