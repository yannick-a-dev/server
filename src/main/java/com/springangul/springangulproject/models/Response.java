package com.springangul.springangulproject.models;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder // est utilisé pour générer automatiquement un constructeur avec des parametres pour une classe
@JsonInclude(JsonInclude.Include.NON_NULL) //utilisé pour spécifier comment les propriétés d'un objet doivent etre incluses lors de la sérialisation JSON
public class Response {

	protected LocalDateTime timeStamp;
	protected int statusCode;
	protected HttpStatus status;
	protected String reason;
	protected String message;
	protected String developerMessage;
	protected Map<?, ?> data;
 }
