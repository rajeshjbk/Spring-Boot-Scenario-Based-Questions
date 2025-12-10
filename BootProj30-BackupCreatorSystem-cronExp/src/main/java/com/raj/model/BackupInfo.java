package com.raj.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BackupInfo {

	private int backupId;

	@Value("${backup.fileName}")
	private String fileName;

	private Date backupTime;
}
