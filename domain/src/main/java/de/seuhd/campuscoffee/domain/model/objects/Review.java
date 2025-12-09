package de.seuhd.campuscoffee.domain.model.objects;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;

/**
 * Domain record that stores a review for a point of sale.
 * Reviews are approved once they received a configurable number of approvals.
 */
@Builder(toBuilder = true)
public record Review(
        @Nullable Long id, // null when the review has not been created yet
        @Nullable LocalDateTime createdAt, // set on review creation
        @Nullable LocalDateTime updatedAt, // set on review creation and update
        //TODO: Implement review domain model.
        @NonNull Integer approvalCount, // is updated by the domain module
        @NonNull Boolean approved, // is determined by the domain module

        @NotNull Long authorId, // reference to the user who wrote the review
        @NotNull Long posId, // reference to the point of sale being reviewed
        @NonNull String review // the review text
) implements DomainModel<Long> {
    @Override
    public Long getId() {
        return id;
    }
}