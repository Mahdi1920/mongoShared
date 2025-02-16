package tn.starter.mongoShared.dto;

import org.bson.types.ObjectId;

import java.time.LocalDate;

public record QuizDTO(ObjectId id ,String titreQuiz , String specialite , LocalDate dateQuiz ) {
}
