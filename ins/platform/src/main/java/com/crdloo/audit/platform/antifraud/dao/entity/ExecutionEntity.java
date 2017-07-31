package com.crdloo.audit.platform.antifraud.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;
/**
 * 法院被执行人—个人版
 * @author hs
 *
 * @date 2017年7月21日
 */
@Entity
@Table(name = "bfd_execution")
public class ExecutionEntity extends BaseEntity{
	private static final long serialVersionUID = -4125653210399871783L;
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="swift_number",length=50)
	private String swift_number;//流水号
	@Column(name = "flag_execution", length = 10)
	private Integer flag_execution =10;// 计费标识:1计费，0不计费
	
    @Column(name = "ex_bad1_name", length = 30)
    private String ex_bad1_name="";  
    @Column(length = 20)
    private String ex_bad1_cid="";  
    @Column(length = 20)
    private String ex_bad1_cidtype="";  
    @Column(length = 20)
    private String ex_bad1_datatime="";  
    @Column(length = 10)
    private String ex_bad1_datatypeid="";  
    @Column(length = 20)
    private String ex_bad1_datatype="";  
    @Column(length = 30)
    private String ex_bad1_leader="";  
    @Column(length = 100)
    private String ex_bad1_address="";  
    @Column(length = 100)
    private String ex_bad1_court="";  
    @Column(length = 20)
    private String ex_bad1_time="";  
    @Column(length = 20)
    private String ex_bad1_casenum="";  
    @Column(length = 20)
    private String ex_bad1_money="";  
    @Column(length = 100)
    private String ex_bad1_base="";  
    @Column(length = 100)
    private String ex_bad1_basecompany="";  
    @Column(length = 100)
    private String ex_bad1_obligation="";  
    @Column(length = 20)
    private String ex_bad1_lasttime="";  
    @Column(length = 100)
    private String ex_bad1_performance="";  
    @Column(length = 100)
    private String ex_bad1_concretesituation="";  
    @Column(length = 20)
    private String ex_bad1_breaktime="";  
    @Column(length = 20)
    private String ex_bad1_posttime="";  
    @Column(length = 20)
    private String ex_bad1_performedpart="";  
    @Column(length = 20)
    private String ex_bad1_unperformpart="";  
   
    @Column(length = 30)
    private String ex_bad2_name="";  
    @Column(length = 20)
    private String ex_bad2_cid="";  
    @Column(length = 20)
    private String ex_bad2_cidtype="";  
    @Column(length = 20)
    private String ex_bad2_datatime="";  
    @Column(length = 10)
    private String ex_bad2_datatypeid="";  
    @Column(length = 20)
    private String ex_bad2_datatype="";  
    @Column(length = 30)
    private String ex_bad2_leader="";  
    @Column(length = 100)
    private String ex_bad2_address="";  
    @Column(length = 100)
    private String ex_bad2_court="";  
    @Column(length = 20)
    private String ex_bad2_time="";  
    @Column(length = 20)
    private String ex_bad2_casenum="";  
    @Column(length = 20)
    private String ex_bad2_money="";  
    @Column(length = 100)
    private String ex_bad2_base="";  
    @Column(length = 100)
    private String ex_bad2_basecompany="";  
    @Column(length = 100)
    private String ex_bad2_obligation="";  
    @Column(length = 20)
    private String ex_bad2_lasttime="";  
    @Column(length = 100)
    private String ex_bad2_performance="";  
    @Column(length = 100)
    private String ex_bad2_concretesituation="";  
    @Column(length = 20)
    private String ex_bad2_breaktime="";  
    @Column(length = 20)
    private String ex_bad2_posttime="";  
    @Column(length = 20)
    private String ex_bad2_performedpart="";  
    @Column(length = 20)
    private String ex_bad2_unperformpart=""; 
    
    @Column(length = 30)
    private String ex_bad3_name="";  
    @Column(length = 20)
    private String ex_bad3_cid="";  
    @Column(length = 20)
    private String ex_bad3_cidtype="";  
    @Column(length = 20)
    private String ex_bad3_datatime="";  
    @Column(length = 10)
    private String ex_bad3_datatypeid="";  
    @Column(length = 20)
    private String ex_bad3_datatype="";  
    @Column(length = 30)
    private String ex_bad3_leader="";  
    @Column(length = 100)
    private String ex_bad3_address="";  
    @Column(length = 100)
    private String ex_bad3_court="";  
    @Column(length = 20)
    private String ex_bad3_time="";  
    @Column(length = 20)
    private String ex_bad3_casenum="";  
    @Column(length = 20)
    private String ex_bad3_money="";  
    @Column(length = 100)
    private String ex_bad3_base="";  
    @Column(length = 100)
    private String ex_bad3_basecompany="";  
    @Column(length = 100)
    private String ex_bad3_obligation="";  
    @Column(length = 20)
    private String ex_bad3_lasttime="";  
    @Column(length = 100)
    private String ex_bad3_performance="";  
    @Column(length = 100)
    private String ex_bad3_concretesituation="";  
    @Column(length = 20)
    private String ex_bad3_breaktime="";  
    @Column(length = 20)
    private String ex_bad3_posttime="";  
    @Column(length = 20)
    private String ex_bad3_performedpart="";  
    @Column(length = 20)
    private String ex_bad3_unperformpart=""; 
    
    @Column(length = 30)
    private String ex_bad4_name="";  
    @Column(length = 20)
    private String ex_bad4_cid="";  
    @Column(length = 20)
    private String ex_bad4_cidtype="";  
    @Column(length = 20)
    private String ex_bad4_datatime="";  
    @Column(length = 10)
    private String ex_bad4_datatypeid="";  
    @Column(length = 20)
    private String ex_bad4_datatype="";  
    @Column(length = 30)
    private String ex_bad4_leader="";  
    @Column(length = 100)
    private String ex_bad4_address="";  
    @Column(length = 100)
    private String ex_bad4_court="";  
    @Column(length = 20)
    private String ex_bad4_time="";  
    @Column(length = 20)
    private String ex_bad4_casenum="";  
    @Column(length = 20)
    private String ex_bad4_money="";  
    @Column(length = 100)
    private String ex_bad4_base="";  
    @Column(length = 100)
    private String ex_bad4_basecompany="";  
    @Column(length = 100)
    private String ex_bad4_obligation="";  
    @Column(length = 20)
    private String ex_bad4_lasttime="";  
    @Column(length = 100)
    private String ex_bad4_performance="";  
    @Column(length = 100)
    private String ex_bad4_concretesituation="";  
    @Column(length = 20)
    private String ex_bad4_breaktime="";  
    @Column(length = 20)
    private String ex_bad4_posttime="";  
    @Column(length = 20)
    private String ex_bad4_performedpart="";  
    @Column(length = 20)
    private String ex_bad4_unperformpart=""; 
    
    @Column(length = 30)
    private String ex_bad5_name="";  
    @Column(length = 20)
    private String ex_bad5_cid="";  
    @Column(length = 20)
    private String ex_bad5_cidtype="";  
    @Column(length = 20)
    private String ex_bad5_datatime="";  
    @Column(length = 10)
    private String ex_bad5_datatypeid="";  
    @Column(length = 20)
    private String ex_bad5_datatype="";  
    @Column(length = 30)
    private String ex_bad5_leader="";  
    @Column(length = 100)
    private String ex_bad5_address="";  
    @Column(length = 100)
    private String ex_bad5_court="";  
    @Column(length = 20)
    private String ex_bad5_time="";  
    @Column(length = 20)
    private String ex_bad5_casenum="";  
    @Column(length = 20)
    private String ex_bad5_money="";  
    @Column(length = 100)
    private String ex_bad5_base="";  
    @Column(length = 100)
    private String ex_bad5_basecompany="";  
    @Column(length = 100)
    private String ex_bad5_obligation="";  
    @Column(length = 20)
    private String ex_bad5_lasttime="";  
    @Column(length = 100)
    private String ex_bad5_performance="";  
    @Column(length = 100)
    private String ex_bad5_concretesituation="";  
    @Column(length = 20)
    private String ex_bad5_breaktime="";  
    @Column(length = 20)
    private String ex_bad5_posttime="";  
    @Column(length = 20)
    private String ex_bad5_performedpart="";  
    @Column(length = 20)
    private String ex_bad5_unperformpart=""; 
    
    @Column(length = 30)
    private String ex_execut1_name="";  
    @Column(length = 20)
    private String ex_execut1_cid="";  
    @Column(length = 10)
    private String ex_execut1_cidtype="";  
    @Column(length = 20)
    private String ex_execut1_datatime="";  
    @Column(length = 10)
    private String ex_execut1_datatypeid="";  
    @Column(length = 20)
    private String ex_execut1_datatype="";  
    @Column(length = 100)
    private String ex_execut1_court="";  
    @Column(length = 20)
    private String ex_execut1_time="";  
    @Column(length = 100)
    private String ex_execut1_casenum="";  
    @Column(length = 20)
    private String ex_execut1_money="";  
    @Column(length = 20)
    private String ex_execut1_statute="";  
    @Column(length = 100)
    private String ex_execut1_basic="";  
    @Column(length = 100)
    private String ex_execut1_basiccourt="";
    
    @Column(length = 30)
    private String ex_execut2_name="";  
    @Column(length = 20)
    private String ex_execut2_cid="";  
    @Column(length = 10)
    private String ex_execut2_cidtype="";  
    @Column(length = 20)
    private String ex_execut2_datatime="";  
    @Column(length = 10)
    private String ex_execut2_datatypeid="";  
    @Column(length = 20)
    private String ex_execut2_datatype="";  
    @Column(length = 100)
    private String ex_execut2_court="";  
    @Column(length = 20)
    private String ex_execut2_time="";  
    @Column(length = 100)
    private String ex_execut2_casenum="";  
    @Column(length = 20)
    private String ex_execut2_money="";  
    @Column(length = 20)
    private String ex_execut2_statute="";  
    @Column(length = 100)
    private String ex_execut2_basic="";  
    @Column(length = 100)
    private String ex_execut2_basiccourt="";
    
    
    
    
    
    @Column(length = 30)
    private String ex_execut3_name="";  
    @Column(length = 20)
    private String ex_execut3_cid="";  
    @Column(length = 10)
    private String ex_execut3_cidtype="";  
    @Column(length = 20)
    private String ex_execut3_datatime="";  
    @Column(length = 10)
    private String ex_execut3_datatypeid="";  
    @Column(length = 20)
    private String ex_execut3_datatype="";  
    @Column(length = 100)
    private String ex_execut3_court="";  
    @Column(length = 20)
    private String ex_execut3_time="";  
    @Column(length = 100)
    private String ex_execut3_casenum="";  
    @Column(length = 20)
    private String ex_execut3_money="";  
    @Column(length = 20)
    private String ex_execut3_statute="";  
    @Column(length = 100)
    private String ex_execut3_basic="";  
    @Column(length = 100)
    private String ex_execut3_basiccourt="";
    
    
    
    
    @Column(length = 30)
    private String ex_execut4_name="";  
    @Column(length = 20)
    private String ex_execut4_cid="";  
    @Column(length = 10)
    private String ex_execut4_cidtype="";  
    @Column(length = 20)
    private String ex_execut4_datatime="";  
    @Column(length = 10)
    private String ex_execut4_datatypeid="";  
    @Column(length = 20)
    private String ex_execut4_datatype="";  
    @Column(length = 100)
    private String ex_execut4_court="";  
    @Column(length = 20)
    private String ex_execut4_time="";  
    @Column(length = 100)
    private String ex_execut4_casenum="";  
    @Column(length = 20)
    private String ex_execut4_money="";  
    @Column(length = 20)
    private String ex_execut4_statute="";  
    @Column(length = 100)
    private String ex_execut4_basic="";  
    @Column(length = 100)
    private String ex_execut4_basiccourt="";
    
    @Column(length = 30)
    private String ex_execut5_name="";  
    @Column(length = 20)
    private String ex_execut5_cid="";  
    @Column(length = 10)
    private String ex_execut5_cidtype="";  
    @Column(length = 20)
    private String ex_execut5_datatime="";  
    @Column(length = 10)
    private String ex_execut5_datatypeid="";  
    @Column(length = 20)
    private String ex_execut5_datatype="";  
    @Column(length = 100)
    private String ex_execut5_court="";  
    @Column(length = 20)
    private String ex_execut5_time="";  
    @Column(length = 100)
    private String ex_execut5_casenum="";  
    @Column(length = 20)
    private String ex_execut5_money="";  
    @Column(length = 20)
    private String ex_execut5_statute="";  
    @Column(length = 100)
    private String ex_execut5_basic="";  
    @Column(length = 100)
    private String ex_execut5_basiccourt="";
    
   
	
	public ExecutionEntity() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getSwift_number() {
		return swift_number;
	}



	public void setSwift_number(String swift_number) {
		this.swift_number = swift_number;
	}



	public Integer getFlag_execution() {
		return flag_execution;
	}



	public void setFlag_execution(Integer flag_execution) {
		this.flag_execution = flag_execution;
	}



	public String getEx_bad1_name() {
		return ex_bad1_name;
	}



	public void setEx_bad1_name(String ex_bad1_name) {
		this.ex_bad1_name = ex_bad1_name;
	}



	public String getEx_bad1_cid() {
		return ex_bad1_cid;
	}



	public void setEx_bad1_cid(String ex_bad1_cid) {
		this.ex_bad1_cid = ex_bad1_cid;
	}



	public String getEx_bad1_cidtype() {
		return ex_bad1_cidtype;
	}



	public void setEx_bad1_cidtype(String ex_bad1_cidtype) {
		this.ex_bad1_cidtype = ex_bad1_cidtype;
	}



	public String getEx_bad1_datatime() {
		return ex_bad1_datatime;
	}



	public void setEx_bad1_datatime(String ex_bad1_datatime) {
		this.ex_bad1_datatime = ex_bad1_datatime;
	}



	public String getEx_bad1_datatypeid() {
		return ex_bad1_datatypeid;
	}



	public void setEx_bad1_datatypeid(String ex_bad1_datatypeid) {
		this.ex_bad1_datatypeid = ex_bad1_datatypeid;
	}



	public String getEx_bad1_datatype() {
		return ex_bad1_datatype;
	}



	public void setEx_bad1_datatype(String ex_bad1_datatype) {
		this.ex_bad1_datatype = ex_bad1_datatype;
	}



	public String getEx_bad1_leader() {
		return ex_bad1_leader;
	}



	public void setEx_bad1_leader(String ex_bad1_leader) {
		this.ex_bad1_leader = ex_bad1_leader;
	}



	public String getEx_bad1_address() {
		return ex_bad1_address;
	}



	public void setEx_bad1_address(String ex_bad1_address) {
		this.ex_bad1_address = ex_bad1_address;
	}



	public String getEx_bad1_court() {
		return ex_bad1_court;
	}



	public void setEx_bad1_court(String ex_bad1_court) {
		this.ex_bad1_court = ex_bad1_court;
	}



	public String getEx_bad1_time() {
		return ex_bad1_time;
	}



	public void setEx_bad1_time(String ex_bad1_time) {
		this.ex_bad1_time = ex_bad1_time;
	}



	public String getEx_bad1_casenum() {
		return ex_bad1_casenum;
	}



	public void setEx_bad1_casenum(String ex_bad1_casenum) {
		this.ex_bad1_casenum = ex_bad1_casenum;
	}



	public String getEx_bad1_money() {
		return ex_bad1_money;
	}



	public void setEx_bad1_money(String ex_bad1_money) {
		this.ex_bad1_money = ex_bad1_money;
	}



	public String getEx_bad1_base() {
		return ex_bad1_base;
	}



	public void setEx_bad1_base(String ex_bad1_base) {
		this.ex_bad1_base = ex_bad1_base;
	}



	public String getEx_bad1_basecompany() {
		return ex_bad1_basecompany;
	}



	public void setEx_bad1_basecompany(String ex_bad1_basecompany) {
		this.ex_bad1_basecompany = ex_bad1_basecompany;
	}



	public String getEx_bad1_obligation() {
		return ex_bad1_obligation;
	}



	public void setEx_bad1_obligation(String ex_bad1_obligation) {
		this.ex_bad1_obligation = ex_bad1_obligation;
	}



	public String getEx_bad1_lasttime() {
		return ex_bad1_lasttime;
	}



	public void setEx_bad1_lasttime(String ex_bad1_lasttime) {
		this.ex_bad1_lasttime = ex_bad1_lasttime;
	}



	public String getEx_bad1_performance() {
		return ex_bad1_performance;
	}



	public void setEx_bad1_performance(String ex_bad1_performance) {
		this.ex_bad1_performance = ex_bad1_performance;
	}



	public String getEx_bad1_concretesituation() {
		return ex_bad1_concretesituation;
	}



	public void setEx_bad1_concretesituation(String ex_bad1_concretesituation) {
		this.ex_bad1_concretesituation = ex_bad1_concretesituation;
	}



	public String getEx_bad1_breaktime() {
		return ex_bad1_breaktime;
	}



	public void setEx_bad1_breaktime(String ex_bad1_breaktime) {
		this.ex_bad1_breaktime = ex_bad1_breaktime;
	}



	public String getEx_bad1_posttime() {
		return ex_bad1_posttime;
	}



	public void setEx_bad1_posttime(String ex_bad1_posttime) {
		this.ex_bad1_posttime = ex_bad1_posttime;
	}



	public String getEx_bad1_performedpart() {
		return ex_bad1_performedpart;
	}



	public void setEx_bad1_performedpart(String ex_bad1_performedpart) {
		this.ex_bad1_performedpart = ex_bad1_performedpart;
	}



	public String getEx_bad1_unperformpart() {
		return ex_bad1_unperformpart;
	}



	public void setEx_bad1_unperformpart(String ex_bad1_unperformpart) {
		this.ex_bad1_unperformpart = ex_bad1_unperformpart;
	}



	public String getEx_bad2_name() {
		return ex_bad2_name;
	}



	public void setEx_bad2_name(String ex_bad2_name) {
		this.ex_bad2_name = ex_bad2_name;
	}



	public String getEx_bad2_cid() {
		return ex_bad2_cid;
	}



	public void setEx_bad2_cid(String ex_bad2_cid) {
		this.ex_bad2_cid = ex_bad2_cid;
	}



	public String getEx_bad2_cidtype() {
		return ex_bad2_cidtype;
	}



	public void setEx_bad2_cidtype(String ex_bad2_cidtype) {
		this.ex_bad2_cidtype = ex_bad2_cidtype;
	}



	public String getEx_bad2_datatime() {
		return ex_bad2_datatime;
	}



	public void setEx_bad2_datatime(String ex_bad2_datatime) {
		this.ex_bad2_datatime = ex_bad2_datatime;
	}



	public String getEx_bad2_datatypeid() {
		return ex_bad2_datatypeid;
	}



	public void setEx_bad2_datatypeid(String ex_bad2_datatypeid) {
		this.ex_bad2_datatypeid = ex_bad2_datatypeid;
	}



	public String getEx_bad2_datatype() {
		return ex_bad2_datatype;
	}



	public void setEx_bad2_datatype(String ex_bad2_datatype) {
		this.ex_bad2_datatype = ex_bad2_datatype;
	}



	public String getEx_bad2_leader() {
		return ex_bad2_leader;
	}



	public void setEx_bad2_leader(String ex_bad2_leader) {
		this.ex_bad2_leader = ex_bad2_leader;
	}



	public String getEx_bad2_address() {
		return ex_bad2_address;
	}



	public void setEx_bad2_address(String ex_bad2_address) {
		this.ex_bad2_address = ex_bad2_address;
	}



	public String getEx_bad2_court() {
		return ex_bad2_court;
	}



	public void setEx_bad2_court(String ex_bad2_court) {
		this.ex_bad2_court = ex_bad2_court;
	}



	public String getEx_bad2_time() {
		return ex_bad2_time;
	}



	public void setEx_bad2_time(String ex_bad2_time) {
		this.ex_bad2_time = ex_bad2_time;
	}



	public String getEx_bad2_casenum() {
		return ex_bad2_casenum;
	}



	public void setEx_bad2_casenum(String ex_bad2_casenum) {
		this.ex_bad2_casenum = ex_bad2_casenum;
	}



	public String getEx_bad2_money() {
		return ex_bad2_money;
	}



	public void setEx_bad2_money(String ex_bad2_money) {
		this.ex_bad2_money = ex_bad2_money;
	}



	public String getEx_bad2_base() {
		return ex_bad2_base;
	}



	public void setEx_bad2_base(String ex_bad2_base) {
		this.ex_bad2_base = ex_bad2_base;
	}



	public String getEx_bad2_basecompany() {
		return ex_bad2_basecompany;
	}



	public void setEx_bad2_basecompany(String ex_bad2_basecompany) {
		this.ex_bad2_basecompany = ex_bad2_basecompany;
	}



	public String getEx_bad2_obligation() {
		return ex_bad2_obligation;
	}



	public void setEx_bad2_obligation(String ex_bad2_obligation) {
		this.ex_bad2_obligation = ex_bad2_obligation;
	}



	public String getEx_bad2_lasttime() {
		return ex_bad2_lasttime;
	}



	public void setEx_bad2_lasttime(String ex_bad2_lasttime) {
		this.ex_bad2_lasttime = ex_bad2_lasttime;
	}



	public String getEx_bad2_performance() {
		return ex_bad2_performance;
	}



	public void setEx_bad2_performance(String ex_bad2_performance) {
		this.ex_bad2_performance = ex_bad2_performance;
	}



	public String getEx_bad2_concretesituation() {
		return ex_bad2_concretesituation;
	}



	public void setEx_bad2_concretesituation(String ex_bad2_concretesituation) {
		this.ex_bad2_concretesituation = ex_bad2_concretesituation;
	}



	public String getEx_bad2_breaktime() {
		return ex_bad2_breaktime;
	}



	public void setEx_bad2_breaktime(String ex_bad2_breaktime) {
		this.ex_bad2_breaktime = ex_bad2_breaktime;
	}



	public String getEx_bad2_posttime() {
		return ex_bad2_posttime;
	}



	public void setEx_bad2_posttime(String ex_bad2_posttime) {
		this.ex_bad2_posttime = ex_bad2_posttime;
	}



	public String getEx_bad2_performedpart() {
		return ex_bad2_performedpart;
	}



	public void setEx_bad2_performedpart(String ex_bad2_performedpart) {
		this.ex_bad2_performedpart = ex_bad2_performedpart;
	}



	public String getEx_bad2_unperformpart() {
		return ex_bad2_unperformpart;
	}



	public void setEx_bad2_unperformpart(String ex_bad2_unperformpart) {
		this.ex_bad2_unperformpart = ex_bad2_unperformpart;
	}



	public String getEx_bad3_name() {
		return ex_bad3_name;
	}



	public void setEx_bad3_name(String ex_bad3_name) {
		this.ex_bad3_name = ex_bad3_name;
	}



	public String getEx_bad3_cid() {
		return ex_bad3_cid;
	}



	public void setEx_bad3_cid(String ex_bad3_cid) {
		this.ex_bad3_cid = ex_bad3_cid;
	}



	public String getEx_bad3_cidtype() {
		return ex_bad3_cidtype;
	}



	public void setEx_bad3_cidtype(String ex_bad3_cidtype) {
		this.ex_bad3_cidtype = ex_bad3_cidtype;
	}



	public String getEx_bad3_datatime() {
		return ex_bad3_datatime;
	}



	public void setEx_bad3_datatime(String ex_bad3_datatime) {
		this.ex_bad3_datatime = ex_bad3_datatime;
	}



	public String getEx_bad3_datatypeid() {
		return ex_bad3_datatypeid;
	}



	public void setEx_bad3_datatypeid(String ex_bad3_datatypeid) {
		this.ex_bad3_datatypeid = ex_bad3_datatypeid;
	}



	public String getEx_bad3_datatype() {
		return ex_bad3_datatype;
	}



	public void setEx_bad3_datatype(String ex_bad3_datatype) {
		this.ex_bad3_datatype = ex_bad3_datatype;
	}



	public String getEx_bad3_leader() {
		return ex_bad3_leader;
	}



	public void setEx_bad3_leader(String ex_bad3_leader) {
		this.ex_bad3_leader = ex_bad3_leader;
	}



	public String getEx_bad3_address() {
		return ex_bad3_address;
	}



	public void setEx_bad3_address(String ex_bad3_address) {
		this.ex_bad3_address = ex_bad3_address;
	}



	public String getEx_bad3_court() {
		return ex_bad3_court;
	}



	public void setEx_bad3_court(String ex_bad3_court) {
		this.ex_bad3_court = ex_bad3_court;
	}



	public String getEx_bad3_time() {
		return ex_bad3_time;
	}



	public void setEx_bad3_time(String ex_bad3_time) {
		this.ex_bad3_time = ex_bad3_time;
	}



	public String getEx_bad3_casenum() {
		return ex_bad3_casenum;
	}



	public void setEx_bad3_casenum(String ex_bad3_casenum) {
		this.ex_bad3_casenum = ex_bad3_casenum;
	}



	public String getEx_bad3_money() {
		return ex_bad3_money;
	}



	public void setEx_bad3_money(String ex_bad3_money) {
		this.ex_bad3_money = ex_bad3_money;
	}



	public String getEx_bad3_base() {
		return ex_bad3_base;
	}



	public void setEx_bad3_base(String ex_bad3_base) {
		this.ex_bad3_base = ex_bad3_base;
	}



	public String getEx_bad3_basecompany() {
		return ex_bad3_basecompany;
	}



	public void setEx_bad3_basecompany(String ex_bad3_basecompany) {
		this.ex_bad3_basecompany = ex_bad3_basecompany;
	}



	public String getEx_bad3_obligation() {
		return ex_bad3_obligation;
	}



	public void setEx_bad3_obligation(String ex_bad3_obligation) {
		this.ex_bad3_obligation = ex_bad3_obligation;
	}



	public String getEx_bad3_lasttime() {
		return ex_bad3_lasttime;
	}



	public void setEx_bad3_lasttime(String ex_bad3_lasttime) {
		this.ex_bad3_lasttime = ex_bad3_lasttime;
	}



	public String getEx_bad3_performance() {
		return ex_bad3_performance;
	}



	public void setEx_bad3_performance(String ex_bad3_performance) {
		this.ex_bad3_performance = ex_bad3_performance;
	}



	public String getEx_bad3_concretesituation() {
		return ex_bad3_concretesituation;
	}



	public void setEx_bad3_concretesituation(String ex_bad3_concretesituation) {
		this.ex_bad3_concretesituation = ex_bad3_concretesituation;
	}



	public String getEx_bad3_breaktime() {
		return ex_bad3_breaktime;
	}



	public void setEx_bad3_breaktime(String ex_bad3_breaktime) {
		this.ex_bad3_breaktime = ex_bad3_breaktime;
	}



	public String getEx_bad3_posttime() {
		return ex_bad3_posttime;
	}



	public void setEx_bad3_posttime(String ex_bad3_posttime) {
		this.ex_bad3_posttime = ex_bad3_posttime;
	}



	public String getEx_bad3_performedpart() {
		return ex_bad3_performedpart;
	}



	public void setEx_bad3_performedpart(String ex_bad3_performedpart) {
		this.ex_bad3_performedpart = ex_bad3_performedpart;
	}



	public String getEx_bad3_unperformpart() {
		return ex_bad3_unperformpart;
	}



	public void setEx_bad3_unperformpart(String ex_bad3_unperformpart) {
		this.ex_bad3_unperformpart = ex_bad3_unperformpart;
	}



	public String getEx_bad4_name() {
		return ex_bad4_name;
	}



	public void setEx_bad4_name(String ex_bad4_name) {
		this.ex_bad4_name = ex_bad4_name;
	}



	public String getEx_bad4_cid() {
		return ex_bad4_cid;
	}



	public void setEx_bad4_cid(String ex_bad4_cid) {
		this.ex_bad4_cid = ex_bad4_cid;
	}



	public String getEx_bad4_cidtype() {
		return ex_bad4_cidtype;
	}



	public void setEx_bad4_cidtype(String ex_bad4_cidtype) {
		this.ex_bad4_cidtype = ex_bad4_cidtype;
	}



	public String getEx_bad4_datatime() {
		return ex_bad4_datatime;
	}



	public void setEx_bad4_datatime(String ex_bad4_datatime) {
		this.ex_bad4_datatime = ex_bad4_datatime;
	}



	public String getEx_bad4_datatypeid() {
		return ex_bad4_datatypeid;
	}



	public void setEx_bad4_datatypeid(String ex_bad4_datatypeid) {
		this.ex_bad4_datatypeid = ex_bad4_datatypeid;
	}



	public String getEx_bad4_datatype() {
		return ex_bad4_datatype;
	}



	public void setEx_bad4_datatype(String ex_bad4_datatype) {
		this.ex_bad4_datatype = ex_bad4_datatype;
	}



	public String getEx_bad4_leader() {
		return ex_bad4_leader;
	}



	public void setEx_bad4_leader(String ex_bad4_leader) {
		this.ex_bad4_leader = ex_bad4_leader;
	}



	public String getEx_bad4_address() {
		return ex_bad4_address;
	}



	public void setEx_bad4_address(String ex_bad4_address) {
		this.ex_bad4_address = ex_bad4_address;
	}



	public String getEx_bad4_court() {
		return ex_bad4_court;
	}



	public void setEx_bad4_court(String ex_bad4_court) {
		this.ex_bad4_court = ex_bad4_court;
	}



	public String getEx_bad4_time() {
		return ex_bad4_time;
	}



	public void setEx_bad4_time(String ex_bad4_time) {
		this.ex_bad4_time = ex_bad4_time;
	}



	public String getEx_bad4_casenum() {
		return ex_bad4_casenum;
	}



	public void setEx_bad4_casenum(String ex_bad4_casenum) {
		this.ex_bad4_casenum = ex_bad4_casenum;
	}



	public String getEx_bad4_money() {
		return ex_bad4_money;
	}



	public void setEx_bad4_money(String ex_bad4_money) {
		this.ex_bad4_money = ex_bad4_money;
	}



	public String getEx_bad4_base() {
		return ex_bad4_base;
	}



	public void setEx_bad4_base(String ex_bad4_base) {
		this.ex_bad4_base = ex_bad4_base;
	}



	public String getEx_bad4_basecompany() {
		return ex_bad4_basecompany;
	}



	public void setEx_bad4_basecompany(String ex_bad4_basecompany) {
		this.ex_bad4_basecompany = ex_bad4_basecompany;
	}



	public String getEx_bad4_obligation() {
		return ex_bad4_obligation;
	}



	public void setEx_bad4_obligation(String ex_bad4_obligation) {
		this.ex_bad4_obligation = ex_bad4_obligation;
	}



	public String getEx_bad4_lasttime() {
		return ex_bad4_lasttime;
	}



	public void setEx_bad4_lasttime(String ex_bad4_lasttime) {
		this.ex_bad4_lasttime = ex_bad4_lasttime;
	}



	public String getEx_bad4_performance() {
		return ex_bad4_performance;
	}



	public void setEx_bad4_performance(String ex_bad4_performance) {
		this.ex_bad4_performance = ex_bad4_performance;
	}



	public String getEx_bad4_concretesituation() {
		return ex_bad4_concretesituation;
	}



	public void setEx_bad4_concretesituation(String ex_bad4_concretesituation) {
		this.ex_bad4_concretesituation = ex_bad4_concretesituation;
	}



	public String getEx_bad4_breaktime() {
		return ex_bad4_breaktime;
	}



	public void setEx_bad4_breaktime(String ex_bad4_breaktime) {
		this.ex_bad4_breaktime = ex_bad4_breaktime;
	}



	public String getEx_bad4_posttime() {
		return ex_bad4_posttime;
	}



	public void setEx_bad4_posttime(String ex_bad4_posttime) {
		this.ex_bad4_posttime = ex_bad4_posttime;
	}



	public String getEx_bad4_performedpart() {
		return ex_bad4_performedpart;
	}



	public void setEx_bad4_performedpart(String ex_bad4_performedpart) {
		this.ex_bad4_performedpart = ex_bad4_performedpart;
	}



	public String getEx_bad4_unperformpart() {
		return ex_bad4_unperformpart;
	}



	public void setEx_bad4_unperformpart(String ex_bad4_unperformpart) {
		this.ex_bad4_unperformpart = ex_bad4_unperformpart;
	}



	public String getEx_bad5_name() {
		return ex_bad5_name;
	}



	public void setEx_bad5_name(String ex_bad5_name) {
		this.ex_bad5_name = ex_bad5_name;
	}



	public String getEx_bad5_cid() {
		return ex_bad5_cid;
	}



	public void setEx_bad5_cid(String ex_bad5_cid) {
		this.ex_bad5_cid = ex_bad5_cid;
	}



	public String getEx_bad5_cidtype() {
		return ex_bad5_cidtype;
	}



	public void setEx_bad5_cidtype(String ex_bad5_cidtype) {
		this.ex_bad5_cidtype = ex_bad5_cidtype;
	}



	public String getEx_bad5_datatime() {
		return ex_bad5_datatime;
	}



	public void setEx_bad5_datatime(String ex_bad5_datatime) {
		this.ex_bad5_datatime = ex_bad5_datatime;
	}



	public String getEx_bad5_datatypeid() {
		return ex_bad5_datatypeid;
	}



	public void setEx_bad5_datatypeid(String ex_bad5_datatypeid) {
		this.ex_bad5_datatypeid = ex_bad5_datatypeid;
	}



	public String getEx_bad5_datatype() {
		return ex_bad5_datatype;
	}



	public void setEx_bad5_datatype(String ex_bad5_datatype) {
		this.ex_bad5_datatype = ex_bad5_datatype;
	}



	public String getEx_bad5_leader() {
		return ex_bad5_leader;
	}



	public void setEx_bad5_leader(String ex_bad5_leader) {
		this.ex_bad5_leader = ex_bad5_leader;
	}



	public String getEx_bad5_address() {
		return ex_bad5_address;
	}



	public void setEx_bad5_address(String ex_bad5_address) {
		this.ex_bad5_address = ex_bad5_address;
	}



	public String getEx_bad5_court() {
		return ex_bad5_court;
	}



	public void setEx_bad5_court(String ex_bad5_court) {
		this.ex_bad5_court = ex_bad5_court;
	}



	public String getEx_bad5_time() {
		return ex_bad5_time;
	}



	public void setEx_bad5_time(String ex_bad5_time) {
		this.ex_bad5_time = ex_bad5_time;
	}



	public String getEx_bad5_casenum() {
		return ex_bad5_casenum;
	}



	public void setEx_bad5_casenum(String ex_bad5_casenum) {
		this.ex_bad5_casenum = ex_bad5_casenum;
	}



	public String getEx_bad5_money() {
		return ex_bad5_money;
	}



	public void setEx_bad5_money(String ex_bad5_money) {
		this.ex_bad5_money = ex_bad5_money;
	}



	public String getEx_bad5_base() {
		return ex_bad5_base;
	}



	public void setEx_bad5_base(String ex_bad5_base) {
		this.ex_bad5_base = ex_bad5_base;
	}



	public String getEx_bad5_basecompany() {
		return ex_bad5_basecompany;
	}



	public void setEx_bad5_basecompany(String ex_bad5_basecompany) {
		this.ex_bad5_basecompany = ex_bad5_basecompany;
	}



	public String getEx_bad5_obligation() {
		return ex_bad5_obligation;
	}



	public void setEx_bad5_obligation(String ex_bad5_obligation) {
		this.ex_bad5_obligation = ex_bad5_obligation;
	}



	public String getEx_bad5_lasttime() {
		return ex_bad5_lasttime;
	}



	public void setEx_bad5_lasttime(String ex_bad5_lasttime) {
		this.ex_bad5_lasttime = ex_bad5_lasttime;
	}



	public String getEx_bad5_performance() {
		return ex_bad5_performance;
	}



	public void setEx_bad5_performance(String ex_bad5_performance) {
		this.ex_bad5_performance = ex_bad5_performance;
	}



	public String getEx_bad5_concretesituation() {
		return ex_bad5_concretesituation;
	}



	public void setEx_bad5_concretesituation(String ex_bad5_concretesituation) {
		this.ex_bad5_concretesituation = ex_bad5_concretesituation;
	}



	public String getEx_bad5_breaktime() {
		return ex_bad5_breaktime;
	}



	public void setEx_bad5_breaktime(String ex_bad5_breaktime) {
		this.ex_bad5_breaktime = ex_bad5_breaktime;
	}



	public String getEx_bad5_posttime() {
		return ex_bad5_posttime;
	}



	public void setEx_bad5_posttime(String ex_bad5_posttime) {
		this.ex_bad5_posttime = ex_bad5_posttime;
	}



	public String getEx_bad5_performedpart() {
		return ex_bad5_performedpart;
	}



	public void setEx_bad5_performedpart(String ex_bad5_performedpart) {
		this.ex_bad5_performedpart = ex_bad5_performedpart;
	}



	public String getEx_bad5_unperformpart() {
		return ex_bad5_unperformpart;
	}



	public void setEx_bad5_unperformpart(String ex_bad5_unperformpart) {
		this.ex_bad5_unperformpart = ex_bad5_unperformpart;
	}



	public String getEx_execut1_name() {
		return ex_execut1_name;
	}



	public void setEx_execut1_name(String ex_execut1_name) {
		this.ex_execut1_name = ex_execut1_name;
	}



	public String getEx_execut1_cid() {
		return ex_execut1_cid;
	}



	public void setEx_execut1_cid(String ex_execut1_cid) {
		this.ex_execut1_cid = ex_execut1_cid;
	}



	public String getEx_execut1_cidtype() {
		return ex_execut1_cidtype;
	}



	public void setEx_execut1_cidtype(String ex_execut1_cidtype) {
		this.ex_execut1_cidtype = ex_execut1_cidtype;
	}



	public String getEx_execut1_datatime() {
		return ex_execut1_datatime;
	}



	public void setEx_execut1_datatime(String ex_execut1_datatime) {
		this.ex_execut1_datatime = ex_execut1_datatime;
	}



	public String getEx_execut1_datatypeid() {
		return ex_execut1_datatypeid;
	}



	public void setEx_execut1_datatypeid(String ex_execut1_datatypeid) {
		this.ex_execut1_datatypeid = ex_execut1_datatypeid;
	}



	public String getEx_execut1_datatype() {
		return ex_execut1_datatype;
	}



	public void setEx_execut1_datatype(String ex_execut1_datatype) {
		this.ex_execut1_datatype = ex_execut1_datatype;
	}



	public String getEx_execut1_court() {
		return ex_execut1_court;
	}



	public void setEx_execut1_court(String ex_execut1_court) {
		this.ex_execut1_court = ex_execut1_court;
	}



	public String getEx_execut1_time() {
		return ex_execut1_time;
	}



	public void setEx_execut1_time(String ex_execut1_time) {
		this.ex_execut1_time = ex_execut1_time;
	}



	public String getEx_execut1_casenum() {
		return ex_execut1_casenum;
	}



	public void setEx_execut1_casenum(String ex_execut1_casenum) {
		this.ex_execut1_casenum = ex_execut1_casenum;
	}



	public String getEx_execut1_money() {
		return ex_execut1_money;
	}



	public void setEx_execut1_money(String ex_execut1_money) {
		this.ex_execut1_money = ex_execut1_money;
	}



	public String getEx_execut1_statute() {
		return ex_execut1_statute;
	}



	public void setEx_execut1_statute(String ex_execut1_statute) {
		this.ex_execut1_statute = ex_execut1_statute;
	}



	public String getEx_execut1_basic() {
		return ex_execut1_basic;
	}



	public void setEx_execut1_basic(String ex_execut1_basic) {
		this.ex_execut1_basic = ex_execut1_basic;
	}



	public String getEx_execut1_basiccourt() {
		return ex_execut1_basiccourt;
	}



	public void setEx_execut1_basiccourt(String ex_execut1_basiccourt) {
		this.ex_execut1_basiccourt = ex_execut1_basiccourt;
	}



	public String getEx_execut2_name() {
		return ex_execut2_name;
	}



	public void setEx_execut2_name(String ex_execut2_name) {
		this.ex_execut2_name = ex_execut2_name;
	}



	public String getEx_execut2_cid() {
		return ex_execut2_cid;
	}



	public void setEx_execut2_cid(String ex_execut2_cid) {
		this.ex_execut2_cid = ex_execut2_cid;
	}



	public String getEx_execut2_cidtype() {
		return ex_execut2_cidtype;
	}



	public void setEx_execut2_cidtype(String ex_execut2_cidtype) {
		this.ex_execut2_cidtype = ex_execut2_cidtype;
	}



	public String getEx_execut2_datatime() {
		return ex_execut2_datatime;
	}



	public void setEx_execut2_datatime(String ex_execut2_datatime) {
		this.ex_execut2_datatime = ex_execut2_datatime;
	}



	public String getEx_execut2_datatypeid() {
		return ex_execut2_datatypeid;
	}



	public void setEx_execut2_datatypeid(String ex_execut2_datatypeid) {
		this.ex_execut2_datatypeid = ex_execut2_datatypeid;
	}



	public String getEx_execut2_datatype() {
		return ex_execut2_datatype;
	}



	public void setEx_execut2_datatype(String ex_execut2_datatype) {
		this.ex_execut2_datatype = ex_execut2_datatype;
	}



	public String getEx_execut2_court() {
		return ex_execut2_court;
	}



	public void setEx_execut2_court(String ex_execut2_court) {
		this.ex_execut2_court = ex_execut2_court;
	}



	public String getEx_execut2_time() {
		return ex_execut2_time;
	}



	public void setEx_execut2_time(String ex_execut2_time) {
		this.ex_execut2_time = ex_execut2_time;
	}



	public String getEx_execut2_casenum() {
		return ex_execut2_casenum;
	}



	public void setEx_execut2_casenum(String ex_execut2_casenum) {
		this.ex_execut2_casenum = ex_execut2_casenum;
	}



	public String getEx_execut2_money() {
		return ex_execut2_money;
	}



	public void setEx_execut2_money(String ex_execut2_money) {
		this.ex_execut2_money = ex_execut2_money;
	}



	public String getEx_execut2_statute() {
		return ex_execut2_statute;
	}



	public void setEx_execut2_statute(String ex_execut2_statute) {
		this.ex_execut2_statute = ex_execut2_statute;
	}



	public String getEx_execut2_basic() {
		return ex_execut2_basic;
	}



	public void setEx_execut2_basic(String ex_execut2_basic) {
		this.ex_execut2_basic = ex_execut2_basic;
	}



	public String getEx_execut2_basiccourt() {
		return ex_execut2_basiccourt;
	}



	public void setEx_execut2_basiccourt(String ex_execut2_basiccourt) {
		this.ex_execut2_basiccourt = ex_execut2_basiccourt;
	}



	public String getEx_execut3_name() {
		return ex_execut3_name;
	}



	public void setEx_execut3_name(String ex_execut3_name) {
		this.ex_execut3_name = ex_execut3_name;
	}



	public String getEx_execut3_cid() {
		return ex_execut3_cid;
	}



	public void setEx_execut3_cid(String ex_execut3_cid) {
		this.ex_execut3_cid = ex_execut3_cid;
	}



	public String getEx_execut3_cidtype() {
		return ex_execut3_cidtype;
	}



	public void setEx_execut3_cidtype(String ex_execut3_cidtype) {
		this.ex_execut3_cidtype = ex_execut3_cidtype;
	}



	public String getEx_execut3_datatime() {
		return ex_execut3_datatime;
	}



	public void setEx_execut3_datatime(String ex_execut3_datatime) {
		this.ex_execut3_datatime = ex_execut3_datatime;
	}



	public String getEx_execut3_datatypeid() {
		return ex_execut3_datatypeid;
	}



	public void setEx_execut3_datatypeid(String ex_execut3_datatypeid) {
		this.ex_execut3_datatypeid = ex_execut3_datatypeid;
	}



	public String getEx_execut3_datatype() {
		return ex_execut3_datatype;
	}



	public void setEx_execut3_datatype(String ex_execut3_datatype) {
		this.ex_execut3_datatype = ex_execut3_datatype;
	}



	public String getEx_execut3_court() {
		return ex_execut3_court;
	}



	public void setEx_execut3_court(String ex_execut3_court) {
		this.ex_execut3_court = ex_execut3_court;
	}



	public String getEx_execut3_time() {
		return ex_execut3_time;
	}



	public void setEx_execut3_time(String ex_execut3_time) {
		this.ex_execut3_time = ex_execut3_time;
	}



	public String getEx_execut3_casenum() {
		return ex_execut3_casenum;
	}



	public void setEx_execut3_casenum(String ex_execut3_casenum) {
		this.ex_execut3_casenum = ex_execut3_casenum;
	}



	public String getEx_execut3_money() {
		return ex_execut3_money;
	}



	public void setEx_execut3_money(String ex_execut3_money) {
		this.ex_execut3_money = ex_execut3_money;
	}



	public String getEx_execut3_statute() {
		return ex_execut3_statute;
	}



	public void setEx_execut3_statute(String ex_execut3_statute) {
		this.ex_execut3_statute = ex_execut3_statute;
	}



	public String getEx_execut3_basic() {
		return ex_execut3_basic;
	}



	public void setEx_execut3_basic(String ex_execut3_basic) {
		this.ex_execut3_basic = ex_execut3_basic;
	}



	public String getEx_execut3_basiccourt() {
		return ex_execut3_basiccourt;
	}



	public void setEx_execut3_basiccourt(String ex_execut3_basiccourt) {
		this.ex_execut3_basiccourt = ex_execut3_basiccourt;
	}



	public String getEx_execut4_name() {
		return ex_execut4_name;
	}



	public void setEx_execut4_name(String ex_execut4_name) {
		this.ex_execut4_name = ex_execut4_name;
	}



	public String getEx_execut4_cid() {
		return ex_execut4_cid;
	}



	public void setEx_execut4_cid(String ex_execut4_cid) {
		this.ex_execut4_cid = ex_execut4_cid;
	}



	public String getEx_execut4_cidtype() {
		return ex_execut4_cidtype;
	}



	public void setEx_execut4_cidtype(String ex_execut4_cidtype) {
		this.ex_execut4_cidtype = ex_execut4_cidtype;
	}



	public String getEx_execut4_datatime() {
		return ex_execut4_datatime;
	}



	public void setEx_execut4_datatime(String ex_execut4_datatime) {
		this.ex_execut4_datatime = ex_execut4_datatime;
	}



	public String getEx_execut4_datatypeid() {
		return ex_execut4_datatypeid;
	}



	public void setEx_execut4_datatypeid(String ex_execut4_datatypeid) {
		this.ex_execut4_datatypeid = ex_execut4_datatypeid;
	}



	public String getEx_execut4_datatype() {
		return ex_execut4_datatype;
	}



	public void setEx_execut4_datatype(String ex_execut4_datatype) {
		this.ex_execut4_datatype = ex_execut4_datatype;
	}



	public String getEx_execut4_court() {
		return ex_execut4_court;
	}



	public void setEx_execut4_court(String ex_execut4_court) {
		this.ex_execut4_court = ex_execut4_court;
	}



	public String getEx_execut4_time() {
		return ex_execut4_time;
	}



	public void setEx_execut4_time(String ex_execut4_time) {
		this.ex_execut4_time = ex_execut4_time;
	}



	public String getEx_execut4_casenum() {
		return ex_execut4_casenum;
	}



	public void setEx_execut4_casenum(String ex_execut4_casenum) {
		this.ex_execut4_casenum = ex_execut4_casenum;
	}



	public String getEx_execut4_money() {
		return ex_execut4_money;
	}



	public void setEx_execut4_money(String ex_execut4_money) {
		this.ex_execut4_money = ex_execut4_money;
	}



	public String getEx_execut4_statute() {
		return ex_execut4_statute;
	}



	public void setEx_execut4_statute(String ex_execut4_statute) {
		this.ex_execut4_statute = ex_execut4_statute;
	}



	public String getEx_execut4_basic() {
		return ex_execut4_basic;
	}



	public void setEx_execut4_basic(String ex_execut4_basic) {
		this.ex_execut4_basic = ex_execut4_basic;
	}



	public String getEx_execut4_basiccourt() {
		return ex_execut4_basiccourt;
	}



	public void setEx_execut4_basiccourt(String ex_execut4_basiccourt) {
		this.ex_execut4_basiccourt = ex_execut4_basiccourt;
	}



	public String getEx_execut5_name() {
		return ex_execut5_name;
	}



	public void setEx_execut5_name(String ex_execut5_name) {
		this.ex_execut5_name = ex_execut5_name;
	}



	public String getEx_execut5_cid() {
		return ex_execut5_cid;
	}



	public void setEx_execut5_cid(String ex_execut5_cid) {
		this.ex_execut5_cid = ex_execut5_cid;
	}



	public String getEx_execut5_cidtype() {
		return ex_execut5_cidtype;
	}



	public void setEx_execut5_cidtype(String ex_execut5_cidtype) {
		this.ex_execut5_cidtype = ex_execut5_cidtype;
	}



	public String getEx_execut5_datatime() {
		return ex_execut5_datatime;
	}



	public void setEx_execut5_datatime(String ex_execut5_datatime) {
		this.ex_execut5_datatime = ex_execut5_datatime;
	}



	public String getEx_execut5_datatypeid() {
		return ex_execut5_datatypeid;
	}



	public void setEx_execut5_datatypeid(String ex_execut5_datatypeid) {
		this.ex_execut5_datatypeid = ex_execut5_datatypeid;
	}



	public String getEx_execut5_datatype() {
		return ex_execut5_datatype;
	}



	public void setEx_execut5_datatype(String ex_execut5_datatype) {
		this.ex_execut5_datatype = ex_execut5_datatype;
	}



	public String getEx_execut5_court() {
		return ex_execut5_court;
	}



	public void setEx_execut5_court(String ex_execut5_court) {
		this.ex_execut5_court = ex_execut5_court;
	}



	public String getEx_execut5_time() {
		return ex_execut5_time;
	}



	public void setEx_execut5_time(String ex_execut5_time) {
		this.ex_execut5_time = ex_execut5_time;
	}



	public String getEx_execut5_casenum() {
		return ex_execut5_casenum;
	}



	public void setEx_execut5_casenum(String ex_execut5_casenum) {
		this.ex_execut5_casenum = ex_execut5_casenum;
	}



	public String getEx_execut5_money() {
		return ex_execut5_money;
	}



	public void setEx_execut5_money(String ex_execut5_money) {
		this.ex_execut5_money = ex_execut5_money;
	}



	public String getEx_execut5_statute() {
		return ex_execut5_statute;
	}



	public void setEx_execut5_statute(String ex_execut5_statute) {
		this.ex_execut5_statute = ex_execut5_statute;
	}



	public String getEx_execut5_basic() {
		return ex_execut5_basic;
	}



	public void setEx_execut5_basic(String ex_execut5_basic) {
		this.ex_execut5_basic = ex_execut5_basic;
	}



	public String getEx_execut5_basiccourt() {
		return ex_execut5_basiccourt;
	}



	public void setEx_execut5_basiccourt(String ex_execut5_basiccourt) {
		this.ex_execut5_basiccourt = ex_execut5_basiccourt;
	}



	@Override
    public String toString() {
        String[] others = new String[] {};
        return ReflectionToStringBuilder.toStringExclude(this, others);
    }
}
