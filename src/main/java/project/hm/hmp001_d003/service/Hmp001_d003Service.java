package project.hm.hmp001_d003.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import project.hm.hmp001_d003.vo.Hmp001_d003VO;

public interface Hmp001_d003Service {
	 public List<Hmp001_d003VO> searchList(Map<String, Object> searchMap) throws DataAccessException;
	 public List<Hmp001_d003VO> searchMod(Map<String, Object> searchMap) throws DataAccessException;
	 public List<Hmp001_d003VO> searchAdd() throws DataAccessException;
	 
	 public void updateMember(Map<String, Object> datahMap) throws Exception;
	 public void insertMember(Map<String, Object> datahMap) throws Exception;
	 public void deleteMember(Map<String, Object> datahMap) throws Exception;
}
