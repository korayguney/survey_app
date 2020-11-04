package com.aegon.surveyapp.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "survey")
public class Survey extends AbstractEntity {

    @NotNull
    @Column(name = "topic", nullable = false)
    private String surveyTopic;

    @NotNull
    @Column(name = "question", nullable = false)
    private String surveyQuestion;

    @NotNull
    @Column(name = "score", nullable = false)
    private int surveyScore;

    @NotNull
    @Column(name = "feedback", nullable = false)
    private String surveyFeedback;

}
