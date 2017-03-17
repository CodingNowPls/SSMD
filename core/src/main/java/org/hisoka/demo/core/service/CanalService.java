package org.hisoka.demo.core.service;

public interface CanalService {

	int insertSSRecordByStudentId(String studentId);
	
	int insertSSRecordByScoreId(String scoreId);
	
	void deleteSSRecordByStudentId(String studentId);
	
	void deleteSSRecordByScoreId(String scoreId);
}
