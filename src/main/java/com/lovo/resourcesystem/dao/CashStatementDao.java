package com.lovo.resourcesystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lovo.resourcesystem.entity.CashStatementEntity;
/**
 * 医生人员管理
 * @author admin
 *
 */
@Repository
public interface CashStatementDao {
   
	/**
	 * 添加医生
	 * @param cashStatement
	 */
	public void cashStatementAdd(CashStatementEntity cashStatement);
	
	
	/**
	 * 删除医生
	 * @param id
	 */
	public void cashStatementdelete(Integer id);
	
	
	/**
	 * 展示医生
	 * @return
	 */
	public List<CashStatementEntity> cashStatementFinda();
	
	
	/**
	 * 根据状态查询在线医生
	 * @param state
	 * @return
	 */
	public List<CashStatementEntity> cashStatementFindb(@Param("state")String state);
	
	
	/**
	 * 根据ID修改状态
	 * @param id
	 */
	public void  cashStatementRevise(Integer id,String state);
	
	/**
	 * 查询负责人电话
	 * @param name 负责人姓名
	 * @return 负责人电话
	 */
	public String findPhone(String  name);
	/**
	 * 根据id查询负责人姓名
	 * @param inventoriesId id
	 * @return 负责人姓名
	 */
	public String findHeadName(Integer inventoriesId);
	
	
	/**
	 * 根据状态查询在线数量
	 * @param state
	 * @return
	 */
	public Integer finDoctorNum(String state);
	
	/**
	 * 根据姓名修改状态
	 * @param state 状态
	 * @param name 姓名
	 */
	public void updateState(String state,String  name);
}
