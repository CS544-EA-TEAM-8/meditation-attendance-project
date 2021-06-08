package edu.ea.project.team8.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
public class Student extends Person {

	@Column(name="personid", columnDefinition = "char(11)")
	private String studentId;

	@Column(name="visastatus", columnDefinition = "nvarchar(50)")
	private String visaStatus;

	@Column(columnDefinition = "nvarchar(50)")
	private String status;

	@Column(columnDefinition = "varchar(50)")
	private String track;

	@Column(name="entry", columnDefinition = "datetime")
	private LocalDate entryDate;

	@Column(columnDefinition = "char(13)")
	private String barcode;

	public Student(String firstName, String lastName, String emailAddress,
				   String studentId, String visaStatus, String status,
				   String track, LocalDate entryDate, String barcode) {
		super(firstName, lastName, emailAddress);
		this.studentId = studentId;
		this.visaStatus = visaStatus;
		this.status = status;
		this.track = track;
		this.entryDate = entryDate;
		this.barcode = barcode;
	}
}

