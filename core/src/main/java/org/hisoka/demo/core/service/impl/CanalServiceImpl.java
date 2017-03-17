//package com.sztx.demo.core.service.impl;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import CanalService;
//import com.sztx.demo.dataaccess.dao.sql.CanalMysqlDAO;
//import com.sztx.se.core.service.impl.BaseServiceImpl;
//
//@Service("canalService")
//public class CanalServiceImpl extends BaseServiceImpl implements CanalService {
//
//	@Autowired
//	private CanalMysqlDAO canalMysqlDAO;
//
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Override
//	public int insertSSRecordByStudentId(String studentId) {
//		int count = -2;
//		if(studentId == null || studentId.length() == 0) return count;
//		count = -1;
//		Map queryStu = new HashMap();
//		queryStu.put("id", studentId);
//		List<HashMap> student = canalMysqlDAO.selectStudent(queryStu);
//		if(student == null || student.isEmpty() || student.size() > 1) return count;
//		count = 0;
//		List<HashMap> scores = canalMysqlDAO.selectScore(new HashMap());
//		if(scores == null || scores.isEmpty()) return count;
//		for(HashMap score : scores){
//			Object scoreId = score.get("id");
//			if(scoreId == null || scoreId.toString() == "") continue;
//			Map scoreData = new HashMap();
//			scoreData.put("student_id", studentId);
//			scoreData.put("score_id", scoreId);
//			List<HashMap> sss = canalMysqlDAO.selectSSRecord(scoreData);
//			if(sss == null || sss.isEmpty()){
//				canalMysqlDAO.insertSSRecord(scoreData);
//				count++;
//			}
//		}
//		return count;
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Override
//	public int insertSSRecordByScoreId(String scoreId) {
//		int count = -2;
//		if(scoreId == null || scoreId.length() == 0) return count;
//		count = -1;
//		Map querySco = new HashMap();
//		querySco.put("id", scoreId);
//		List<HashMap> score = canalMysqlDAO.selectScore(querySco);
//		if(score == null || score.isEmpty() || score.size() > 1) return count;
//		count = 0;
//		List<HashMap> students = canalMysqlDAO.selectStudent(new HashMap());
//		if(students == null || students.isEmpty()) return count;
//		for(HashMap student : students){
//			Object studentId = student.get("id");
//			if(scoreId == null || scoreId.toString() == "") continue;
//			Map scoreData = new HashMap();
//			scoreData.put("student_id", studentId);
//			scoreData.put("score_id", scoreId);
//			List<HashMap> sss = canalMysqlDAO.selectSSRecord(scoreData);
//			if(sss == null || sss.isEmpty()){
//				canalMysqlDAO.insertSSRecord(scoreData);
//				count++;
//			}
//		}
//		return count;
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Override
//	public void deleteSSRecordByStudentId(String studentId) {
//		Map data = new HashMap();
//		data.put("student_id", studentId);
//		canalMysqlDAO.deleteSSRecord(data);
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Override
//	public void deleteSSRecordByScoreId(String scoreId) {
//		Map data = new HashMap();
//		data.put("score_id", scoreId);
//		canalMysqlDAO.deleteSSRecord(data);
//	}
//
//
//}
