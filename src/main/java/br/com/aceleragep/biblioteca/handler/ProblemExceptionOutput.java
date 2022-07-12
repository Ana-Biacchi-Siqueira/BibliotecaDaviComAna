package br.com.aceleragep.biblioteca.handler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import lombok.Getter;

@Getter
public class ProblemExceptionOutput {
	private int statusCode;
	private String message;
	private Calendar dateTime = Calendar.getInstance();

	// Saída de exceção de campos
	private List<FieldsExceptionOutput> campos;

	// Saída de exceção de problema
	public ProblemExceptionOutput(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
		campos = new ArrayList<>();
	}

	// Saída de exceção de problema // Saída de exceção de campos
	public ProblemExceptionOutput(int statusCode, String message, List<FieldsExceptionOutput> campos) {
		this(statusCode, message);
		this.campos = campos;
	}

}
