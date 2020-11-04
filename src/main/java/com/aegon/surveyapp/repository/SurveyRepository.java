package com.aegon.surveyapp.repository;

import com.aegon.surveyapp.models.Survey;
import com.aegon.surveyapp.models.SurveyScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long> {
    List<Survey> findBySurveyTopic(String surveyTopic);

    @Query("SELECT " +
            "    new com.aegon.surveyapp.models.SurveyScore(s.surveyTopic, SUM(s.surveyScore)) " +
            "FROM " +
            "    Survey s " +
            "GROUP BY " +
            "    s.surveyTopic")
    List<SurveyScore> findSurveyTotalScores();
}
