package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class AbstractAuditDTO implements Serializable {

		private String  createdby;
		private LocalDateTime  createdAt;
		private String updatedBy;
		private LocalDate updatedAt;
}
