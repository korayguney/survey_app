package com.aegon.surveyapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SurveyScore {

    private String surveyTopic;
    private long totalScore;

}
