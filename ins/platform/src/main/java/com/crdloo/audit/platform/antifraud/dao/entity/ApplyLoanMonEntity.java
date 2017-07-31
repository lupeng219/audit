package com.crdloo.audit.platform.antifraud.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;
@Entity
@Table(name = "bfd_applyLoanMon")
public class ApplyLoanMonEntity extends BaseEntity{
	private static final long serialVersionUID = -7299598291879140491L;
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="swift_number",length=50)
	private String swift_number;//流水号
    
	@Column(name = "flag_applyloanmon", length = 10)
	private Integer flag_applyloanmon=10;// 计费标识:1计费，0不计费
	
	private String alm_d7_id_bank_selfnum = "";
	private String alm_d7_id_bank_allnum = "";
	private String alm_d7_id_bank_orgnum = "";
	private String alm_d7_id_nbank_selfnum = "";
	private String alm_d7_id_nbank_allnum = "";
	private String alm_d7_id_nbank_p2p_allnum = "";
	private String alm_d7_id_nbank_mc_allnum = "";
	private String alm_d7_id_nbank_ca_allnum = "";
	private String alm_d7_id_nbank_cf_allnum = "";
	private String alm_d7_id_nbank_com_allnum = "";
	private String alm_d7_id_nbank_oth_allnum = "";
	private String alm_d7_id_nbank_orgnum = "";
	private String alm_d7_id_nbank_p2p_orgnum = "";
	private String alm_d7_id_nbank_mc_orgnum = "";
	private String alm_d7_id_nbank_ca_orgnum = "";
	private String alm_d7_id_nbank_cf_orgnum = "";
	private String alm_d7_id_nbank_com_orgnum = "";
	private String alm_d7_id_nbank_oth_orgnum = "";
	private String alm_d7_cell_bank_selfnum = "";
	private String alm_d7_cell_bank_allnum = "";
	private String alm_d7_cell_bank_orgnum = "";
	private String alm_d7_cell_nbank_selfnum = "";
	private String alm_d7_cell_nbank_allnum = "";
	private String alm_d7_cell_nbank_p2p_allnum = "";
	private String alm_d7_cell_nbank_mc_allnum = "";
	private String alm_d7_cell_nbank_ca_allnum = "";
	private String alm_d7_cell_nbank_cf_allnum = "";
	private String alm_d7_cell_nbank_com_allnum = "";
	private String alm_d7_cell_nbank_oth_allnum = "";
	private String alm_d7_cell_nbank_orgnum = "";
	private String alm_d7_cell_nbank_p2p_orgnum = "";
	private String alm_d7_cell_nbank_mc_orgnum = "";
	private String alm_d7_cell_nbank_ca_orgnum = "";
	private String alm_d7_cell_nbank_cf_orgnum = "";
	private String alm_d7_cell_nbank_com_orgnum = "";
	private String alm_d7_cell_nbank_oth_orgnum = "";
	private String alm_d7_lm_cell_bank_selfnum = "";
	private String alm_d7_lm_cell_bank_allnum = "";
	private String alm_d7_lm_cell_bank_orgnum = "";
	private String alm_d7_lm_cell_nbank_selfnum = "";
	private String alm_d7_lm_cell_nbank_allnum = "";
	private String alm_d7_lm_cell_nbank_p2p_allnum = "";
	private String alm_d7_lm_cell_nbank_mc_allnum = "";
	private String alm_d7_lm_cell_nbank_ca_allnum = "";
	private String alm_d7_lm_cell_nbank_cf_allnum = "";
	private String alm_d7_lm_cell_nbank_com_allnum = "";
	private String alm_d7_lm_cell_nbank_oth_allnum = "";
	private String alm_d7_lm_cell_nbank_orgnum = "";
	private String alm_d7_lm_cell_nbank_p2p_orgnum = "";
	private String alm_d7_lm_cell_nbank_mc_orgnum = "";
	private String alm_d7_lm_cell_nbank_ca_orgnum = "";
	private String alm_d7_lm_cell_nbank_cf_orgnum = "";
	private String alm_d7_lm_cell_nbank_com_orgnum = "";
	private String alm_d7_lm_cell_nbank_oth_orgnum = "";
	private String alm_d15_id_bank_selfnum = "";
	private String alm_d15_id_bank_allnum = "";
	private String alm_d15_id_bank_orgnum = "";
	private String alm_d15_id_nbank_selfnum = "";
	private String alm_d15_id_nbank_allnum = "";
	private String alm_d15_id_nbank_p2p_allnum = "";
	private String alm_d15_id_nbank_mc_allnum = "";
	private String alm_d15_id_nbank_ca_allnum = "";
	private String alm_d15_id_nbank_cf_allnum = "";
	private String alm_d15_id_nbank_com_allnum = "";
	private String alm_d15_id_nbank_oth_allnum = "";
	private String alm_d15_id_nbank_orgnum = "";
	private String alm_d15_id_nbank_p2p_orgnum = "";
	private String alm_d15_id_nbank_mc_orgnum = "";
	private String alm_d15_id_nbank_ca_orgnum = "";
	private String alm_d15_id_nbank_cf_orgnum = "";
	private String alm_d15_id_nbank_com_orgnum = "";
	private String alm_d15_id_nbank_oth_orgnum = "";
	private String alm_d15_cell_bank_selfnum = "";
	private String alm_d15_cell_bank_allnum = "";
	private String alm_d15_cell_bank_orgnum = "";
	private String alm_d15_cell_nbank_selfnum = "";
	private String alm_d15_cell_nbank_allnum = "";
	private String alm_d15_cell_nbank_p2p_allnum = "";
	private String alm_d15_cell_nbank_mc_allnum = "";
	private String alm_d15_cell_nbank_ca_allnum = "";
	private String alm_d15_cell_nbank_cf_allnum = "";
	private String alm_d15_cell_nbank_com_allnum = "";
	private String alm_d15_cell_nbank_oth_allnum = "";
	private String alm_d15_cell_nbank_orgnum = "";
	private String alm_d15_cell_nbank_p2p_orgnum = "";
	private String alm_d15_cell_nbank_mc_orgnum = "";
	private String alm_d15_cell_nbank_ca_orgnum = "";
	private String alm_d15_cell_nbank_cf_orgnum = "";
	private String alm_d15_cell_nbank_com_orgnum = "";
	private String alm_d15_cell_nbank_oth_orgnum = "";
	private String alm_d15_lm_cell_bank_selfnum = "";
	private String alm_d15_lm_cell_bank_allnum = "";
	private String alm_d15_lm_cell_bank_orgnum = "";
	private String alm_d15_lm_cell_nbank_selfnum = "";
	private String alm_d15_lm_cell_nbank_allnum = "";
	private String alm_d15_lm_cell_nbank_p2p_allnum = "";
	private String alm_d15_lm_cell_nbank_mc_allnum = "";
	private String alm_d15_lm_cell_nbank_ca_allnum = "";
	private String alm_d15_lm_cell_nbank_cf_allnum = "";
	private String alm_d15_lm_cell_nbank_com_allnum = "";
	private String alm_d15_lm_cell_nbank_oth_allnum = "";
	private String alm_d15_lm_cell_nbank_orgnum = "";
	private String alm_d15_lm_cell_nbank_p2p_orgnum = "";
	private String alm_d15_lm_cell_nbank_mc_orgnum = "";
	private String alm_d15_lm_cell_nbank_ca_orgnum = "";
	private String alm_d15_lm_cell_nbank_cf_orgnum = "";
	private String alm_d15_lm_cell_nbank_com_orgnum = "";
	private String alm_d15_lm_cell_nbank_oth_orgnum = "";
	private String alm_m1_id_bank_selfnum = "";
	private String alm_m1_id_bank_allnum = "";
	private String alm_m1_id_bank_orgnum = "";
	private String alm_m1_id_nbank_selfnum = "";
	private String alm_m1_id_nbank_allnum = "";
	private String alm_m1_id_nbank_p2p_allnum = "";
	private String alm_m1_id_nbank_mc_allnum = "";
	private String alm_m1_id_nbank_ca_allnum = "";
	private String alm_m1_id_nbank_cf_allnum = "";
	private String alm_m1_id_nbank_com_allnum = "";
	private String alm_m1_id_nbank_oth_allnum = "";
	private String alm_m1_id_nbank_orgnum = "";
	private String alm_m1_id_nbank_p2p_orgnum = "";
	private String alm_m1_id_nbank_mc_orgnum = "";
	private String alm_m1_id_nbank_ca_orgnum = "";
	private String alm_m1_id_nbank_cf_orgnum = "";
	private String alm_m1_id_nbank_com_orgnum = "";
	private String alm_m1_id_nbank_oth_orgnum = "";
	private String alm_m1_cell_bank_selfnum = "";
	private String alm_m1_cell_bank_allnum = "";
	private String alm_m1_cell_bank_orgnum = "";
	private String alm_m1_cell_nbank_selfnum = "";
	private String alm_m1_cell_nbank_allnum = "";
	private String alm_m1_cell_nbank_p2p_allnum = "";
	private String alm_m1_cell_nbank_mc_allnum = "";
	private String alm_m1_cell_nbank_ca_allnum = "";
	private String alm_m1_cell_nbank_cf_allnum = "";
	private String alm_m1_cell_nbank_com_allnum = "";
	private String alm_m1_cell_nbank_oth_allnum = "";
	private String alm_m1_cell_nbank_orgnum = "";
	private String alm_m1_cell_nbank_p2p_orgnum = "";
	private String alm_m1_cell_nbank_mc_orgnum = "";
	private String alm_m1_cell_nbank_ca_orgnum = "";
	private String alm_m1_cell_nbank_cf_orgnum = "";
	private String alm_m1_cell_nbank_com_orgnum = "";
	private String alm_m1_cell_nbank_oth_orgnum = "";
	private String alm_m1_lm_cell_bank_selfnum = "";
	private String alm_m1_lm_cell_bank_allnum = "";
	private String alm_m1_lm_cell_bank_orgnum = "";
	private String alm_m1_lm_cell_nbank_selfnum = "";
	private String alm_m1_lm_cell_nbank_allnum = "";
	private String alm_m1_lm_cell_nbank_p2p_allnum = "";
	private String alm_m1_lm_cell_nbank_mc_allnum = "";
	private String alm_m1_lm_cell_nbank_ca_allnum = "";
	private String alm_m1_lm_cell_nbank_cf_allnum = "";
	private String alm_m1_lm_cell_nbank_com_allnum = "";
	private String alm_m1_lm_cell_nbank_oth_allnum = "";
	private String alm_m1_lm_cell_nbank_orgnum = "";
	private String alm_m1_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m1_lm_cell_nbank_mc_orgnum = "";
	private String alm_m1_lm_cell_nbank_ca_orgnum = "";
	private String alm_m1_lm_cell_nbank_cf_orgnum = "";
	private String alm_m1_lm_cell_nbank_com_orgnum = "";
	private String alm_m1_lm_cell_nbank_oth_orgnum = "";
	private String alm_m2_id_bank_selfnum = "";
	private String alm_m2_id_bank_allnum = "";
	private String alm_m2_id_bank_orgnum = "";
	private String alm_m2_id_nbank_selfnum = "";
	private String alm_m2_id_nbank_allnum = "";
	private String alm_m2_id_nbank_p2p_allnum = "";
	private String alm_m2_id_nbank_mc_allnum = "";
	private String alm_m2_id_nbank_ca_allnum = "";
	private String alm_m2_id_nbank_cf_allnum = "";
	private String alm_m2_id_nbank_com_allnum = "";
	private String alm_m2_id_nbank_oth_allnum = "";
	private String alm_m2_id_nbank_orgnum = "";
	private String alm_m2_id_nbank_p2p_orgnum = "";
	private String alm_m2_id_nbank_mc_orgnum = "";
	private String alm_m2_id_nbank_ca_orgnum = "";
	private String alm_m2_id_nbank_cf_orgnum = "";
	private String alm_m2_id_nbank_com_orgnum = "";
	private String alm_m2_id_nbank_oth_orgnum = "";
	private String alm_m2_cell_bank_selfnum = "";
	private String alm_m2_cell_bank_allnum = "";
	private String alm_m2_cell_bank_orgnum = "";
	private String alm_m2_cell_nbank_selfnum = "";
	private String alm_m2_cell_nbank_allnum = "";
	private String alm_m2_cell_nbank_p2p_allnum = "";
	private String alm_m2_cell_nbank_mc_allnum = "";
	private String alm_m2_cell_nbank_ca_allnum = "";
	private String alm_m2_cell_nbank_cf_allnum = "";
	private String alm_m2_cell_nbank_com_allnum = "";
	private String alm_m2_cell_nbank_oth_allnum = "";
	private String alm_m2_cell_nbank_orgnum = "";
	private String alm_m2_cell_nbank_p2p_orgnum = "";
	private String alm_m2_cell_nbank_mc_orgnum = "";
	private String alm_m2_cell_nbank_ca_orgnum = "";
	private String alm_m2_cell_nbank_cf_orgnum = "";
	private String alm_m2_cell_nbank_com_orgnum = "";
	private String alm_m2_cell_nbank_oth_orgnum = "";
	private String alm_m2_lm_cell_bank_selfnum = "";
	private String alm_m2_lm_cell_bank_allnum = "";
	private String alm_m2_lm_cell_bank_orgnum = "";
	private String alm_m2_lm_cell_nbank_selfnum = "";
	private String alm_m2_lm_cell_nbank_allnum = "";
	private String alm_m2_lm_cell_nbank_p2p_allnum = "";
	private String alm_m2_lm_cell_nbank_mc_allnum = "";
	private String alm_m2_lm_cell_nbank_ca_allnum = "";
	private String alm_m2_lm_cell_nbank_cf_allnum = "";
	private String alm_m2_lm_cell_nbank_com_allnum = "";
	private String alm_m2_lm_cell_nbank_oth_allnum = "";
	private String alm_m2_lm_cell_nbank_orgnum = "";
	private String alm_m2_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m2_lm_cell_nbank_mc_orgnum = "";
	private String alm_m2_lm_cell_nbank_ca_orgnum = "";
	private String alm_m2_lm_cell_nbank_cf_orgnum = "";
	private String alm_m2_lm_cell_nbank_com_orgnum = "";
	private String alm_m2_lm_cell_nbank_oth_orgnum = "";
	private String alm_m3_id_bank_selfnum = "";
	private String alm_m3_id_bank_allnum = "";
	private String alm_m3_id_bank_orgnum = "";
	private String alm_m3_id_nbank_selfnum = "";
	private String alm_m3_id_nbank_allnum = "";
	private String alm_m3_id_nbank_p2p_allnum = "";
	private String alm_m3_id_nbank_mc_allnum = "";
	private String alm_m3_id_nbank_ca_allnum = "";
	private String alm_m3_id_nbank_cf_allnum = "";
	private String alm_m3_id_nbank_com_allnum = "";
	private String alm_m3_id_nbank_oth_allnum = "";
	private String alm_m3_id_nbank_orgnum = "";
	private String alm_m3_id_nbank_p2p_orgnum = "";
	private String alm_m3_id_nbank_mc_orgnum = "";
	private String alm_m3_id_nbank_ca_orgnum = "";
	private String alm_m3_id_nbank_cf_orgnum = "";
	private String alm_m3_id_nbank_com_orgnum = "";
	private String alm_m3_id_nbank_oth_orgnum = "";
	private String alm_m3_cell_bank_selfnum = "";
	private String alm_m3_cell_bank_allnum = "";
	private String alm_m3_cell_bank_orgnum = "";
	private String alm_m3_cell_nbank_selfnum = "";
	private String alm_m3_cell_nbank_allnum = "";
	private String alm_m3_cell_nbank_p2p_allnum = "";
	private String alm_m3_cell_nbank_mc_allnum = "";
	private String alm_m3_cell_nbank_ca_allnum = "";
	private String alm_m3_cell_nbank_cf_allnum = "";
	private String alm_m3_cell_nbank_com_allnum = "";
	private String alm_m3_cell_nbank_oth_allnum = "";
	private String alm_m3_cell_nbank_orgnum = "";
	private String alm_m3_cell_nbank_p2p_orgnum = "";
	private String alm_m3_cell_nbank_mc_orgnum = "";
	private String alm_m3_cell_nbank_ca_orgnum = "";
	private String alm_m3_cell_nbank_cf_orgnum = "";
	private String alm_m3_cell_nbank_com_orgnum = "";
	private String alm_m3_cell_nbank_oth_orgnum = "";
	private String alm_m3_lm_cell_bank_selfnum = "";
	private String alm_m3_lm_cell_bank_allnum = "";
	private String alm_m3_lm_cell_bank_orgnum = "";
	private String alm_m3_lm_cell_nbank_selfnum = "";
	private String alm_m3_lm_cell_nbank_allnum = "";
	private String alm_m3_lm_cell_nbank_p2p_allnum = "";
	private String alm_m3_lm_cell_nbank_mc_allnum = "";
	private String alm_m3_lm_cell_nbank_ca_allnum = "";
	private String alm_m3_lm_cell_nbank_cf_allnum = "";
	private String alm_m3_lm_cell_nbank_com_allnum = "";
	private String alm_m3_lm_cell_nbank_oth_allnum = "";
	private String alm_m3_lm_cell_nbank_orgnum = "";
	private String alm_m3_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m3_lm_cell_nbank_mc_orgnum = "";
	private String alm_m3_lm_cell_nbank_ca_orgnum = "";
	private String alm_m3_lm_cell_nbank_cf_orgnum = "";
	private String alm_m3_lm_cell_nbank_com_orgnum = "";
	private String alm_m3_lm_cell_nbank_oth_orgnum = "";
	private String alm_m4_id_bank_selfnum = "";
	private String alm_m4_id_bank_allnum = "";
	private String alm_m4_id_bank_orgnum = "";
	private String alm_m4_id_nbank_selfnum = "";
	private String alm_m4_id_nbank_allnum = "";
	private String alm_m4_id_nbank_p2p_allnum = "";
	private String alm_m4_id_nbank_mc_allnum = "";
	private String alm_m4_id_nbank_ca_allnum = "";
	private String alm_m4_id_nbank_cf_allnum = "";
	private String alm_m4_id_nbank_com_allnum = "";
	private String alm_m4_id_nbank_oth_allnum = "";
	private String alm_m4_id_nbank_orgnum = "";
	private String alm_m4_id_nbank_p2p_orgnum = "";
	private String alm_m4_id_nbank_mc_orgnum = "";
	private String alm_m4_id_nbank_ca_orgnum = "";
	private String alm_m4_id_nbank_cf_orgnum = "";
	private String alm_m4_id_nbank_com_orgnum = "";
	private String alm_m4_id_nbank_oth_orgnum = "";
	private String alm_m4_cell_bank_selfnum = "";
	private String alm_m4_cell_bank_allnum = "";
	private String alm_m4_cell_bank_orgnum = "";
	private String alm_m4_cell_nbank_selfnum = "";
	private String alm_m4_cell_nbank_allnum = "";
	private String alm_m4_cell_nbank_p2p_allnum = "";
	private String alm_m4_cell_nbank_mc_allnum = "";
	private String alm_m4_cell_nbank_ca_allnum = "";
	private String alm_m4_cell_nbank_cf_allnum = "";
	private String alm_m4_cell_nbank_com_allnum = "";
	private String alm_m4_cell_nbank_oth_allnum = "";
	private String alm_m4_cell_nbank_orgnum = "";
	private String alm_m4_cell_nbank_p2p_orgnum = "";
	private String alm_m4_cell_nbank_mc_orgnum = "";
	private String alm_m4_cell_nbank_ca_orgnum = "";
	private String alm_m4_cell_nbank_cf_orgnum = "";
	private String alm_m4_cell_nbank_com_orgnum = "";
	private String alm_m4_cell_nbank_oth_orgnum = "";
	private String alm_m4_lm_cell_bank_selfnum = "";
	private String alm_m4_lm_cell_bank_allnum = "";
	private String alm_m4_lm_cell_bank_orgnum = "";
	private String alm_m4_lm_cell_nbank_selfnum = "";
	private String alm_m4_lm_cell_nbank_allnum = "";
	private String alm_m4_lm_cell_nbank_p2p_allnum = "";
	private String alm_m4_lm_cell_nbank_mc_allnum = "";
	private String alm_m4_lm_cell_nbank_ca_allnum = "";
	private String alm_m4_lm_cell_nbank_cf_allnum = "";
	private String alm_m4_lm_cell_nbank_com_allnum = "";
	private String alm_m4_lm_cell_nbank_oth_allnum = "";
	private String alm_m4_lm_cell_nbank_orgnum = "";
	private String alm_m4_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m4_lm_cell_nbank_mc_orgnum = "";
	private String alm_m4_lm_cell_nbank_ca_orgnum = "";
	private String alm_m4_lm_cell_nbank_cf_orgnum = "";
	private String alm_m4_lm_cell_nbank_com_orgnum = "";
	private String alm_m4_lm_cell_nbank_oth_orgnum = "";
	private String alm_m5_id_bank_selfnum = "";
	private String alm_m5_id_bank_allnum = "";
	private String alm_m5_id_bank_orgnum = "";
	private String alm_m5_id_nbank_selfnum = "";
	private String alm_m5_id_nbank_allnum = "";
	private String alm_m5_id_nbank_p2p_allnum = "";
	private String alm_m5_id_nbank_mc_allnum = "";
	private String alm_m5_id_nbank_ca_allnum = "";
	private String alm_m5_id_nbank_cf_allnum = "";
	private String alm_m5_id_nbank_com_allnum = "";
	private String alm_m5_id_nbank_oth_allnum = "";
	private String alm_m5_id_nbank_orgnum = "";
	private String alm_m5_id_nbank_p2p_orgnum = "";
	private String alm_m5_id_nbank_mc_orgnum = "";
	private String alm_m5_id_nbank_ca_orgnum = "";
	private String alm_m5_id_nbank_cf_orgnum = "";
	private String alm_m5_id_nbank_com_orgnum = "";
	private String alm_m5_id_nbank_oth_orgnum = "";
	private String alm_m5_cell_bank_selfnum = "";
	private String alm_m5_cell_bank_allnum = "";
	private String alm_m5_cell_bank_orgnum = "";
	private String alm_m5_cell_nbank_selfnum = "";
	private String alm_m5_cell_nbank_allnum = "";
	private String alm_m5_cell_nbank_p2p_allnum = "";
	private String alm_m5_cell_nbank_mc_allnum = "";
	private String alm_m5_cell_nbank_ca_allnum = "";
	private String alm_m5_cell_nbank_cf_allnum = "";
	private String alm_m5_cell_nbank_com_allnum = "";
	private String alm_m5_cell_nbank_oth_allnum = "";
	private String alm_m5_cell_nbank_orgnum = "";
	private String alm_m5_cell_nbank_p2p_orgnum = "";
	private String alm_m5_cell_nbank_mc_orgnum = "";
	private String alm_m5_cell_nbank_ca_orgnum = "";
	private String alm_m5_cell_nbank_cf_orgnum = "";
	private String alm_m5_cell_nbank_com_orgnum = "";
	private String alm_m5_cell_nbank_oth_orgnum = "";
	private String alm_m5_lm_cell_bank_selfnum = "";
	private String alm_m5_lm_cell_bank_allnum = "";
	private String alm_m5_lm_cell_bank_orgnum = "";
	private String alm_m5_lm_cell_nbank_selfnum = "";
	private String alm_m5_lm_cell_nbank_allnum = "";
	private String alm_m5_lm_cell_nbank_p2p_allnum = "";
	private String alm_m5_lm_cell_nbank_mc_allnum = "";
	private String alm_m5_lm_cell_nbank_ca_allnum = "";
	private String alm_m5_lm_cell_nbank_cf_allnum = "";
	private String alm_m5_lm_cell_nbank_com_allnum = "";
	private String alm_m5_lm_cell_nbank_oth_allnum = "";
	private String alm_m5_lm_cell_nbank_orgnum = "";
	private String alm_m5_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m5_lm_cell_nbank_mc_orgnum = "";
	private String alm_m5_lm_cell_nbank_ca_orgnum = "";
	private String alm_m5_lm_cell_nbank_cf_orgnum = "";
	private String alm_m5_lm_cell_nbank_com_orgnum = "";
	private String alm_m5_lm_cell_nbank_oth_orgnum = "";
	private String alm_m6_id_bank_selfnum = "";
	private String alm_m6_id_bank_allnum = "";
	private String alm_m6_id_bank_orgnum = "";
	private String alm_m6_id_nbank_selfnum = "";
	private String alm_m6_id_nbank_allnum = "";
	private String alm_m6_id_nbank_p2p_allnum = "";
	private String alm_m6_id_nbank_mc_allnum = "";
	private String alm_m6_id_nbank_ca_allnum = "";
	private String alm_m6_id_nbank_cf_allnum = "";
	private String alm_m6_id_nbank_com_allnum = "";
	private String alm_m6_id_nbank_oth_allnum = "";
	private String alm_m6_id_nbank_orgnum = "";
	private String alm_m6_id_nbank_p2p_orgnum = "";
	private String alm_m6_id_nbank_mc_orgnum = "";
	private String alm_m6_id_nbank_ca_orgnum = "";
	private String alm_m6_id_nbank_cf_orgnum = "";
	private String alm_m6_id_nbank_com_orgnum = "";
	private String alm_m6_id_nbank_oth_orgnum = "";
	private String alm_m6_cell_bank_selfnum = "";
	private String alm_m6_cell_bank_allnum = "";
	private String alm_m6_cell_bank_orgnum = "";
	private String alm_m6_cell_nbank_selfnum = "";
	private String alm_m6_cell_nbank_allnum = "";
	private String alm_m6_cell_nbank_p2p_allnum = "";
	private String alm_m6_cell_nbank_mc_allnum = "";
	private String alm_m6_cell_nbank_ca_allnum = "";
	private String alm_m6_cell_nbank_cf_allnum = "";
	private String alm_m6_cell_nbank_com_allnum = "";
	private String alm_m6_cell_nbank_oth_allnum = "";
	private String alm_m6_cell_nbank_orgnum = "";
	private String alm_m6_cell_nbank_p2p_orgnum = "";
	private String alm_m6_cell_nbank_mc_orgnum = "";
	private String alm_m6_cell_nbank_ca_orgnum = "";
	private String alm_m6_cell_nbank_cf_orgnum = "";
	private String alm_m6_cell_nbank_com_orgnum = "";
	private String alm_m6_cell_nbank_oth_orgnum = "";
	private String alm_m6_lm_cell_bank_selfnum = "";
	private String alm_m6_lm_cell_bank_allnum = "";
	private String alm_m6_lm_cell_bank_orgnum = "";
	private String alm_m6_lm_cell_nbank_selfnum = "";
	private String alm_m6_lm_cell_nbank_allnum = "";
	private String alm_m6_lm_cell_nbank_p2p_allnum = "";
	private String alm_m6_lm_cell_nbank_mc_allnum = "";
	private String alm_m6_lm_cell_nbank_ca_allnum = "";
	private String alm_m6_lm_cell_nbank_cf_allnum = "";
	private String alm_m6_lm_cell_nbank_com_allnum = "";
	private String alm_m6_lm_cell_nbank_oth_allnum = "";
	private String alm_m6_lm_cell_nbank_orgnum = "";
	private String alm_m6_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m6_lm_cell_nbank_mc_orgnum = "";
	private String alm_m6_lm_cell_nbank_ca_orgnum = "";
	private String alm_m6_lm_cell_nbank_cf_orgnum = "";
	private String alm_m6_lm_cell_nbank_com_orgnum = "";
	private String alm_m6_lm_cell_nbank_oth_orgnum = "";
	private String alm_m7_id_bank_selfnum = "";
	private String alm_m7_id_bank_allnum = "";
	private String alm_m7_id_bank_orgnum = "";
	private String alm_m7_id_nbank_selfnum = "";
	private String alm_m7_id_nbank_allnum = "";
	private String alm_m7_id_nbank_p2p_allnum = "";
	private String alm_m7_id_nbank_mc_allnum = "";
	private String alm_m7_id_nbank_ca_allnum = "";
	private String alm_m7_id_nbank_cf_allnum = "";
	private String alm_m7_id_nbank_com_allnum = "";
	private String alm_m7_id_nbank_oth_allnum = "";
	private String alm_m7_id_nbank_orgnum = "";
	private String alm_m7_id_nbank_p2p_orgnum = "";
	private String alm_m7_id_nbank_mc_orgnum = "";
	private String alm_m7_id_nbank_ca_orgnum = "";
	private String alm_m7_id_nbank_cf_orgnum = "";
	private String alm_m7_id_nbank_com_orgnum = "";
	private String alm_m7_id_nbank_oth_orgnum = "";
	private String alm_m7_cell_bank_selfnum = "";
	private String alm_m7_cell_bank_allnum = "";
	private String alm_m7_cell_bank_orgnum = "";
	private String alm_m7_cell_nbank_selfnum = "";
	private String alm_m7_cell_nbank_allnum = "";
	private String alm_m7_cell_nbank_p2p_allnum = "";
	private String alm_m7_cell_nbank_mc_allnum = "";
	private String alm_m7_cell_nbank_ca_allnum = "";
	private String alm_m7_cell_nbank_cf_allnum = "";
	private String alm_m7_cell_nbank_com_allnum = "";
	private String alm_m7_cell_nbank_oth_allnum = "";
	private String alm_m7_cell_nbank_orgnum = "";
	private String alm_m7_cell_nbank_p2p_orgnum = "";
	private String alm_m7_cell_nbank_mc_orgnum = "";
	private String alm_m7_cell_nbank_ca_orgnum = "";
	private String alm_m7_cell_nbank_cf_orgnum = "";
	private String alm_m7_cell_nbank_com_orgnum = "";
	private String alm_m7_cell_nbank_oth_orgnum = "";
	private String alm_m7_lm_cell_bank_selfnum = "";
	private String alm_m7_lm_cell_bank_allnum = "";
	private String alm_m7_lm_cell_bank_orgnum = "";
	private String alm_m7_lm_cell_nbank_selfnum = "";
	private String alm_m7_lm_cell_nbank_allnum = "";
	private String alm_m7_lm_cell_nbank_p2p_allnum = "";
	private String alm_m7_lm_cell_nbank_mc_allnum = "";
	private String alm_m7_lm_cell_nbank_ca_allnum = "";
	private String alm_m7_lm_cell_nbank_cf_allnum = "";
	private String alm_m7_lm_cell_nbank_com_allnum = "";
	private String alm_m7_lm_cell_nbank_oth_allnum = "";
	private String alm_m7_lm_cell_nbank_orgnum = "";
	private String alm_m7_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m7_lm_cell_nbank_mc_orgnum = "";
	private String alm_m7_lm_cell_nbank_ca_orgnum = "";
	private String alm_m7_lm_cell_nbank_cf_orgnum = "";
	private String alm_m7_lm_cell_nbank_com_orgnum = "";
	private String alm_m7_lm_cell_nbank_oth_orgnum = "";
	private String alm_m8_id_bank_selfnum = "";
	private String alm_m8_id_bank_allnum = "";
	private String alm_m8_id_bank_orgnum = "";
	private String alm_m8_id_nbank_selfnum = "";
	private String alm_m8_id_nbank_allnum = "";
	private String alm_m8_id_nbank_p2p_allnum = "";
	private String alm_m8_id_nbank_mc_allnum = "";
	private String alm_m8_id_nbank_ca_allnum = "";
	private String alm_m8_id_nbank_cf_allnum = "";
	private String alm_m8_id_nbank_com_allnum = "";
	private String alm_m8_id_nbank_oth_allnum = "";
	private String alm_m8_id_nbank_orgnum = "";
	private String alm_m8_id_nbank_p2p_orgnum = "";
	private String alm_m8_id_nbank_mc_orgnum = "";
	private String alm_m8_id_nbank_ca_orgnum = "";
	private String alm_m8_id_nbank_cf_orgnum = "";
	private String alm_m8_id_nbank_com_orgnum = "";
	private String alm_m8_id_nbank_oth_orgnum = "";
	private String alm_m8_cell_bank_selfnum = "";
	private String alm_m8_cell_bank_allnum = "";
	private String alm_m8_cell_bank_orgnum = "";
	private String alm_m8_cell_nbank_selfnum = "";
	private String alm_m8_cell_nbank_allnum = "";
	private String alm_m8_cell_nbank_p2p_allnum = "";
	private String alm_m8_cell_nbank_mc_allnum = "";
	private String alm_m8_cell_nbank_ca_allnum = "";
	private String alm_m8_cell_nbank_cf_allnum = "";
	private String alm_m8_cell_nbank_com_allnum = "";
	private String alm_m8_cell_nbank_oth_allnum = "";
	private String alm_m8_cell_nbank_orgnum = "";
	private String alm_m8_cell_nbank_p2p_orgnum = "";
	private String alm_m8_cell_nbank_mc_orgnum = "";
	private String alm_m8_cell_nbank_ca_orgnum = "";
	private String alm_m8_cell_nbank_cf_orgnum = "";
	private String alm_m8_cell_nbank_com_orgnum = "";
	private String alm_m8_cell_nbank_oth_orgnum = "";
	private String alm_m8_lm_cell_bank_selfnum = "";
	private String alm_m8_lm_cell_bank_allnum = "";
	private String alm_m8_lm_cell_bank_orgnum = "";
	private String alm_m8_lm_cell_nbank_selfnum = "";
	private String alm_m8_lm_cell_nbank_allnum = "";
	private String alm_m8_lm_cell_nbank_p2p_allnum = "";
	private String alm_m8_lm_cell_nbank_mc_allnum = "";
	private String alm_m8_lm_cell_nbank_ca_allnum = "";
	private String alm_m8_lm_cell_nbank_cf_allnum = "";
	private String alm_m8_lm_cell_nbank_com_allnum = "";
	private String alm_m8_lm_cell_nbank_oth_allnum = "";
	private String alm_m8_lm_cell_nbank_orgnum = "";
	private String alm_m8_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m8_lm_cell_nbank_mc_orgnum = "";
	private String alm_m8_lm_cell_nbank_ca_orgnum = "";
	private String alm_m8_lm_cell_nbank_cf_orgnum = "";
	private String alm_m8_lm_cell_nbank_com_orgnum = "";
	private String alm_m8_lm_cell_nbank_oth_orgnum = "";
	private String alm_m9_id_bank_selfnum = "";
	private String alm_m9_id_bank_allnum = "";
	private String alm_m9_id_bank_orgnum = "";
	private String alm_m9_id_nbank_selfnum = "";
	private String alm_m9_id_nbank_allnum = "";
	private String alm_m9_id_nbank_p2p_allnum = "";
	private String alm_m9_id_nbank_mc_allnum = "";
	private String alm_m9_id_nbank_ca_allnum = "";
	private String alm_m9_id_nbank_cf_allnum = "";
	private String alm_m9_id_nbank_com_allnum = "";
	private String alm_m9_id_nbank_oth_allnum = "";
	private String alm_m9_id_nbank_orgnum = "";
	private String alm_m9_id_nbank_p2p_orgnum = "";
	private String alm_m9_id_nbank_mc_orgnum = "";
	private String alm_m9_id_nbank_ca_orgnum = "";
	private String alm_m9_id_nbank_cf_orgnum = "";
	private String alm_m9_id_nbank_com_orgnum = "";
	private String alm_m9_id_nbank_oth_orgnum = "";
	private String alm_m9_cell_bank_selfnum = "";
	private String alm_m9_cell_bank_allnum = "";
	private String alm_m9_cell_bank_orgnum = "";
	private String alm_m9_cell_nbank_selfnum = "";
	private String alm_m9_cell_nbank_allnum = "";
	private String alm_m9_cell_nbank_p2p_allnum = "";
	private String alm_m9_cell_nbank_mc_allnum = "";
	private String alm_m9_cell_nbank_ca_allnum = "";
	private String alm_m9_cell_nbank_cf_allnum = "";
	private String alm_m9_cell_nbank_com_allnum = "";
	private String alm_m9_cell_nbank_oth_allnum = "";
	private String alm_m9_cell_nbank_orgnum = "";
	private String alm_m9_cell_nbank_p2p_orgnum = "";
	private String alm_m9_cell_nbank_mc_orgnum = "";
	private String alm_m9_cell_nbank_ca_orgnum = "";
	private String alm_m9_cell_nbank_cf_orgnum = "";
	private String alm_m9_cell_nbank_com_orgnum = "";
	private String alm_m9_cell_nbank_oth_orgnum = "";
	private String alm_m9_lm_cell_bank_selfnum = "";
	private String alm_m9_lm_cell_bank_allnum = "";
	private String alm_m9_lm_cell_bank_orgnum = "";
	private String alm_m9_lm_cell_nbank_selfnum = "";
	private String alm_m9_lm_cell_nbank_allnum = "";
	private String alm_m9_lm_cell_nbank_p2p_allnum = "";
	private String alm_m9_lm_cell_nbank_mc_allnum = "";
	private String alm_m9_lm_cell_nbank_ca_allnum = "";
	private String alm_m9_lm_cell_nbank_cf_allnum = "";
	private String alm_m9_lm_cell_nbank_com_allnum = "";
	private String alm_m9_lm_cell_nbank_oth_allnum = "";
	private String alm_m9_lm_cell_nbank_orgnum = "";
	private String alm_m9_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m9_lm_cell_nbank_mc_orgnum = "";
	private String alm_m9_lm_cell_nbank_ca_orgnum = "";
	private String alm_m9_lm_cell_nbank_cf_orgnum = "";
	private String alm_m9_lm_cell_nbank_com_orgnum = "";
	private String alm_m9_lm_cell_nbank_oth_orgnum = "";
	private String alm_m10_id_bank_selfnum = "";
	private String alm_m10_id_bank_allnum = "";
	private String alm_m10_id_bank_orgnum = "";
	private String alm_m10_id_nbank_selfnum = "";
	private String alm_m10_id_nbank_allnum = "";
	private String alm_m10_id_nbank_p2p_allnum = "";
	private String alm_m10_id_nbank_mc_allnum = "";
	private String alm_m10_id_nbank_ca_allnum = "";
	private String alm_m10_id_nbank_cf_allnum = "";
	private String alm_m10_id_nbank_com_allnum = "";
	private String alm_m10_id_nbank_oth_allnum = "";
	private String alm_m10_id_nbank_orgnum = "";
	private String alm_m10_id_nbank_p2p_orgnum = "";
	private String alm_m10_id_nbank_mc_orgnum = "";
	private String alm_m10_id_nbank_ca_orgnum = "";
	private String alm_m10_id_nbank_cf_orgnum = "";
	private String alm_m10_id_nbank_com_orgnum = "";
	private String alm_m10_id_nbank_oth_orgnum = "";
	private String alm_m10_cell_bank_selfnum = "";
	private String alm_m10_cell_bank_allnum = "";
	private String alm_m10_cell_bank_orgnum = "";
	private String alm_m10_cell_nbank_selfnum = "";
	private String alm_m10_cell_nbank_allnum = "";
	private String alm_m10_cell_nbank_p2p_allnum = "";
	private String alm_m10_cell_nbank_mc_allnum = "";
	private String alm_m10_cell_nbank_ca_allnum = "";
	private String alm_m10_cell_nbank_cf_allnum = "";
	private String alm_m10_cell_nbank_com_allnum = "";
	private String alm_m10_cell_nbank_oth_allnum = "";
	private String alm_m10_cell_nbank_orgnum = "";
	private String alm_m10_cell_nbank_p2p_orgnum = "";
	private String alm_m10_cell_nbank_mc_orgnum = "";
	private String alm_m10_cell_nbank_ca_orgnum = "";
	private String alm_m10_cell_nbank_cf_orgnum = "";
	private String alm_m10_cell_nbank_com_orgnum = "";
	private String alm_m10_cell_nbank_oth_orgnum = "";
	private String alm_m10_lm_cell_bank_selfnum = "";
	private String alm_m10_lm_cell_bank_allnum = "";
	private String alm_m10_lm_cell_bank_orgnum = "";
	private String alm_m10_lm_cell_nbank_selfnum = "";
	private String alm_m10_lm_cell_nbank_allnum = "";
	private String alm_m10_lm_cell_nbank_p2p_allnum = "";
	private String alm_m10_lm_cell_nbank_mc_allnum = "";
	private String alm_m10_lm_cell_nbank_ca_allnum = "";
	private String alm_m10_lm_cell_nbank_cf_allnum = "";
	private String alm_m10_lm_cell_nbank_com_allnum = "";
	private String alm_m10_lm_cell_nbank_oth_allnum = "";
	private String alm_m10_lm_cell_nbank_orgnum = "";
	private String alm_m10_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m10_lm_cell_nbank_mc_orgnum = "";
	private String alm_m10_lm_cell_nbank_ca_orgnum = "";
	private String alm_m10_lm_cell_nbank_cf_orgnum = "";
	private String alm_m10_lm_cell_nbank_com_orgnum = "";
	private String alm_m10_lm_cell_nbank_oth_orgnum = "";
	private String alm_m11_id_bank_selfnum = "";
	private String alm_m11_id_bank_allnum = "";
	private String alm_m11_id_bank_orgnum = "";
	private String alm_m11_id_nbank_selfnum = "";
	private String alm_m11_id_nbank_allnum = "";
	private String alm_m11_id_nbank_p2p_allnum = "";
	private String alm_m11_id_nbank_mc_allnum = "";
	private String alm_m11_id_nbank_ca_allnum = "";
	private String alm_m11_id_nbank_cf_allnum = "";
	private String alm_m11_id_nbank_com_allnum = "";
	private String alm_m11_id_nbank_oth_allnum = "";
	private String alm_m11_id_nbank_orgnum = "";
	private String alm_m11_id_nbank_p2p_orgnum = "";
	private String alm_m11_id_nbank_mc_orgnum = "";
	private String alm_m11_id_nbank_ca_orgnum = "";
	private String alm_m11_id_nbank_cf_orgnum = "";
	private String alm_m11_id_nbank_com_orgnum = "";
	private String alm_m11_id_nbank_oth_orgnum = "";
	private String alm_m11_cell_bank_selfnum = "";
	private String alm_m11_cell_bank_allnum = "";
	private String alm_m11_cell_bank_orgnum = "";
	private String alm_m11_cell_nbank_selfnum = "";
	private String alm_m11_cell_nbank_allnum = "";
	private String alm_m11_cell_nbank_p2p_allnum = "";
	private String alm_m11_cell_nbank_mc_allnum = "";
	private String alm_m11_cell_nbank_ca_allnum = "";
	private String alm_m11_cell_nbank_cf_allnum = "";
	private String alm_m11_cell_nbank_com_allnum = "";
	private String alm_m11_cell_nbank_oth_allnum = "";
	private String alm_m11_cell_nbank_orgnum = "";
	private String alm_m11_cell_nbank_p2p_orgnum = "";
	private String alm_m11_cell_nbank_mc_orgnum = "";
	private String alm_m11_cell_nbank_ca_orgnum = "";
	private String alm_m11_cell_nbank_cf_orgnum = "";
	private String alm_m11_cell_nbank_com_orgnum = "";
	private String alm_m11_cell_nbank_oth_orgnum = "";
	private String alm_m11_lm_cell_bank_selfnum = "";
	private String alm_m11_lm_cell_bank_allnum = "";
	private String alm_m11_lm_cell_bank_orgnum = "";
	private String alm_m11_lm_cell_nbank_selfnum = "";
	private String alm_m11_lm_cell_nbank_allnum = "";
	private String alm_m11_lm_cell_nbank_p2p_allnum = "";
	private String alm_m11_lm_cell_nbank_mc_allnum = "";
	private String alm_m11_lm_cell_nbank_ca_allnum = "";
	private String alm_m11_lm_cell_nbank_cf_allnum = "";
	private String alm_m11_lm_cell_nbank_com_allnum = "";
	private String alm_m11_lm_cell_nbank_oth_allnum = "";
	private String alm_m11_lm_cell_nbank_orgnum = "";
	private String alm_m11_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m11_lm_cell_nbank_mc_orgnum = "";
	private String alm_m11_lm_cell_nbank_ca_orgnum = "";
	private String alm_m11_lm_cell_nbank_cf_orgnum = "";
	private String alm_m11_lm_cell_nbank_com_orgnum = "";
	private String alm_m11_lm_cell_nbank_oth_orgnum = "";
	private String alm_m12_id_bank_selfnum = "";
	private String alm_m12_id_bank_allnum = "";
	private String alm_m12_id_bank_orgnum = "";
	private String alm_m12_id_nbank_selfnum = "";
	private String alm_m12_id_nbank_allnum = "";
	private String alm_m12_id_nbank_p2p_allnum = "";
	private String alm_m12_id_nbank_mc_allnum = "";
	private String alm_m12_id_nbank_ca_allnum = "";
	private String alm_m12_id_nbank_cf_allnum = "";
	private String alm_m12_id_nbank_com_allnum = "";
	private String alm_m12_id_nbank_oth_allnum = "";
	private String alm_m12_id_nbank_orgnum = "";
	private String alm_m12_id_nbank_p2p_orgnum = "";
	private String alm_m12_id_nbank_mc_orgnum = "";
	private String alm_m12_id_nbank_ca_orgnum = "";
	private String alm_m12_id_nbank_cf_orgnum = "";
	private String alm_m12_id_nbank_com_orgnum = "";
	private String alm_m12_id_nbank_oth_orgnum = "";
	private String alm_m12_cell_bank_selfnum = "";
	private String alm_m12_cell_bank_allnum = "";
	private String alm_m12_cell_bank_orgnum = "";
	private String alm_m12_cell_nbank_selfnum = "";
	private String alm_m12_cell_nbank_allnum = "";
	private String alm_m12_cell_nbank_p2p_allnum = "";
	private String alm_m12_cell_nbank_mc_allnum = "";
	private String alm_m12_cell_nbank_ca_allnum = "";
	private String alm_m12_cell_nbank_cf_allnum = "";
	private String alm_m12_cell_nbank_com_allnum = "";
	private String alm_m12_cell_nbank_oth_allnum = "";
	private String alm_m12_cell_nbank_orgnum = "";
	private String alm_m12_cell_nbank_p2p_orgnum = "";
	private String alm_m12_cell_nbank_mc_orgnum = "";
	private String alm_m12_cell_nbank_ca_orgnum = "";
	private String alm_m12_cell_nbank_cf_orgnum = "";
	private String alm_m12_cell_nbank_com_orgnum = "";
	private String alm_m12_cell_nbank_oth_orgnum = "";
	private String alm_m12_lm_cell_bank_selfnum = "";
	private String alm_m12_lm_cell_bank_allnum = "";
	private String alm_m12_lm_cell_bank_orgnum = "";
	private String alm_m12_lm_cell_nbank_selfnum = "";
	private String alm_m12_lm_cell_nbank_allnum = "";
	private String alm_m12_lm_cell_nbank_p2p_allnum = "";
	private String alm_m12_lm_cell_nbank_mc_allnum = "";
	private String alm_m12_lm_cell_nbank_ca_allnum = "";
	private String alm_m12_lm_cell_nbank_cf_allnum = "";
	private String alm_m12_lm_cell_nbank_com_allnum = "";
	private String alm_m12_lm_cell_nbank_oth_allnum = "";
	private String alm_m12_lm_cell_nbank_orgnum = "";
	private String alm_m12_lm_cell_nbank_p2p_orgnum = "";
	private String alm_m12_lm_cell_nbank_mc_orgnum = "";
	private String alm_m12_lm_cell_nbank_ca_orgnum = "";
	private String alm_m12_lm_cell_nbank_cf_orgnum = "";
	private String alm_m12_lm_cell_nbank_com_orgnum = "";
	private String alm_m12_lm_cell_nbank_oth_orgnum = "";
	public ApplyLoanMonEntity() {
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
	public Integer getFlag_applyloanmon() {
		return flag_applyloanmon;
	}
	public void setFlag_applyloanmon(Integer flag_applyloanmon) {
		this.flag_applyloanmon = flag_applyloanmon;
	}
	public String getAlm_d7_id_bank_selfnum() {
		return alm_d7_id_bank_selfnum;
	}
	public void setAlm_d7_id_bank_selfnum(String alm_d7_id_bank_selfnum) {
		this.alm_d7_id_bank_selfnum = alm_d7_id_bank_selfnum;
	}
	public String getAlm_d7_id_bank_allnum() {
		return alm_d7_id_bank_allnum;
	}
	public void setAlm_d7_id_bank_allnum(String alm_d7_id_bank_allnum) {
		this.alm_d7_id_bank_allnum = alm_d7_id_bank_allnum;
	}
	public String getAlm_d7_id_bank_orgnum() {
		return alm_d7_id_bank_orgnum;
	}
	public void setAlm_d7_id_bank_orgnum(String alm_d7_id_bank_orgnum) {
		this.alm_d7_id_bank_orgnum = alm_d7_id_bank_orgnum;
	}
	public String getAlm_d7_id_nbank_selfnum() {
		return alm_d7_id_nbank_selfnum;
	}
	public void setAlm_d7_id_nbank_selfnum(String alm_d7_id_nbank_selfnum) {
		this.alm_d7_id_nbank_selfnum = alm_d7_id_nbank_selfnum;
	}
	public String getAlm_d7_id_nbank_allnum() {
		return alm_d7_id_nbank_allnum;
	}
	public void setAlm_d7_id_nbank_allnum(String alm_d7_id_nbank_allnum) {
		this.alm_d7_id_nbank_allnum = alm_d7_id_nbank_allnum;
	}
	public String getAlm_d7_id_nbank_p2p_allnum() {
		return alm_d7_id_nbank_p2p_allnum;
	}
	public void setAlm_d7_id_nbank_p2p_allnum(String alm_d7_id_nbank_p2p_allnum) {
		this.alm_d7_id_nbank_p2p_allnum = alm_d7_id_nbank_p2p_allnum;
	}
	public String getAlm_d7_id_nbank_mc_allnum() {
		return alm_d7_id_nbank_mc_allnum;
	}
	public void setAlm_d7_id_nbank_mc_allnum(String alm_d7_id_nbank_mc_allnum) {
		this.alm_d7_id_nbank_mc_allnum = alm_d7_id_nbank_mc_allnum;
	}
	public String getAlm_d7_id_nbank_ca_allnum() {
		return alm_d7_id_nbank_ca_allnum;
	}
	public void setAlm_d7_id_nbank_ca_allnum(String alm_d7_id_nbank_ca_allnum) {
		this.alm_d7_id_nbank_ca_allnum = alm_d7_id_nbank_ca_allnum;
	}
	public String getAlm_d7_id_nbank_cf_allnum() {
		return alm_d7_id_nbank_cf_allnum;
	}
	public void setAlm_d7_id_nbank_cf_allnum(String alm_d7_id_nbank_cf_allnum) {
		this.alm_d7_id_nbank_cf_allnum = alm_d7_id_nbank_cf_allnum;
	}
	public String getAlm_d7_id_nbank_com_allnum() {
		return alm_d7_id_nbank_com_allnum;
	}
	public void setAlm_d7_id_nbank_com_allnum(String alm_d7_id_nbank_com_allnum) {
		this.alm_d7_id_nbank_com_allnum = alm_d7_id_nbank_com_allnum;
	}
	public String getAlm_d7_id_nbank_oth_allnum() {
		return alm_d7_id_nbank_oth_allnum;
	}
	public void setAlm_d7_id_nbank_oth_allnum(String alm_d7_id_nbank_oth_allnum) {
		this.alm_d7_id_nbank_oth_allnum = alm_d7_id_nbank_oth_allnum;
	}
	public String getAlm_d7_id_nbank_orgnum() {
		return alm_d7_id_nbank_orgnum;
	}
	public void setAlm_d7_id_nbank_orgnum(String alm_d7_id_nbank_orgnum) {
		this.alm_d7_id_nbank_orgnum = alm_d7_id_nbank_orgnum;
	}
	public String getAlm_d7_id_nbank_p2p_orgnum() {
		return alm_d7_id_nbank_p2p_orgnum;
	}
	public void setAlm_d7_id_nbank_p2p_orgnum(String alm_d7_id_nbank_p2p_orgnum) {
		this.alm_d7_id_nbank_p2p_orgnum = alm_d7_id_nbank_p2p_orgnum;
	}
	public String getAlm_d7_id_nbank_mc_orgnum() {
		return alm_d7_id_nbank_mc_orgnum;
	}
	public void setAlm_d7_id_nbank_mc_orgnum(String alm_d7_id_nbank_mc_orgnum) {
		this.alm_d7_id_nbank_mc_orgnum = alm_d7_id_nbank_mc_orgnum;
	}
	public String getAlm_d7_id_nbank_ca_orgnum() {
		return alm_d7_id_nbank_ca_orgnum;
	}
	public void setAlm_d7_id_nbank_ca_orgnum(String alm_d7_id_nbank_ca_orgnum) {
		this.alm_d7_id_nbank_ca_orgnum = alm_d7_id_nbank_ca_orgnum;
	}
	public String getAlm_d7_id_nbank_cf_orgnum() {
		return alm_d7_id_nbank_cf_orgnum;
	}
	public void setAlm_d7_id_nbank_cf_orgnum(String alm_d7_id_nbank_cf_orgnum) {
		this.alm_d7_id_nbank_cf_orgnum = alm_d7_id_nbank_cf_orgnum;
	}
	public String getAlm_d7_id_nbank_com_orgnum() {
		return alm_d7_id_nbank_com_orgnum;
	}
	public void setAlm_d7_id_nbank_com_orgnum(String alm_d7_id_nbank_com_orgnum) {
		this.alm_d7_id_nbank_com_orgnum = alm_d7_id_nbank_com_orgnum;
	}
	public String getAlm_d7_id_nbank_oth_orgnum() {
		return alm_d7_id_nbank_oth_orgnum;
	}
	public void setAlm_d7_id_nbank_oth_orgnum(String alm_d7_id_nbank_oth_orgnum) {
		this.alm_d7_id_nbank_oth_orgnum = alm_d7_id_nbank_oth_orgnum;
	}
	public String getAlm_d7_cell_bank_selfnum() {
		return alm_d7_cell_bank_selfnum;
	}
	public void setAlm_d7_cell_bank_selfnum(String alm_d7_cell_bank_selfnum) {
		this.alm_d7_cell_bank_selfnum = alm_d7_cell_bank_selfnum;
	}
	public String getAlm_d7_cell_bank_allnum() {
		return alm_d7_cell_bank_allnum;
	}
	public void setAlm_d7_cell_bank_allnum(String alm_d7_cell_bank_allnum) {
		this.alm_d7_cell_bank_allnum = alm_d7_cell_bank_allnum;
	}
	public String getAlm_d7_cell_bank_orgnum() {
		return alm_d7_cell_bank_orgnum;
	}
	public void setAlm_d7_cell_bank_orgnum(String alm_d7_cell_bank_orgnum) {
		this.alm_d7_cell_bank_orgnum = alm_d7_cell_bank_orgnum;
	}
	public String getAlm_d7_cell_nbank_selfnum() {
		return alm_d7_cell_nbank_selfnum;
	}
	public void setAlm_d7_cell_nbank_selfnum(String alm_d7_cell_nbank_selfnum) {
		this.alm_d7_cell_nbank_selfnum = alm_d7_cell_nbank_selfnum;
	}
	public String getAlm_d7_cell_nbank_allnum() {
		return alm_d7_cell_nbank_allnum;
	}
	public void setAlm_d7_cell_nbank_allnum(String alm_d7_cell_nbank_allnum) {
		this.alm_d7_cell_nbank_allnum = alm_d7_cell_nbank_allnum;
	}
	public String getAlm_d7_cell_nbank_p2p_allnum() {
		return alm_d7_cell_nbank_p2p_allnum;
	}
	public void setAlm_d7_cell_nbank_p2p_allnum(String alm_d7_cell_nbank_p2p_allnum) {
		this.alm_d7_cell_nbank_p2p_allnum = alm_d7_cell_nbank_p2p_allnum;
	}
	public String getAlm_d7_cell_nbank_mc_allnum() {
		return alm_d7_cell_nbank_mc_allnum;
	}
	public void setAlm_d7_cell_nbank_mc_allnum(String alm_d7_cell_nbank_mc_allnum) {
		this.alm_d7_cell_nbank_mc_allnum = alm_d7_cell_nbank_mc_allnum;
	}
	public String getAlm_d7_cell_nbank_ca_allnum() {
		return alm_d7_cell_nbank_ca_allnum;
	}
	public void setAlm_d7_cell_nbank_ca_allnum(String alm_d7_cell_nbank_ca_allnum) {
		this.alm_d7_cell_nbank_ca_allnum = alm_d7_cell_nbank_ca_allnum;
	}
	public String getAlm_d7_cell_nbank_cf_allnum() {
		return alm_d7_cell_nbank_cf_allnum;
	}
	public void setAlm_d7_cell_nbank_cf_allnum(String alm_d7_cell_nbank_cf_allnum) {
		this.alm_d7_cell_nbank_cf_allnum = alm_d7_cell_nbank_cf_allnum;
	}
	public String getAlm_d7_cell_nbank_com_allnum() {
		return alm_d7_cell_nbank_com_allnum;
	}
	public void setAlm_d7_cell_nbank_com_allnum(String alm_d7_cell_nbank_com_allnum) {
		this.alm_d7_cell_nbank_com_allnum = alm_d7_cell_nbank_com_allnum;
	}
	public String getAlm_d7_cell_nbank_oth_allnum() {
		return alm_d7_cell_nbank_oth_allnum;
	}
	public void setAlm_d7_cell_nbank_oth_allnum(String alm_d7_cell_nbank_oth_allnum) {
		this.alm_d7_cell_nbank_oth_allnum = alm_d7_cell_nbank_oth_allnum;
	}
	public String getAlm_d7_cell_nbank_orgnum() {
		return alm_d7_cell_nbank_orgnum;
	}
	public void setAlm_d7_cell_nbank_orgnum(String alm_d7_cell_nbank_orgnum) {
		this.alm_d7_cell_nbank_orgnum = alm_d7_cell_nbank_orgnum;
	}
	public String getAlm_d7_cell_nbank_p2p_orgnum() {
		return alm_d7_cell_nbank_p2p_orgnum;
	}
	public void setAlm_d7_cell_nbank_p2p_orgnum(String alm_d7_cell_nbank_p2p_orgnum) {
		this.alm_d7_cell_nbank_p2p_orgnum = alm_d7_cell_nbank_p2p_orgnum;
	}
	public String getAlm_d7_cell_nbank_mc_orgnum() {
		return alm_d7_cell_nbank_mc_orgnum;
	}
	public void setAlm_d7_cell_nbank_mc_orgnum(String alm_d7_cell_nbank_mc_orgnum) {
		this.alm_d7_cell_nbank_mc_orgnum = alm_d7_cell_nbank_mc_orgnum;
	}
	public String getAlm_d7_cell_nbank_ca_orgnum() {
		return alm_d7_cell_nbank_ca_orgnum;
	}
	public void setAlm_d7_cell_nbank_ca_orgnum(String alm_d7_cell_nbank_ca_orgnum) {
		this.alm_d7_cell_nbank_ca_orgnum = alm_d7_cell_nbank_ca_orgnum;
	}
	public String getAlm_d7_cell_nbank_cf_orgnum() {
		return alm_d7_cell_nbank_cf_orgnum;
	}
	public void setAlm_d7_cell_nbank_cf_orgnum(String alm_d7_cell_nbank_cf_orgnum) {
		this.alm_d7_cell_nbank_cf_orgnum = alm_d7_cell_nbank_cf_orgnum;
	}
	public String getAlm_d7_cell_nbank_com_orgnum() {
		return alm_d7_cell_nbank_com_orgnum;
	}
	public void setAlm_d7_cell_nbank_com_orgnum(String alm_d7_cell_nbank_com_orgnum) {
		this.alm_d7_cell_nbank_com_orgnum = alm_d7_cell_nbank_com_orgnum;
	}
	public String getAlm_d7_cell_nbank_oth_orgnum() {
		return alm_d7_cell_nbank_oth_orgnum;
	}
	public void setAlm_d7_cell_nbank_oth_orgnum(String alm_d7_cell_nbank_oth_orgnum) {
		this.alm_d7_cell_nbank_oth_orgnum = alm_d7_cell_nbank_oth_orgnum;
	}
	public String getAlm_d7_lm_cell_bank_selfnum() {
		return alm_d7_lm_cell_bank_selfnum;
	}
	public void setAlm_d7_lm_cell_bank_selfnum(String alm_d7_lm_cell_bank_selfnum) {
		this.alm_d7_lm_cell_bank_selfnum = alm_d7_lm_cell_bank_selfnum;
	}
	public String getAlm_d7_lm_cell_bank_allnum() {
		return alm_d7_lm_cell_bank_allnum;
	}
	public void setAlm_d7_lm_cell_bank_allnum(String alm_d7_lm_cell_bank_allnum) {
		this.alm_d7_lm_cell_bank_allnum = alm_d7_lm_cell_bank_allnum;
	}
	public String getAlm_d7_lm_cell_bank_orgnum() {
		return alm_d7_lm_cell_bank_orgnum;
	}
	public void setAlm_d7_lm_cell_bank_orgnum(String alm_d7_lm_cell_bank_orgnum) {
		this.alm_d7_lm_cell_bank_orgnum = alm_d7_lm_cell_bank_orgnum;
	}
	public String getAlm_d7_lm_cell_nbank_selfnum() {
		return alm_d7_lm_cell_nbank_selfnum;
	}
	public void setAlm_d7_lm_cell_nbank_selfnum(String alm_d7_lm_cell_nbank_selfnum) {
		this.alm_d7_lm_cell_nbank_selfnum = alm_d7_lm_cell_nbank_selfnum;
	}
	public String getAlm_d7_lm_cell_nbank_allnum() {
		return alm_d7_lm_cell_nbank_allnum;
	}
	public void setAlm_d7_lm_cell_nbank_allnum(String alm_d7_lm_cell_nbank_allnum) {
		this.alm_d7_lm_cell_nbank_allnum = alm_d7_lm_cell_nbank_allnum;
	}
	public String getAlm_d7_lm_cell_nbank_p2p_allnum() {
		return alm_d7_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_d7_lm_cell_nbank_p2p_allnum(String alm_d7_lm_cell_nbank_p2p_allnum) {
		this.alm_d7_lm_cell_nbank_p2p_allnum = alm_d7_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_d7_lm_cell_nbank_mc_allnum() {
		return alm_d7_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_d7_lm_cell_nbank_mc_allnum(String alm_d7_lm_cell_nbank_mc_allnum) {
		this.alm_d7_lm_cell_nbank_mc_allnum = alm_d7_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_d7_lm_cell_nbank_ca_allnum() {
		return alm_d7_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_d7_lm_cell_nbank_ca_allnum(String alm_d7_lm_cell_nbank_ca_allnum) {
		this.alm_d7_lm_cell_nbank_ca_allnum = alm_d7_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_d7_lm_cell_nbank_cf_allnum() {
		return alm_d7_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_d7_lm_cell_nbank_cf_allnum(String alm_d7_lm_cell_nbank_cf_allnum) {
		this.alm_d7_lm_cell_nbank_cf_allnum = alm_d7_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_d7_lm_cell_nbank_com_allnum() {
		return alm_d7_lm_cell_nbank_com_allnum;
	}
	public void setAlm_d7_lm_cell_nbank_com_allnum(String alm_d7_lm_cell_nbank_com_allnum) {
		this.alm_d7_lm_cell_nbank_com_allnum = alm_d7_lm_cell_nbank_com_allnum;
	}
	public String getAlm_d7_lm_cell_nbank_oth_allnum() {
		return alm_d7_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_d7_lm_cell_nbank_oth_allnum(String alm_d7_lm_cell_nbank_oth_allnum) {
		this.alm_d7_lm_cell_nbank_oth_allnum = alm_d7_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_d7_lm_cell_nbank_orgnum() {
		return alm_d7_lm_cell_nbank_orgnum;
	}
	public void setAlm_d7_lm_cell_nbank_orgnum(String alm_d7_lm_cell_nbank_orgnum) {
		this.alm_d7_lm_cell_nbank_orgnum = alm_d7_lm_cell_nbank_orgnum;
	}
	public String getAlm_d7_lm_cell_nbank_p2p_orgnum() {
		return alm_d7_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_d7_lm_cell_nbank_p2p_orgnum(String alm_d7_lm_cell_nbank_p2p_orgnum) {
		this.alm_d7_lm_cell_nbank_p2p_orgnum = alm_d7_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_d7_lm_cell_nbank_mc_orgnum() {
		return alm_d7_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_d7_lm_cell_nbank_mc_orgnum(String alm_d7_lm_cell_nbank_mc_orgnum) {
		this.alm_d7_lm_cell_nbank_mc_orgnum = alm_d7_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_d7_lm_cell_nbank_ca_orgnum() {
		return alm_d7_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_d7_lm_cell_nbank_ca_orgnum(String alm_d7_lm_cell_nbank_ca_orgnum) {
		this.alm_d7_lm_cell_nbank_ca_orgnum = alm_d7_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_d7_lm_cell_nbank_cf_orgnum() {
		return alm_d7_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_d7_lm_cell_nbank_cf_orgnum(String alm_d7_lm_cell_nbank_cf_orgnum) {
		this.alm_d7_lm_cell_nbank_cf_orgnum = alm_d7_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_d7_lm_cell_nbank_com_orgnum() {
		return alm_d7_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_d7_lm_cell_nbank_com_orgnum(String alm_d7_lm_cell_nbank_com_orgnum) {
		this.alm_d7_lm_cell_nbank_com_orgnum = alm_d7_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_d7_lm_cell_nbank_oth_orgnum() {
		return alm_d7_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_d7_lm_cell_nbank_oth_orgnum(String alm_d7_lm_cell_nbank_oth_orgnum) {
		this.alm_d7_lm_cell_nbank_oth_orgnum = alm_d7_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_d15_id_bank_selfnum() {
		return alm_d15_id_bank_selfnum;
	}
	public void setAlm_d15_id_bank_selfnum(String alm_d15_id_bank_selfnum) {
		this.alm_d15_id_bank_selfnum = alm_d15_id_bank_selfnum;
	}
	public String getAlm_d15_id_bank_allnum() {
		return alm_d15_id_bank_allnum;
	}
	public void setAlm_d15_id_bank_allnum(String alm_d15_id_bank_allnum) {
		this.alm_d15_id_bank_allnum = alm_d15_id_bank_allnum;
	}
	public String getAlm_d15_id_bank_orgnum() {
		return alm_d15_id_bank_orgnum;
	}
	public void setAlm_d15_id_bank_orgnum(String alm_d15_id_bank_orgnum) {
		this.alm_d15_id_bank_orgnum = alm_d15_id_bank_orgnum;
	}
	public String getAlm_d15_id_nbank_selfnum() {
		return alm_d15_id_nbank_selfnum;
	}
	public void setAlm_d15_id_nbank_selfnum(String alm_d15_id_nbank_selfnum) {
		this.alm_d15_id_nbank_selfnum = alm_d15_id_nbank_selfnum;
	}
	public String getAlm_d15_id_nbank_allnum() {
		return alm_d15_id_nbank_allnum;
	}
	public void setAlm_d15_id_nbank_allnum(String alm_d15_id_nbank_allnum) {
		this.alm_d15_id_nbank_allnum = alm_d15_id_nbank_allnum;
	}
	public String getAlm_d15_id_nbank_p2p_allnum() {
		return alm_d15_id_nbank_p2p_allnum;
	}
	public void setAlm_d15_id_nbank_p2p_allnum(String alm_d15_id_nbank_p2p_allnum) {
		this.alm_d15_id_nbank_p2p_allnum = alm_d15_id_nbank_p2p_allnum;
	}
	public String getAlm_d15_id_nbank_mc_allnum() {
		return alm_d15_id_nbank_mc_allnum;
	}
	public void setAlm_d15_id_nbank_mc_allnum(String alm_d15_id_nbank_mc_allnum) {
		this.alm_d15_id_nbank_mc_allnum = alm_d15_id_nbank_mc_allnum;
	}
	public String getAlm_d15_id_nbank_ca_allnum() {
		return alm_d15_id_nbank_ca_allnum;
	}
	public void setAlm_d15_id_nbank_ca_allnum(String alm_d15_id_nbank_ca_allnum) {
		this.alm_d15_id_nbank_ca_allnum = alm_d15_id_nbank_ca_allnum;
	}
	public String getAlm_d15_id_nbank_cf_allnum() {
		return alm_d15_id_nbank_cf_allnum;
	}
	public void setAlm_d15_id_nbank_cf_allnum(String alm_d15_id_nbank_cf_allnum) {
		this.alm_d15_id_nbank_cf_allnum = alm_d15_id_nbank_cf_allnum;
	}
	public String getAlm_d15_id_nbank_com_allnum() {
		return alm_d15_id_nbank_com_allnum;
	}
	public void setAlm_d15_id_nbank_com_allnum(String alm_d15_id_nbank_com_allnum) {
		this.alm_d15_id_nbank_com_allnum = alm_d15_id_nbank_com_allnum;
	}
	public String getAlm_d15_id_nbank_oth_allnum() {
		return alm_d15_id_nbank_oth_allnum;
	}
	public void setAlm_d15_id_nbank_oth_allnum(String alm_d15_id_nbank_oth_allnum) {
		this.alm_d15_id_nbank_oth_allnum = alm_d15_id_nbank_oth_allnum;
	}
	public String getAlm_d15_id_nbank_orgnum() {
		return alm_d15_id_nbank_orgnum;
	}
	public void setAlm_d15_id_nbank_orgnum(String alm_d15_id_nbank_orgnum) {
		this.alm_d15_id_nbank_orgnum = alm_d15_id_nbank_orgnum;
	}
	public String getAlm_d15_id_nbank_p2p_orgnum() {
		return alm_d15_id_nbank_p2p_orgnum;
	}
	public void setAlm_d15_id_nbank_p2p_orgnum(String alm_d15_id_nbank_p2p_orgnum) {
		this.alm_d15_id_nbank_p2p_orgnum = alm_d15_id_nbank_p2p_orgnum;
	}
	public String getAlm_d15_id_nbank_mc_orgnum() {
		return alm_d15_id_nbank_mc_orgnum;
	}
	public void setAlm_d15_id_nbank_mc_orgnum(String alm_d15_id_nbank_mc_orgnum) {
		this.alm_d15_id_nbank_mc_orgnum = alm_d15_id_nbank_mc_orgnum;
	}
	public String getAlm_d15_id_nbank_ca_orgnum() {
		return alm_d15_id_nbank_ca_orgnum;
	}
	public void setAlm_d15_id_nbank_ca_orgnum(String alm_d15_id_nbank_ca_orgnum) {
		this.alm_d15_id_nbank_ca_orgnum = alm_d15_id_nbank_ca_orgnum;
	}
	public String getAlm_d15_id_nbank_cf_orgnum() {
		return alm_d15_id_nbank_cf_orgnum;
	}
	public void setAlm_d15_id_nbank_cf_orgnum(String alm_d15_id_nbank_cf_orgnum) {
		this.alm_d15_id_nbank_cf_orgnum = alm_d15_id_nbank_cf_orgnum;
	}
	public String getAlm_d15_id_nbank_com_orgnum() {
		return alm_d15_id_nbank_com_orgnum;
	}
	public void setAlm_d15_id_nbank_com_orgnum(String alm_d15_id_nbank_com_orgnum) {
		this.alm_d15_id_nbank_com_orgnum = alm_d15_id_nbank_com_orgnum;
	}
	public String getAlm_d15_id_nbank_oth_orgnum() {
		return alm_d15_id_nbank_oth_orgnum;
	}
	public void setAlm_d15_id_nbank_oth_orgnum(String alm_d15_id_nbank_oth_orgnum) {
		this.alm_d15_id_nbank_oth_orgnum = alm_d15_id_nbank_oth_orgnum;
	}
	public String getAlm_d15_cell_bank_selfnum() {
		return alm_d15_cell_bank_selfnum;
	}
	public void setAlm_d15_cell_bank_selfnum(String alm_d15_cell_bank_selfnum) {
		this.alm_d15_cell_bank_selfnum = alm_d15_cell_bank_selfnum;
	}
	public String getAlm_d15_cell_bank_allnum() {
		return alm_d15_cell_bank_allnum;
	}
	public void setAlm_d15_cell_bank_allnum(String alm_d15_cell_bank_allnum) {
		this.alm_d15_cell_bank_allnum = alm_d15_cell_bank_allnum;
	}
	public String getAlm_d15_cell_bank_orgnum() {
		return alm_d15_cell_bank_orgnum;
	}
	public void setAlm_d15_cell_bank_orgnum(String alm_d15_cell_bank_orgnum) {
		this.alm_d15_cell_bank_orgnum = alm_d15_cell_bank_orgnum;
	}
	public String getAlm_d15_cell_nbank_selfnum() {
		return alm_d15_cell_nbank_selfnum;
	}
	public void setAlm_d15_cell_nbank_selfnum(String alm_d15_cell_nbank_selfnum) {
		this.alm_d15_cell_nbank_selfnum = alm_d15_cell_nbank_selfnum;
	}
	public String getAlm_d15_cell_nbank_allnum() {
		return alm_d15_cell_nbank_allnum;
	}
	public void setAlm_d15_cell_nbank_allnum(String alm_d15_cell_nbank_allnum) {
		this.alm_d15_cell_nbank_allnum = alm_d15_cell_nbank_allnum;
	}
	public String getAlm_d15_cell_nbank_p2p_allnum() {
		return alm_d15_cell_nbank_p2p_allnum;
	}
	public void setAlm_d15_cell_nbank_p2p_allnum(String alm_d15_cell_nbank_p2p_allnum) {
		this.alm_d15_cell_nbank_p2p_allnum = alm_d15_cell_nbank_p2p_allnum;
	}
	public String getAlm_d15_cell_nbank_mc_allnum() {
		return alm_d15_cell_nbank_mc_allnum;
	}
	public void setAlm_d15_cell_nbank_mc_allnum(String alm_d15_cell_nbank_mc_allnum) {
		this.alm_d15_cell_nbank_mc_allnum = alm_d15_cell_nbank_mc_allnum;
	}
	public String getAlm_d15_cell_nbank_ca_allnum() {
		return alm_d15_cell_nbank_ca_allnum;
	}
	public void setAlm_d15_cell_nbank_ca_allnum(String alm_d15_cell_nbank_ca_allnum) {
		this.alm_d15_cell_nbank_ca_allnum = alm_d15_cell_nbank_ca_allnum;
	}
	public String getAlm_d15_cell_nbank_cf_allnum() {
		return alm_d15_cell_nbank_cf_allnum;
	}
	public void setAlm_d15_cell_nbank_cf_allnum(String alm_d15_cell_nbank_cf_allnum) {
		this.alm_d15_cell_nbank_cf_allnum = alm_d15_cell_nbank_cf_allnum;
	}
	public String getAlm_d15_cell_nbank_com_allnum() {
		return alm_d15_cell_nbank_com_allnum;
	}
	public void setAlm_d15_cell_nbank_com_allnum(String alm_d15_cell_nbank_com_allnum) {
		this.alm_d15_cell_nbank_com_allnum = alm_d15_cell_nbank_com_allnum;
	}
	public String getAlm_d15_cell_nbank_oth_allnum() {
		return alm_d15_cell_nbank_oth_allnum;
	}
	public void setAlm_d15_cell_nbank_oth_allnum(String alm_d15_cell_nbank_oth_allnum) {
		this.alm_d15_cell_nbank_oth_allnum = alm_d15_cell_nbank_oth_allnum;
	}
	public String getAlm_d15_cell_nbank_orgnum() {
		return alm_d15_cell_nbank_orgnum;
	}
	public void setAlm_d15_cell_nbank_orgnum(String alm_d15_cell_nbank_orgnum) {
		this.alm_d15_cell_nbank_orgnum = alm_d15_cell_nbank_orgnum;
	}
	public String getAlm_d15_cell_nbank_p2p_orgnum() {
		return alm_d15_cell_nbank_p2p_orgnum;
	}
	public void setAlm_d15_cell_nbank_p2p_orgnum(String alm_d15_cell_nbank_p2p_orgnum) {
		this.alm_d15_cell_nbank_p2p_orgnum = alm_d15_cell_nbank_p2p_orgnum;
	}
	public String getAlm_d15_cell_nbank_mc_orgnum() {
		return alm_d15_cell_nbank_mc_orgnum;
	}
	public void setAlm_d15_cell_nbank_mc_orgnum(String alm_d15_cell_nbank_mc_orgnum) {
		this.alm_d15_cell_nbank_mc_orgnum = alm_d15_cell_nbank_mc_orgnum;
	}
	public String getAlm_d15_cell_nbank_ca_orgnum() {
		return alm_d15_cell_nbank_ca_orgnum;
	}
	public void setAlm_d15_cell_nbank_ca_orgnum(String alm_d15_cell_nbank_ca_orgnum) {
		this.alm_d15_cell_nbank_ca_orgnum = alm_d15_cell_nbank_ca_orgnum;
	}
	public String getAlm_d15_cell_nbank_cf_orgnum() {
		return alm_d15_cell_nbank_cf_orgnum;
	}
	public void setAlm_d15_cell_nbank_cf_orgnum(String alm_d15_cell_nbank_cf_orgnum) {
		this.alm_d15_cell_nbank_cf_orgnum = alm_d15_cell_nbank_cf_orgnum;
	}
	public String getAlm_d15_cell_nbank_com_orgnum() {
		return alm_d15_cell_nbank_com_orgnum;
	}
	public void setAlm_d15_cell_nbank_com_orgnum(String alm_d15_cell_nbank_com_orgnum) {
		this.alm_d15_cell_nbank_com_orgnum = alm_d15_cell_nbank_com_orgnum;
	}
	public String getAlm_d15_cell_nbank_oth_orgnum() {
		return alm_d15_cell_nbank_oth_orgnum;
	}
	public void setAlm_d15_cell_nbank_oth_orgnum(String alm_d15_cell_nbank_oth_orgnum) {
		this.alm_d15_cell_nbank_oth_orgnum = alm_d15_cell_nbank_oth_orgnum;
	}
	public String getAlm_d15_lm_cell_bank_selfnum() {
		return alm_d15_lm_cell_bank_selfnum;
	}
	public void setAlm_d15_lm_cell_bank_selfnum(String alm_d15_lm_cell_bank_selfnum) {
		this.alm_d15_lm_cell_bank_selfnum = alm_d15_lm_cell_bank_selfnum;
	}
	public String getAlm_d15_lm_cell_bank_allnum() {
		return alm_d15_lm_cell_bank_allnum;
	}
	public void setAlm_d15_lm_cell_bank_allnum(String alm_d15_lm_cell_bank_allnum) {
		this.alm_d15_lm_cell_bank_allnum = alm_d15_lm_cell_bank_allnum;
	}
	public String getAlm_d15_lm_cell_bank_orgnum() {
		return alm_d15_lm_cell_bank_orgnum;
	}
	public void setAlm_d15_lm_cell_bank_orgnum(String alm_d15_lm_cell_bank_orgnum) {
		this.alm_d15_lm_cell_bank_orgnum = alm_d15_lm_cell_bank_orgnum;
	}
	public String getAlm_d15_lm_cell_nbank_selfnum() {
		return alm_d15_lm_cell_nbank_selfnum;
	}
	public void setAlm_d15_lm_cell_nbank_selfnum(String alm_d15_lm_cell_nbank_selfnum) {
		this.alm_d15_lm_cell_nbank_selfnum = alm_d15_lm_cell_nbank_selfnum;
	}
	public String getAlm_d15_lm_cell_nbank_allnum() {
		return alm_d15_lm_cell_nbank_allnum;
	}
	public void setAlm_d15_lm_cell_nbank_allnum(String alm_d15_lm_cell_nbank_allnum) {
		this.alm_d15_lm_cell_nbank_allnum = alm_d15_lm_cell_nbank_allnum;
	}
	public String getAlm_d15_lm_cell_nbank_p2p_allnum() {
		return alm_d15_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_d15_lm_cell_nbank_p2p_allnum(String alm_d15_lm_cell_nbank_p2p_allnum) {
		this.alm_d15_lm_cell_nbank_p2p_allnum = alm_d15_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_d15_lm_cell_nbank_mc_allnum() {
		return alm_d15_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_d15_lm_cell_nbank_mc_allnum(String alm_d15_lm_cell_nbank_mc_allnum) {
		this.alm_d15_lm_cell_nbank_mc_allnum = alm_d15_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_d15_lm_cell_nbank_ca_allnum() {
		return alm_d15_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_d15_lm_cell_nbank_ca_allnum(String alm_d15_lm_cell_nbank_ca_allnum) {
		this.alm_d15_lm_cell_nbank_ca_allnum = alm_d15_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_d15_lm_cell_nbank_cf_allnum() {
		return alm_d15_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_d15_lm_cell_nbank_cf_allnum(String alm_d15_lm_cell_nbank_cf_allnum) {
		this.alm_d15_lm_cell_nbank_cf_allnum = alm_d15_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_d15_lm_cell_nbank_com_allnum() {
		return alm_d15_lm_cell_nbank_com_allnum;
	}
	public void setAlm_d15_lm_cell_nbank_com_allnum(String alm_d15_lm_cell_nbank_com_allnum) {
		this.alm_d15_lm_cell_nbank_com_allnum = alm_d15_lm_cell_nbank_com_allnum;
	}
	public String getAlm_d15_lm_cell_nbank_oth_allnum() {
		return alm_d15_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_d15_lm_cell_nbank_oth_allnum(String alm_d15_lm_cell_nbank_oth_allnum) {
		this.alm_d15_lm_cell_nbank_oth_allnum = alm_d15_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_d15_lm_cell_nbank_orgnum() {
		return alm_d15_lm_cell_nbank_orgnum;
	}
	public void setAlm_d15_lm_cell_nbank_orgnum(String alm_d15_lm_cell_nbank_orgnum) {
		this.alm_d15_lm_cell_nbank_orgnum = alm_d15_lm_cell_nbank_orgnum;
	}
	public String getAlm_d15_lm_cell_nbank_p2p_orgnum() {
		return alm_d15_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_d15_lm_cell_nbank_p2p_orgnum(String alm_d15_lm_cell_nbank_p2p_orgnum) {
		this.alm_d15_lm_cell_nbank_p2p_orgnum = alm_d15_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_d15_lm_cell_nbank_mc_orgnum() {
		return alm_d15_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_d15_lm_cell_nbank_mc_orgnum(String alm_d15_lm_cell_nbank_mc_orgnum) {
		this.alm_d15_lm_cell_nbank_mc_orgnum = alm_d15_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_d15_lm_cell_nbank_ca_orgnum() {
		return alm_d15_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_d15_lm_cell_nbank_ca_orgnum(String alm_d15_lm_cell_nbank_ca_orgnum) {
		this.alm_d15_lm_cell_nbank_ca_orgnum = alm_d15_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_d15_lm_cell_nbank_cf_orgnum() {
		return alm_d15_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_d15_lm_cell_nbank_cf_orgnum(String alm_d15_lm_cell_nbank_cf_orgnum) {
		this.alm_d15_lm_cell_nbank_cf_orgnum = alm_d15_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_d15_lm_cell_nbank_com_orgnum() {
		return alm_d15_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_d15_lm_cell_nbank_com_orgnum(String alm_d15_lm_cell_nbank_com_orgnum) {
		this.alm_d15_lm_cell_nbank_com_orgnum = alm_d15_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_d15_lm_cell_nbank_oth_orgnum() {
		return alm_d15_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_d15_lm_cell_nbank_oth_orgnum(String alm_d15_lm_cell_nbank_oth_orgnum) {
		this.alm_d15_lm_cell_nbank_oth_orgnum = alm_d15_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m1_id_bank_selfnum() {
		return alm_m1_id_bank_selfnum;
	}
	public void setAlm_m1_id_bank_selfnum(String alm_m1_id_bank_selfnum) {
		this.alm_m1_id_bank_selfnum = alm_m1_id_bank_selfnum;
	}
	public String getAlm_m1_id_bank_allnum() {
		return alm_m1_id_bank_allnum;
	}
	public void setAlm_m1_id_bank_allnum(String alm_m1_id_bank_allnum) {
		this.alm_m1_id_bank_allnum = alm_m1_id_bank_allnum;
	}
	public String getAlm_m1_id_bank_orgnum() {
		return alm_m1_id_bank_orgnum;
	}
	public void setAlm_m1_id_bank_orgnum(String alm_m1_id_bank_orgnum) {
		this.alm_m1_id_bank_orgnum = alm_m1_id_bank_orgnum;
	}
	public String getAlm_m1_id_nbank_selfnum() {
		return alm_m1_id_nbank_selfnum;
	}
	public void setAlm_m1_id_nbank_selfnum(String alm_m1_id_nbank_selfnum) {
		this.alm_m1_id_nbank_selfnum = alm_m1_id_nbank_selfnum;
	}
	public String getAlm_m1_id_nbank_allnum() {
		return alm_m1_id_nbank_allnum;
	}
	public void setAlm_m1_id_nbank_allnum(String alm_m1_id_nbank_allnum) {
		this.alm_m1_id_nbank_allnum = alm_m1_id_nbank_allnum;
	}
	public String getAlm_m1_id_nbank_p2p_allnum() {
		return alm_m1_id_nbank_p2p_allnum;
	}
	public void setAlm_m1_id_nbank_p2p_allnum(String alm_m1_id_nbank_p2p_allnum) {
		this.alm_m1_id_nbank_p2p_allnum = alm_m1_id_nbank_p2p_allnum;
	}
	public String getAlm_m1_id_nbank_mc_allnum() {
		return alm_m1_id_nbank_mc_allnum;
	}
	public void setAlm_m1_id_nbank_mc_allnum(String alm_m1_id_nbank_mc_allnum) {
		this.alm_m1_id_nbank_mc_allnum = alm_m1_id_nbank_mc_allnum;
	}
	public String getAlm_m1_id_nbank_ca_allnum() {
		return alm_m1_id_nbank_ca_allnum;
	}
	public void setAlm_m1_id_nbank_ca_allnum(String alm_m1_id_nbank_ca_allnum) {
		this.alm_m1_id_nbank_ca_allnum = alm_m1_id_nbank_ca_allnum;
	}
	public String getAlm_m1_id_nbank_cf_allnum() {
		return alm_m1_id_nbank_cf_allnum;
	}
	public void setAlm_m1_id_nbank_cf_allnum(String alm_m1_id_nbank_cf_allnum) {
		this.alm_m1_id_nbank_cf_allnum = alm_m1_id_nbank_cf_allnum;
	}
	public String getAlm_m1_id_nbank_com_allnum() {
		return alm_m1_id_nbank_com_allnum;
	}
	public void setAlm_m1_id_nbank_com_allnum(String alm_m1_id_nbank_com_allnum) {
		this.alm_m1_id_nbank_com_allnum = alm_m1_id_nbank_com_allnum;
	}
	public String getAlm_m1_id_nbank_oth_allnum() {
		return alm_m1_id_nbank_oth_allnum;
	}
	public void setAlm_m1_id_nbank_oth_allnum(String alm_m1_id_nbank_oth_allnum) {
		this.alm_m1_id_nbank_oth_allnum = alm_m1_id_nbank_oth_allnum;
	}
	public String getAlm_m1_id_nbank_orgnum() {
		return alm_m1_id_nbank_orgnum;
	}
	public void setAlm_m1_id_nbank_orgnum(String alm_m1_id_nbank_orgnum) {
		this.alm_m1_id_nbank_orgnum = alm_m1_id_nbank_orgnum;
	}
	public String getAlm_m1_id_nbank_p2p_orgnum() {
		return alm_m1_id_nbank_p2p_orgnum;
	}
	public void setAlm_m1_id_nbank_p2p_orgnum(String alm_m1_id_nbank_p2p_orgnum) {
		this.alm_m1_id_nbank_p2p_orgnum = alm_m1_id_nbank_p2p_orgnum;
	}
	public String getAlm_m1_id_nbank_mc_orgnum() {
		return alm_m1_id_nbank_mc_orgnum;
	}
	public void setAlm_m1_id_nbank_mc_orgnum(String alm_m1_id_nbank_mc_orgnum) {
		this.alm_m1_id_nbank_mc_orgnum = alm_m1_id_nbank_mc_orgnum;
	}
	public String getAlm_m1_id_nbank_ca_orgnum() {
		return alm_m1_id_nbank_ca_orgnum;
	}
	public void setAlm_m1_id_nbank_ca_orgnum(String alm_m1_id_nbank_ca_orgnum) {
		this.alm_m1_id_nbank_ca_orgnum = alm_m1_id_nbank_ca_orgnum;
	}
	public String getAlm_m1_id_nbank_cf_orgnum() {
		return alm_m1_id_nbank_cf_orgnum;
	}
	public void setAlm_m1_id_nbank_cf_orgnum(String alm_m1_id_nbank_cf_orgnum) {
		this.alm_m1_id_nbank_cf_orgnum = alm_m1_id_nbank_cf_orgnum;
	}
	public String getAlm_m1_id_nbank_com_orgnum() {
		return alm_m1_id_nbank_com_orgnum;
	}
	public void setAlm_m1_id_nbank_com_orgnum(String alm_m1_id_nbank_com_orgnum) {
		this.alm_m1_id_nbank_com_orgnum = alm_m1_id_nbank_com_orgnum;
	}
	public String getAlm_m1_id_nbank_oth_orgnum() {
		return alm_m1_id_nbank_oth_orgnum;
	}
	public void setAlm_m1_id_nbank_oth_orgnum(String alm_m1_id_nbank_oth_orgnum) {
		this.alm_m1_id_nbank_oth_orgnum = alm_m1_id_nbank_oth_orgnum;
	}
	public String getAlm_m1_cell_bank_selfnum() {
		return alm_m1_cell_bank_selfnum;
	}
	public void setAlm_m1_cell_bank_selfnum(String alm_m1_cell_bank_selfnum) {
		this.alm_m1_cell_bank_selfnum = alm_m1_cell_bank_selfnum;
	}
	public String getAlm_m1_cell_bank_allnum() {
		return alm_m1_cell_bank_allnum;
	}
	public void setAlm_m1_cell_bank_allnum(String alm_m1_cell_bank_allnum) {
		this.alm_m1_cell_bank_allnum = alm_m1_cell_bank_allnum;
	}
	public String getAlm_m1_cell_bank_orgnum() {
		return alm_m1_cell_bank_orgnum;
	}
	public void setAlm_m1_cell_bank_orgnum(String alm_m1_cell_bank_orgnum) {
		this.alm_m1_cell_bank_orgnum = alm_m1_cell_bank_orgnum;
	}
	public String getAlm_m1_cell_nbank_selfnum() {
		return alm_m1_cell_nbank_selfnum;
	}
	public void setAlm_m1_cell_nbank_selfnum(String alm_m1_cell_nbank_selfnum) {
		this.alm_m1_cell_nbank_selfnum = alm_m1_cell_nbank_selfnum;
	}
	public String getAlm_m1_cell_nbank_allnum() {
		return alm_m1_cell_nbank_allnum;
	}
	public void setAlm_m1_cell_nbank_allnum(String alm_m1_cell_nbank_allnum) {
		this.alm_m1_cell_nbank_allnum = alm_m1_cell_nbank_allnum;
	}
	public String getAlm_m1_cell_nbank_p2p_allnum() {
		return alm_m1_cell_nbank_p2p_allnum;
	}
	public void setAlm_m1_cell_nbank_p2p_allnum(String alm_m1_cell_nbank_p2p_allnum) {
		this.alm_m1_cell_nbank_p2p_allnum = alm_m1_cell_nbank_p2p_allnum;
	}
	public String getAlm_m1_cell_nbank_mc_allnum() {
		return alm_m1_cell_nbank_mc_allnum;
	}
	public void setAlm_m1_cell_nbank_mc_allnum(String alm_m1_cell_nbank_mc_allnum) {
		this.alm_m1_cell_nbank_mc_allnum = alm_m1_cell_nbank_mc_allnum;
	}
	public String getAlm_m1_cell_nbank_ca_allnum() {
		return alm_m1_cell_nbank_ca_allnum;
	}
	public void setAlm_m1_cell_nbank_ca_allnum(String alm_m1_cell_nbank_ca_allnum) {
		this.alm_m1_cell_nbank_ca_allnum = alm_m1_cell_nbank_ca_allnum;
	}
	public String getAlm_m1_cell_nbank_cf_allnum() {
		return alm_m1_cell_nbank_cf_allnum;
	}
	public void setAlm_m1_cell_nbank_cf_allnum(String alm_m1_cell_nbank_cf_allnum) {
		this.alm_m1_cell_nbank_cf_allnum = alm_m1_cell_nbank_cf_allnum;
	}
	public String getAlm_m1_cell_nbank_com_allnum() {
		return alm_m1_cell_nbank_com_allnum;
	}
	public void setAlm_m1_cell_nbank_com_allnum(String alm_m1_cell_nbank_com_allnum) {
		this.alm_m1_cell_nbank_com_allnum = alm_m1_cell_nbank_com_allnum;
	}
	public String getAlm_m1_cell_nbank_oth_allnum() {
		return alm_m1_cell_nbank_oth_allnum;
	}
	public void setAlm_m1_cell_nbank_oth_allnum(String alm_m1_cell_nbank_oth_allnum) {
		this.alm_m1_cell_nbank_oth_allnum = alm_m1_cell_nbank_oth_allnum;
	}
	public String getAlm_m1_cell_nbank_orgnum() {
		return alm_m1_cell_nbank_orgnum;
	}
	public void setAlm_m1_cell_nbank_orgnum(String alm_m1_cell_nbank_orgnum) {
		this.alm_m1_cell_nbank_orgnum = alm_m1_cell_nbank_orgnum;
	}
	public String getAlm_m1_cell_nbank_p2p_orgnum() {
		return alm_m1_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m1_cell_nbank_p2p_orgnum(String alm_m1_cell_nbank_p2p_orgnum) {
		this.alm_m1_cell_nbank_p2p_orgnum = alm_m1_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m1_cell_nbank_mc_orgnum() {
		return alm_m1_cell_nbank_mc_orgnum;
	}
	public void setAlm_m1_cell_nbank_mc_orgnum(String alm_m1_cell_nbank_mc_orgnum) {
		this.alm_m1_cell_nbank_mc_orgnum = alm_m1_cell_nbank_mc_orgnum;
	}
	public String getAlm_m1_cell_nbank_ca_orgnum() {
		return alm_m1_cell_nbank_ca_orgnum;
	}
	public void setAlm_m1_cell_nbank_ca_orgnum(String alm_m1_cell_nbank_ca_orgnum) {
		this.alm_m1_cell_nbank_ca_orgnum = alm_m1_cell_nbank_ca_orgnum;
	}
	public String getAlm_m1_cell_nbank_cf_orgnum() {
		return alm_m1_cell_nbank_cf_orgnum;
	}
	public void setAlm_m1_cell_nbank_cf_orgnum(String alm_m1_cell_nbank_cf_orgnum) {
		this.alm_m1_cell_nbank_cf_orgnum = alm_m1_cell_nbank_cf_orgnum;
	}
	public String getAlm_m1_cell_nbank_com_orgnum() {
		return alm_m1_cell_nbank_com_orgnum;
	}
	public void setAlm_m1_cell_nbank_com_orgnum(String alm_m1_cell_nbank_com_orgnum) {
		this.alm_m1_cell_nbank_com_orgnum = alm_m1_cell_nbank_com_orgnum;
	}
	public String getAlm_m1_cell_nbank_oth_orgnum() {
		return alm_m1_cell_nbank_oth_orgnum;
	}
	public void setAlm_m1_cell_nbank_oth_orgnum(String alm_m1_cell_nbank_oth_orgnum) {
		this.alm_m1_cell_nbank_oth_orgnum = alm_m1_cell_nbank_oth_orgnum;
	}
	public String getAlm_m1_lm_cell_bank_selfnum() {
		return alm_m1_lm_cell_bank_selfnum;
	}
	public void setAlm_m1_lm_cell_bank_selfnum(String alm_m1_lm_cell_bank_selfnum) {
		this.alm_m1_lm_cell_bank_selfnum = alm_m1_lm_cell_bank_selfnum;
	}
	public String getAlm_m1_lm_cell_bank_allnum() {
		return alm_m1_lm_cell_bank_allnum;
	}
	public void setAlm_m1_lm_cell_bank_allnum(String alm_m1_lm_cell_bank_allnum) {
		this.alm_m1_lm_cell_bank_allnum = alm_m1_lm_cell_bank_allnum;
	}
	public String getAlm_m1_lm_cell_bank_orgnum() {
		return alm_m1_lm_cell_bank_orgnum;
	}
	public void setAlm_m1_lm_cell_bank_orgnum(String alm_m1_lm_cell_bank_orgnum) {
		this.alm_m1_lm_cell_bank_orgnum = alm_m1_lm_cell_bank_orgnum;
	}
	public String getAlm_m1_lm_cell_nbank_selfnum() {
		return alm_m1_lm_cell_nbank_selfnum;
	}
	public void setAlm_m1_lm_cell_nbank_selfnum(String alm_m1_lm_cell_nbank_selfnum) {
		this.alm_m1_lm_cell_nbank_selfnum = alm_m1_lm_cell_nbank_selfnum;
	}
	public String getAlm_m1_lm_cell_nbank_allnum() {
		return alm_m1_lm_cell_nbank_allnum;
	}
	public void setAlm_m1_lm_cell_nbank_allnum(String alm_m1_lm_cell_nbank_allnum) {
		this.alm_m1_lm_cell_nbank_allnum = alm_m1_lm_cell_nbank_allnum;
	}
	public String getAlm_m1_lm_cell_nbank_p2p_allnum() {
		return alm_m1_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m1_lm_cell_nbank_p2p_allnum(String alm_m1_lm_cell_nbank_p2p_allnum) {
		this.alm_m1_lm_cell_nbank_p2p_allnum = alm_m1_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m1_lm_cell_nbank_mc_allnum() {
		return alm_m1_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m1_lm_cell_nbank_mc_allnum(String alm_m1_lm_cell_nbank_mc_allnum) {
		this.alm_m1_lm_cell_nbank_mc_allnum = alm_m1_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m1_lm_cell_nbank_ca_allnum() {
		return alm_m1_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m1_lm_cell_nbank_ca_allnum(String alm_m1_lm_cell_nbank_ca_allnum) {
		this.alm_m1_lm_cell_nbank_ca_allnum = alm_m1_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m1_lm_cell_nbank_cf_allnum() {
		return alm_m1_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m1_lm_cell_nbank_cf_allnum(String alm_m1_lm_cell_nbank_cf_allnum) {
		this.alm_m1_lm_cell_nbank_cf_allnum = alm_m1_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m1_lm_cell_nbank_com_allnum() {
		return alm_m1_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m1_lm_cell_nbank_com_allnum(String alm_m1_lm_cell_nbank_com_allnum) {
		this.alm_m1_lm_cell_nbank_com_allnum = alm_m1_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m1_lm_cell_nbank_oth_allnum() {
		return alm_m1_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m1_lm_cell_nbank_oth_allnum(String alm_m1_lm_cell_nbank_oth_allnum) {
		this.alm_m1_lm_cell_nbank_oth_allnum = alm_m1_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m1_lm_cell_nbank_orgnum() {
		return alm_m1_lm_cell_nbank_orgnum;
	}
	public void setAlm_m1_lm_cell_nbank_orgnum(String alm_m1_lm_cell_nbank_orgnum) {
		this.alm_m1_lm_cell_nbank_orgnum = alm_m1_lm_cell_nbank_orgnum;
	}
	public String getAlm_m1_lm_cell_nbank_p2p_orgnum() {
		return alm_m1_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m1_lm_cell_nbank_p2p_orgnum(String alm_m1_lm_cell_nbank_p2p_orgnum) {
		this.alm_m1_lm_cell_nbank_p2p_orgnum = alm_m1_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m1_lm_cell_nbank_mc_orgnum() {
		return alm_m1_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m1_lm_cell_nbank_mc_orgnum(String alm_m1_lm_cell_nbank_mc_orgnum) {
		this.alm_m1_lm_cell_nbank_mc_orgnum = alm_m1_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m1_lm_cell_nbank_ca_orgnum() {
		return alm_m1_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m1_lm_cell_nbank_ca_orgnum(String alm_m1_lm_cell_nbank_ca_orgnum) {
		this.alm_m1_lm_cell_nbank_ca_orgnum = alm_m1_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m1_lm_cell_nbank_cf_orgnum() {
		return alm_m1_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m1_lm_cell_nbank_cf_orgnum(String alm_m1_lm_cell_nbank_cf_orgnum) {
		this.alm_m1_lm_cell_nbank_cf_orgnum = alm_m1_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m1_lm_cell_nbank_com_orgnum() {
		return alm_m1_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m1_lm_cell_nbank_com_orgnum(String alm_m1_lm_cell_nbank_com_orgnum) {
		this.alm_m1_lm_cell_nbank_com_orgnum = alm_m1_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m1_lm_cell_nbank_oth_orgnum() {
		return alm_m1_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m1_lm_cell_nbank_oth_orgnum(String alm_m1_lm_cell_nbank_oth_orgnum) {
		this.alm_m1_lm_cell_nbank_oth_orgnum = alm_m1_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m2_id_bank_selfnum() {
		return alm_m2_id_bank_selfnum;
	}
	public void setAlm_m2_id_bank_selfnum(String alm_m2_id_bank_selfnum) {
		this.alm_m2_id_bank_selfnum = alm_m2_id_bank_selfnum;
	}
	public String getAlm_m2_id_bank_allnum() {
		return alm_m2_id_bank_allnum;
	}
	public void setAlm_m2_id_bank_allnum(String alm_m2_id_bank_allnum) {
		this.alm_m2_id_bank_allnum = alm_m2_id_bank_allnum;
	}
	public String getAlm_m2_id_bank_orgnum() {
		return alm_m2_id_bank_orgnum;
	}
	public void setAlm_m2_id_bank_orgnum(String alm_m2_id_bank_orgnum) {
		this.alm_m2_id_bank_orgnum = alm_m2_id_bank_orgnum;
	}
	public String getAlm_m2_id_nbank_selfnum() {
		return alm_m2_id_nbank_selfnum;
	}
	public void setAlm_m2_id_nbank_selfnum(String alm_m2_id_nbank_selfnum) {
		this.alm_m2_id_nbank_selfnum = alm_m2_id_nbank_selfnum;
	}
	public String getAlm_m2_id_nbank_allnum() {
		return alm_m2_id_nbank_allnum;
	}
	public void setAlm_m2_id_nbank_allnum(String alm_m2_id_nbank_allnum) {
		this.alm_m2_id_nbank_allnum = alm_m2_id_nbank_allnum;
	}
	public String getAlm_m2_id_nbank_p2p_allnum() {
		return alm_m2_id_nbank_p2p_allnum;
	}
	public void setAlm_m2_id_nbank_p2p_allnum(String alm_m2_id_nbank_p2p_allnum) {
		this.alm_m2_id_nbank_p2p_allnum = alm_m2_id_nbank_p2p_allnum;
	}
	public String getAlm_m2_id_nbank_mc_allnum() {
		return alm_m2_id_nbank_mc_allnum;
	}
	public void setAlm_m2_id_nbank_mc_allnum(String alm_m2_id_nbank_mc_allnum) {
		this.alm_m2_id_nbank_mc_allnum = alm_m2_id_nbank_mc_allnum;
	}
	public String getAlm_m2_id_nbank_ca_allnum() {
		return alm_m2_id_nbank_ca_allnum;
	}
	public void setAlm_m2_id_nbank_ca_allnum(String alm_m2_id_nbank_ca_allnum) {
		this.alm_m2_id_nbank_ca_allnum = alm_m2_id_nbank_ca_allnum;
	}
	public String getAlm_m2_id_nbank_cf_allnum() {
		return alm_m2_id_nbank_cf_allnum;
	}
	public void setAlm_m2_id_nbank_cf_allnum(String alm_m2_id_nbank_cf_allnum) {
		this.alm_m2_id_nbank_cf_allnum = alm_m2_id_nbank_cf_allnum;
	}
	public String getAlm_m2_id_nbank_com_allnum() {
		return alm_m2_id_nbank_com_allnum;
	}
	public void setAlm_m2_id_nbank_com_allnum(String alm_m2_id_nbank_com_allnum) {
		this.alm_m2_id_nbank_com_allnum = alm_m2_id_nbank_com_allnum;
	}
	public String getAlm_m2_id_nbank_oth_allnum() {
		return alm_m2_id_nbank_oth_allnum;
	}
	public void setAlm_m2_id_nbank_oth_allnum(String alm_m2_id_nbank_oth_allnum) {
		this.alm_m2_id_nbank_oth_allnum = alm_m2_id_nbank_oth_allnum;
	}
	public String getAlm_m2_id_nbank_orgnum() {
		return alm_m2_id_nbank_orgnum;
	}
	public void setAlm_m2_id_nbank_orgnum(String alm_m2_id_nbank_orgnum) {
		this.alm_m2_id_nbank_orgnum = alm_m2_id_nbank_orgnum;
	}
	public String getAlm_m2_id_nbank_p2p_orgnum() {
		return alm_m2_id_nbank_p2p_orgnum;
	}
	public void setAlm_m2_id_nbank_p2p_orgnum(String alm_m2_id_nbank_p2p_orgnum) {
		this.alm_m2_id_nbank_p2p_orgnum = alm_m2_id_nbank_p2p_orgnum;
	}
	public String getAlm_m2_id_nbank_mc_orgnum() {
		return alm_m2_id_nbank_mc_orgnum;
	}
	public void setAlm_m2_id_nbank_mc_orgnum(String alm_m2_id_nbank_mc_orgnum) {
		this.alm_m2_id_nbank_mc_orgnum = alm_m2_id_nbank_mc_orgnum;
	}
	public String getAlm_m2_id_nbank_ca_orgnum() {
		return alm_m2_id_nbank_ca_orgnum;
	}
	public void setAlm_m2_id_nbank_ca_orgnum(String alm_m2_id_nbank_ca_orgnum) {
		this.alm_m2_id_nbank_ca_orgnum = alm_m2_id_nbank_ca_orgnum;
	}
	public String getAlm_m2_id_nbank_cf_orgnum() {
		return alm_m2_id_nbank_cf_orgnum;
	}
	public void setAlm_m2_id_nbank_cf_orgnum(String alm_m2_id_nbank_cf_orgnum) {
		this.alm_m2_id_nbank_cf_orgnum = alm_m2_id_nbank_cf_orgnum;
	}
	public String getAlm_m2_id_nbank_com_orgnum() {
		return alm_m2_id_nbank_com_orgnum;
	}
	public void setAlm_m2_id_nbank_com_orgnum(String alm_m2_id_nbank_com_orgnum) {
		this.alm_m2_id_nbank_com_orgnum = alm_m2_id_nbank_com_orgnum;
	}
	public String getAlm_m2_id_nbank_oth_orgnum() {
		return alm_m2_id_nbank_oth_orgnum;
	}
	public void setAlm_m2_id_nbank_oth_orgnum(String alm_m2_id_nbank_oth_orgnum) {
		this.alm_m2_id_nbank_oth_orgnum = alm_m2_id_nbank_oth_orgnum;
	}
	public String getAlm_m2_cell_bank_selfnum() {
		return alm_m2_cell_bank_selfnum;
	}
	public void setAlm_m2_cell_bank_selfnum(String alm_m2_cell_bank_selfnum) {
		this.alm_m2_cell_bank_selfnum = alm_m2_cell_bank_selfnum;
	}
	public String getAlm_m2_cell_bank_allnum() {
		return alm_m2_cell_bank_allnum;
	}
	public void setAlm_m2_cell_bank_allnum(String alm_m2_cell_bank_allnum) {
		this.alm_m2_cell_bank_allnum = alm_m2_cell_bank_allnum;
	}
	public String getAlm_m2_cell_bank_orgnum() {
		return alm_m2_cell_bank_orgnum;
	}
	public void setAlm_m2_cell_bank_orgnum(String alm_m2_cell_bank_orgnum) {
		this.alm_m2_cell_bank_orgnum = alm_m2_cell_bank_orgnum;
	}
	public String getAlm_m2_cell_nbank_selfnum() {
		return alm_m2_cell_nbank_selfnum;
	}
	public void setAlm_m2_cell_nbank_selfnum(String alm_m2_cell_nbank_selfnum) {
		this.alm_m2_cell_nbank_selfnum = alm_m2_cell_nbank_selfnum;
	}
	public String getAlm_m2_cell_nbank_allnum() {
		return alm_m2_cell_nbank_allnum;
	}
	public void setAlm_m2_cell_nbank_allnum(String alm_m2_cell_nbank_allnum) {
		this.alm_m2_cell_nbank_allnum = alm_m2_cell_nbank_allnum;
	}
	public String getAlm_m2_cell_nbank_p2p_allnum() {
		return alm_m2_cell_nbank_p2p_allnum;
	}
	public void setAlm_m2_cell_nbank_p2p_allnum(String alm_m2_cell_nbank_p2p_allnum) {
		this.alm_m2_cell_nbank_p2p_allnum = alm_m2_cell_nbank_p2p_allnum;
	}
	public String getAlm_m2_cell_nbank_mc_allnum() {
		return alm_m2_cell_nbank_mc_allnum;
	}
	public void setAlm_m2_cell_nbank_mc_allnum(String alm_m2_cell_nbank_mc_allnum) {
		this.alm_m2_cell_nbank_mc_allnum = alm_m2_cell_nbank_mc_allnum;
	}
	public String getAlm_m2_cell_nbank_ca_allnum() {
		return alm_m2_cell_nbank_ca_allnum;
	}
	public void setAlm_m2_cell_nbank_ca_allnum(String alm_m2_cell_nbank_ca_allnum) {
		this.alm_m2_cell_nbank_ca_allnum = alm_m2_cell_nbank_ca_allnum;
	}
	public String getAlm_m2_cell_nbank_cf_allnum() {
		return alm_m2_cell_nbank_cf_allnum;
	}
	public void setAlm_m2_cell_nbank_cf_allnum(String alm_m2_cell_nbank_cf_allnum) {
		this.alm_m2_cell_nbank_cf_allnum = alm_m2_cell_nbank_cf_allnum;
	}
	public String getAlm_m2_cell_nbank_com_allnum() {
		return alm_m2_cell_nbank_com_allnum;
	}
	public void setAlm_m2_cell_nbank_com_allnum(String alm_m2_cell_nbank_com_allnum) {
		this.alm_m2_cell_nbank_com_allnum = alm_m2_cell_nbank_com_allnum;
	}
	public String getAlm_m2_cell_nbank_oth_allnum() {
		return alm_m2_cell_nbank_oth_allnum;
	}
	public void setAlm_m2_cell_nbank_oth_allnum(String alm_m2_cell_nbank_oth_allnum) {
		this.alm_m2_cell_nbank_oth_allnum = alm_m2_cell_nbank_oth_allnum;
	}
	public String getAlm_m2_cell_nbank_orgnum() {
		return alm_m2_cell_nbank_orgnum;
	}
	public void setAlm_m2_cell_nbank_orgnum(String alm_m2_cell_nbank_orgnum) {
		this.alm_m2_cell_nbank_orgnum = alm_m2_cell_nbank_orgnum;
	}
	public String getAlm_m2_cell_nbank_p2p_orgnum() {
		return alm_m2_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m2_cell_nbank_p2p_orgnum(String alm_m2_cell_nbank_p2p_orgnum) {
		this.alm_m2_cell_nbank_p2p_orgnum = alm_m2_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m2_cell_nbank_mc_orgnum() {
		return alm_m2_cell_nbank_mc_orgnum;
	}
	public void setAlm_m2_cell_nbank_mc_orgnum(String alm_m2_cell_nbank_mc_orgnum) {
		this.alm_m2_cell_nbank_mc_orgnum = alm_m2_cell_nbank_mc_orgnum;
	}
	public String getAlm_m2_cell_nbank_ca_orgnum() {
		return alm_m2_cell_nbank_ca_orgnum;
	}
	public void setAlm_m2_cell_nbank_ca_orgnum(String alm_m2_cell_nbank_ca_orgnum) {
		this.alm_m2_cell_nbank_ca_orgnum = alm_m2_cell_nbank_ca_orgnum;
	}
	public String getAlm_m2_cell_nbank_cf_orgnum() {
		return alm_m2_cell_nbank_cf_orgnum;
	}
	public void setAlm_m2_cell_nbank_cf_orgnum(String alm_m2_cell_nbank_cf_orgnum) {
		this.alm_m2_cell_nbank_cf_orgnum = alm_m2_cell_nbank_cf_orgnum;
	}
	public String getAlm_m2_cell_nbank_com_orgnum() {
		return alm_m2_cell_nbank_com_orgnum;
	}
	public void setAlm_m2_cell_nbank_com_orgnum(String alm_m2_cell_nbank_com_orgnum) {
		this.alm_m2_cell_nbank_com_orgnum = alm_m2_cell_nbank_com_orgnum;
	}
	public String getAlm_m2_cell_nbank_oth_orgnum() {
		return alm_m2_cell_nbank_oth_orgnum;
	}
	public void setAlm_m2_cell_nbank_oth_orgnum(String alm_m2_cell_nbank_oth_orgnum) {
		this.alm_m2_cell_nbank_oth_orgnum = alm_m2_cell_nbank_oth_orgnum;
	}
	public String getAlm_m2_lm_cell_bank_selfnum() {
		return alm_m2_lm_cell_bank_selfnum;
	}
	public void setAlm_m2_lm_cell_bank_selfnum(String alm_m2_lm_cell_bank_selfnum) {
		this.alm_m2_lm_cell_bank_selfnum = alm_m2_lm_cell_bank_selfnum;
	}
	public String getAlm_m2_lm_cell_bank_allnum() {
		return alm_m2_lm_cell_bank_allnum;
	}
	public void setAlm_m2_lm_cell_bank_allnum(String alm_m2_lm_cell_bank_allnum) {
		this.alm_m2_lm_cell_bank_allnum = alm_m2_lm_cell_bank_allnum;
	}
	public String getAlm_m2_lm_cell_bank_orgnum() {
		return alm_m2_lm_cell_bank_orgnum;
	}
	public void setAlm_m2_lm_cell_bank_orgnum(String alm_m2_lm_cell_bank_orgnum) {
		this.alm_m2_lm_cell_bank_orgnum = alm_m2_lm_cell_bank_orgnum;
	}
	public String getAlm_m2_lm_cell_nbank_selfnum() {
		return alm_m2_lm_cell_nbank_selfnum;
	}
	public void setAlm_m2_lm_cell_nbank_selfnum(String alm_m2_lm_cell_nbank_selfnum) {
		this.alm_m2_lm_cell_nbank_selfnum = alm_m2_lm_cell_nbank_selfnum;
	}
	public String getAlm_m2_lm_cell_nbank_allnum() {
		return alm_m2_lm_cell_nbank_allnum;
	}
	public void setAlm_m2_lm_cell_nbank_allnum(String alm_m2_lm_cell_nbank_allnum) {
		this.alm_m2_lm_cell_nbank_allnum = alm_m2_lm_cell_nbank_allnum;
	}
	public String getAlm_m2_lm_cell_nbank_p2p_allnum() {
		return alm_m2_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m2_lm_cell_nbank_p2p_allnum(String alm_m2_lm_cell_nbank_p2p_allnum) {
		this.alm_m2_lm_cell_nbank_p2p_allnum = alm_m2_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m2_lm_cell_nbank_mc_allnum() {
		return alm_m2_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m2_lm_cell_nbank_mc_allnum(String alm_m2_lm_cell_nbank_mc_allnum) {
		this.alm_m2_lm_cell_nbank_mc_allnum = alm_m2_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m2_lm_cell_nbank_ca_allnum() {
		return alm_m2_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m2_lm_cell_nbank_ca_allnum(String alm_m2_lm_cell_nbank_ca_allnum) {
		this.alm_m2_lm_cell_nbank_ca_allnum = alm_m2_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m2_lm_cell_nbank_cf_allnum() {
		return alm_m2_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m2_lm_cell_nbank_cf_allnum(String alm_m2_lm_cell_nbank_cf_allnum) {
		this.alm_m2_lm_cell_nbank_cf_allnum = alm_m2_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m2_lm_cell_nbank_com_allnum() {
		return alm_m2_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m2_lm_cell_nbank_com_allnum(String alm_m2_lm_cell_nbank_com_allnum) {
		this.alm_m2_lm_cell_nbank_com_allnum = alm_m2_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m2_lm_cell_nbank_oth_allnum() {
		return alm_m2_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m2_lm_cell_nbank_oth_allnum(String alm_m2_lm_cell_nbank_oth_allnum) {
		this.alm_m2_lm_cell_nbank_oth_allnum = alm_m2_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m2_lm_cell_nbank_orgnum() {
		return alm_m2_lm_cell_nbank_orgnum;
	}
	public void setAlm_m2_lm_cell_nbank_orgnum(String alm_m2_lm_cell_nbank_orgnum) {
		this.alm_m2_lm_cell_nbank_orgnum = alm_m2_lm_cell_nbank_orgnum;
	}
	public String getAlm_m2_lm_cell_nbank_p2p_orgnum() {
		return alm_m2_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m2_lm_cell_nbank_p2p_orgnum(String alm_m2_lm_cell_nbank_p2p_orgnum) {
		this.alm_m2_lm_cell_nbank_p2p_orgnum = alm_m2_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m2_lm_cell_nbank_mc_orgnum() {
		return alm_m2_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m2_lm_cell_nbank_mc_orgnum(String alm_m2_lm_cell_nbank_mc_orgnum) {
		this.alm_m2_lm_cell_nbank_mc_orgnum = alm_m2_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m2_lm_cell_nbank_ca_orgnum() {
		return alm_m2_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m2_lm_cell_nbank_ca_orgnum(String alm_m2_lm_cell_nbank_ca_orgnum) {
		this.alm_m2_lm_cell_nbank_ca_orgnum = alm_m2_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m2_lm_cell_nbank_cf_orgnum() {
		return alm_m2_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m2_lm_cell_nbank_cf_orgnum(String alm_m2_lm_cell_nbank_cf_orgnum) {
		this.alm_m2_lm_cell_nbank_cf_orgnum = alm_m2_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m2_lm_cell_nbank_com_orgnum() {
		return alm_m2_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m2_lm_cell_nbank_com_orgnum(String alm_m2_lm_cell_nbank_com_orgnum) {
		this.alm_m2_lm_cell_nbank_com_orgnum = alm_m2_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m2_lm_cell_nbank_oth_orgnum() {
		return alm_m2_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m2_lm_cell_nbank_oth_orgnum(String alm_m2_lm_cell_nbank_oth_orgnum) {
		this.alm_m2_lm_cell_nbank_oth_orgnum = alm_m2_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m3_id_bank_selfnum() {
		return alm_m3_id_bank_selfnum;
	}
	public void setAlm_m3_id_bank_selfnum(String alm_m3_id_bank_selfnum) {
		this.alm_m3_id_bank_selfnum = alm_m3_id_bank_selfnum;
	}
	public String getAlm_m3_id_bank_allnum() {
		return alm_m3_id_bank_allnum;
	}
	public void setAlm_m3_id_bank_allnum(String alm_m3_id_bank_allnum) {
		this.alm_m3_id_bank_allnum = alm_m3_id_bank_allnum;
	}
	public String getAlm_m3_id_bank_orgnum() {
		return alm_m3_id_bank_orgnum;
	}
	public void setAlm_m3_id_bank_orgnum(String alm_m3_id_bank_orgnum) {
		this.alm_m3_id_bank_orgnum = alm_m3_id_bank_orgnum;
	}
	public String getAlm_m3_id_nbank_selfnum() {
		return alm_m3_id_nbank_selfnum;
	}
	public void setAlm_m3_id_nbank_selfnum(String alm_m3_id_nbank_selfnum) {
		this.alm_m3_id_nbank_selfnum = alm_m3_id_nbank_selfnum;
	}
	public String getAlm_m3_id_nbank_allnum() {
		return alm_m3_id_nbank_allnum;
	}
	public void setAlm_m3_id_nbank_allnum(String alm_m3_id_nbank_allnum) {
		this.alm_m3_id_nbank_allnum = alm_m3_id_nbank_allnum;
	}
	public String getAlm_m3_id_nbank_p2p_allnum() {
		return alm_m3_id_nbank_p2p_allnum;
	}
	public void setAlm_m3_id_nbank_p2p_allnum(String alm_m3_id_nbank_p2p_allnum) {
		this.alm_m3_id_nbank_p2p_allnum = alm_m3_id_nbank_p2p_allnum;
	}
	public String getAlm_m3_id_nbank_mc_allnum() {
		return alm_m3_id_nbank_mc_allnum;
	}
	public void setAlm_m3_id_nbank_mc_allnum(String alm_m3_id_nbank_mc_allnum) {
		this.alm_m3_id_nbank_mc_allnum = alm_m3_id_nbank_mc_allnum;
	}
	public String getAlm_m3_id_nbank_ca_allnum() {
		return alm_m3_id_nbank_ca_allnum;
	}
	public void setAlm_m3_id_nbank_ca_allnum(String alm_m3_id_nbank_ca_allnum) {
		this.alm_m3_id_nbank_ca_allnum = alm_m3_id_nbank_ca_allnum;
	}
	public String getAlm_m3_id_nbank_cf_allnum() {
		return alm_m3_id_nbank_cf_allnum;
	}
	public void setAlm_m3_id_nbank_cf_allnum(String alm_m3_id_nbank_cf_allnum) {
		this.alm_m3_id_nbank_cf_allnum = alm_m3_id_nbank_cf_allnum;
	}
	public String getAlm_m3_id_nbank_com_allnum() {
		return alm_m3_id_nbank_com_allnum;
	}
	public void setAlm_m3_id_nbank_com_allnum(String alm_m3_id_nbank_com_allnum) {
		this.alm_m3_id_nbank_com_allnum = alm_m3_id_nbank_com_allnum;
	}
	public String getAlm_m3_id_nbank_oth_allnum() {
		return alm_m3_id_nbank_oth_allnum;
	}
	public void setAlm_m3_id_nbank_oth_allnum(String alm_m3_id_nbank_oth_allnum) {
		this.alm_m3_id_nbank_oth_allnum = alm_m3_id_nbank_oth_allnum;
	}
	public String getAlm_m3_id_nbank_orgnum() {
		return alm_m3_id_nbank_orgnum;
	}
	public void setAlm_m3_id_nbank_orgnum(String alm_m3_id_nbank_orgnum) {
		this.alm_m3_id_nbank_orgnum = alm_m3_id_nbank_orgnum;
	}
	public String getAlm_m3_id_nbank_p2p_orgnum() {
		return alm_m3_id_nbank_p2p_orgnum;
	}
	public void setAlm_m3_id_nbank_p2p_orgnum(String alm_m3_id_nbank_p2p_orgnum) {
		this.alm_m3_id_nbank_p2p_orgnum = alm_m3_id_nbank_p2p_orgnum;
	}
	public String getAlm_m3_id_nbank_mc_orgnum() {
		return alm_m3_id_nbank_mc_orgnum;
	}
	public void setAlm_m3_id_nbank_mc_orgnum(String alm_m3_id_nbank_mc_orgnum) {
		this.alm_m3_id_nbank_mc_orgnum = alm_m3_id_nbank_mc_orgnum;
	}
	public String getAlm_m3_id_nbank_ca_orgnum() {
		return alm_m3_id_nbank_ca_orgnum;
	}
	public void setAlm_m3_id_nbank_ca_orgnum(String alm_m3_id_nbank_ca_orgnum) {
		this.alm_m3_id_nbank_ca_orgnum = alm_m3_id_nbank_ca_orgnum;
	}
	public String getAlm_m3_id_nbank_cf_orgnum() {
		return alm_m3_id_nbank_cf_orgnum;
	}
	public void setAlm_m3_id_nbank_cf_orgnum(String alm_m3_id_nbank_cf_orgnum) {
		this.alm_m3_id_nbank_cf_orgnum = alm_m3_id_nbank_cf_orgnum;
	}
	public String getAlm_m3_id_nbank_com_orgnum() {
		return alm_m3_id_nbank_com_orgnum;
	}
	public void setAlm_m3_id_nbank_com_orgnum(String alm_m3_id_nbank_com_orgnum) {
		this.alm_m3_id_nbank_com_orgnum = alm_m3_id_nbank_com_orgnum;
	}
	public String getAlm_m3_id_nbank_oth_orgnum() {
		return alm_m3_id_nbank_oth_orgnum;
	}
	public void setAlm_m3_id_nbank_oth_orgnum(String alm_m3_id_nbank_oth_orgnum) {
		this.alm_m3_id_nbank_oth_orgnum = alm_m3_id_nbank_oth_orgnum;
	}
	public String getAlm_m3_cell_bank_selfnum() {
		return alm_m3_cell_bank_selfnum;
	}
	public void setAlm_m3_cell_bank_selfnum(String alm_m3_cell_bank_selfnum) {
		this.alm_m3_cell_bank_selfnum = alm_m3_cell_bank_selfnum;
	}
	public String getAlm_m3_cell_bank_allnum() {
		return alm_m3_cell_bank_allnum;
	}
	public void setAlm_m3_cell_bank_allnum(String alm_m3_cell_bank_allnum) {
		this.alm_m3_cell_bank_allnum = alm_m3_cell_bank_allnum;
	}
	public String getAlm_m3_cell_bank_orgnum() {
		return alm_m3_cell_bank_orgnum;
	}
	public void setAlm_m3_cell_bank_orgnum(String alm_m3_cell_bank_orgnum) {
		this.alm_m3_cell_bank_orgnum = alm_m3_cell_bank_orgnum;
	}
	public String getAlm_m3_cell_nbank_selfnum() {
		return alm_m3_cell_nbank_selfnum;
	}
	public void setAlm_m3_cell_nbank_selfnum(String alm_m3_cell_nbank_selfnum) {
		this.alm_m3_cell_nbank_selfnum = alm_m3_cell_nbank_selfnum;
	}
	public String getAlm_m3_cell_nbank_allnum() {
		return alm_m3_cell_nbank_allnum;
	}
	public void setAlm_m3_cell_nbank_allnum(String alm_m3_cell_nbank_allnum) {
		this.alm_m3_cell_nbank_allnum = alm_m3_cell_nbank_allnum;
	}
	public String getAlm_m3_cell_nbank_p2p_allnum() {
		return alm_m3_cell_nbank_p2p_allnum;
	}
	public void setAlm_m3_cell_nbank_p2p_allnum(String alm_m3_cell_nbank_p2p_allnum) {
		this.alm_m3_cell_nbank_p2p_allnum = alm_m3_cell_nbank_p2p_allnum;
	}
	public String getAlm_m3_cell_nbank_mc_allnum() {
		return alm_m3_cell_nbank_mc_allnum;
	}
	public void setAlm_m3_cell_nbank_mc_allnum(String alm_m3_cell_nbank_mc_allnum) {
		this.alm_m3_cell_nbank_mc_allnum = alm_m3_cell_nbank_mc_allnum;
	}
	public String getAlm_m3_cell_nbank_ca_allnum() {
		return alm_m3_cell_nbank_ca_allnum;
	}
	public void setAlm_m3_cell_nbank_ca_allnum(String alm_m3_cell_nbank_ca_allnum) {
		this.alm_m3_cell_nbank_ca_allnum = alm_m3_cell_nbank_ca_allnum;
	}
	public String getAlm_m3_cell_nbank_cf_allnum() {
		return alm_m3_cell_nbank_cf_allnum;
	}
	public void setAlm_m3_cell_nbank_cf_allnum(String alm_m3_cell_nbank_cf_allnum) {
		this.alm_m3_cell_nbank_cf_allnum = alm_m3_cell_nbank_cf_allnum;
	}
	public String getAlm_m3_cell_nbank_com_allnum() {
		return alm_m3_cell_nbank_com_allnum;
	}
	public void setAlm_m3_cell_nbank_com_allnum(String alm_m3_cell_nbank_com_allnum) {
		this.alm_m3_cell_nbank_com_allnum = alm_m3_cell_nbank_com_allnum;
	}
	public String getAlm_m3_cell_nbank_oth_allnum() {
		return alm_m3_cell_nbank_oth_allnum;
	}
	public void setAlm_m3_cell_nbank_oth_allnum(String alm_m3_cell_nbank_oth_allnum) {
		this.alm_m3_cell_nbank_oth_allnum = alm_m3_cell_nbank_oth_allnum;
	}
	public String getAlm_m3_cell_nbank_orgnum() {
		return alm_m3_cell_nbank_orgnum;
	}
	public void setAlm_m3_cell_nbank_orgnum(String alm_m3_cell_nbank_orgnum) {
		this.alm_m3_cell_nbank_orgnum = alm_m3_cell_nbank_orgnum;
	}
	public String getAlm_m3_cell_nbank_p2p_orgnum() {
		return alm_m3_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m3_cell_nbank_p2p_orgnum(String alm_m3_cell_nbank_p2p_orgnum) {
		this.alm_m3_cell_nbank_p2p_orgnum = alm_m3_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m3_cell_nbank_mc_orgnum() {
		return alm_m3_cell_nbank_mc_orgnum;
	}
	public void setAlm_m3_cell_nbank_mc_orgnum(String alm_m3_cell_nbank_mc_orgnum) {
		this.alm_m3_cell_nbank_mc_orgnum = alm_m3_cell_nbank_mc_orgnum;
	}
	public String getAlm_m3_cell_nbank_ca_orgnum() {
		return alm_m3_cell_nbank_ca_orgnum;
	}
	public void setAlm_m3_cell_nbank_ca_orgnum(String alm_m3_cell_nbank_ca_orgnum) {
		this.alm_m3_cell_nbank_ca_orgnum = alm_m3_cell_nbank_ca_orgnum;
	}
	public String getAlm_m3_cell_nbank_cf_orgnum() {
		return alm_m3_cell_nbank_cf_orgnum;
	}
	public void setAlm_m3_cell_nbank_cf_orgnum(String alm_m3_cell_nbank_cf_orgnum) {
		this.alm_m3_cell_nbank_cf_orgnum = alm_m3_cell_nbank_cf_orgnum;
	}
	public String getAlm_m3_cell_nbank_com_orgnum() {
		return alm_m3_cell_nbank_com_orgnum;
	}
	public void setAlm_m3_cell_nbank_com_orgnum(String alm_m3_cell_nbank_com_orgnum) {
		this.alm_m3_cell_nbank_com_orgnum = alm_m3_cell_nbank_com_orgnum;
	}
	public String getAlm_m3_cell_nbank_oth_orgnum() {
		return alm_m3_cell_nbank_oth_orgnum;
	}
	public void setAlm_m3_cell_nbank_oth_orgnum(String alm_m3_cell_nbank_oth_orgnum) {
		this.alm_m3_cell_nbank_oth_orgnum = alm_m3_cell_nbank_oth_orgnum;
	}
	public String getAlm_m3_lm_cell_bank_selfnum() {
		return alm_m3_lm_cell_bank_selfnum;
	}
	public void setAlm_m3_lm_cell_bank_selfnum(String alm_m3_lm_cell_bank_selfnum) {
		this.alm_m3_lm_cell_bank_selfnum = alm_m3_lm_cell_bank_selfnum;
	}
	public String getAlm_m3_lm_cell_bank_allnum() {
		return alm_m3_lm_cell_bank_allnum;
	}
	public void setAlm_m3_lm_cell_bank_allnum(String alm_m3_lm_cell_bank_allnum) {
		this.alm_m3_lm_cell_bank_allnum = alm_m3_lm_cell_bank_allnum;
	}
	public String getAlm_m3_lm_cell_bank_orgnum() {
		return alm_m3_lm_cell_bank_orgnum;
	}
	public void setAlm_m3_lm_cell_bank_orgnum(String alm_m3_lm_cell_bank_orgnum) {
		this.alm_m3_lm_cell_bank_orgnum = alm_m3_lm_cell_bank_orgnum;
	}
	public String getAlm_m3_lm_cell_nbank_selfnum() {
		return alm_m3_lm_cell_nbank_selfnum;
	}
	public void setAlm_m3_lm_cell_nbank_selfnum(String alm_m3_lm_cell_nbank_selfnum) {
		this.alm_m3_lm_cell_nbank_selfnum = alm_m3_lm_cell_nbank_selfnum;
	}
	public String getAlm_m3_lm_cell_nbank_allnum() {
		return alm_m3_lm_cell_nbank_allnum;
	}
	public void setAlm_m3_lm_cell_nbank_allnum(String alm_m3_lm_cell_nbank_allnum) {
		this.alm_m3_lm_cell_nbank_allnum = alm_m3_lm_cell_nbank_allnum;
	}
	public String getAlm_m3_lm_cell_nbank_p2p_allnum() {
		return alm_m3_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m3_lm_cell_nbank_p2p_allnum(String alm_m3_lm_cell_nbank_p2p_allnum) {
		this.alm_m3_lm_cell_nbank_p2p_allnum = alm_m3_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m3_lm_cell_nbank_mc_allnum() {
		return alm_m3_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m3_lm_cell_nbank_mc_allnum(String alm_m3_lm_cell_nbank_mc_allnum) {
		this.alm_m3_lm_cell_nbank_mc_allnum = alm_m3_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m3_lm_cell_nbank_ca_allnum() {
		return alm_m3_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m3_lm_cell_nbank_ca_allnum(String alm_m3_lm_cell_nbank_ca_allnum) {
		this.alm_m3_lm_cell_nbank_ca_allnum = alm_m3_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m3_lm_cell_nbank_cf_allnum() {
		return alm_m3_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m3_lm_cell_nbank_cf_allnum(String alm_m3_lm_cell_nbank_cf_allnum) {
		this.alm_m3_lm_cell_nbank_cf_allnum = alm_m3_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m3_lm_cell_nbank_com_allnum() {
		return alm_m3_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m3_lm_cell_nbank_com_allnum(String alm_m3_lm_cell_nbank_com_allnum) {
		this.alm_m3_lm_cell_nbank_com_allnum = alm_m3_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m3_lm_cell_nbank_oth_allnum() {
		return alm_m3_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m3_lm_cell_nbank_oth_allnum(String alm_m3_lm_cell_nbank_oth_allnum) {
		this.alm_m3_lm_cell_nbank_oth_allnum = alm_m3_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m3_lm_cell_nbank_orgnum() {
		return alm_m3_lm_cell_nbank_orgnum;
	}
	public void setAlm_m3_lm_cell_nbank_orgnum(String alm_m3_lm_cell_nbank_orgnum) {
		this.alm_m3_lm_cell_nbank_orgnum = alm_m3_lm_cell_nbank_orgnum;
	}
	public String getAlm_m3_lm_cell_nbank_p2p_orgnum() {
		return alm_m3_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m3_lm_cell_nbank_p2p_orgnum(String alm_m3_lm_cell_nbank_p2p_orgnum) {
		this.alm_m3_lm_cell_nbank_p2p_orgnum = alm_m3_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m3_lm_cell_nbank_mc_orgnum() {
		return alm_m3_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m3_lm_cell_nbank_mc_orgnum(String alm_m3_lm_cell_nbank_mc_orgnum) {
		this.alm_m3_lm_cell_nbank_mc_orgnum = alm_m3_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m3_lm_cell_nbank_ca_orgnum() {
		return alm_m3_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m3_lm_cell_nbank_ca_orgnum(String alm_m3_lm_cell_nbank_ca_orgnum) {
		this.alm_m3_lm_cell_nbank_ca_orgnum = alm_m3_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m3_lm_cell_nbank_cf_orgnum() {
		return alm_m3_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m3_lm_cell_nbank_cf_orgnum(String alm_m3_lm_cell_nbank_cf_orgnum) {
		this.alm_m3_lm_cell_nbank_cf_orgnum = alm_m3_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m3_lm_cell_nbank_com_orgnum() {
		return alm_m3_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m3_lm_cell_nbank_com_orgnum(String alm_m3_lm_cell_nbank_com_orgnum) {
		this.alm_m3_lm_cell_nbank_com_orgnum = alm_m3_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m3_lm_cell_nbank_oth_orgnum() {
		return alm_m3_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m3_lm_cell_nbank_oth_orgnum(String alm_m3_lm_cell_nbank_oth_orgnum) {
		this.alm_m3_lm_cell_nbank_oth_orgnum = alm_m3_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m4_id_bank_selfnum() {
		return alm_m4_id_bank_selfnum;
	}
	public void setAlm_m4_id_bank_selfnum(String alm_m4_id_bank_selfnum) {
		this.alm_m4_id_bank_selfnum = alm_m4_id_bank_selfnum;
	}
	public String getAlm_m4_id_bank_allnum() {
		return alm_m4_id_bank_allnum;
	}
	public void setAlm_m4_id_bank_allnum(String alm_m4_id_bank_allnum) {
		this.alm_m4_id_bank_allnum = alm_m4_id_bank_allnum;
	}
	public String getAlm_m4_id_bank_orgnum() {
		return alm_m4_id_bank_orgnum;
	}
	public void setAlm_m4_id_bank_orgnum(String alm_m4_id_bank_orgnum) {
		this.alm_m4_id_bank_orgnum = alm_m4_id_bank_orgnum;
	}
	public String getAlm_m4_id_nbank_selfnum() {
		return alm_m4_id_nbank_selfnum;
	}
	public void setAlm_m4_id_nbank_selfnum(String alm_m4_id_nbank_selfnum) {
		this.alm_m4_id_nbank_selfnum = alm_m4_id_nbank_selfnum;
	}
	public String getAlm_m4_id_nbank_allnum() {
		return alm_m4_id_nbank_allnum;
	}
	public void setAlm_m4_id_nbank_allnum(String alm_m4_id_nbank_allnum) {
		this.alm_m4_id_nbank_allnum = alm_m4_id_nbank_allnum;
	}
	public String getAlm_m4_id_nbank_p2p_allnum() {
		return alm_m4_id_nbank_p2p_allnum;
	}
	public void setAlm_m4_id_nbank_p2p_allnum(String alm_m4_id_nbank_p2p_allnum) {
		this.alm_m4_id_nbank_p2p_allnum = alm_m4_id_nbank_p2p_allnum;
	}
	public String getAlm_m4_id_nbank_mc_allnum() {
		return alm_m4_id_nbank_mc_allnum;
	}
	public void setAlm_m4_id_nbank_mc_allnum(String alm_m4_id_nbank_mc_allnum) {
		this.alm_m4_id_nbank_mc_allnum = alm_m4_id_nbank_mc_allnum;
	}
	public String getAlm_m4_id_nbank_ca_allnum() {
		return alm_m4_id_nbank_ca_allnum;
	}
	public void setAlm_m4_id_nbank_ca_allnum(String alm_m4_id_nbank_ca_allnum) {
		this.alm_m4_id_nbank_ca_allnum = alm_m4_id_nbank_ca_allnum;
	}
	public String getAlm_m4_id_nbank_cf_allnum() {
		return alm_m4_id_nbank_cf_allnum;
	}
	public void setAlm_m4_id_nbank_cf_allnum(String alm_m4_id_nbank_cf_allnum) {
		this.alm_m4_id_nbank_cf_allnum = alm_m4_id_nbank_cf_allnum;
	}
	public String getAlm_m4_id_nbank_com_allnum() {
		return alm_m4_id_nbank_com_allnum;
	}
	public void setAlm_m4_id_nbank_com_allnum(String alm_m4_id_nbank_com_allnum) {
		this.alm_m4_id_nbank_com_allnum = alm_m4_id_nbank_com_allnum;
	}
	public String getAlm_m4_id_nbank_oth_allnum() {
		return alm_m4_id_nbank_oth_allnum;
	}
	public void setAlm_m4_id_nbank_oth_allnum(String alm_m4_id_nbank_oth_allnum) {
		this.alm_m4_id_nbank_oth_allnum = alm_m4_id_nbank_oth_allnum;
	}
	public String getAlm_m4_id_nbank_orgnum() {
		return alm_m4_id_nbank_orgnum;
	}
	public void setAlm_m4_id_nbank_orgnum(String alm_m4_id_nbank_orgnum) {
		this.alm_m4_id_nbank_orgnum = alm_m4_id_nbank_orgnum;
	}
	public String getAlm_m4_id_nbank_p2p_orgnum() {
		return alm_m4_id_nbank_p2p_orgnum;
	}
	public void setAlm_m4_id_nbank_p2p_orgnum(String alm_m4_id_nbank_p2p_orgnum) {
		this.alm_m4_id_nbank_p2p_orgnum = alm_m4_id_nbank_p2p_orgnum;
	}
	public String getAlm_m4_id_nbank_mc_orgnum() {
		return alm_m4_id_nbank_mc_orgnum;
	}
	public void setAlm_m4_id_nbank_mc_orgnum(String alm_m4_id_nbank_mc_orgnum) {
		this.alm_m4_id_nbank_mc_orgnum = alm_m4_id_nbank_mc_orgnum;
	}
	public String getAlm_m4_id_nbank_ca_orgnum() {
		return alm_m4_id_nbank_ca_orgnum;
	}
	public void setAlm_m4_id_nbank_ca_orgnum(String alm_m4_id_nbank_ca_orgnum) {
		this.alm_m4_id_nbank_ca_orgnum = alm_m4_id_nbank_ca_orgnum;
	}
	public String getAlm_m4_id_nbank_cf_orgnum() {
		return alm_m4_id_nbank_cf_orgnum;
	}
	public void setAlm_m4_id_nbank_cf_orgnum(String alm_m4_id_nbank_cf_orgnum) {
		this.alm_m4_id_nbank_cf_orgnum = alm_m4_id_nbank_cf_orgnum;
	}
	public String getAlm_m4_id_nbank_com_orgnum() {
		return alm_m4_id_nbank_com_orgnum;
	}
	public void setAlm_m4_id_nbank_com_orgnum(String alm_m4_id_nbank_com_orgnum) {
		this.alm_m4_id_nbank_com_orgnum = alm_m4_id_nbank_com_orgnum;
	}
	public String getAlm_m4_id_nbank_oth_orgnum() {
		return alm_m4_id_nbank_oth_orgnum;
	}
	public void setAlm_m4_id_nbank_oth_orgnum(String alm_m4_id_nbank_oth_orgnum) {
		this.alm_m4_id_nbank_oth_orgnum = alm_m4_id_nbank_oth_orgnum;
	}
	public String getAlm_m4_cell_bank_selfnum() {
		return alm_m4_cell_bank_selfnum;
	}
	public void setAlm_m4_cell_bank_selfnum(String alm_m4_cell_bank_selfnum) {
		this.alm_m4_cell_bank_selfnum = alm_m4_cell_bank_selfnum;
	}
	public String getAlm_m4_cell_bank_allnum() {
		return alm_m4_cell_bank_allnum;
	}
	public void setAlm_m4_cell_bank_allnum(String alm_m4_cell_bank_allnum) {
		this.alm_m4_cell_bank_allnum = alm_m4_cell_bank_allnum;
	}
	public String getAlm_m4_cell_bank_orgnum() {
		return alm_m4_cell_bank_orgnum;
	}
	public void setAlm_m4_cell_bank_orgnum(String alm_m4_cell_bank_orgnum) {
		this.alm_m4_cell_bank_orgnum = alm_m4_cell_bank_orgnum;
	}
	public String getAlm_m4_cell_nbank_selfnum() {
		return alm_m4_cell_nbank_selfnum;
	}
	public void setAlm_m4_cell_nbank_selfnum(String alm_m4_cell_nbank_selfnum) {
		this.alm_m4_cell_nbank_selfnum = alm_m4_cell_nbank_selfnum;
	}
	public String getAlm_m4_cell_nbank_allnum() {
		return alm_m4_cell_nbank_allnum;
	}
	public void setAlm_m4_cell_nbank_allnum(String alm_m4_cell_nbank_allnum) {
		this.alm_m4_cell_nbank_allnum = alm_m4_cell_nbank_allnum;
	}
	public String getAlm_m4_cell_nbank_p2p_allnum() {
		return alm_m4_cell_nbank_p2p_allnum;
	}
	public void setAlm_m4_cell_nbank_p2p_allnum(String alm_m4_cell_nbank_p2p_allnum) {
		this.alm_m4_cell_nbank_p2p_allnum = alm_m4_cell_nbank_p2p_allnum;
	}
	public String getAlm_m4_cell_nbank_mc_allnum() {
		return alm_m4_cell_nbank_mc_allnum;
	}
	public void setAlm_m4_cell_nbank_mc_allnum(String alm_m4_cell_nbank_mc_allnum) {
		this.alm_m4_cell_nbank_mc_allnum = alm_m4_cell_nbank_mc_allnum;
	}
	public String getAlm_m4_cell_nbank_ca_allnum() {
		return alm_m4_cell_nbank_ca_allnum;
	}
	public void setAlm_m4_cell_nbank_ca_allnum(String alm_m4_cell_nbank_ca_allnum) {
		this.alm_m4_cell_nbank_ca_allnum = alm_m4_cell_nbank_ca_allnum;
	}
	public String getAlm_m4_cell_nbank_cf_allnum() {
		return alm_m4_cell_nbank_cf_allnum;
	}
	public void setAlm_m4_cell_nbank_cf_allnum(String alm_m4_cell_nbank_cf_allnum) {
		this.alm_m4_cell_nbank_cf_allnum = alm_m4_cell_nbank_cf_allnum;
	}
	public String getAlm_m4_cell_nbank_com_allnum() {
		return alm_m4_cell_nbank_com_allnum;
	}
	public void setAlm_m4_cell_nbank_com_allnum(String alm_m4_cell_nbank_com_allnum) {
		this.alm_m4_cell_nbank_com_allnum = alm_m4_cell_nbank_com_allnum;
	}
	public String getAlm_m4_cell_nbank_oth_allnum() {
		return alm_m4_cell_nbank_oth_allnum;
	}
	public void setAlm_m4_cell_nbank_oth_allnum(String alm_m4_cell_nbank_oth_allnum) {
		this.alm_m4_cell_nbank_oth_allnum = alm_m4_cell_nbank_oth_allnum;
	}
	public String getAlm_m4_cell_nbank_orgnum() {
		return alm_m4_cell_nbank_orgnum;
	}
	public void setAlm_m4_cell_nbank_orgnum(String alm_m4_cell_nbank_orgnum) {
		this.alm_m4_cell_nbank_orgnum = alm_m4_cell_nbank_orgnum;
	}
	public String getAlm_m4_cell_nbank_p2p_orgnum() {
		return alm_m4_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m4_cell_nbank_p2p_orgnum(String alm_m4_cell_nbank_p2p_orgnum) {
		this.alm_m4_cell_nbank_p2p_orgnum = alm_m4_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m4_cell_nbank_mc_orgnum() {
		return alm_m4_cell_nbank_mc_orgnum;
	}
	public void setAlm_m4_cell_nbank_mc_orgnum(String alm_m4_cell_nbank_mc_orgnum) {
		this.alm_m4_cell_nbank_mc_orgnum = alm_m4_cell_nbank_mc_orgnum;
	}
	public String getAlm_m4_cell_nbank_ca_orgnum() {
		return alm_m4_cell_nbank_ca_orgnum;
	}
	public void setAlm_m4_cell_nbank_ca_orgnum(String alm_m4_cell_nbank_ca_orgnum) {
		this.alm_m4_cell_nbank_ca_orgnum = alm_m4_cell_nbank_ca_orgnum;
	}
	public String getAlm_m4_cell_nbank_cf_orgnum() {
		return alm_m4_cell_nbank_cf_orgnum;
	}
	public void setAlm_m4_cell_nbank_cf_orgnum(String alm_m4_cell_nbank_cf_orgnum) {
		this.alm_m4_cell_nbank_cf_orgnum = alm_m4_cell_nbank_cf_orgnum;
	}
	public String getAlm_m4_cell_nbank_com_orgnum() {
		return alm_m4_cell_nbank_com_orgnum;
	}
	public void setAlm_m4_cell_nbank_com_orgnum(String alm_m4_cell_nbank_com_orgnum) {
		this.alm_m4_cell_nbank_com_orgnum = alm_m4_cell_nbank_com_orgnum;
	}
	public String getAlm_m4_cell_nbank_oth_orgnum() {
		return alm_m4_cell_nbank_oth_orgnum;
	}
	public void setAlm_m4_cell_nbank_oth_orgnum(String alm_m4_cell_nbank_oth_orgnum) {
		this.alm_m4_cell_nbank_oth_orgnum = alm_m4_cell_nbank_oth_orgnum;
	}
	public String getAlm_m4_lm_cell_bank_selfnum() {
		return alm_m4_lm_cell_bank_selfnum;
	}
	public void setAlm_m4_lm_cell_bank_selfnum(String alm_m4_lm_cell_bank_selfnum) {
		this.alm_m4_lm_cell_bank_selfnum = alm_m4_lm_cell_bank_selfnum;
	}
	public String getAlm_m4_lm_cell_bank_allnum() {
		return alm_m4_lm_cell_bank_allnum;
	}
	public void setAlm_m4_lm_cell_bank_allnum(String alm_m4_lm_cell_bank_allnum) {
		this.alm_m4_lm_cell_bank_allnum = alm_m4_lm_cell_bank_allnum;
	}
	public String getAlm_m4_lm_cell_bank_orgnum() {
		return alm_m4_lm_cell_bank_orgnum;
	}
	public void setAlm_m4_lm_cell_bank_orgnum(String alm_m4_lm_cell_bank_orgnum) {
		this.alm_m4_lm_cell_bank_orgnum = alm_m4_lm_cell_bank_orgnum;
	}
	public String getAlm_m4_lm_cell_nbank_selfnum() {
		return alm_m4_lm_cell_nbank_selfnum;
	}
	public void setAlm_m4_lm_cell_nbank_selfnum(String alm_m4_lm_cell_nbank_selfnum) {
		this.alm_m4_lm_cell_nbank_selfnum = alm_m4_lm_cell_nbank_selfnum;
	}
	public String getAlm_m4_lm_cell_nbank_allnum() {
		return alm_m4_lm_cell_nbank_allnum;
	}
	public void setAlm_m4_lm_cell_nbank_allnum(String alm_m4_lm_cell_nbank_allnum) {
		this.alm_m4_lm_cell_nbank_allnum = alm_m4_lm_cell_nbank_allnum;
	}
	public String getAlm_m4_lm_cell_nbank_p2p_allnum() {
		return alm_m4_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m4_lm_cell_nbank_p2p_allnum(String alm_m4_lm_cell_nbank_p2p_allnum) {
		this.alm_m4_lm_cell_nbank_p2p_allnum = alm_m4_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m4_lm_cell_nbank_mc_allnum() {
		return alm_m4_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m4_lm_cell_nbank_mc_allnum(String alm_m4_lm_cell_nbank_mc_allnum) {
		this.alm_m4_lm_cell_nbank_mc_allnum = alm_m4_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m4_lm_cell_nbank_ca_allnum() {
		return alm_m4_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m4_lm_cell_nbank_ca_allnum(String alm_m4_lm_cell_nbank_ca_allnum) {
		this.alm_m4_lm_cell_nbank_ca_allnum = alm_m4_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m4_lm_cell_nbank_cf_allnum() {
		return alm_m4_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m4_lm_cell_nbank_cf_allnum(String alm_m4_lm_cell_nbank_cf_allnum) {
		this.alm_m4_lm_cell_nbank_cf_allnum = alm_m4_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m4_lm_cell_nbank_com_allnum() {
		return alm_m4_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m4_lm_cell_nbank_com_allnum(String alm_m4_lm_cell_nbank_com_allnum) {
		this.alm_m4_lm_cell_nbank_com_allnum = alm_m4_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m4_lm_cell_nbank_oth_allnum() {
		return alm_m4_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m4_lm_cell_nbank_oth_allnum(String alm_m4_lm_cell_nbank_oth_allnum) {
		this.alm_m4_lm_cell_nbank_oth_allnum = alm_m4_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m4_lm_cell_nbank_orgnum() {
		return alm_m4_lm_cell_nbank_orgnum;
	}
	public void setAlm_m4_lm_cell_nbank_orgnum(String alm_m4_lm_cell_nbank_orgnum) {
		this.alm_m4_lm_cell_nbank_orgnum = alm_m4_lm_cell_nbank_orgnum;
	}
	public String getAlm_m4_lm_cell_nbank_p2p_orgnum() {
		return alm_m4_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m4_lm_cell_nbank_p2p_orgnum(String alm_m4_lm_cell_nbank_p2p_orgnum) {
		this.alm_m4_lm_cell_nbank_p2p_orgnum = alm_m4_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m4_lm_cell_nbank_mc_orgnum() {
		return alm_m4_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m4_lm_cell_nbank_mc_orgnum(String alm_m4_lm_cell_nbank_mc_orgnum) {
		this.alm_m4_lm_cell_nbank_mc_orgnum = alm_m4_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m4_lm_cell_nbank_ca_orgnum() {
		return alm_m4_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m4_lm_cell_nbank_ca_orgnum(String alm_m4_lm_cell_nbank_ca_orgnum) {
		this.alm_m4_lm_cell_nbank_ca_orgnum = alm_m4_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m4_lm_cell_nbank_cf_orgnum() {
		return alm_m4_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m4_lm_cell_nbank_cf_orgnum(String alm_m4_lm_cell_nbank_cf_orgnum) {
		this.alm_m4_lm_cell_nbank_cf_orgnum = alm_m4_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m4_lm_cell_nbank_com_orgnum() {
		return alm_m4_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m4_lm_cell_nbank_com_orgnum(String alm_m4_lm_cell_nbank_com_orgnum) {
		this.alm_m4_lm_cell_nbank_com_orgnum = alm_m4_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m4_lm_cell_nbank_oth_orgnum() {
		return alm_m4_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m4_lm_cell_nbank_oth_orgnum(String alm_m4_lm_cell_nbank_oth_orgnum) {
		this.alm_m4_lm_cell_nbank_oth_orgnum = alm_m4_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m5_id_bank_selfnum() {
		return alm_m5_id_bank_selfnum;
	}
	public void setAlm_m5_id_bank_selfnum(String alm_m5_id_bank_selfnum) {
		this.alm_m5_id_bank_selfnum = alm_m5_id_bank_selfnum;
	}
	public String getAlm_m5_id_bank_allnum() {
		return alm_m5_id_bank_allnum;
	}
	public void setAlm_m5_id_bank_allnum(String alm_m5_id_bank_allnum) {
		this.alm_m5_id_bank_allnum = alm_m5_id_bank_allnum;
	}
	public String getAlm_m5_id_bank_orgnum() {
		return alm_m5_id_bank_orgnum;
	}
	public void setAlm_m5_id_bank_orgnum(String alm_m5_id_bank_orgnum) {
		this.alm_m5_id_bank_orgnum = alm_m5_id_bank_orgnum;
	}
	public String getAlm_m5_id_nbank_selfnum() {
		return alm_m5_id_nbank_selfnum;
	}
	public void setAlm_m5_id_nbank_selfnum(String alm_m5_id_nbank_selfnum) {
		this.alm_m5_id_nbank_selfnum = alm_m5_id_nbank_selfnum;
	}
	public String getAlm_m5_id_nbank_allnum() {
		return alm_m5_id_nbank_allnum;
	}
	public void setAlm_m5_id_nbank_allnum(String alm_m5_id_nbank_allnum) {
		this.alm_m5_id_nbank_allnum = alm_m5_id_nbank_allnum;
	}
	public String getAlm_m5_id_nbank_p2p_allnum() {
		return alm_m5_id_nbank_p2p_allnum;
	}
	public void setAlm_m5_id_nbank_p2p_allnum(String alm_m5_id_nbank_p2p_allnum) {
		this.alm_m5_id_nbank_p2p_allnum = alm_m5_id_nbank_p2p_allnum;
	}
	public String getAlm_m5_id_nbank_mc_allnum() {
		return alm_m5_id_nbank_mc_allnum;
	}
	public void setAlm_m5_id_nbank_mc_allnum(String alm_m5_id_nbank_mc_allnum) {
		this.alm_m5_id_nbank_mc_allnum = alm_m5_id_nbank_mc_allnum;
	}
	public String getAlm_m5_id_nbank_ca_allnum() {
		return alm_m5_id_nbank_ca_allnum;
	}
	public void setAlm_m5_id_nbank_ca_allnum(String alm_m5_id_nbank_ca_allnum) {
		this.alm_m5_id_nbank_ca_allnum = alm_m5_id_nbank_ca_allnum;
	}
	public String getAlm_m5_id_nbank_cf_allnum() {
		return alm_m5_id_nbank_cf_allnum;
	}
	public void setAlm_m5_id_nbank_cf_allnum(String alm_m5_id_nbank_cf_allnum) {
		this.alm_m5_id_nbank_cf_allnum = alm_m5_id_nbank_cf_allnum;
	}
	public String getAlm_m5_id_nbank_com_allnum() {
		return alm_m5_id_nbank_com_allnum;
	}
	public void setAlm_m5_id_nbank_com_allnum(String alm_m5_id_nbank_com_allnum) {
		this.alm_m5_id_nbank_com_allnum = alm_m5_id_nbank_com_allnum;
	}
	public String getAlm_m5_id_nbank_oth_allnum() {
		return alm_m5_id_nbank_oth_allnum;
	}
	public void setAlm_m5_id_nbank_oth_allnum(String alm_m5_id_nbank_oth_allnum) {
		this.alm_m5_id_nbank_oth_allnum = alm_m5_id_nbank_oth_allnum;
	}
	public String getAlm_m5_id_nbank_orgnum() {
		return alm_m5_id_nbank_orgnum;
	}
	public void setAlm_m5_id_nbank_orgnum(String alm_m5_id_nbank_orgnum) {
		this.alm_m5_id_nbank_orgnum = alm_m5_id_nbank_orgnum;
	}
	public String getAlm_m5_id_nbank_p2p_orgnum() {
		return alm_m5_id_nbank_p2p_orgnum;
	}
	public void setAlm_m5_id_nbank_p2p_orgnum(String alm_m5_id_nbank_p2p_orgnum) {
		this.alm_m5_id_nbank_p2p_orgnum = alm_m5_id_nbank_p2p_orgnum;
	}
	public String getAlm_m5_id_nbank_mc_orgnum() {
		return alm_m5_id_nbank_mc_orgnum;
	}
	public void setAlm_m5_id_nbank_mc_orgnum(String alm_m5_id_nbank_mc_orgnum) {
		this.alm_m5_id_nbank_mc_orgnum = alm_m5_id_nbank_mc_orgnum;
	}
	public String getAlm_m5_id_nbank_ca_orgnum() {
		return alm_m5_id_nbank_ca_orgnum;
	}
	public void setAlm_m5_id_nbank_ca_orgnum(String alm_m5_id_nbank_ca_orgnum) {
		this.alm_m5_id_nbank_ca_orgnum = alm_m5_id_nbank_ca_orgnum;
	}
	public String getAlm_m5_id_nbank_cf_orgnum() {
		return alm_m5_id_nbank_cf_orgnum;
	}
	public void setAlm_m5_id_nbank_cf_orgnum(String alm_m5_id_nbank_cf_orgnum) {
		this.alm_m5_id_nbank_cf_orgnum = alm_m5_id_nbank_cf_orgnum;
	}
	public String getAlm_m5_id_nbank_com_orgnum() {
		return alm_m5_id_nbank_com_orgnum;
	}
	public void setAlm_m5_id_nbank_com_orgnum(String alm_m5_id_nbank_com_orgnum) {
		this.alm_m5_id_nbank_com_orgnum = alm_m5_id_nbank_com_orgnum;
	}
	public String getAlm_m5_id_nbank_oth_orgnum() {
		return alm_m5_id_nbank_oth_orgnum;
	}
	public void setAlm_m5_id_nbank_oth_orgnum(String alm_m5_id_nbank_oth_orgnum) {
		this.alm_m5_id_nbank_oth_orgnum = alm_m5_id_nbank_oth_orgnum;
	}
	public String getAlm_m5_cell_bank_selfnum() {
		return alm_m5_cell_bank_selfnum;
	}
	public void setAlm_m5_cell_bank_selfnum(String alm_m5_cell_bank_selfnum) {
		this.alm_m5_cell_bank_selfnum = alm_m5_cell_bank_selfnum;
	}
	public String getAlm_m5_cell_bank_allnum() {
		return alm_m5_cell_bank_allnum;
	}
	public void setAlm_m5_cell_bank_allnum(String alm_m5_cell_bank_allnum) {
		this.alm_m5_cell_bank_allnum = alm_m5_cell_bank_allnum;
	}
	public String getAlm_m5_cell_bank_orgnum() {
		return alm_m5_cell_bank_orgnum;
	}
	public void setAlm_m5_cell_bank_orgnum(String alm_m5_cell_bank_orgnum) {
		this.alm_m5_cell_bank_orgnum = alm_m5_cell_bank_orgnum;
	}
	public String getAlm_m5_cell_nbank_selfnum() {
		return alm_m5_cell_nbank_selfnum;
	}
	public void setAlm_m5_cell_nbank_selfnum(String alm_m5_cell_nbank_selfnum) {
		this.alm_m5_cell_nbank_selfnum = alm_m5_cell_nbank_selfnum;
	}
	public String getAlm_m5_cell_nbank_allnum() {
		return alm_m5_cell_nbank_allnum;
	}
	public void setAlm_m5_cell_nbank_allnum(String alm_m5_cell_nbank_allnum) {
		this.alm_m5_cell_nbank_allnum = alm_m5_cell_nbank_allnum;
	}
	public String getAlm_m5_cell_nbank_p2p_allnum() {
		return alm_m5_cell_nbank_p2p_allnum;
	}
	public void setAlm_m5_cell_nbank_p2p_allnum(String alm_m5_cell_nbank_p2p_allnum) {
		this.alm_m5_cell_nbank_p2p_allnum = alm_m5_cell_nbank_p2p_allnum;
	}
	public String getAlm_m5_cell_nbank_mc_allnum() {
		return alm_m5_cell_nbank_mc_allnum;
	}
	public void setAlm_m5_cell_nbank_mc_allnum(String alm_m5_cell_nbank_mc_allnum) {
		this.alm_m5_cell_nbank_mc_allnum = alm_m5_cell_nbank_mc_allnum;
	}
	public String getAlm_m5_cell_nbank_ca_allnum() {
		return alm_m5_cell_nbank_ca_allnum;
	}
	public void setAlm_m5_cell_nbank_ca_allnum(String alm_m5_cell_nbank_ca_allnum) {
		this.alm_m5_cell_nbank_ca_allnum = alm_m5_cell_nbank_ca_allnum;
	}
	public String getAlm_m5_cell_nbank_cf_allnum() {
		return alm_m5_cell_nbank_cf_allnum;
	}
	public void setAlm_m5_cell_nbank_cf_allnum(String alm_m5_cell_nbank_cf_allnum) {
		this.alm_m5_cell_nbank_cf_allnum = alm_m5_cell_nbank_cf_allnum;
	}
	public String getAlm_m5_cell_nbank_com_allnum() {
		return alm_m5_cell_nbank_com_allnum;
	}
	public void setAlm_m5_cell_nbank_com_allnum(String alm_m5_cell_nbank_com_allnum) {
		this.alm_m5_cell_nbank_com_allnum = alm_m5_cell_nbank_com_allnum;
	}
	public String getAlm_m5_cell_nbank_oth_allnum() {
		return alm_m5_cell_nbank_oth_allnum;
	}
	public void setAlm_m5_cell_nbank_oth_allnum(String alm_m5_cell_nbank_oth_allnum) {
		this.alm_m5_cell_nbank_oth_allnum = alm_m5_cell_nbank_oth_allnum;
	}
	public String getAlm_m5_cell_nbank_orgnum() {
		return alm_m5_cell_nbank_orgnum;
	}
	public void setAlm_m5_cell_nbank_orgnum(String alm_m5_cell_nbank_orgnum) {
		this.alm_m5_cell_nbank_orgnum = alm_m5_cell_nbank_orgnum;
	}
	public String getAlm_m5_cell_nbank_p2p_orgnum() {
		return alm_m5_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m5_cell_nbank_p2p_orgnum(String alm_m5_cell_nbank_p2p_orgnum) {
		this.alm_m5_cell_nbank_p2p_orgnum = alm_m5_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m5_cell_nbank_mc_orgnum() {
		return alm_m5_cell_nbank_mc_orgnum;
	}
	public void setAlm_m5_cell_nbank_mc_orgnum(String alm_m5_cell_nbank_mc_orgnum) {
		this.alm_m5_cell_nbank_mc_orgnum = alm_m5_cell_nbank_mc_orgnum;
	}
	public String getAlm_m5_cell_nbank_ca_orgnum() {
		return alm_m5_cell_nbank_ca_orgnum;
	}
	public void setAlm_m5_cell_nbank_ca_orgnum(String alm_m5_cell_nbank_ca_orgnum) {
		this.alm_m5_cell_nbank_ca_orgnum = alm_m5_cell_nbank_ca_orgnum;
	}
	public String getAlm_m5_cell_nbank_cf_orgnum() {
		return alm_m5_cell_nbank_cf_orgnum;
	}
	public void setAlm_m5_cell_nbank_cf_orgnum(String alm_m5_cell_nbank_cf_orgnum) {
		this.alm_m5_cell_nbank_cf_orgnum = alm_m5_cell_nbank_cf_orgnum;
	}
	public String getAlm_m5_cell_nbank_com_orgnum() {
		return alm_m5_cell_nbank_com_orgnum;
	}
	public void setAlm_m5_cell_nbank_com_orgnum(String alm_m5_cell_nbank_com_orgnum) {
		this.alm_m5_cell_nbank_com_orgnum = alm_m5_cell_nbank_com_orgnum;
	}
	public String getAlm_m5_cell_nbank_oth_orgnum() {
		return alm_m5_cell_nbank_oth_orgnum;
	}
	public void setAlm_m5_cell_nbank_oth_orgnum(String alm_m5_cell_nbank_oth_orgnum) {
		this.alm_m5_cell_nbank_oth_orgnum = alm_m5_cell_nbank_oth_orgnum;
	}
	public String getAlm_m5_lm_cell_bank_selfnum() {
		return alm_m5_lm_cell_bank_selfnum;
	}
	public void setAlm_m5_lm_cell_bank_selfnum(String alm_m5_lm_cell_bank_selfnum) {
		this.alm_m5_lm_cell_bank_selfnum = alm_m5_lm_cell_bank_selfnum;
	}
	public String getAlm_m5_lm_cell_bank_allnum() {
		return alm_m5_lm_cell_bank_allnum;
	}
	public void setAlm_m5_lm_cell_bank_allnum(String alm_m5_lm_cell_bank_allnum) {
		this.alm_m5_lm_cell_bank_allnum = alm_m5_lm_cell_bank_allnum;
	}
	public String getAlm_m5_lm_cell_bank_orgnum() {
		return alm_m5_lm_cell_bank_orgnum;
	}
	public void setAlm_m5_lm_cell_bank_orgnum(String alm_m5_lm_cell_bank_orgnum) {
		this.alm_m5_lm_cell_bank_orgnum = alm_m5_lm_cell_bank_orgnum;
	}
	public String getAlm_m5_lm_cell_nbank_selfnum() {
		return alm_m5_lm_cell_nbank_selfnum;
	}
	public void setAlm_m5_lm_cell_nbank_selfnum(String alm_m5_lm_cell_nbank_selfnum) {
		this.alm_m5_lm_cell_nbank_selfnum = alm_m5_lm_cell_nbank_selfnum;
	}
	public String getAlm_m5_lm_cell_nbank_allnum() {
		return alm_m5_lm_cell_nbank_allnum;
	}
	public void setAlm_m5_lm_cell_nbank_allnum(String alm_m5_lm_cell_nbank_allnum) {
		this.alm_m5_lm_cell_nbank_allnum = alm_m5_lm_cell_nbank_allnum;
	}
	public String getAlm_m5_lm_cell_nbank_p2p_allnum() {
		return alm_m5_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m5_lm_cell_nbank_p2p_allnum(String alm_m5_lm_cell_nbank_p2p_allnum) {
		this.alm_m5_lm_cell_nbank_p2p_allnum = alm_m5_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m5_lm_cell_nbank_mc_allnum() {
		return alm_m5_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m5_lm_cell_nbank_mc_allnum(String alm_m5_lm_cell_nbank_mc_allnum) {
		this.alm_m5_lm_cell_nbank_mc_allnum = alm_m5_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m5_lm_cell_nbank_ca_allnum() {
		return alm_m5_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m5_lm_cell_nbank_ca_allnum(String alm_m5_lm_cell_nbank_ca_allnum) {
		this.alm_m5_lm_cell_nbank_ca_allnum = alm_m5_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m5_lm_cell_nbank_cf_allnum() {
		return alm_m5_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m5_lm_cell_nbank_cf_allnum(String alm_m5_lm_cell_nbank_cf_allnum) {
		this.alm_m5_lm_cell_nbank_cf_allnum = alm_m5_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m5_lm_cell_nbank_com_allnum() {
		return alm_m5_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m5_lm_cell_nbank_com_allnum(String alm_m5_lm_cell_nbank_com_allnum) {
		this.alm_m5_lm_cell_nbank_com_allnum = alm_m5_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m5_lm_cell_nbank_oth_allnum() {
		return alm_m5_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m5_lm_cell_nbank_oth_allnum(String alm_m5_lm_cell_nbank_oth_allnum) {
		this.alm_m5_lm_cell_nbank_oth_allnum = alm_m5_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m5_lm_cell_nbank_orgnum() {
		return alm_m5_lm_cell_nbank_orgnum;
	}
	public void setAlm_m5_lm_cell_nbank_orgnum(String alm_m5_lm_cell_nbank_orgnum) {
		this.alm_m5_lm_cell_nbank_orgnum = alm_m5_lm_cell_nbank_orgnum;
	}
	public String getAlm_m5_lm_cell_nbank_p2p_orgnum() {
		return alm_m5_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m5_lm_cell_nbank_p2p_orgnum(String alm_m5_lm_cell_nbank_p2p_orgnum) {
		this.alm_m5_lm_cell_nbank_p2p_orgnum = alm_m5_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m5_lm_cell_nbank_mc_orgnum() {
		return alm_m5_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m5_lm_cell_nbank_mc_orgnum(String alm_m5_lm_cell_nbank_mc_orgnum) {
		this.alm_m5_lm_cell_nbank_mc_orgnum = alm_m5_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m5_lm_cell_nbank_ca_orgnum() {
		return alm_m5_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m5_lm_cell_nbank_ca_orgnum(String alm_m5_lm_cell_nbank_ca_orgnum) {
		this.alm_m5_lm_cell_nbank_ca_orgnum = alm_m5_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m5_lm_cell_nbank_cf_orgnum() {
		return alm_m5_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m5_lm_cell_nbank_cf_orgnum(String alm_m5_lm_cell_nbank_cf_orgnum) {
		this.alm_m5_lm_cell_nbank_cf_orgnum = alm_m5_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m5_lm_cell_nbank_com_orgnum() {
		return alm_m5_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m5_lm_cell_nbank_com_orgnum(String alm_m5_lm_cell_nbank_com_orgnum) {
		this.alm_m5_lm_cell_nbank_com_orgnum = alm_m5_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m5_lm_cell_nbank_oth_orgnum() {
		return alm_m5_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m5_lm_cell_nbank_oth_orgnum(String alm_m5_lm_cell_nbank_oth_orgnum) {
		this.alm_m5_lm_cell_nbank_oth_orgnum = alm_m5_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m6_id_bank_selfnum() {
		return alm_m6_id_bank_selfnum;
	}
	public void setAlm_m6_id_bank_selfnum(String alm_m6_id_bank_selfnum) {
		this.alm_m6_id_bank_selfnum = alm_m6_id_bank_selfnum;
	}
	public String getAlm_m6_id_bank_allnum() {
		return alm_m6_id_bank_allnum;
	}
	public void setAlm_m6_id_bank_allnum(String alm_m6_id_bank_allnum) {
		this.alm_m6_id_bank_allnum = alm_m6_id_bank_allnum;
	}
	public String getAlm_m6_id_bank_orgnum() {
		return alm_m6_id_bank_orgnum;
	}
	public void setAlm_m6_id_bank_orgnum(String alm_m6_id_bank_orgnum) {
		this.alm_m6_id_bank_orgnum = alm_m6_id_bank_orgnum;
	}
	public String getAlm_m6_id_nbank_selfnum() {
		return alm_m6_id_nbank_selfnum;
	}
	public void setAlm_m6_id_nbank_selfnum(String alm_m6_id_nbank_selfnum) {
		this.alm_m6_id_nbank_selfnum = alm_m6_id_nbank_selfnum;
	}
	public String getAlm_m6_id_nbank_allnum() {
		return alm_m6_id_nbank_allnum;
	}
	public void setAlm_m6_id_nbank_allnum(String alm_m6_id_nbank_allnum) {
		this.alm_m6_id_nbank_allnum = alm_m6_id_nbank_allnum;
	}
	public String getAlm_m6_id_nbank_p2p_allnum() {
		return alm_m6_id_nbank_p2p_allnum;
	}
	public void setAlm_m6_id_nbank_p2p_allnum(String alm_m6_id_nbank_p2p_allnum) {
		this.alm_m6_id_nbank_p2p_allnum = alm_m6_id_nbank_p2p_allnum;
	}
	public String getAlm_m6_id_nbank_mc_allnum() {
		return alm_m6_id_nbank_mc_allnum;
	}
	public void setAlm_m6_id_nbank_mc_allnum(String alm_m6_id_nbank_mc_allnum) {
		this.alm_m6_id_nbank_mc_allnum = alm_m6_id_nbank_mc_allnum;
	}
	public String getAlm_m6_id_nbank_ca_allnum() {
		return alm_m6_id_nbank_ca_allnum;
	}
	public void setAlm_m6_id_nbank_ca_allnum(String alm_m6_id_nbank_ca_allnum) {
		this.alm_m6_id_nbank_ca_allnum = alm_m6_id_nbank_ca_allnum;
	}
	public String getAlm_m6_id_nbank_cf_allnum() {
		return alm_m6_id_nbank_cf_allnum;
	}
	public void setAlm_m6_id_nbank_cf_allnum(String alm_m6_id_nbank_cf_allnum) {
		this.alm_m6_id_nbank_cf_allnum = alm_m6_id_nbank_cf_allnum;
	}
	public String getAlm_m6_id_nbank_com_allnum() {
		return alm_m6_id_nbank_com_allnum;
	}
	public void setAlm_m6_id_nbank_com_allnum(String alm_m6_id_nbank_com_allnum) {
		this.alm_m6_id_nbank_com_allnum = alm_m6_id_nbank_com_allnum;
	}
	public String getAlm_m6_id_nbank_oth_allnum() {
		return alm_m6_id_nbank_oth_allnum;
	}
	public void setAlm_m6_id_nbank_oth_allnum(String alm_m6_id_nbank_oth_allnum) {
		this.alm_m6_id_nbank_oth_allnum = alm_m6_id_nbank_oth_allnum;
	}
	public String getAlm_m6_id_nbank_orgnum() {
		return alm_m6_id_nbank_orgnum;
	}
	public void setAlm_m6_id_nbank_orgnum(String alm_m6_id_nbank_orgnum) {
		this.alm_m6_id_nbank_orgnum = alm_m6_id_nbank_orgnum;
	}
	public String getAlm_m6_id_nbank_p2p_orgnum() {
		return alm_m6_id_nbank_p2p_orgnum;
	}
	public void setAlm_m6_id_nbank_p2p_orgnum(String alm_m6_id_nbank_p2p_orgnum) {
		this.alm_m6_id_nbank_p2p_orgnum = alm_m6_id_nbank_p2p_orgnum;
	}
	public String getAlm_m6_id_nbank_mc_orgnum() {
		return alm_m6_id_nbank_mc_orgnum;
	}
	public void setAlm_m6_id_nbank_mc_orgnum(String alm_m6_id_nbank_mc_orgnum) {
		this.alm_m6_id_nbank_mc_orgnum = alm_m6_id_nbank_mc_orgnum;
	}
	public String getAlm_m6_id_nbank_ca_orgnum() {
		return alm_m6_id_nbank_ca_orgnum;
	}
	public void setAlm_m6_id_nbank_ca_orgnum(String alm_m6_id_nbank_ca_orgnum) {
		this.alm_m6_id_nbank_ca_orgnum = alm_m6_id_nbank_ca_orgnum;
	}
	public String getAlm_m6_id_nbank_cf_orgnum() {
		return alm_m6_id_nbank_cf_orgnum;
	}
	public void setAlm_m6_id_nbank_cf_orgnum(String alm_m6_id_nbank_cf_orgnum) {
		this.alm_m6_id_nbank_cf_orgnum = alm_m6_id_nbank_cf_orgnum;
	}
	public String getAlm_m6_id_nbank_com_orgnum() {
		return alm_m6_id_nbank_com_orgnum;
	}
	public void setAlm_m6_id_nbank_com_orgnum(String alm_m6_id_nbank_com_orgnum) {
		this.alm_m6_id_nbank_com_orgnum = alm_m6_id_nbank_com_orgnum;
	}
	public String getAlm_m6_id_nbank_oth_orgnum() {
		return alm_m6_id_nbank_oth_orgnum;
	}
	public void setAlm_m6_id_nbank_oth_orgnum(String alm_m6_id_nbank_oth_orgnum) {
		this.alm_m6_id_nbank_oth_orgnum = alm_m6_id_nbank_oth_orgnum;
	}
	public String getAlm_m6_cell_bank_selfnum() {
		return alm_m6_cell_bank_selfnum;
	}
	public void setAlm_m6_cell_bank_selfnum(String alm_m6_cell_bank_selfnum) {
		this.alm_m6_cell_bank_selfnum = alm_m6_cell_bank_selfnum;
	}
	public String getAlm_m6_cell_bank_allnum() {
		return alm_m6_cell_bank_allnum;
	}
	public void setAlm_m6_cell_bank_allnum(String alm_m6_cell_bank_allnum) {
		this.alm_m6_cell_bank_allnum = alm_m6_cell_bank_allnum;
	}
	public String getAlm_m6_cell_bank_orgnum() {
		return alm_m6_cell_bank_orgnum;
	}
	public void setAlm_m6_cell_bank_orgnum(String alm_m6_cell_bank_orgnum) {
		this.alm_m6_cell_bank_orgnum = alm_m6_cell_bank_orgnum;
	}
	public String getAlm_m6_cell_nbank_selfnum() {
		return alm_m6_cell_nbank_selfnum;
	}
	public void setAlm_m6_cell_nbank_selfnum(String alm_m6_cell_nbank_selfnum) {
		this.alm_m6_cell_nbank_selfnum = alm_m6_cell_nbank_selfnum;
	}
	public String getAlm_m6_cell_nbank_allnum() {
		return alm_m6_cell_nbank_allnum;
	}
	public void setAlm_m6_cell_nbank_allnum(String alm_m6_cell_nbank_allnum) {
		this.alm_m6_cell_nbank_allnum = alm_m6_cell_nbank_allnum;
	}
	public String getAlm_m6_cell_nbank_p2p_allnum() {
		return alm_m6_cell_nbank_p2p_allnum;
	}
	public void setAlm_m6_cell_nbank_p2p_allnum(String alm_m6_cell_nbank_p2p_allnum) {
		this.alm_m6_cell_nbank_p2p_allnum = alm_m6_cell_nbank_p2p_allnum;
	}
	public String getAlm_m6_cell_nbank_mc_allnum() {
		return alm_m6_cell_nbank_mc_allnum;
	}
	public void setAlm_m6_cell_nbank_mc_allnum(String alm_m6_cell_nbank_mc_allnum) {
		this.alm_m6_cell_nbank_mc_allnum = alm_m6_cell_nbank_mc_allnum;
	}
	public String getAlm_m6_cell_nbank_ca_allnum() {
		return alm_m6_cell_nbank_ca_allnum;
	}
	public void setAlm_m6_cell_nbank_ca_allnum(String alm_m6_cell_nbank_ca_allnum) {
		this.alm_m6_cell_nbank_ca_allnum = alm_m6_cell_nbank_ca_allnum;
	}
	public String getAlm_m6_cell_nbank_cf_allnum() {
		return alm_m6_cell_nbank_cf_allnum;
	}
	public void setAlm_m6_cell_nbank_cf_allnum(String alm_m6_cell_nbank_cf_allnum) {
		this.alm_m6_cell_nbank_cf_allnum = alm_m6_cell_nbank_cf_allnum;
	}
	public String getAlm_m6_cell_nbank_com_allnum() {
		return alm_m6_cell_nbank_com_allnum;
	}
	public void setAlm_m6_cell_nbank_com_allnum(String alm_m6_cell_nbank_com_allnum) {
		this.alm_m6_cell_nbank_com_allnum = alm_m6_cell_nbank_com_allnum;
	}
	public String getAlm_m6_cell_nbank_oth_allnum() {
		return alm_m6_cell_nbank_oth_allnum;
	}
	public void setAlm_m6_cell_nbank_oth_allnum(String alm_m6_cell_nbank_oth_allnum) {
		this.alm_m6_cell_nbank_oth_allnum = alm_m6_cell_nbank_oth_allnum;
	}
	public String getAlm_m6_cell_nbank_orgnum() {
		return alm_m6_cell_nbank_orgnum;
	}
	public void setAlm_m6_cell_nbank_orgnum(String alm_m6_cell_nbank_orgnum) {
		this.alm_m6_cell_nbank_orgnum = alm_m6_cell_nbank_orgnum;
	}
	public String getAlm_m6_cell_nbank_p2p_orgnum() {
		return alm_m6_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m6_cell_nbank_p2p_orgnum(String alm_m6_cell_nbank_p2p_orgnum) {
		this.alm_m6_cell_nbank_p2p_orgnum = alm_m6_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m6_cell_nbank_mc_orgnum() {
		return alm_m6_cell_nbank_mc_orgnum;
	}
	public void setAlm_m6_cell_nbank_mc_orgnum(String alm_m6_cell_nbank_mc_orgnum) {
		this.alm_m6_cell_nbank_mc_orgnum = alm_m6_cell_nbank_mc_orgnum;
	}
	public String getAlm_m6_cell_nbank_ca_orgnum() {
		return alm_m6_cell_nbank_ca_orgnum;
	}
	public void setAlm_m6_cell_nbank_ca_orgnum(String alm_m6_cell_nbank_ca_orgnum) {
		this.alm_m6_cell_nbank_ca_orgnum = alm_m6_cell_nbank_ca_orgnum;
	}
	public String getAlm_m6_cell_nbank_cf_orgnum() {
		return alm_m6_cell_nbank_cf_orgnum;
	}
	public void setAlm_m6_cell_nbank_cf_orgnum(String alm_m6_cell_nbank_cf_orgnum) {
		this.alm_m6_cell_nbank_cf_orgnum = alm_m6_cell_nbank_cf_orgnum;
	}
	public String getAlm_m6_cell_nbank_com_orgnum() {
		return alm_m6_cell_nbank_com_orgnum;
	}
	public void setAlm_m6_cell_nbank_com_orgnum(String alm_m6_cell_nbank_com_orgnum) {
		this.alm_m6_cell_nbank_com_orgnum = alm_m6_cell_nbank_com_orgnum;
	}
	public String getAlm_m6_cell_nbank_oth_orgnum() {
		return alm_m6_cell_nbank_oth_orgnum;
	}
	public void setAlm_m6_cell_nbank_oth_orgnum(String alm_m6_cell_nbank_oth_orgnum) {
		this.alm_m6_cell_nbank_oth_orgnum = alm_m6_cell_nbank_oth_orgnum;
	}
	public String getAlm_m6_lm_cell_bank_selfnum() {
		return alm_m6_lm_cell_bank_selfnum;
	}
	public void setAlm_m6_lm_cell_bank_selfnum(String alm_m6_lm_cell_bank_selfnum) {
		this.alm_m6_lm_cell_bank_selfnum = alm_m6_lm_cell_bank_selfnum;
	}
	public String getAlm_m6_lm_cell_bank_allnum() {
		return alm_m6_lm_cell_bank_allnum;
	}
	public void setAlm_m6_lm_cell_bank_allnum(String alm_m6_lm_cell_bank_allnum) {
		this.alm_m6_lm_cell_bank_allnum = alm_m6_lm_cell_bank_allnum;
	}
	public String getAlm_m6_lm_cell_bank_orgnum() {
		return alm_m6_lm_cell_bank_orgnum;
	}
	public void setAlm_m6_lm_cell_bank_orgnum(String alm_m6_lm_cell_bank_orgnum) {
		this.alm_m6_lm_cell_bank_orgnum = alm_m6_lm_cell_bank_orgnum;
	}
	public String getAlm_m6_lm_cell_nbank_selfnum() {
		return alm_m6_lm_cell_nbank_selfnum;
	}
	public void setAlm_m6_lm_cell_nbank_selfnum(String alm_m6_lm_cell_nbank_selfnum) {
		this.alm_m6_lm_cell_nbank_selfnum = alm_m6_lm_cell_nbank_selfnum;
	}
	public String getAlm_m6_lm_cell_nbank_allnum() {
		return alm_m6_lm_cell_nbank_allnum;
	}
	public void setAlm_m6_lm_cell_nbank_allnum(String alm_m6_lm_cell_nbank_allnum) {
		this.alm_m6_lm_cell_nbank_allnum = alm_m6_lm_cell_nbank_allnum;
	}
	public String getAlm_m6_lm_cell_nbank_p2p_allnum() {
		return alm_m6_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m6_lm_cell_nbank_p2p_allnum(String alm_m6_lm_cell_nbank_p2p_allnum) {
		this.alm_m6_lm_cell_nbank_p2p_allnum = alm_m6_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m6_lm_cell_nbank_mc_allnum() {
		return alm_m6_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m6_lm_cell_nbank_mc_allnum(String alm_m6_lm_cell_nbank_mc_allnum) {
		this.alm_m6_lm_cell_nbank_mc_allnum = alm_m6_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m6_lm_cell_nbank_ca_allnum() {
		return alm_m6_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m6_lm_cell_nbank_ca_allnum(String alm_m6_lm_cell_nbank_ca_allnum) {
		this.alm_m6_lm_cell_nbank_ca_allnum = alm_m6_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m6_lm_cell_nbank_cf_allnum() {
		return alm_m6_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m6_lm_cell_nbank_cf_allnum(String alm_m6_lm_cell_nbank_cf_allnum) {
		this.alm_m6_lm_cell_nbank_cf_allnum = alm_m6_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m6_lm_cell_nbank_com_allnum() {
		return alm_m6_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m6_lm_cell_nbank_com_allnum(String alm_m6_lm_cell_nbank_com_allnum) {
		this.alm_m6_lm_cell_nbank_com_allnum = alm_m6_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m6_lm_cell_nbank_oth_allnum() {
		return alm_m6_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m6_lm_cell_nbank_oth_allnum(String alm_m6_lm_cell_nbank_oth_allnum) {
		this.alm_m6_lm_cell_nbank_oth_allnum = alm_m6_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m6_lm_cell_nbank_orgnum() {
		return alm_m6_lm_cell_nbank_orgnum;
	}
	public void setAlm_m6_lm_cell_nbank_orgnum(String alm_m6_lm_cell_nbank_orgnum) {
		this.alm_m6_lm_cell_nbank_orgnum = alm_m6_lm_cell_nbank_orgnum;
	}
	public String getAlm_m6_lm_cell_nbank_p2p_orgnum() {
		return alm_m6_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m6_lm_cell_nbank_p2p_orgnum(String alm_m6_lm_cell_nbank_p2p_orgnum) {
		this.alm_m6_lm_cell_nbank_p2p_orgnum = alm_m6_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m6_lm_cell_nbank_mc_orgnum() {
		return alm_m6_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m6_lm_cell_nbank_mc_orgnum(String alm_m6_lm_cell_nbank_mc_orgnum) {
		this.alm_m6_lm_cell_nbank_mc_orgnum = alm_m6_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m6_lm_cell_nbank_ca_orgnum() {
		return alm_m6_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m6_lm_cell_nbank_ca_orgnum(String alm_m6_lm_cell_nbank_ca_orgnum) {
		this.alm_m6_lm_cell_nbank_ca_orgnum = alm_m6_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m6_lm_cell_nbank_cf_orgnum() {
		return alm_m6_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m6_lm_cell_nbank_cf_orgnum(String alm_m6_lm_cell_nbank_cf_orgnum) {
		this.alm_m6_lm_cell_nbank_cf_orgnum = alm_m6_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m6_lm_cell_nbank_com_orgnum() {
		return alm_m6_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m6_lm_cell_nbank_com_orgnum(String alm_m6_lm_cell_nbank_com_orgnum) {
		this.alm_m6_lm_cell_nbank_com_orgnum = alm_m6_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m6_lm_cell_nbank_oth_orgnum() {
		return alm_m6_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m6_lm_cell_nbank_oth_orgnum(String alm_m6_lm_cell_nbank_oth_orgnum) {
		this.alm_m6_lm_cell_nbank_oth_orgnum = alm_m6_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m7_id_bank_selfnum() {
		return alm_m7_id_bank_selfnum;
	}
	public void setAlm_m7_id_bank_selfnum(String alm_m7_id_bank_selfnum) {
		this.alm_m7_id_bank_selfnum = alm_m7_id_bank_selfnum;
	}
	public String getAlm_m7_id_bank_allnum() {
		return alm_m7_id_bank_allnum;
	}
	public void setAlm_m7_id_bank_allnum(String alm_m7_id_bank_allnum) {
		this.alm_m7_id_bank_allnum = alm_m7_id_bank_allnum;
	}
	public String getAlm_m7_id_bank_orgnum() {
		return alm_m7_id_bank_orgnum;
	}
	public void setAlm_m7_id_bank_orgnum(String alm_m7_id_bank_orgnum) {
		this.alm_m7_id_bank_orgnum = alm_m7_id_bank_orgnum;
	}
	public String getAlm_m7_id_nbank_selfnum() {
		return alm_m7_id_nbank_selfnum;
	}
	public void setAlm_m7_id_nbank_selfnum(String alm_m7_id_nbank_selfnum) {
		this.alm_m7_id_nbank_selfnum = alm_m7_id_nbank_selfnum;
	}
	public String getAlm_m7_id_nbank_allnum() {
		return alm_m7_id_nbank_allnum;
	}
	public void setAlm_m7_id_nbank_allnum(String alm_m7_id_nbank_allnum) {
		this.alm_m7_id_nbank_allnum = alm_m7_id_nbank_allnum;
	}
	public String getAlm_m7_id_nbank_p2p_allnum() {
		return alm_m7_id_nbank_p2p_allnum;
	}
	public void setAlm_m7_id_nbank_p2p_allnum(String alm_m7_id_nbank_p2p_allnum) {
		this.alm_m7_id_nbank_p2p_allnum = alm_m7_id_nbank_p2p_allnum;
	}
	public String getAlm_m7_id_nbank_mc_allnum() {
		return alm_m7_id_nbank_mc_allnum;
	}
	public void setAlm_m7_id_nbank_mc_allnum(String alm_m7_id_nbank_mc_allnum) {
		this.alm_m7_id_nbank_mc_allnum = alm_m7_id_nbank_mc_allnum;
	}
	public String getAlm_m7_id_nbank_ca_allnum() {
		return alm_m7_id_nbank_ca_allnum;
	}
	public void setAlm_m7_id_nbank_ca_allnum(String alm_m7_id_nbank_ca_allnum) {
		this.alm_m7_id_nbank_ca_allnum = alm_m7_id_nbank_ca_allnum;
	}
	public String getAlm_m7_id_nbank_cf_allnum() {
		return alm_m7_id_nbank_cf_allnum;
	}
	public void setAlm_m7_id_nbank_cf_allnum(String alm_m7_id_nbank_cf_allnum) {
		this.alm_m7_id_nbank_cf_allnum = alm_m7_id_nbank_cf_allnum;
	}
	public String getAlm_m7_id_nbank_com_allnum() {
		return alm_m7_id_nbank_com_allnum;
	}
	public void setAlm_m7_id_nbank_com_allnum(String alm_m7_id_nbank_com_allnum) {
		this.alm_m7_id_nbank_com_allnum = alm_m7_id_nbank_com_allnum;
	}
	public String getAlm_m7_id_nbank_oth_allnum() {
		return alm_m7_id_nbank_oth_allnum;
	}
	public void setAlm_m7_id_nbank_oth_allnum(String alm_m7_id_nbank_oth_allnum) {
		this.alm_m7_id_nbank_oth_allnum = alm_m7_id_nbank_oth_allnum;
	}
	public String getAlm_m7_id_nbank_orgnum() {
		return alm_m7_id_nbank_orgnum;
	}
	public void setAlm_m7_id_nbank_orgnum(String alm_m7_id_nbank_orgnum) {
		this.alm_m7_id_nbank_orgnum = alm_m7_id_nbank_orgnum;
	}
	public String getAlm_m7_id_nbank_p2p_orgnum() {
		return alm_m7_id_nbank_p2p_orgnum;
	}
	public void setAlm_m7_id_nbank_p2p_orgnum(String alm_m7_id_nbank_p2p_orgnum) {
		this.alm_m7_id_nbank_p2p_orgnum = alm_m7_id_nbank_p2p_orgnum;
	}
	public String getAlm_m7_id_nbank_mc_orgnum() {
		return alm_m7_id_nbank_mc_orgnum;
	}
	public void setAlm_m7_id_nbank_mc_orgnum(String alm_m7_id_nbank_mc_orgnum) {
		this.alm_m7_id_nbank_mc_orgnum = alm_m7_id_nbank_mc_orgnum;
	}
	public String getAlm_m7_id_nbank_ca_orgnum() {
		return alm_m7_id_nbank_ca_orgnum;
	}
	public void setAlm_m7_id_nbank_ca_orgnum(String alm_m7_id_nbank_ca_orgnum) {
		this.alm_m7_id_nbank_ca_orgnum = alm_m7_id_nbank_ca_orgnum;
	}
	public String getAlm_m7_id_nbank_cf_orgnum() {
		return alm_m7_id_nbank_cf_orgnum;
	}
	public void setAlm_m7_id_nbank_cf_orgnum(String alm_m7_id_nbank_cf_orgnum) {
		this.alm_m7_id_nbank_cf_orgnum = alm_m7_id_nbank_cf_orgnum;
	}
	public String getAlm_m7_id_nbank_com_orgnum() {
		return alm_m7_id_nbank_com_orgnum;
	}
	public void setAlm_m7_id_nbank_com_orgnum(String alm_m7_id_nbank_com_orgnum) {
		this.alm_m7_id_nbank_com_orgnum = alm_m7_id_nbank_com_orgnum;
	}
	public String getAlm_m7_id_nbank_oth_orgnum() {
		return alm_m7_id_nbank_oth_orgnum;
	}
	public void setAlm_m7_id_nbank_oth_orgnum(String alm_m7_id_nbank_oth_orgnum) {
		this.alm_m7_id_nbank_oth_orgnum = alm_m7_id_nbank_oth_orgnum;
	}
	public String getAlm_m7_cell_bank_selfnum() {
		return alm_m7_cell_bank_selfnum;
	}
	public void setAlm_m7_cell_bank_selfnum(String alm_m7_cell_bank_selfnum) {
		this.alm_m7_cell_bank_selfnum = alm_m7_cell_bank_selfnum;
	}
	public String getAlm_m7_cell_bank_allnum() {
		return alm_m7_cell_bank_allnum;
	}
	public void setAlm_m7_cell_bank_allnum(String alm_m7_cell_bank_allnum) {
		this.alm_m7_cell_bank_allnum = alm_m7_cell_bank_allnum;
	}
	public String getAlm_m7_cell_bank_orgnum() {
		return alm_m7_cell_bank_orgnum;
	}
	public void setAlm_m7_cell_bank_orgnum(String alm_m7_cell_bank_orgnum) {
		this.alm_m7_cell_bank_orgnum = alm_m7_cell_bank_orgnum;
	}
	public String getAlm_m7_cell_nbank_selfnum() {
		return alm_m7_cell_nbank_selfnum;
	}
	public void setAlm_m7_cell_nbank_selfnum(String alm_m7_cell_nbank_selfnum) {
		this.alm_m7_cell_nbank_selfnum = alm_m7_cell_nbank_selfnum;
	}
	public String getAlm_m7_cell_nbank_allnum() {
		return alm_m7_cell_nbank_allnum;
	}
	public void setAlm_m7_cell_nbank_allnum(String alm_m7_cell_nbank_allnum) {
		this.alm_m7_cell_nbank_allnum = alm_m7_cell_nbank_allnum;
	}
	public String getAlm_m7_cell_nbank_p2p_allnum() {
		return alm_m7_cell_nbank_p2p_allnum;
	}
	public void setAlm_m7_cell_nbank_p2p_allnum(String alm_m7_cell_nbank_p2p_allnum) {
		this.alm_m7_cell_nbank_p2p_allnum = alm_m7_cell_nbank_p2p_allnum;
	}
	public String getAlm_m7_cell_nbank_mc_allnum() {
		return alm_m7_cell_nbank_mc_allnum;
	}
	public void setAlm_m7_cell_nbank_mc_allnum(String alm_m7_cell_nbank_mc_allnum) {
		this.alm_m7_cell_nbank_mc_allnum = alm_m7_cell_nbank_mc_allnum;
	}
	public String getAlm_m7_cell_nbank_ca_allnum() {
		return alm_m7_cell_nbank_ca_allnum;
	}
	public void setAlm_m7_cell_nbank_ca_allnum(String alm_m7_cell_nbank_ca_allnum) {
		this.alm_m7_cell_nbank_ca_allnum = alm_m7_cell_nbank_ca_allnum;
	}
	public String getAlm_m7_cell_nbank_cf_allnum() {
		return alm_m7_cell_nbank_cf_allnum;
	}
	public void setAlm_m7_cell_nbank_cf_allnum(String alm_m7_cell_nbank_cf_allnum) {
		this.alm_m7_cell_nbank_cf_allnum = alm_m7_cell_nbank_cf_allnum;
	}
	public String getAlm_m7_cell_nbank_com_allnum() {
		return alm_m7_cell_nbank_com_allnum;
	}
	public void setAlm_m7_cell_nbank_com_allnum(String alm_m7_cell_nbank_com_allnum) {
		this.alm_m7_cell_nbank_com_allnum = alm_m7_cell_nbank_com_allnum;
	}
	public String getAlm_m7_cell_nbank_oth_allnum() {
		return alm_m7_cell_nbank_oth_allnum;
	}
	public void setAlm_m7_cell_nbank_oth_allnum(String alm_m7_cell_nbank_oth_allnum) {
		this.alm_m7_cell_nbank_oth_allnum = alm_m7_cell_nbank_oth_allnum;
	}
	public String getAlm_m7_cell_nbank_orgnum() {
		return alm_m7_cell_nbank_orgnum;
	}
	public void setAlm_m7_cell_nbank_orgnum(String alm_m7_cell_nbank_orgnum) {
		this.alm_m7_cell_nbank_orgnum = alm_m7_cell_nbank_orgnum;
	}
	public String getAlm_m7_cell_nbank_p2p_orgnum() {
		return alm_m7_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m7_cell_nbank_p2p_orgnum(String alm_m7_cell_nbank_p2p_orgnum) {
		this.alm_m7_cell_nbank_p2p_orgnum = alm_m7_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m7_cell_nbank_mc_orgnum() {
		return alm_m7_cell_nbank_mc_orgnum;
	}
	public void setAlm_m7_cell_nbank_mc_orgnum(String alm_m7_cell_nbank_mc_orgnum) {
		this.alm_m7_cell_nbank_mc_orgnum = alm_m7_cell_nbank_mc_orgnum;
	}
	public String getAlm_m7_cell_nbank_ca_orgnum() {
		return alm_m7_cell_nbank_ca_orgnum;
	}
	public void setAlm_m7_cell_nbank_ca_orgnum(String alm_m7_cell_nbank_ca_orgnum) {
		this.alm_m7_cell_nbank_ca_orgnum = alm_m7_cell_nbank_ca_orgnum;
	}
	public String getAlm_m7_cell_nbank_cf_orgnum() {
		return alm_m7_cell_nbank_cf_orgnum;
	}
	public void setAlm_m7_cell_nbank_cf_orgnum(String alm_m7_cell_nbank_cf_orgnum) {
		this.alm_m7_cell_nbank_cf_orgnum = alm_m7_cell_nbank_cf_orgnum;
	}
	public String getAlm_m7_cell_nbank_com_orgnum() {
		return alm_m7_cell_nbank_com_orgnum;
	}
	public void setAlm_m7_cell_nbank_com_orgnum(String alm_m7_cell_nbank_com_orgnum) {
		this.alm_m7_cell_nbank_com_orgnum = alm_m7_cell_nbank_com_orgnum;
	}
	public String getAlm_m7_cell_nbank_oth_orgnum() {
		return alm_m7_cell_nbank_oth_orgnum;
	}
	public void setAlm_m7_cell_nbank_oth_orgnum(String alm_m7_cell_nbank_oth_orgnum) {
		this.alm_m7_cell_nbank_oth_orgnum = alm_m7_cell_nbank_oth_orgnum;
	}
	public String getAlm_m7_lm_cell_bank_selfnum() {
		return alm_m7_lm_cell_bank_selfnum;
	}
	public void setAlm_m7_lm_cell_bank_selfnum(String alm_m7_lm_cell_bank_selfnum) {
		this.alm_m7_lm_cell_bank_selfnum = alm_m7_lm_cell_bank_selfnum;
	}
	public String getAlm_m7_lm_cell_bank_allnum() {
		return alm_m7_lm_cell_bank_allnum;
	}
	public void setAlm_m7_lm_cell_bank_allnum(String alm_m7_lm_cell_bank_allnum) {
		this.alm_m7_lm_cell_bank_allnum = alm_m7_lm_cell_bank_allnum;
	}
	public String getAlm_m7_lm_cell_bank_orgnum() {
		return alm_m7_lm_cell_bank_orgnum;
	}
	public void setAlm_m7_lm_cell_bank_orgnum(String alm_m7_lm_cell_bank_orgnum) {
		this.alm_m7_lm_cell_bank_orgnum = alm_m7_lm_cell_bank_orgnum;
	}
	public String getAlm_m7_lm_cell_nbank_selfnum() {
		return alm_m7_lm_cell_nbank_selfnum;
	}
	public void setAlm_m7_lm_cell_nbank_selfnum(String alm_m7_lm_cell_nbank_selfnum) {
		this.alm_m7_lm_cell_nbank_selfnum = alm_m7_lm_cell_nbank_selfnum;
	}
	public String getAlm_m7_lm_cell_nbank_allnum() {
		return alm_m7_lm_cell_nbank_allnum;
	}
	public void setAlm_m7_lm_cell_nbank_allnum(String alm_m7_lm_cell_nbank_allnum) {
		this.alm_m7_lm_cell_nbank_allnum = alm_m7_lm_cell_nbank_allnum;
	}
	public String getAlm_m7_lm_cell_nbank_p2p_allnum() {
		return alm_m7_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m7_lm_cell_nbank_p2p_allnum(String alm_m7_lm_cell_nbank_p2p_allnum) {
		this.alm_m7_lm_cell_nbank_p2p_allnum = alm_m7_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m7_lm_cell_nbank_mc_allnum() {
		return alm_m7_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m7_lm_cell_nbank_mc_allnum(String alm_m7_lm_cell_nbank_mc_allnum) {
		this.alm_m7_lm_cell_nbank_mc_allnum = alm_m7_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m7_lm_cell_nbank_ca_allnum() {
		return alm_m7_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m7_lm_cell_nbank_ca_allnum(String alm_m7_lm_cell_nbank_ca_allnum) {
		this.alm_m7_lm_cell_nbank_ca_allnum = alm_m7_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m7_lm_cell_nbank_cf_allnum() {
		return alm_m7_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m7_lm_cell_nbank_cf_allnum(String alm_m7_lm_cell_nbank_cf_allnum) {
		this.alm_m7_lm_cell_nbank_cf_allnum = alm_m7_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m7_lm_cell_nbank_com_allnum() {
		return alm_m7_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m7_lm_cell_nbank_com_allnum(String alm_m7_lm_cell_nbank_com_allnum) {
		this.alm_m7_lm_cell_nbank_com_allnum = alm_m7_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m7_lm_cell_nbank_oth_allnum() {
		return alm_m7_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m7_lm_cell_nbank_oth_allnum(String alm_m7_lm_cell_nbank_oth_allnum) {
		this.alm_m7_lm_cell_nbank_oth_allnum = alm_m7_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m7_lm_cell_nbank_orgnum() {
		return alm_m7_lm_cell_nbank_orgnum;
	}
	public void setAlm_m7_lm_cell_nbank_orgnum(String alm_m7_lm_cell_nbank_orgnum) {
		this.alm_m7_lm_cell_nbank_orgnum = alm_m7_lm_cell_nbank_orgnum;
	}
	public String getAlm_m7_lm_cell_nbank_p2p_orgnum() {
		return alm_m7_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m7_lm_cell_nbank_p2p_orgnum(String alm_m7_lm_cell_nbank_p2p_orgnum) {
		this.alm_m7_lm_cell_nbank_p2p_orgnum = alm_m7_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m7_lm_cell_nbank_mc_orgnum() {
		return alm_m7_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m7_lm_cell_nbank_mc_orgnum(String alm_m7_lm_cell_nbank_mc_orgnum) {
		this.alm_m7_lm_cell_nbank_mc_orgnum = alm_m7_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m7_lm_cell_nbank_ca_orgnum() {
		return alm_m7_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m7_lm_cell_nbank_ca_orgnum(String alm_m7_lm_cell_nbank_ca_orgnum) {
		this.alm_m7_lm_cell_nbank_ca_orgnum = alm_m7_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m7_lm_cell_nbank_cf_orgnum() {
		return alm_m7_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m7_lm_cell_nbank_cf_orgnum(String alm_m7_lm_cell_nbank_cf_orgnum) {
		this.alm_m7_lm_cell_nbank_cf_orgnum = alm_m7_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m7_lm_cell_nbank_com_orgnum() {
		return alm_m7_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m7_lm_cell_nbank_com_orgnum(String alm_m7_lm_cell_nbank_com_orgnum) {
		this.alm_m7_lm_cell_nbank_com_orgnum = alm_m7_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m7_lm_cell_nbank_oth_orgnum() {
		return alm_m7_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m7_lm_cell_nbank_oth_orgnum(String alm_m7_lm_cell_nbank_oth_orgnum) {
		this.alm_m7_lm_cell_nbank_oth_orgnum = alm_m7_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m8_id_bank_selfnum() {
		return alm_m8_id_bank_selfnum;
	}
	public void setAlm_m8_id_bank_selfnum(String alm_m8_id_bank_selfnum) {
		this.alm_m8_id_bank_selfnum = alm_m8_id_bank_selfnum;
	}
	public String getAlm_m8_id_bank_allnum() {
		return alm_m8_id_bank_allnum;
	}
	public void setAlm_m8_id_bank_allnum(String alm_m8_id_bank_allnum) {
		this.alm_m8_id_bank_allnum = alm_m8_id_bank_allnum;
	}
	public String getAlm_m8_id_bank_orgnum() {
		return alm_m8_id_bank_orgnum;
	}
	public void setAlm_m8_id_bank_orgnum(String alm_m8_id_bank_orgnum) {
		this.alm_m8_id_bank_orgnum = alm_m8_id_bank_orgnum;
	}
	public String getAlm_m8_id_nbank_selfnum() {
		return alm_m8_id_nbank_selfnum;
	}
	public void setAlm_m8_id_nbank_selfnum(String alm_m8_id_nbank_selfnum) {
		this.alm_m8_id_nbank_selfnum = alm_m8_id_nbank_selfnum;
	}
	public String getAlm_m8_id_nbank_allnum() {
		return alm_m8_id_nbank_allnum;
	}
	public void setAlm_m8_id_nbank_allnum(String alm_m8_id_nbank_allnum) {
		this.alm_m8_id_nbank_allnum = alm_m8_id_nbank_allnum;
	}
	public String getAlm_m8_id_nbank_p2p_allnum() {
		return alm_m8_id_nbank_p2p_allnum;
	}
	public void setAlm_m8_id_nbank_p2p_allnum(String alm_m8_id_nbank_p2p_allnum) {
		this.alm_m8_id_nbank_p2p_allnum = alm_m8_id_nbank_p2p_allnum;
	}
	public String getAlm_m8_id_nbank_mc_allnum() {
		return alm_m8_id_nbank_mc_allnum;
	}
	public void setAlm_m8_id_nbank_mc_allnum(String alm_m8_id_nbank_mc_allnum) {
		this.alm_m8_id_nbank_mc_allnum = alm_m8_id_nbank_mc_allnum;
	}
	public String getAlm_m8_id_nbank_ca_allnum() {
		return alm_m8_id_nbank_ca_allnum;
	}
	public void setAlm_m8_id_nbank_ca_allnum(String alm_m8_id_nbank_ca_allnum) {
		this.alm_m8_id_nbank_ca_allnum = alm_m8_id_nbank_ca_allnum;
	}
	public String getAlm_m8_id_nbank_cf_allnum() {
		return alm_m8_id_nbank_cf_allnum;
	}
	public void setAlm_m8_id_nbank_cf_allnum(String alm_m8_id_nbank_cf_allnum) {
		this.alm_m8_id_nbank_cf_allnum = alm_m8_id_nbank_cf_allnum;
	}
	public String getAlm_m8_id_nbank_com_allnum() {
		return alm_m8_id_nbank_com_allnum;
	}
	public void setAlm_m8_id_nbank_com_allnum(String alm_m8_id_nbank_com_allnum) {
		this.alm_m8_id_nbank_com_allnum = alm_m8_id_nbank_com_allnum;
	}
	public String getAlm_m8_id_nbank_oth_allnum() {
		return alm_m8_id_nbank_oth_allnum;
	}
	public void setAlm_m8_id_nbank_oth_allnum(String alm_m8_id_nbank_oth_allnum) {
		this.alm_m8_id_nbank_oth_allnum = alm_m8_id_nbank_oth_allnum;
	}
	public String getAlm_m8_id_nbank_orgnum() {
		return alm_m8_id_nbank_orgnum;
	}
	public void setAlm_m8_id_nbank_orgnum(String alm_m8_id_nbank_orgnum) {
		this.alm_m8_id_nbank_orgnum = alm_m8_id_nbank_orgnum;
	}
	public String getAlm_m8_id_nbank_p2p_orgnum() {
		return alm_m8_id_nbank_p2p_orgnum;
	}
	public void setAlm_m8_id_nbank_p2p_orgnum(String alm_m8_id_nbank_p2p_orgnum) {
		this.alm_m8_id_nbank_p2p_orgnum = alm_m8_id_nbank_p2p_orgnum;
	}
	public String getAlm_m8_id_nbank_mc_orgnum() {
		return alm_m8_id_nbank_mc_orgnum;
	}
	public void setAlm_m8_id_nbank_mc_orgnum(String alm_m8_id_nbank_mc_orgnum) {
		this.alm_m8_id_nbank_mc_orgnum = alm_m8_id_nbank_mc_orgnum;
	}
	public String getAlm_m8_id_nbank_ca_orgnum() {
		return alm_m8_id_nbank_ca_orgnum;
	}
	public void setAlm_m8_id_nbank_ca_orgnum(String alm_m8_id_nbank_ca_orgnum) {
		this.alm_m8_id_nbank_ca_orgnum = alm_m8_id_nbank_ca_orgnum;
	}
	public String getAlm_m8_id_nbank_cf_orgnum() {
		return alm_m8_id_nbank_cf_orgnum;
	}
	public void setAlm_m8_id_nbank_cf_orgnum(String alm_m8_id_nbank_cf_orgnum) {
		this.alm_m8_id_nbank_cf_orgnum = alm_m8_id_nbank_cf_orgnum;
	}
	public String getAlm_m8_id_nbank_com_orgnum() {
		return alm_m8_id_nbank_com_orgnum;
	}
	public void setAlm_m8_id_nbank_com_orgnum(String alm_m8_id_nbank_com_orgnum) {
		this.alm_m8_id_nbank_com_orgnum = alm_m8_id_nbank_com_orgnum;
	}
	public String getAlm_m8_id_nbank_oth_orgnum() {
		return alm_m8_id_nbank_oth_orgnum;
	}
	public void setAlm_m8_id_nbank_oth_orgnum(String alm_m8_id_nbank_oth_orgnum) {
		this.alm_m8_id_nbank_oth_orgnum = alm_m8_id_nbank_oth_orgnum;
	}
	public String getAlm_m8_cell_bank_selfnum() {
		return alm_m8_cell_bank_selfnum;
	}
	public void setAlm_m8_cell_bank_selfnum(String alm_m8_cell_bank_selfnum) {
		this.alm_m8_cell_bank_selfnum = alm_m8_cell_bank_selfnum;
	}
	public String getAlm_m8_cell_bank_allnum() {
		return alm_m8_cell_bank_allnum;
	}
	public void setAlm_m8_cell_bank_allnum(String alm_m8_cell_bank_allnum) {
		this.alm_m8_cell_bank_allnum = alm_m8_cell_bank_allnum;
	}
	public String getAlm_m8_cell_bank_orgnum() {
		return alm_m8_cell_bank_orgnum;
	}
	public void setAlm_m8_cell_bank_orgnum(String alm_m8_cell_bank_orgnum) {
		this.alm_m8_cell_bank_orgnum = alm_m8_cell_bank_orgnum;
	}
	public String getAlm_m8_cell_nbank_selfnum() {
		return alm_m8_cell_nbank_selfnum;
	}
	public void setAlm_m8_cell_nbank_selfnum(String alm_m8_cell_nbank_selfnum) {
		this.alm_m8_cell_nbank_selfnum = alm_m8_cell_nbank_selfnum;
	}
	public String getAlm_m8_cell_nbank_allnum() {
		return alm_m8_cell_nbank_allnum;
	}
	public void setAlm_m8_cell_nbank_allnum(String alm_m8_cell_nbank_allnum) {
		this.alm_m8_cell_nbank_allnum = alm_m8_cell_nbank_allnum;
	}
	public String getAlm_m8_cell_nbank_p2p_allnum() {
		return alm_m8_cell_nbank_p2p_allnum;
	}
	public void setAlm_m8_cell_nbank_p2p_allnum(String alm_m8_cell_nbank_p2p_allnum) {
		this.alm_m8_cell_nbank_p2p_allnum = alm_m8_cell_nbank_p2p_allnum;
	}
	public String getAlm_m8_cell_nbank_mc_allnum() {
		return alm_m8_cell_nbank_mc_allnum;
	}
	public void setAlm_m8_cell_nbank_mc_allnum(String alm_m8_cell_nbank_mc_allnum) {
		this.alm_m8_cell_nbank_mc_allnum = alm_m8_cell_nbank_mc_allnum;
	}
	public String getAlm_m8_cell_nbank_ca_allnum() {
		return alm_m8_cell_nbank_ca_allnum;
	}
	public void setAlm_m8_cell_nbank_ca_allnum(String alm_m8_cell_nbank_ca_allnum) {
		this.alm_m8_cell_nbank_ca_allnum = alm_m8_cell_nbank_ca_allnum;
	}
	public String getAlm_m8_cell_nbank_cf_allnum() {
		return alm_m8_cell_nbank_cf_allnum;
	}
	public void setAlm_m8_cell_nbank_cf_allnum(String alm_m8_cell_nbank_cf_allnum) {
		this.alm_m8_cell_nbank_cf_allnum = alm_m8_cell_nbank_cf_allnum;
	}
	public String getAlm_m8_cell_nbank_com_allnum() {
		return alm_m8_cell_nbank_com_allnum;
	}
	public void setAlm_m8_cell_nbank_com_allnum(String alm_m8_cell_nbank_com_allnum) {
		this.alm_m8_cell_nbank_com_allnum = alm_m8_cell_nbank_com_allnum;
	}
	public String getAlm_m8_cell_nbank_oth_allnum() {
		return alm_m8_cell_nbank_oth_allnum;
	}
	public void setAlm_m8_cell_nbank_oth_allnum(String alm_m8_cell_nbank_oth_allnum) {
		this.alm_m8_cell_nbank_oth_allnum = alm_m8_cell_nbank_oth_allnum;
	}
	public String getAlm_m8_cell_nbank_orgnum() {
		return alm_m8_cell_nbank_orgnum;
	}
	public void setAlm_m8_cell_nbank_orgnum(String alm_m8_cell_nbank_orgnum) {
		this.alm_m8_cell_nbank_orgnum = alm_m8_cell_nbank_orgnum;
	}
	public String getAlm_m8_cell_nbank_p2p_orgnum() {
		return alm_m8_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m8_cell_nbank_p2p_orgnum(String alm_m8_cell_nbank_p2p_orgnum) {
		this.alm_m8_cell_nbank_p2p_orgnum = alm_m8_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m8_cell_nbank_mc_orgnum() {
		return alm_m8_cell_nbank_mc_orgnum;
	}
	public void setAlm_m8_cell_nbank_mc_orgnum(String alm_m8_cell_nbank_mc_orgnum) {
		this.alm_m8_cell_nbank_mc_orgnum = alm_m8_cell_nbank_mc_orgnum;
	}
	public String getAlm_m8_cell_nbank_ca_orgnum() {
		return alm_m8_cell_nbank_ca_orgnum;
	}
	public void setAlm_m8_cell_nbank_ca_orgnum(String alm_m8_cell_nbank_ca_orgnum) {
		this.alm_m8_cell_nbank_ca_orgnum = alm_m8_cell_nbank_ca_orgnum;
	}
	public String getAlm_m8_cell_nbank_cf_orgnum() {
		return alm_m8_cell_nbank_cf_orgnum;
	}
	public void setAlm_m8_cell_nbank_cf_orgnum(String alm_m8_cell_nbank_cf_orgnum) {
		this.alm_m8_cell_nbank_cf_orgnum = alm_m8_cell_nbank_cf_orgnum;
	}
	public String getAlm_m8_cell_nbank_com_orgnum() {
		return alm_m8_cell_nbank_com_orgnum;
	}
	public void setAlm_m8_cell_nbank_com_orgnum(String alm_m8_cell_nbank_com_orgnum) {
		this.alm_m8_cell_nbank_com_orgnum = alm_m8_cell_nbank_com_orgnum;
	}
	public String getAlm_m8_cell_nbank_oth_orgnum() {
		return alm_m8_cell_nbank_oth_orgnum;
	}
	public void setAlm_m8_cell_nbank_oth_orgnum(String alm_m8_cell_nbank_oth_orgnum) {
		this.alm_m8_cell_nbank_oth_orgnum = alm_m8_cell_nbank_oth_orgnum;
	}
	public String getAlm_m8_lm_cell_bank_selfnum() {
		return alm_m8_lm_cell_bank_selfnum;
	}
	public void setAlm_m8_lm_cell_bank_selfnum(String alm_m8_lm_cell_bank_selfnum) {
		this.alm_m8_lm_cell_bank_selfnum = alm_m8_lm_cell_bank_selfnum;
	}
	public String getAlm_m8_lm_cell_bank_allnum() {
		return alm_m8_lm_cell_bank_allnum;
	}
	public void setAlm_m8_lm_cell_bank_allnum(String alm_m8_lm_cell_bank_allnum) {
		this.alm_m8_lm_cell_bank_allnum = alm_m8_lm_cell_bank_allnum;
	}
	public String getAlm_m8_lm_cell_bank_orgnum() {
		return alm_m8_lm_cell_bank_orgnum;
	}
	public void setAlm_m8_lm_cell_bank_orgnum(String alm_m8_lm_cell_bank_orgnum) {
		this.alm_m8_lm_cell_bank_orgnum = alm_m8_lm_cell_bank_orgnum;
	}
	public String getAlm_m8_lm_cell_nbank_selfnum() {
		return alm_m8_lm_cell_nbank_selfnum;
	}
	public void setAlm_m8_lm_cell_nbank_selfnum(String alm_m8_lm_cell_nbank_selfnum) {
		this.alm_m8_lm_cell_nbank_selfnum = alm_m8_lm_cell_nbank_selfnum;
	}
	public String getAlm_m8_lm_cell_nbank_allnum() {
		return alm_m8_lm_cell_nbank_allnum;
	}
	public void setAlm_m8_lm_cell_nbank_allnum(String alm_m8_lm_cell_nbank_allnum) {
		this.alm_m8_lm_cell_nbank_allnum = alm_m8_lm_cell_nbank_allnum;
	}
	public String getAlm_m8_lm_cell_nbank_p2p_allnum() {
		return alm_m8_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m8_lm_cell_nbank_p2p_allnum(String alm_m8_lm_cell_nbank_p2p_allnum) {
		this.alm_m8_lm_cell_nbank_p2p_allnum = alm_m8_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m8_lm_cell_nbank_mc_allnum() {
		return alm_m8_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m8_lm_cell_nbank_mc_allnum(String alm_m8_lm_cell_nbank_mc_allnum) {
		this.alm_m8_lm_cell_nbank_mc_allnum = alm_m8_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m8_lm_cell_nbank_ca_allnum() {
		return alm_m8_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m8_lm_cell_nbank_ca_allnum(String alm_m8_lm_cell_nbank_ca_allnum) {
		this.alm_m8_lm_cell_nbank_ca_allnum = alm_m8_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m8_lm_cell_nbank_cf_allnum() {
		return alm_m8_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m8_lm_cell_nbank_cf_allnum(String alm_m8_lm_cell_nbank_cf_allnum) {
		this.alm_m8_lm_cell_nbank_cf_allnum = alm_m8_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m8_lm_cell_nbank_com_allnum() {
		return alm_m8_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m8_lm_cell_nbank_com_allnum(String alm_m8_lm_cell_nbank_com_allnum) {
		this.alm_m8_lm_cell_nbank_com_allnum = alm_m8_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m8_lm_cell_nbank_oth_allnum() {
		return alm_m8_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m8_lm_cell_nbank_oth_allnum(String alm_m8_lm_cell_nbank_oth_allnum) {
		this.alm_m8_lm_cell_nbank_oth_allnum = alm_m8_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m8_lm_cell_nbank_orgnum() {
		return alm_m8_lm_cell_nbank_orgnum;
	}
	public void setAlm_m8_lm_cell_nbank_orgnum(String alm_m8_lm_cell_nbank_orgnum) {
		this.alm_m8_lm_cell_nbank_orgnum = alm_m8_lm_cell_nbank_orgnum;
	}
	public String getAlm_m8_lm_cell_nbank_p2p_orgnum() {
		return alm_m8_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m8_lm_cell_nbank_p2p_orgnum(String alm_m8_lm_cell_nbank_p2p_orgnum) {
		this.alm_m8_lm_cell_nbank_p2p_orgnum = alm_m8_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m8_lm_cell_nbank_mc_orgnum() {
		return alm_m8_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m8_lm_cell_nbank_mc_orgnum(String alm_m8_lm_cell_nbank_mc_orgnum) {
		this.alm_m8_lm_cell_nbank_mc_orgnum = alm_m8_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m8_lm_cell_nbank_ca_orgnum() {
		return alm_m8_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m8_lm_cell_nbank_ca_orgnum(String alm_m8_lm_cell_nbank_ca_orgnum) {
		this.alm_m8_lm_cell_nbank_ca_orgnum = alm_m8_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m8_lm_cell_nbank_cf_orgnum() {
		return alm_m8_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m8_lm_cell_nbank_cf_orgnum(String alm_m8_lm_cell_nbank_cf_orgnum) {
		this.alm_m8_lm_cell_nbank_cf_orgnum = alm_m8_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m8_lm_cell_nbank_com_orgnum() {
		return alm_m8_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m8_lm_cell_nbank_com_orgnum(String alm_m8_lm_cell_nbank_com_orgnum) {
		this.alm_m8_lm_cell_nbank_com_orgnum = alm_m8_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m8_lm_cell_nbank_oth_orgnum() {
		return alm_m8_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m8_lm_cell_nbank_oth_orgnum(String alm_m8_lm_cell_nbank_oth_orgnum) {
		this.alm_m8_lm_cell_nbank_oth_orgnum = alm_m8_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m9_id_bank_selfnum() {
		return alm_m9_id_bank_selfnum;
	}
	public void setAlm_m9_id_bank_selfnum(String alm_m9_id_bank_selfnum) {
		this.alm_m9_id_bank_selfnum = alm_m9_id_bank_selfnum;
	}
	public String getAlm_m9_id_bank_allnum() {
		return alm_m9_id_bank_allnum;
	}
	public void setAlm_m9_id_bank_allnum(String alm_m9_id_bank_allnum) {
		this.alm_m9_id_bank_allnum = alm_m9_id_bank_allnum;
	}
	public String getAlm_m9_id_bank_orgnum() {
		return alm_m9_id_bank_orgnum;
	}
	public void setAlm_m9_id_bank_orgnum(String alm_m9_id_bank_orgnum) {
		this.alm_m9_id_bank_orgnum = alm_m9_id_bank_orgnum;
	}
	public String getAlm_m9_id_nbank_selfnum() {
		return alm_m9_id_nbank_selfnum;
	}
	public void setAlm_m9_id_nbank_selfnum(String alm_m9_id_nbank_selfnum) {
		this.alm_m9_id_nbank_selfnum = alm_m9_id_nbank_selfnum;
	}
	public String getAlm_m9_id_nbank_allnum() {
		return alm_m9_id_nbank_allnum;
	}
	public void setAlm_m9_id_nbank_allnum(String alm_m9_id_nbank_allnum) {
		this.alm_m9_id_nbank_allnum = alm_m9_id_nbank_allnum;
	}
	public String getAlm_m9_id_nbank_p2p_allnum() {
		return alm_m9_id_nbank_p2p_allnum;
	}
	public void setAlm_m9_id_nbank_p2p_allnum(String alm_m9_id_nbank_p2p_allnum) {
		this.alm_m9_id_nbank_p2p_allnum = alm_m9_id_nbank_p2p_allnum;
	}
	public String getAlm_m9_id_nbank_mc_allnum() {
		return alm_m9_id_nbank_mc_allnum;
	}
	public void setAlm_m9_id_nbank_mc_allnum(String alm_m9_id_nbank_mc_allnum) {
		this.alm_m9_id_nbank_mc_allnum = alm_m9_id_nbank_mc_allnum;
	}
	public String getAlm_m9_id_nbank_ca_allnum() {
		return alm_m9_id_nbank_ca_allnum;
	}
	public void setAlm_m9_id_nbank_ca_allnum(String alm_m9_id_nbank_ca_allnum) {
		this.alm_m9_id_nbank_ca_allnum = alm_m9_id_nbank_ca_allnum;
	}
	public String getAlm_m9_id_nbank_cf_allnum() {
		return alm_m9_id_nbank_cf_allnum;
	}
	public void setAlm_m9_id_nbank_cf_allnum(String alm_m9_id_nbank_cf_allnum) {
		this.alm_m9_id_nbank_cf_allnum = alm_m9_id_nbank_cf_allnum;
	}
	public String getAlm_m9_id_nbank_com_allnum() {
		return alm_m9_id_nbank_com_allnum;
	}
	public void setAlm_m9_id_nbank_com_allnum(String alm_m9_id_nbank_com_allnum) {
		this.alm_m9_id_nbank_com_allnum = alm_m9_id_nbank_com_allnum;
	}
	public String getAlm_m9_id_nbank_oth_allnum() {
		return alm_m9_id_nbank_oth_allnum;
	}
	public void setAlm_m9_id_nbank_oth_allnum(String alm_m9_id_nbank_oth_allnum) {
		this.alm_m9_id_nbank_oth_allnum = alm_m9_id_nbank_oth_allnum;
	}
	public String getAlm_m9_id_nbank_orgnum() {
		return alm_m9_id_nbank_orgnum;
	}
	public void setAlm_m9_id_nbank_orgnum(String alm_m9_id_nbank_orgnum) {
		this.alm_m9_id_nbank_orgnum = alm_m9_id_nbank_orgnum;
	}
	public String getAlm_m9_id_nbank_p2p_orgnum() {
		return alm_m9_id_nbank_p2p_orgnum;
	}
	public void setAlm_m9_id_nbank_p2p_orgnum(String alm_m9_id_nbank_p2p_orgnum) {
		this.alm_m9_id_nbank_p2p_orgnum = alm_m9_id_nbank_p2p_orgnum;
	}
	public String getAlm_m9_id_nbank_mc_orgnum() {
		return alm_m9_id_nbank_mc_orgnum;
	}
	public void setAlm_m9_id_nbank_mc_orgnum(String alm_m9_id_nbank_mc_orgnum) {
		this.alm_m9_id_nbank_mc_orgnum = alm_m9_id_nbank_mc_orgnum;
	}
	public String getAlm_m9_id_nbank_ca_orgnum() {
		return alm_m9_id_nbank_ca_orgnum;
	}
	public void setAlm_m9_id_nbank_ca_orgnum(String alm_m9_id_nbank_ca_orgnum) {
		this.alm_m9_id_nbank_ca_orgnum = alm_m9_id_nbank_ca_orgnum;
	}
	public String getAlm_m9_id_nbank_cf_orgnum() {
		return alm_m9_id_nbank_cf_orgnum;
	}
	public void setAlm_m9_id_nbank_cf_orgnum(String alm_m9_id_nbank_cf_orgnum) {
		this.alm_m9_id_nbank_cf_orgnum = alm_m9_id_nbank_cf_orgnum;
	}
	public String getAlm_m9_id_nbank_com_orgnum() {
		return alm_m9_id_nbank_com_orgnum;
	}
	public void setAlm_m9_id_nbank_com_orgnum(String alm_m9_id_nbank_com_orgnum) {
		this.alm_m9_id_nbank_com_orgnum = alm_m9_id_nbank_com_orgnum;
	}
	public String getAlm_m9_id_nbank_oth_orgnum() {
		return alm_m9_id_nbank_oth_orgnum;
	}
	public void setAlm_m9_id_nbank_oth_orgnum(String alm_m9_id_nbank_oth_orgnum) {
		this.alm_m9_id_nbank_oth_orgnum = alm_m9_id_nbank_oth_orgnum;
	}
	public String getAlm_m9_cell_bank_selfnum() {
		return alm_m9_cell_bank_selfnum;
	}
	public void setAlm_m9_cell_bank_selfnum(String alm_m9_cell_bank_selfnum) {
		this.alm_m9_cell_bank_selfnum = alm_m9_cell_bank_selfnum;
	}
	public String getAlm_m9_cell_bank_allnum() {
		return alm_m9_cell_bank_allnum;
	}
	public void setAlm_m9_cell_bank_allnum(String alm_m9_cell_bank_allnum) {
		this.alm_m9_cell_bank_allnum = alm_m9_cell_bank_allnum;
	}
	public String getAlm_m9_cell_bank_orgnum() {
		return alm_m9_cell_bank_orgnum;
	}
	public void setAlm_m9_cell_bank_orgnum(String alm_m9_cell_bank_orgnum) {
		this.alm_m9_cell_bank_orgnum = alm_m9_cell_bank_orgnum;
	}
	public String getAlm_m9_cell_nbank_selfnum() {
		return alm_m9_cell_nbank_selfnum;
	}
	public void setAlm_m9_cell_nbank_selfnum(String alm_m9_cell_nbank_selfnum) {
		this.alm_m9_cell_nbank_selfnum = alm_m9_cell_nbank_selfnum;
	}
	public String getAlm_m9_cell_nbank_allnum() {
		return alm_m9_cell_nbank_allnum;
	}
	public void setAlm_m9_cell_nbank_allnum(String alm_m9_cell_nbank_allnum) {
		this.alm_m9_cell_nbank_allnum = alm_m9_cell_nbank_allnum;
	}
	public String getAlm_m9_cell_nbank_p2p_allnum() {
		return alm_m9_cell_nbank_p2p_allnum;
	}
	public void setAlm_m9_cell_nbank_p2p_allnum(String alm_m9_cell_nbank_p2p_allnum) {
		this.alm_m9_cell_nbank_p2p_allnum = alm_m9_cell_nbank_p2p_allnum;
	}
	public String getAlm_m9_cell_nbank_mc_allnum() {
		return alm_m9_cell_nbank_mc_allnum;
	}
	public void setAlm_m9_cell_nbank_mc_allnum(String alm_m9_cell_nbank_mc_allnum) {
		this.alm_m9_cell_nbank_mc_allnum = alm_m9_cell_nbank_mc_allnum;
	}
	public String getAlm_m9_cell_nbank_ca_allnum() {
		return alm_m9_cell_nbank_ca_allnum;
	}
	public void setAlm_m9_cell_nbank_ca_allnum(String alm_m9_cell_nbank_ca_allnum) {
		this.alm_m9_cell_nbank_ca_allnum = alm_m9_cell_nbank_ca_allnum;
	}
	public String getAlm_m9_cell_nbank_cf_allnum() {
		return alm_m9_cell_nbank_cf_allnum;
	}
	public void setAlm_m9_cell_nbank_cf_allnum(String alm_m9_cell_nbank_cf_allnum) {
		this.alm_m9_cell_nbank_cf_allnum = alm_m9_cell_nbank_cf_allnum;
	}
	public String getAlm_m9_cell_nbank_com_allnum() {
		return alm_m9_cell_nbank_com_allnum;
	}
	public void setAlm_m9_cell_nbank_com_allnum(String alm_m9_cell_nbank_com_allnum) {
		this.alm_m9_cell_nbank_com_allnum = alm_m9_cell_nbank_com_allnum;
	}
	public String getAlm_m9_cell_nbank_oth_allnum() {
		return alm_m9_cell_nbank_oth_allnum;
	}
	public void setAlm_m9_cell_nbank_oth_allnum(String alm_m9_cell_nbank_oth_allnum) {
		this.alm_m9_cell_nbank_oth_allnum = alm_m9_cell_nbank_oth_allnum;
	}
	public String getAlm_m9_cell_nbank_orgnum() {
		return alm_m9_cell_nbank_orgnum;
	}
	public void setAlm_m9_cell_nbank_orgnum(String alm_m9_cell_nbank_orgnum) {
		this.alm_m9_cell_nbank_orgnum = alm_m9_cell_nbank_orgnum;
	}
	public String getAlm_m9_cell_nbank_p2p_orgnum() {
		return alm_m9_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m9_cell_nbank_p2p_orgnum(String alm_m9_cell_nbank_p2p_orgnum) {
		this.alm_m9_cell_nbank_p2p_orgnum = alm_m9_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m9_cell_nbank_mc_orgnum() {
		return alm_m9_cell_nbank_mc_orgnum;
	}
	public void setAlm_m9_cell_nbank_mc_orgnum(String alm_m9_cell_nbank_mc_orgnum) {
		this.alm_m9_cell_nbank_mc_orgnum = alm_m9_cell_nbank_mc_orgnum;
	}
	public String getAlm_m9_cell_nbank_ca_orgnum() {
		return alm_m9_cell_nbank_ca_orgnum;
	}
	public void setAlm_m9_cell_nbank_ca_orgnum(String alm_m9_cell_nbank_ca_orgnum) {
		this.alm_m9_cell_nbank_ca_orgnum = alm_m9_cell_nbank_ca_orgnum;
	}
	public String getAlm_m9_cell_nbank_cf_orgnum() {
		return alm_m9_cell_nbank_cf_orgnum;
	}
	public void setAlm_m9_cell_nbank_cf_orgnum(String alm_m9_cell_nbank_cf_orgnum) {
		this.alm_m9_cell_nbank_cf_orgnum = alm_m9_cell_nbank_cf_orgnum;
	}
	public String getAlm_m9_cell_nbank_com_orgnum() {
		return alm_m9_cell_nbank_com_orgnum;
	}
	public void setAlm_m9_cell_nbank_com_orgnum(String alm_m9_cell_nbank_com_orgnum) {
		this.alm_m9_cell_nbank_com_orgnum = alm_m9_cell_nbank_com_orgnum;
	}
	public String getAlm_m9_cell_nbank_oth_orgnum() {
		return alm_m9_cell_nbank_oth_orgnum;
	}
	public void setAlm_m9_cell_nbank_oth_orgnum(String alm_m9_cell_nbank_oth_orgnum) {
		this.alm_m9_cell_nbank_oth_orgnum = alm_m9_cell_nbank_oth_orgnum;
	}
	public String getAlm_m9_lm_cell_bank_selfnum() {
		return alm_m9_lm_cell_bank_selfnum;
	}
	public void setAlm_m9_lm_cell_bank_selfnum(String alm_m9_lm_cell_bank_selfnum) {
		this.alm_m9_lm_cell_bank_selfnum = alm_m9_lm_cell_bank_selfnum;
	}
	public String getAlm_m9_lm_cell_bank_allnum() {
		return alm_m9_lm_cell_bank_allnum;
	}
	public void setAlm_m9_lm_cell_bank_allnum(String alm_m9_lm_cell_bank_allnum) {
		this.alm_m9_lm_cell_bank_allnum = alm_m9_lm_cell_bank_allnum;
	}
	public String getAlm_m9_lm_cell_bank_orgnum() {
		return alm_m9_lm_cell_bank_orgnum;
	}
	public void setAlm_m9_lm_cell_bank_orgnum(String alm_m9_lm_cell_bank_orgnum) {
		this.alm_m9_lm_cell_bank_orgnum = alm_m9_lm_cell_bank_orgnum;
	}
	public String getAlm_m9_lm_cell_nbank_selfnum() {
		return alm_m9_lm_cell_nbank_selfnum;
	}
	public void setAlm_m9_lm_cell_nbank_selfnum(String alm_m9_lm_cell_nbank_selfnum) {
		this.alm_m9_lm_cell_nbank_selfnum = alm_m9_lm_cell_nbank_selfnum;
	}
	public String getAlm_m9_lm_cell_nbank_allnum() {
		return alm_m9_lm_cell_nbank_allnum;
	}
	public void setAlm_m9_lm_cell_nbank_allnum(String alm_m9_lm_cell_nbank_allnum) {
		this.alm_m9_lm_cell_nbank_allnum = alm_m9_lm_cell_nbank_allnum;
	}
	public String getAlm_m9_lm_cell_nbank_p2p_allnum() {
		return alm_m9_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m9_lm_cell_nbank_p2p_allnum(String alm_m9_lm_cell_nbank_p2p_allnum) {
		this.alm_m9_lm_cell_nbank_p2p_allnum = alm_m9_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m9_lm_cell_nbank_mc_allnum() {
		return alm_m9_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m9_lm_cell_nbank_mc_allnum(String alm_m9_lm_cell_nbank_mc_allnum) {
		this.alm_m9_lm_cell_nbank_mc_allnum = alm_m9_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m9_lm_cell_nbank_ca_allnum() {
		return alm_m9_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m9_lm_cell_nbank_ca_allnum(String alm_m9_lm_cell_nbank_ca_allnum) {
		this.alm_m9_lm_cell_nbank_ca_allnum = alm_m9_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m9_lm_cell_nbank_cf_allnum() {
		return alm_m9_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m9_lm_cell_nbank_cf_allnum(String alm_m9_lm_cell_nbank_cf_allnum) {
		this.alm_m9_lm_cell_nbank_cf_allnum = alm_m9_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m9_lm_cell_nbank_com_allnum() {
		return alm_m9_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m9_lm_cell_nbank_com_allnum(String alm_m9_lm_cell_nbank_com_allnum) {
		this.alm_m9_lm_cell_nbank_com_allnum = alm_m9_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m9_lm_cell_nbank_oth_allnum() {
		return alm_m9_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m9_lm_cell_nbank_oth_allnum(String alm_m9_lm_cell_nbank_oth_allnum) {
		this.alm_m9_lm_cell_nbank_oth_allnum = alm_m9_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m9_lm_cell_nbank_orgnum() {
		return alm_m9_lm_cell_nbank_orgnum;
	}
	public void setAlm_m9_lm_cell_nbank_orgnum(String alm_m9_lm_cell_nbank_orgnum) {
		this.alm_m9_lm_cell_nbank_orgnum = alm_m9_lm_cell_nbank_orgnum;
	}
	public String getAlm_m9_lm_cell_nbank_p2p_orgnum() {
		return alm_m9_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m9_lm_cell_nbank_p2p_orgnum(String alm_m9_lm_cell_nbank_p2p_orgnum) {
		this.alm_m9_lm_cell_nbank_p2p_orgnum = alm_m9_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m9_lm_cell_nbank_mc_orgnum() {
		return alm_m9_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m9_lm_cell_nbank_mc_orgnum(String alm_m9_lm_cell_nbank_mc_orgnum) {
		this.alm_m9_lm_cell_nbank_mc_orgnum = alm_m9_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m9_lm_cell_nbank_ca_orgnum() {
		return alm_m9_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m9_lm_cell_nbank_ca_orgnum(String alm_m9_lm_cell_nbank_ca_orgnum) {
		this.alm_m9_lm_cell_nbank_ca_orgnum = alm_m9_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m9_lm_cell_nbank_cf_orgnum() {
		return alm_m9_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m9_lm_cell_nbank_cf_orgnum(String alm_m9_lm_cell_nbank_cf_orgnum) {
		this.alm_m9_lm_cell_nbank_cf_orgnum = alm_m9_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m9_lm_cell_nbank_com_orgnum() {
		return alm_m9_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m9_lm_cell_nbank_com_orgnum(String alm_m9_lm_cell_nbank_com_orgnum) {
		this.alm_m9_lm_cell_nbank_com_orgnum = alm_m9_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m9_lm_cell_nbank_oth_orgnum() {
		return alm_m9_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m9_lm_cell_nbank_oth_orgnum(String alm_m9_lm_cell_nbank_oth_orgnum) {
		this.alm_m9_lm_cell_nbank_oth_orgnum = alm_m9_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m10_id_bank_selfnum() {
		return alm_m10_id_bank_selfnum;
	}
	public void setAlm_m10_id_bank_selfnum(String alm_m10_id_bank_selfnum) {
		this.alm_m10_id_bank_selfnum = alm_m10_id_bank_selfnum;
	}
	public String getAlm_m10_id_bank_allnum() {
		return alm_m10_id_bank_allnum;
	}
	public void setAlm_m10_id_bank_allnum(String alm_m10_id_bank_allnum) {
		this.alm_m10_id_bank_allnum = alm_m10_id_bank_allnum;
	}
	public String getAlm_m10_id_bank_orgnum() {
		return alm_m10_id_bank_orgnum;
	}
	public void setAlm_m10_id_bank_orgnum(String alm_m10_id_bank_orgnum) {
		this.alm_m10_id_bank_orgnum = alm_m10_id_bank_orgnum;
	}
	public String getAlm_m10_id_nbank_selfnum() {
		return alm_m10_id_nbank_selfnum;
	}
	public void setAlm_m10_id_nbank_selfnum(String alm_m10_id_nbank_selfnum) {
		this.alm_m10_id_nbank_selfnum = alm_m10_id_nbank_selfnum;
	}
	public String getAlm_m10_id_nbank_allnum() {
		return alm_m10_id_nbank_allnum;
	}
	public void setAlm_m10_id_nbank_allnum(String alm_m10_id_nbank_allnum) {
		this.alm_m10_id_nbank_allnum = alm_m10_id_nbank_allnum;
	}
	public String getAlm_m10_id_nbank_p2p_allnum() {
		return alm_m10_id_nbank_p2p_allnum;
	}
	public void setAlm_m10_id_nbank_p2p_allnum(String alm_m10_id_nbank_p2p_allnum) {
		this.alm_m10_id_nbank_p2p_allnum = alm_m10_id_nbank_p2p_allnum;
	}
	public String getAlm_m10_id_nbank_mc_allnum() {
		return alm_m10_id_nbank_mc_allnum;
	}
	public void setAlm_m10_id_nbank_mc_allnum(String alm_m10_id_nbank_mc_allnum) {
		this.alm_m10_id_nbank_mc_allnum = alm_m10_id_nbank_mc_allnum;
	}
	public String getAlm_m10_id_nbank_ca_allnum() {
		return alm_m10_id_nbank_ca_allnum;
	}
	public void setAlm_m10_id_nbank_ca_allnum(String alm_m10_id_nbank_ca_allnum) {
		this.alm_m10_id_nbank_ca_allnum = alm_m10_id_nbank_ca_allnum;
	}
	public String getAlm_m10_id_nbank_cf_allnum() {
		return alm_m10_id_nbank_cf_allnum;
	}
	public void setAlm_m10_id_nbank_cf_allnum(String alm_m10_id_nbank_cf_allnum) {
		this.alm_m10_id_nbank_cf_allnum = alm_m10_id_nbank_cf_allnum;
	}
	public String getAlm_m10_id_nbank_com_allnum() {
		return alm_m10_id_nbank_com_allnum;
	}
	public void setAlm_m10_id_nbank_com_allnum(String alm_m10_id_nbank_com_allnum) {
		this.alm_m10_id_nbank_com_allnum = alm_m10_id_nbank_com_allnum;
	}
	public String getAlm_m10_id_nbank_oth_allnum() {
		return alm_m10_id_nbank_oth_allnum;
	}
	public void setAlm_m10_id_nbank_oth_allnum(String alm_m10_id_nbank_oth_allnum) {
		this.alm_m10_id_nbank_oth_allnum = alm_m10_id_nbank_oth_allnum;
	}
	public String getAlm_m10_id_nbank_orgnum() {
		return alm_m10_id_nbank_orgnum;
	}
	public void setAlm_m10_id_nbank_orgnum(String alm_m10_id_nbank_orgnum) {
		this.alm_m10_id_nbank_orgnum = alm_m10_id_nbank_orgnum;
	}
	public String getAlm_m10_id_nbank_p2p_orgnum() {
		return alm_m10_id_nbank_p2p_orgnum;
	}
	public void setAlm_m10_id_nbank_p2p_orgnum(String alm_m10_id_nbank_p2p_orgnum) {
		this.alm_m10_id_nbank_p2p_orgnum = alm_m10_id_nbank_p2p_orgnum;
	}
	public String getAlm_m10_id_nbank_mc_orgnum() {
		return alm_m10_id_nbank_mc_orgnum;
	}
	public void setAlm_m10_id_nbank_mc_orgnum(String alm_m10_id_nbank_mc_orgnum) {
		this.alm_m10_id_nbank_mc_orgnum = alm_m10_id_nbank_mc_orgnum;
	}
	public String getAlm_m10_id_nbank_ca_orgnum() {
		return alm_m10_id_nbank_ca_orgnum;
	}
	public void setAlm_m10_id_nbank_ca_orgnum(String alm_m10_id_nbank_ca_orgnum) {
		this.alm_m10_id_nbank_ca_orgnum = alm_m10_id_nbank_ca_orgnum;
	}
	public String getAlm_m10_id_nbank_cf_orgnum() {
		return alm_m10_id_nbank_cf_orgnum;
	}
	public void setAlm_m10_id_nbank_cf_orgnum(String alm_m10_id_nbank_cf_orgnum) {
		this.alm_m10_id_nbank_cf_orgnum = alm_m10_id_nbank_cf_orgnum;
	}
	public String getAlm_m10_id_nbank_com_orgnum() {
		return alm_m10_id_nbank_com_orgnum;
	}
	public void setAlm_m10_id_nbank_com_orgnum(String alm_m10_id_nbank_com_orgnum) {
		this.alm_m10_id_nbank_com_orgnum = alm_m10_id_nbank_com_orgnum;
	}
	public String getAlm_m10_id_nbank_oth_orgnum() {
		return alm_m10_id_nbank_oth_orgnum;
	}
	public void setAlm_m10_id_nbank_oth_orgnum(String alm_m10_id_nbank_oth_orgnum) {
		this.alm_m10_id_nbank_oth_orgnum = alm_m10_id_nbank_oth_orgnum;
	}
	public String getAlm_m10_cell_bank_selfnum() {
		return alm_m10_cell_bank_selfnum;
	}
	public void setAlm_m10_cell_bank_selfnum(String alm_m10_cell_bank_selfnum) {
		this.alm_m10_cell_bank_selfnum = alm_m10_cell_bank_selfnum;
	}
	public String getAlm_m10_cell_bank_allnum() {
		return alm_m10_cell_bank_allnum;
	}
	public void setAlm_m10_cell_bank_allnum(String alm_m10_cell_bank_allnum) {
		this.alm_m10_cell_bank_allnum = alm_m10_cell_bank_allnum;
	}
	public String getAlm_m10_cell_bank_orgnum() {
		return alm_m10_cell_bank_orgnum;
	}
	public void setAlm_m10_cell_bank_orgnum(String alm_m10_cell_bank_orgnum) {
		this.alm_m10_cell_bank_orgnum = alm_m10_cell_bank_orgnum;
	}
	public String getAlm_m10_cell_nbank_selfnum() {
		return alm_m10_cell_nbank_selfnum;
	}
	public void setAlm_m10_cell_nbank_selfnum(String alm_m10_cell_nbank_selfnum) {
		this.alm_m10_cell_nbank_selfnum = alm_m10_cell_nbank_selfnum;
	}
	public String getAlm_m10_cell_nbank_allnum() {
		return alm_m10_cell_nbank_allnum;
	}
	public void setAlm_m10_cell_nbank_allnum(String alm_m10_cell_nbank_allnum) {
		this.alm_m10_cell_nbank_allnum = alm_m10_cell_nbank_allnum;
	}
	public String getAlm_m10_cell_nbank_p2p_allnum() {
		return alm_m10_cell_nbank_p2p_allnum;
	}
	public void setAlm_m10_cell_nbank_p2p_allnum(String alm_m10_cell_nbank_p2p_allnum) {
		this.alm_m10_cell_nbank_p2p_allnum = alm_m10_cell_nbank_p2p_allnum;
	}
	public String getAlm_m10_cell_nbank_mc_allnum() {
		return alm_m10_cell_nbank_mc_allnum;
	}
	public void setAlm_m10_cell_nbank_mc_allnum(String alm_m10_cell_nbank_mc_allnum) {
		this.alm_m10_cell_nbank_mc_allnum = alm_m10_cell_nbank_mc_allnum;
	}
	public String getAlm_m10_cell_nbank_ca_allnum() {
		return alm_m10_cell_nbank_ca_allnum;
	}
	public void setAlm_m10_cell_nbank_ca_allnum(String alm_m10_cell_nbank_ca_allnum) {
		this.alm_m10_cell_nbank_ca_allnum = alm_m10_cell_nbank_ca_allnum;
	}
	public String getAlm_m10_cell_nbank_cf_allnum() {
		return alm_m10_cell_nbank_cf_allnum;
	}
	public void setAlm_m10_cell_nbank_cf_allnum(String alm_m10_cell_nbank_cf_allnum) {
		this.alm_m10_cell_nbank_cf_allnum = alm_m10_cell_nbank_cf_allnum;
	}
	public String getAlm_m10_cell_nbank_com_allnum() {
		return alm_m10_cell_nbank_com_allnum;
	}
	public void setAlm_m10_cell_nbank_com_allnum(String alm_m10_cell_nbank_com_allnum) {
		this.alm_m10_cell_nbank_com_allnum = alm_m10_cell_nbank_com_allnum;
	}
	public String getAlm_m10_cell_nbank_oth_allnum() {
		return alm_m10_cell_nbank_oth_allnum;
	}
	public void setAlm_m10_cell_nbank_oth_allnum(String alm_m10_cell_nbank_oth_allnum) {
		this.alm_m10_cell_nbank_oth_allnum = alm_m10_cell_nbank_oth_allnum;
	}
	public String getAlm_m10_cell_nbank_orgnum() {
		return alm_m10_cell_nbank_orgnum;
	}
	public void setAlm_m10_cell_nbank_orgnum(String alm_m10_cell_nbank_orgnum) {
		this.alm_m10_cell_nbank_orgnum = alm_m10_cell_nbank_orgnum;
	}
	public String getAlm_m10_cell_nbank_p2p_orgnum() {
		return alm_m10_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m10_cell_nbank_p2p_orgnum(String alm_m10_cell_nbank_p2p_orgnum) {
		this.alm_m10_cell_nbank_p2p_orgnum = alm_m10_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m10_cell_nbank_mc_orgnum() {
		return alm_m10_cell_nbank_mc_orgnum;
	}
	public void setAlm_m10_cell_nbank_mc_orgnum(String alm_m10_cell_nbank_mc_orgnum) {
		this.alm_m10_cell_nbank_mc_orgnum = alm_m10_cell_nbank_mc_orgnum;
	}
	public String getAlm_m10_cell_nbank_ca_orgnum() {
		return alm_m10_cell_nbank_ca_orgnum;
	}
	public void setAlm_m10_cell_nbank_ca_orgnum(String alm_m10_cell_nbank_ca_orgnum) {
		this.alm_m10_cell_nbank_ca_orgnum = alm_m10_cell_nbank_ca_orgnum;
	}
	public String getAlm_m10_cell_nbank_cf_orgnum() {
		return alm_m10_cell_nbank_cf_orgnum;
	}
	public void setAlm_m10_cell_nbank_cf_orgnum(String alm_m10_cell_nbank_cf_orgnum) {
		this.alm_m10_cell_nbank_cf_orgnum = alm_m10_cell_nbank_cf_orgnum;
	}
	public String getAlm_m10_cell_nbank_com_orgnum() {
		return alm_m10_cell_nbank_com_orgnum;
	}
	public void setAlm_m10_cell_nbank_com_orgnum(String alm_m10_cell_nbank_com_orgnum) {
		this.alm_m10_cell_nbank_com_orgnum = alm_m10_cell_nbank_com_orgnum;
	}
	public String getAlm_m10_cell_nbank_oth_orgnum() {
		return alm_m10_cell_nbank_oth_orgnum;
	}
	public void setAlm_m10_cell_nbank_oth_orgnum(String alm_m10_cell_nbank_oth_orgnum) {
		this.alm_m10_cell_nbank_oth_orgnum = alm_m10_cell_nbank_oth_orgnum;
	}
	public String getAlm_m10_lm_cell_bank_selfnum() {
		return alm_m10_lm_cell_bank_selfnum;
	}
	public void setAlm_m10_lm_cell_bank_selfnum(String alm_m10_lm_cell_bank_selfnum) {
		this.alm_m10_lm_cell_bank_selfnum = alm_m10_lm_cell_bank_selfnum;
	}
	public String getAlm_m10_lm_cell_bank_allnum() {
		return alm_m10_lm_cell_bank_allnum;
	}
	public void setAlm_m10_lm_cell_bank_allnum(String alm_m10_lm_cell_bank_allnum) {
		this.alm_m10_lm_cell_bank_allnum = alm_m10_lm_cell_bank_allnum;
	}
	public String getAlm_m10_lm_cell_bank_orgnum() {
		return alm_m10_lm_cell_bank_orgnum;
	}
	public void setAlm_m10_lm_cell_bank_orgnum(String alm_m10_lm_cell_bank_orgnum) {
		this.alm_m10_lm_cell_bank_orgnum = alm_m10_lm_cell_bank_orgnum;
	}
	public String getAlm_m10_lm_cell_nbank_selfnum() {
		return alm_m10_lm_cell_nbank_selfnum;
	}
	public void setAlm_m10_lm_cell_nbank_selfnum(String alm_m10_lm_cell_nbank_selfnum) {
		this.alm_m10_lm_cell_nbank_selfnum = alm_m10_lm_cell_nbank_selfnum;
	}
	public String getAlm_m10_lm_cell_nbank_allnum() {
		return alm_m10_lm_cell_nbank_allnum;
	}
	public void setAlm_m10_lm_cell_nbank_allnum(String alm_m10_lm_cell_nbank_allnum) {
		this.alm_m10_lm_cell_nbank_allnum = alm_m10_lm_cell_nbank_allnum;
	}
	public String getAlm_m10_lm_cell_nbank_p2p_allnum() {
		return alm_m10_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m10_lm_cell_nbank_p2p_allnum(String alm_m10_lm_cell_nbank_p2p_allnum) {
		this.alm_m10_lm_cell_nbank_p2p_allnum = alm_m10_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m10_lm_cell_nbank_mc_allnum() {
		return alm_m10_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m10_lm_cell_nbank_mc_allnum(String alm_m10_lm_cell_nbank_mc_allnum) {
		this.alm_m10_lm_cell_nbank_mc_allnum = alm_m10_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m10_lm_cell_nbank_ca_allnum() {
		return alm_m10_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m10_lm_cell_nbank_ca_allnum(String alm_m10_lm_cell_nbank_ca_allnum) {
		this.alm_m10_lm_cell_nbank_ca_allnum = alm_m10_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m10_lm_cell_nbank_cf_allnum() {
		return alm_m10_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m10_lm_cell_nbank_cf_allnum(String alm_m10_lm_cell_nbank_cf_allnum) {
		this.alm_m10_lm_cell_nbank_cf_allnum = alm_m10_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m10_lm_cell_nbank_com_allnum() {
		return alm_m10_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m10_lm_cell_nbank_com_allnum(String alm_m10_lm_cell_nbank_com_allnum) {
		this.alm_m10_lm_cell_nbank_com_allnum = alm_m10_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m10_lm_cell_nbank_oth_allnum() {
		return alm_m10_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m10_lm_cell_nbank_oth_allnum(String alm_m10_lm_cell_nbank_oth_allnum) {
		this.alm_m10_lm_cell_nbank_oth_allnum = alm_m10_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m10_lm_cell_nbank_orgnum() {
		return alm_m10_lm_cell_nbank_orgnum;
	}
	public void setAlm_m10_lm_cell_nbank_orgnum(String alm_m10_lm_cell_nbank_orgnum) {
		this.alm_m10_lm_cell_nbank_orgnum = alm_m10_lm_cell_nbank_orgnum;
	}
	public String getAlm_m10_lm_cell_nbank_p2p_orgnum() {
		return alm_m10_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m10_lm_cell_nbank_p2p_orgnum(String alm_m10_lm_cell_nbank_p2p_orgnum) {
		this.alm_m10_lm_cell_nbank_p2p_orgnum = alm_m10_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m10_lm_cell_nbank_mc_orgnum() {
		return alm_m10_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m10_lm_cell_nbank_mc_orgnum(String alm_m10_lm_cell_nbank_mc_orgnum) {
		this.alm_m10_lm_cell_nbank_mc_orgnum = alm_m10_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m10_lm_cell_nbank_ca_orgnum() {
		return alm_m10_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m10_lm_cell_nbank_ca_orgnum(String alm_m10_lm_cell_nbank_ca_orgnum) {
		this.alm_m10_lm_cell_nbank_ca_orgnum = alm_m10_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m10_lm_cell_nbank_cf_orgnum() {
		return alm_m10_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m10_lm_cell_nbank_cf_orgnum(String alm_m10_lm_cell_nbank_cf_orgnum) {
		this.alm_m10_lm_cell_nbank_cf_orgnum = alm_m10_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m10_lm_cell_nbank_com_orgnum() {
		return alm_m10_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m10_lm_cell_nbank_com_orgnum(String alm_m10_lm_cell_nbank_com_orgnum) {
		this.alm_m10_lm_cell_nbank_com_orgnum = alm_m10_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m10_lm_cell_nbank_oth_orgnum() {
		return alm_m10_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m10_lm_cell_nbank_oth_orgnum(String alm_m10_lm_cell_nbank_oth_orgnum) {
		this.alm_m10_lm_cell_nbank_oth_orgnum = alm_m10_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m11_id_bank_selfnum() {
		return alm_m11_id_bank_selfnum;
	}
	public void setAlm_m11_id_bank_selfnum(String alm_m11_id_bank_selfnum) {
		this.alm_m11_id_bank_selfnum = alm_m11_id_bank_selfnum;
	}
	public String getAlm_m11_id_bank_allnum() {
		return alm_m11_id_bank_allnum;
	}
	public void setAlm_m11_id_bank_allnum(String alm_m11_id_bank_allnum) {
		this.alm_m11_id_bank_allnum = alm_m11_id_bank_allnum;
	}
	public String getAlm_m11_id_bank_orgnum() {
		return alm_m11_id_bank_orgnum;
	}
	public void setAlm_m11_id_bank_orgnum(String alm_m11_id_bank_orgnum) {
		this.alm_m11_id_bank_orgnum = alm_m11_id_bank_orgnum;
	}
	public String getAlm_m11_id_nbank_selfnum() {
		return alm_m11_id_nbank_selfnum;
	}
	public void setAlm_m11_id_nbank_selfnum(String alm_m11_id_nbank_selfnum) {
		this.alm_m11_id_nbank_selfnum = alm_m11_id_nbank_selfnum;
	}
	public String getAlm_m11_id_nbank_allnum() {
		return alm_m11_id_nbank_allnum;
	}
	public void setAlm_m11_id_nbank_allnum(String alm_m11_id_nbank_allnum) {
		this.alm_m11_id_nbank_allnum = alm_m11_id_nbank_allnum;
	}
	public String getAlm_m11_id_nbank_p2p_allnum() {
		return alm_m11_id_nbank_p2p_allnum;
	}
	public void setAlm_m11_id_nbank_p2p_allnum(String alm_m11_id_nbank_p2p_allnum) {
		this.alm_m11_id_nbank_p2p_allnum = alm_m11_id_nbank_p2p_allnum;
	}
	public String getAlm_m11_id_nbank_mc_allnum() {
		return alm_m11_id_nbank_mc_allnum;
	}
	public void setAlm_m11_id_nbank_mc_allnum(String alm_m11_id_nbank_mc_allnum) {
		this.alm_m11_id_nbank_mc_allnum = alm_m11_id_nbank_mc_allnum;
	}
	public String getAlm_m11_id_nbank_ca_allnum() {
		return alm_m11_id_nbank_ca_allnum;
	}
	public void setAlm_m11_id_nbank_ca_allnum(String alm_m11_id_nbank_ca_allnum) {
		this.alm_m11_id_nbank_ca_allnum = alm_m11_id_nbank_ca_allnum;
	}
	public String getAlm_m11_id_nbank_cf_allnum() {
		return alm_m11_id_nbank_cf_allnum;
	}
	public void setAlm_m11_id_nbank_cf_allnum(String alm_m11_id_nbank_cf_allnum) {
		this.alm_m11_id_nbank_cf_allnum = alm_m11_id_nbank_cf_allnum;
	}
	public String getAlm_m11_id_nbank_com_allnum() {
		return alm_m11_id_nbank_com_allnum;
	}
	public void setAlm_m11_id_nbank_com_allnum(String alm_m11_id_nbank_com_allnum) {
		this.alm_m11_id_nbank_com_allnum = alm_m11_id_nbank_com_allnum;
	}
	public String getAlm_m11_id_nbank_oth_allnum() {
		return alm_m11_id_nbank_oth_allnum;
	}
	public void setAlm_m11_id_nbank_oth_allnum(String alm_m11_id_nbank_oth_allnum) {
		this.alm_m11_id_nbank_oth_allnum = alm_m11_id_nbank_oth_allnum;
	}
	public String getAlm_m11_id_nbank_orgnum() {
		return alm_m11_id_nbank_orgnum;
	}
	public void setAlm_m11_id_nbank_orgnum(String alm_m11_id_nbank_orgnum) {
		this.alm_m11_id_nbank_orgnum = alm_m11_id_nbank_orgnum;
	}
	public String getAlm_m11_id_nbank_p2p_orgnum() {
		return alm_m11_id_nbank_p2p_orgnum;
	}
	public void setAlm_m11_id_nbank_p2p_orgnum(String alm_m11_id_nbank_p2p_orgnum) {
		this.alm_m11_id_nbank_p2p_orgnum = alm_m11_id_nbank_p2p_orgnum;
	}
	public String getAlm_m11_id_nbank_mc_orgnum() {
		return alm_m11_id_nbank_mc_orgnum;
	}
	public void setAlm_m11_id_nbank_mc_orgnum(String alm_m11_id_nbank_mc_orgnum) {
		this.alm_m11_id_nbank_mc_orgnum = alm_m11_id_nbank_mc_orgnum;
	}
	public String getAlm_m11_id_nbank_ca_orgnum() {
		return alm_m11_id_nbank_ca_orgnum;
	}
	public void setAlm_m11_id_nbank_ca_orgnum(String alm_m11_id_nbank_ca_orgnum) {
		this.alm_m11_id_nbank_ca_orgnum = alm_m11_id_nbank_ca_orgnum;
	}
	public String getAlm_m11_id_nbank_cf_orgnum() {
		return alm_m11_id_nbank_cf_orgnum;
	}
	public void setAlm_m11_id_nbank_cf_orgnum(String alm_m11_id_nbank_cf_orgnum) {
		this.alm_m11_id_nbank_cf_orgnum = alm_m11_id_nbank_cf_orgnum;
	}
	public String getAlm_m11_id_nbank_com_orgnum() {
		return alm_m11_id_nbank_com_orgnum;
	}
	public void setAlm_m11_id_nbank_com_orgnum(String alm_m11_id_nbank_com_orgnum) {
		this.alm_m11_id_nbank_com_orgnum = alm_m11_id_nbank_com_orgnum;
	}
	public String getAlm_m11_id_nbank_oth_orgnum() {
		return alm_m11_id_nbank_oth_orgnum;
	}
	public void setAlm_m11_id_nbank_oth_orgnum(String alm_m11_id_nbank_oth_orgnum) {
		this.alm_m11_id_nbank_oth_orgnum = alm_m11_id_nbank_oth_orgnum;
	}
	public String getAlm_m11_cell_bank_selfnum() {
		return alm_m11_cell_bank_selfnum;
	}
	public void setAlm_m11_cell_bank_selfnum(String alm_m11_cell_bank_selfnum) {
		this.alm_m11_cell_bank_selfnum = alm_m11_cell_bank_selfnum;
	}
	public String getAlm_m11_cell_bank_allnum() {
		return alm_m11_cell_bank_allnum;
	}
	public void setAlm_m11_cell_bank_allnum(String alm_m11_cell_bank_allnum) {
		this.alm_m11_cell_bank_allnum = alm_m11_cell_bank_allnum;
	}
	public String getAlm_m11_cell_bank_orgnum() {
		return alm_m11_cell_bank_orgnum;
	}
	public void setAlm_m11_cell_bank_orgnum(String alm_m11_cell_bank_orgnum) {
		this.alm_m11_cell_bank_orgnum = alm_m11_cell_bank_orgnum;
	}
	public String getAlm_m11_cell_nbank_selfnum() {
		return alm_m11_cell_nbank_selfnum;
	}
	public void setAlm_m11_cell_nbank_selfnum(String alm_m11_cell_nbank_selfnum) {
		this.alm_m11_cell_nbank_selfnum = alm_m11_cell_nbank_selfnum;
	}
	public String getAlm_m11_cell_nbank_allnum() {
		return alm_m11_cell_nbank_allnum;
	}
	public void setAlm_m11_cell_nbank_allnum(String alm_m11_cell_nbank_allnum) {
		this.alm_m11_cell_nbank_allnum = alm_m11_cell_nbank_allnum;
	}
	public String getAlm_m11_cell_nbank_p2p_allnum() {
		return alm_m11_cell_nbank_p2p_allnum;
	}
	public void setAlm_m11_cell_nbank_p2p_allnum(String alm_m11_cell_nbank_p2p_allnum) {
		this.alm_m11_cell_nbank_p2p_allnum = alm_m11_cell_nbank_p2p_allnum;
	}
	public String getAlm_m11_cell_nbank_mc_allnum() {
		return alm_m11_cell_nbank_mc_allnum;
	}
	public void setAlm_m11_cell_nbank_mc_allnum(String alm_m11_cell_nbank_mc_allnum) {
		this.alm_m11_cell_nbank_mc_allnum = alm_m11_cell_nbank_mc_allnum;
	}
	public String getAlm_m11_cell_nbank_ca_allnum() {
		return alm_m11_cell_nbank_ca_allnum;
	}
	public void setAlm_m11_cell_nbank_ca_allnum(String alm_m11_cell_nbank_ca_allnum) {
		this.alm_m11_cell_nbank_ca_allnum = alm_m11_cell_nbank_ca_allnum;
	}
	public String getAlm_m11_cell_nbank_cf_allnum() {
		return alm_m11_cell_nbank_cf_allnum;
	}
	public void setAlm_m11_cell_nbank_cf_allnum(String alm_m11_cell_nbank_cf_allnum) {
		this.alm_m11_cell_nbank_cf_allnum = alm_m11_cell_nbank_cf_allnum;
	}
	public String getAlm_m11_cell_nbank_com_allnum() {
		return alm_m11_cell_nbank_com_allnum;
	}
	public void setAlm_m11_cell_nbank_com_allnum(String alm_m11_cell_nbank_com_allnum) {
		this.alm_m11_cell_nbank_com_allnum = alm_m11_cell_nbank_com_allnum;
	}
	public String getAlm_m11_cell_nbank_oth_allnum() {
		return alm_m11_cell_nbank_oth_allnum;
	}
	public void setAlm_m11_cell_nbank_oth_allnum(String alm_m11_cell_nbank_oth_allnum) {
		this.alm_m11_cell_nbank_oth_allnum = alm_m11_cell_nbank_oth_allnum;
	}
	public String getAlm_m11_cell_nbank_orgnum() {
		return alm_m11_cell_nbank_orgnum;
	}
	public void setAlm_m11_cell_nbank_orgnum(String alm_m11_cell_nbank_orgnum) {
		this.alm_m11_cell_nbank_orgnum = alm_m11_cell_nbank_orgnum;
	}
	public String getAlm_m11_cell_nbank_p2p_orgnum() {
		return alm_m11_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m11_cell_nbank_p2p_orgnum(String alm_m11_cell_nbank_p2p_orgnum) {
		this.alm_m11_cell_nbank_p2p_orgnum = alm_m11_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m11_cell_nbank_mc_orgnum() {
		return alm_m11_cell_nbank_mc_orgnum;
	}
	public void setAlm_m11_cell_nbank_mc_orgnum(String alm_m11_cell_nbank_mc_orgnum) {
		this.alm_m11_cell_nbank_mc_orgnum = alm_m11_cell_nbank_mc_orgnum;
	}
	public String getAlm_m11_cell_nbank_ca_orgnum() {
		return alm_m11_cell_nbank_ca_orgnum;
	}
	public void setAlm_m11_cell_nbank_ca_orgnum(String alm_m11_cell_nbank_ca_orgnum) {
		this.alm_m11_cell_nbank_ca_orgnum = alm_m11_cell_nbank_ca_orgnum;
	}
	public String getAlm_m11_cell_nbank_cf_orgnum() {
		return alm_m11_cell_nbank_cf_orgnum;
	}
	public void setAlm_m11_cell_nbank_cf_orgnum(String alm_m11_cell_nbank_cf_orgnum) {
		this.alm_m11_cell_nbank_cf_orgnum = alm_m11_cell_nbank_cf_orgnum;
	}
	public String getAlm_m11_cell_nbank_com_orgnum() {
		return alm_m11_cell_nbank_com_orgnum;
	}
	public void setAlm_m11_cell_nbank_com_orgnum(String alm_m11_cell_nbank_com_orgnum) {
		this.alm_m11_cell_nbank_com_orgnum = alm_m11_cell_nbank_com_orgnum;
	}
	public String getAlm_m11_cell_nbank_oth_orgnum() {
		return alm_m11_cell_nbank_oth_orgnum;
	}
	public void setAlm_m11_cell_nbank_oth_orgnum(String alm_m11_cell_nbank_oth_orgnum) {
		this.alm_m11_cell_nbank_oth_orgnum = alm_m11_cell_nbank_oth_orgnum;
	}
	public String getAlm_m11_lm_cell_bank_selfnum() {
		return alm_m11_lm_cell_bank_selfnum;
	}
	public void setAlm_m11_lm_cell_bank_selfnum(String alm_m11_lm_cell_bank_selfnum) {
		this.alm_m11_lm_cell_bank_selfnum = alm_m11_lm_cell_bank_selfnum;
	}
	public String getAlm_m11_lm_cell_bank_allnum() {
		return alm_m11_lm_cell_bank_allnum;
	}
	public void setAlm_m11_lm_cell_bank_allnum(String alm_m11_lm_cell_bank_allnum) {
		this.alm_m11_lm_cell_bank_allnum = alm_m11_lm_cell_bank_allnum;
	}
	public String getAlm_m11_lm_cell_bank_orgnum() {
		return alm_m11_lm_cell_bank_orgnum;
	}
	public void setAlm_m11_lm_cell_bank_orgnum(String alm_m11_lm_cell_bank_orgnum) {
		this.alm_m11_lm_cell_bank_orgnum = alm_m11_lm_cell_bank_orgnum;
	}
	public String getAlm_m11_lm_cell_nbank_selfnum() {
		return alm_m11_lm_cell_nbank_selfnum;
	}
	public void setAlm_m11_lm_cell_nbank_selfnum(String alm_m11_lm_cell_nbank_selfnum) {
		this.alm_m11_lm_cell_nbank_selfnum = alm_m11_lm_cell_nbank_selfnum;
	}
	public String getAlm_m11_lm_cell_nbank_allnum() {
		return alm_m11_lm_cell_nbank_allnum;
	}
	public void setAlm_m11_lm_cell_nbank_allnum(String alm_m11_lm_cell_nbank_allnum) {
		this.alm_m11_lm_cell_nbank_allnum = alm_m11_lm_cell_nbank_allnum;
	}
	public String getAlm_m11_lm_cell_nbank_p2p_allnum() {
		return alm_m11_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m11_lm_cell_nbank_p2p_allnum(String alm_m11_lm_cell_nbank_p2p_allnum) {
		this.alm_m11_lm_cell_nbank_p2p_allnum = alm_m11_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m11_lm_cell_nbank_mc_allnum() {
		return alm_m11_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m11_lm_cell_nbank_mc_allnum(String alm_m11_lm_cell_nbank_mc_allnum) {
		this.alm_m11_lm_cell_nbank_mc_allnum = alm_m11_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m11_lm_cell_nbank_ca_allnum() {
		return alm_m11_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m11_lm_cell_nbank_ca_allnum(String alm_m11_lm_cell_nbank_ca_allnum) {
		this.alm_m11_lm_cell_nbank_ca_allnum = alm_m11_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m11_lm_cell_nbank_cf_allnum() {
		return alm_m11_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m11_lm_cell_nbank_cf_allnum(String alm_m11_lm_cell_nbank_cf_allnum) {
		this.alm_m11_lm_cell_nbank_cf_allnum = alm_m11_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m11_lm_cell_nbank_com_allnum() {
		return alm_m11_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m11_lm_cell_nbank_com_allnum(String alm_m11_lm_cell_nbank_com_allnum) {
		this.alm_m11_lm_cell_nbank_com_allnum = alm_m11_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m11_lm_cell_nbank_oth_allnum() {
		return alm_m11_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m11_lm_cell_nbank_oth_allnum(String alm_m11_lm_cell_nbank_oth_allnum) {
		this.alm_m11_lm_cell_nbank_oth_allnum = alm_m11_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m11_lm_cell_nbank_orgnum() {
		return alm_m11_lm_cell_nbank_orgnum;
	}
	public void setAlm_m11_lm_cell_nbank_orgnum(String alm_m11_lm_cell_nbank_orgnum) {
		this.alm_m11_lm_cell_nbank_orgnum = alm_m11_lm_cell_nbank_orgnum;
	}
	public String getAlm_m11_lm_cell_nbank_p2p_orgnum() {
		return alm_m11_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m11_lm_cell_nbank_p2p_orgnum(String alm_m11_lm_cell_nbank_p2p_orgnum) {
		this.alm_m11_lm_cell_nbank_p2p_orgnum = alm_m11_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m11_lm_cell_nbank_mc_orgnum() {
		return alm_m11_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m11_lm_cell_nbank_mc_orgnum(String alm_m11_lm_cell_nbank_mc_orgnum) {
		this.alm_m11_lm_cell_nbank_mc_orgnum = alm_m11_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m11_lm_cell_nbank_ca_orgnum() {
		return alm_m11_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m11_lm_cell_nbank_ca_orgnum(String alm_m11_lm_cell_nbank_ca_orgnum) {
		this.alm_m11_lm_cell_nbank_ca_orgnum = alm_m11_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m11_lm_cell_nbank_cf_orgnum() {
		return alm_m11_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m11_lm_cell_nbank_cf_orgnum(String alm_m11_lm_cell_nbank_cf_orgnum) {
		this.alm_m11_lm_cell_nbank_cf_orgnum = alm_m11_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m11_lm_cell_nbank_com_orgnum() {
		return alm_m11_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m11_lm_cell_nbank_com_orgnum(String alm_m11_lm_cell_nbank_com_orgnum) {
		this.alm_m11_lm_cell_nbank_com_orgnum = alm_m11_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m11_lm_cell_nbank_oth_orgnum() {
		return alm_m11_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m11_lm_cell_nbank_oth_orgnum(String alm_m11_lm_cell_nbank_oth_orgnum) {
		this.alm_m11_lm_cell_nbank_oth_orgnum = alm_m11_lm_cell_nbank_oth_orgnum;
	}
	public String getAlm_m12_id_bank_selfnum() {
		return alm_m12_id_bank_selfnum;
	}
	public void setAlm_m12_id_bank_selfnum(String alm_m12_id_bank_selfnum) {
		this.alm_m12_id_bank_selfnum = alm_m12_id_bank_selfnum;
	}
	public String getAlm_m12_id_bank_allnum() {
		return alm_m12_id_bank_allnum;
	}
	public void setAlm_m12_id_bank_allnum(String alm_m12_id_bank_allnum) {
		this.alm_m12_id_bank_allnum = alm_m12_id_bank_allnum;
	}
	public String getAlm_m12_id_bank_orgnum() {
		return alm_m12_id_bank_orgnum;
	}
	public void setAlm_m12_id_bank_orgnum(String alm_m12_id_bank_orgnum) {
		this.alm_m12_id_bank_orgnum = alm_m12_id_bank_orgnum;
	}
	public String getAlm_m12_id_nbank_selfnum() {
		return alm_m12_id_nbank_selfnum;
	}
	public void setAlm_m12_id_nbank_selfnum(String alm_m12_id_nbank_selfnum) {
		this.alm_m12_id_nbank_selfnum = alm_m12_id_nbank_selfnum;
	}
	public String getAlm_m12_id_nbank_allnum() {
		return alm_m12_id_nbank_allnum;
	}
	public void setAlm_m12_id_nbank_allnum(String alm_m12_id_nbank_allnum) {
		this.alm_m12_id_nbank_allnum = alm_m12_id_nbank_allnum;
	}
	public String getAlm_m12_id_nbank_p2p_allnum() {
		return alm_m12_id_nbank_p2p_allnum;
	}
	public void setAlm_m12_id_nbank_p2p_allnum(String alm_m12_id_nbank_p2p_allnum) {
		this.alm_m12_id_nbank_p2p_allnum = alm_m12_id_nbank_p2p_allnum;
	}
	public String getAlm_m12_id_nbank_mc_allnum() {
		return alm_m12_id_nbank_mc_allnum;
	}
	public void setAlm_m12_id_nbank_mc_allnum(String alm_m12_id_nbank_mc_allnum) {
		this.alm_m12_id_nbank_mc_allnum = alm_m12_id_nbank_mc_allnum;
	}
	public String getAlm_m12_id_nbank_ca_allnum() {
		return alm_m12_id_nbank_ca_allnum;
	}
	public void setAlm_m12_id_nbank_ca_allnum(String alm_m12_id_nbank_ca_allnum) {
		this.alm_m12_id_nbank_ca_allnum = alm_m12_id_nbank_ca_allnum;
	}
	public String getAlm_m12_id_nbank_cf_allnum() {
		return alm_m12_id_nbank_cf_allnum;
	}
	public void setAlm_m12_id_nbank_cf_allnum(String alm_m12_id_nbank_cf_allnum) {
		this.alm_m12_id_nbank_cf_allnum = alm_m12_id_nbank_cf_allnum;
	}
	public String getAlm_m12_id_nbank_com_allnum() {
		return alm_m12_id_nbank_com_allnum;
	}
	public void setAlm_m12_id_nbank_com_allnum(String alm_m12_id_nbank_com_allnum) {
		this.alm_m12_id_nbank_com_allnum = alm_m12_id_nbank_com_allnum;
	}
	public String getAlm_m12_id_nbank_oth_allnum() {
		return alm_m12_id_nbank_oth_allnum;
	}
	public void setAlm_m12_id_nbank_oth_allnum(String alm_m12_id_nbank_oth_allnum) {
		this.alm_m12_id_nbank_oth_allnum = alm_m12_id_nbank_oth_allnum;
	}
	public String getAlm_m12_id_nbank_orgnum() {
		return alm_m12_id_nbank_orgnum;
	}
	public void setAlm_m12_id_nbank_orgnum(String alm_m12_id_nbank_orgnum) {
		this.alm_m12_id_nbank_orgnum = alm_m12_id_nbank_orgnum;
	}
	public String getAlm_m12_id_nbank_p2p_orgnum() {
		return alm_m12_id_nbank_p2p_orgnum;
	}
	public void setAlm_m12_id_nbank_p2p_orgnum(String alm_m12_id_nbank_p2p_orgnum) {
		this.alm_m12_id_nbank_p2p_orgnum = alm_m12_id_nbank_p2p_orgnum;
	}
	public String getAlm_m12_id_nbank_mc_orgnum() {
		return alm_m12_id_nbank_mc_orgnum;
	}
	public void setAlm_m12_id_nbank_mc_orgnum(String alm_m12_id_nbank_mc_orgnum) {
		this.alm_m12_id_nbank_mc_orgnum = alm_m12_id_nbank_mc_orgnum;
	}
	public String getAlm_m12_id_nbank_ca_orgnum() {
		return alm_m12_id_nbank_ca_orgnum;
	}
	public void setAlm_m12_id_nbank_ca_orgnum(String alm_m12_id_nbank_ca_orgnum) {
		this.alm_m12_id_nbank_ca_orgnum = alm_m12_id_nbank_ca_orgnum;
	}
	public String getAlm_m12_id_nbank_cf_orgnum() {
		return alm_m12_id_nbank_cf_orgnum;
	}
	public void setAlm_m12_id_nbank_cf_orgnum(String alm_m12_id_nbank_cf_orgnum) {
		this.alm_m12_id_nbank_cf_orgnum = alm_m12_id_nbank_cf_orgnum;
	}
	public String getAlm_m12_id_nbank_com_orgnum() {
		return alm_m12_id_nbank_com_orgnum;
	}
	public void setAlm_m12_id_nbank_com_orgnum(String alm_m12_id_nbank_com_orgnum) {
		this.alm_m12_id_nbank_com_orgnum = alm_m12_id_nbank_com_orgnum;
	}
	public String getAlm_m12_id_nbank_oth_orgnum() {
		return alm_m12_id_nbank_oth_orgnum;
	}
	public void setAlm_m12_id_nbank_oth_orgnum(String alm_m12_id_nbank_oth_orgnum) {
		this.alm_m12_id_nbank_oth_orgnum = alm_m12_id_nbank_oth_orgnum;
	}
	public String getAlm_m12_cell_bank_selfnum() {
		return alm_m12_cell_bank_selfnum;
	}
	public void setAlm_m12_cell_bank_selfnum(String alm_m12_cell_bank_selfnum) {
		this.alm_m12_cell_bank_selfnum = alm_m12_cell_bank_selfnum;
	}
	public String getAlm_m12_cell_bank_allnum() {
		return alm_m12_cell_bank_allnum;
	}
	public void setAlm_m12_cell_bank_allnum(String alm_m12_cell_bank_allnum) {
		this.alm_m12_cell_bank_allnum = alm_m12_cell_bank_allnum;
	}
	public String getAlm_m12_cell_bank_orgnum() {
		return alm_m12_cell_bank_orgnum;
	}
	public void setAlm_m12_cell_bank_orgnum(String alm_m12_cell_bank_orgnum) {
		this.alm_m12_cell_bank_orgnum = alm_m12_cell_bank_orgnum;
	}
	public String getAlm_m12_cell_nbank_selfnum() {
		return alm_m12_cell_nbank_selfnum;
	}
	public void setAlm_m12_cell_nbank_selfnum(String alm_m12_cell_nbank_selfnum) {
		this.alm_m12_cell_nbank_selfnum = alm_m12_cell_nbank_selfnum;
	}
	public String getAlm_m12_cell_nbank_allnum() {
		return alm_m12_cell_nbank_allnum;
	}
	public void setAlm_m12_cell_nbank_allnum(String alm_m12_cell_nbank_allnum) {
		this.alm_m12_cell_nbank_allnum = alm_m12_cell_nbank_allnum;
	}
	public String getAlm_m12_cell_nbank_p2p_allnum() {
		return alm_m12_cell_nbank_p2p_allnum;
	}
	public void setAlm_m12_cell_nbank_p2p_allnum(String alm_m12_cell_nbank_p2p_allnum) {
		this.alm_m12_cell_nbank_p2p_allnum = alm_m12_cell_nbank_p2p_allnum;
	}
	public String getAlm_m12_cell_nbank_mc_allnum() {
		return alm_m12_cell_nbank_mc_allnum;
	}
	public void setAlm_m12_cell_nbank_mc_allnum(String alm_m12_cell_nbank_mc_allnum) {
		this.alm_m12_cell_nbank_mc_allnum = alm_m12_cell_nbank_mc_allnum;
	}
	public String getAlm_m12_cell_nbank_ca_allnum() {
		return alm_m12_cell_nbank_ca_allnum;
	}
	public void setAlm_m12_cell_nbank_ca_allnum(String alm_m12_cell_nbank_ca_allnum) {
		this.alm_m12_cell_nbank_ca_allnum = alm_m12_cell_nbank_ca_allnum;
	}
	public String getAlm_m12_cell_nbank_cf_allnum() {
		return alm_m12_cell_nbank_cf_allnum;
	}
	public void setAlm_m12_cell_nbank_cf_allnum(String alm_m12_cell_nbank_cf_allnum) {
		this.alm_m12_cell_nbank_cf_allnum = alm_m12_cell_nbank_cf_allnum;
	}
	public String getAlm_m12_cell_nbank_com_allnum() {
		return alm_m12_cell_nbank_com_allnum;
	}
	public void setAlm_m12_cell_nbank_com_allnum(String alm_m12_cell_nbank_com_allnum) {
		this.alm_m12_cell_nbank_com_allnum = alm_m12_cell_nbank_com_allnum;
	}
	public String getAlm_m12_cell_nbank_oth_allnum() {
		return alm_m12_cell_nbank_oth_allnum;
	}
	public void setAlm_m12_cell_nbank_oth_allnum(String alm_m12_cell_nbank_oth_allnum) {
		this.alm_m12_cell_nbank_oth_allnum = alm_m12_cell_nbank_oth_allnum;
	}
	public String getAlm_m12_cell_nbank_orgnum() {
		return alm_m12_cell_nbank_orgnum;
	}
	public void setAlm_m12_cell_nbank_orgnum(String alm_m12_cell_nbank_orgnum) {
		this.alm_m12_cell_nbank_orgnum = alm_m12_cell_nbank_orgnum;
	}
	public String getAlm_m12_cell_nbank_p2p_orgnum() {
		return alm_m12_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m12_cell_nbank_p2p_orgnum(String alm_m12_cell_nbank_p2p_orgnum) {
		this.alm_m12_cell_nbank_p2p_orgnum = alm_m12_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m12_cell_nbank_mc_orgnum() {
		return alm_m12_cell_nbank_mc_orgnum;
	}
	public void setAlm_m12_cell_nbank_mc_orgnum(String alm_m12_cell_nbank_mc_orgnum) {
		this.alm_m12_cell_nbank_mc_orgnum = alm_m12_cell_nbank_mc_orgnum;
	}
	public String getAlm_m12_cell_nbank_ca_orgnum() {
		return alm_m12_cell_nbank_ca_orgnum;
	}
	public void setAlm_m12_cell_nbank_ca_orgnum(String alm_m12_cell_nbank_ca_orgnum) {
		this.alm_m12_cell_nbank_ca_orgnum = alm_m12_cell_nbank_ca_orgnum;
	}
	public String getAlm_m12_cell_nbank_cf_orgnum() {
		return alm_m12_cell_nbank_cf_orgnum;
	}
	public void setAlm_m12_cell_nbank_cf_orgnum(String alm_m12_cell_nbank_cf_orgnum) {
		this.alm_m12_cell_nbank_cf_orgnum = alm_m12_cell_nbank_cf_orgnum;
	}
	public String getAlm_m12_cell_nbank_com_orgnum() {
		return alm_m12_cell_nbank_com_orgnum;
	}
	public void setAlm_m12_cell_nbank_com_orgnum(String alm_m12_cell_nbank_com_orgnum) {
		this.alm_m12_cell_nbank_com_orgnum = alm_m12_cell_nbank_com_orgnum;
	}
	public String getAlm_m12_cell_nbank_oth_orgnum() {
		return alm_m12_cell_nbank_oth_orgnum;
	}
	public void setAlm_m12_cell_nbank_oth_orgnum(String alm_m12_cell_nbank_oth_orgnum) {
		this.alm_m12_cell_nbank_oth_orgnum = alm_m12_cell_nbank_oth_orgnum;
	}
	public String getAlm_m12_lm_cell_bank_selfnum() {
		return alm_m12_lm_cell_bank_selfnum;
	}
	public void setAlm_m12_lm_cell_bank_selfnum(String alm_m12_lm_cell_bank_selfnum) {
		this.alm_m12_lm_cell_bank_selfnum = alm_m12_lm_cell_bank_selfnum;
	}
	public String getAlm_m12_lm_cell_bank_allnum() {
		return alm_m12_lm_cell_bank_allnum;
	}
	public void setAlm_m12_lm_cell_bank_allnum(String alm_m12_lm_cell_bank_allnum) {
		this.alm_m12_lm_cell_bank_allnum = alm_m12_lm_cell_bank_allnum;
	}
	public String getAlm_m12_lm_cell_bank_orgnum() {
		return alm_m12_lm_cell_bank_orgnum;
	}
	public void setAlm_m12_lm_cell_bank_orgnum(String alm_m12_lm_cell_bank_orgnum) {
		this.alm_m12_lm_cell_bank_orgnum = alm_m12_lm_cell_bank_orgnum;
	}
	public String getAlm_m12_lm_cell_nbank_selfnum() {
		return alm_m12_lm_cell_nbank_selfnum;
	}
	public void setAlm_m12_lm_cell_nbank_selfnum(String alm_m12_lm_cell_nbank_selfnum) {
		this.alm_m12_lm_cell_nbank_selfnum = alm_m12_lm_cell_nbank_selfnum;
	}
	public String getAlm_m12_lm_cell_nbank_allnum() {
		return alm_m12_lm_cell_nbank_allnum;
	}
	public void setAlm_m12_lm_cell_nbank_allnum(String alm_m12_lm_cell_nbank_allnum) {
		this.alm_m12_lm_cell_nbank_allnum = alm_m12_lm_cell_nbank_allnum;
	}
	public String getAlm_m12_lm_cell_nbank_p2p_allnum() {
		return alm_m12_lm_cell_nbank_p2p_allnum;
	}
	public void setAlm_m12_lm_cell_nbank_p2p_allnum(String alm_m12_lm_cell_nbank_p2p_allnum) {
		this.alm_m12_lm_cell_nbank_p2p_allnum = alm_m12_lm_cell_nbank_p2p_allnum;
	}
	public String getAlm_m12_lm_cell_nbank_mc_allnum() {
		return alm_m12_lm_cell_nbank_mc_allnum;
	}
	public void setAlm_m12_lm_cell_nbank_mc_allnum(String alm_m12_lm_cell_nbank_mc_allnum) {
		this.alm_m12_lm_cell_nbank_mc_allnum = alm_m12_lm_cell_nbank_mc_allnum;
	}
	public String getAlm_m12_lm_cell_nbank_ca_allnum() {
		return alm_m12_lm_cell_nbank_ca_allnum;
	}
	public void setAlm_m12_lm_cell_nbank_ca_allnum(String alm_m12_lm_cell_nbank_ca_allnum) {
		this.alm_m12_lm_cell_nbank_ca_allnum = alm_m12_lm_cell_nbank_ca_allnum;
	}
	public String getAlm_m12_lm_cell_nbank_cf_allnum() {
		return alm_m12_lm_cell_nbank_cf_allnum;
	}
	public void setAlm_m12_lm_cell_nbank_cf_allnum(String alm_m12_lm_cell_nbank_cf_allnum) {
		this.alm_m12_lm_cell_nbank_cf_allnum = alm_m12_lm_cell_nbank_cf_allnum;
	}
	public String getAlm_m12_lm_cell_nbank_com_allnum() {
		return alm_m12_lm_cell_nbank_com_allnum;
	}
	public void setAlm_m12_lm_cell_nbank_com_allnum(String alm_m12_lm_cell_nbank_com_allnum) {
		this.alm_m12_lm_cell_nbank_com_allnum = alm_m12_lm_cell_nbank_com_allnum;
	}
	public String getAlm_m12_lm_cell_nbank_oth_allnum() {
		return alm_m12_lm_cell_nbank_oth_allnum;
	}
	public void setAlm_m12_lm_cell_nbank_oth_allnum(String alm_m12_lm_cell_nbank_oth_allnum) {
		this.alm_m12_lm_cell_nbank_oth_allnum = alm_m12_lm_cell_nbank_oth_allnum;
	}
	public String getAlm_m12_lm_cell_nbank_orgnum() {
		return alm_m12_lm_cell_nbank_orgnum;
	}
	public void setAlm_m12_lm_cell_nbank_orgnum(String alm_m12_lm_cell_nbank_orgnum) {
		this.alm_m12_lm_cell_nbank_orgnum = alm_m12_lm_cell_nbank_orgnum;
	}
	public String getAlm_m12_lm_cell_nbank_p2p_orgnum() {
		return alm_m12_lm_cell_nbank_p2p_orgnum;
	}
	public void setAlm_m12_lm_cell_nbank_p2p_orgnum(String alm_m12_lm_cell_nbank_p2p_orgnum) {
		this.alm_m12_lm_cell_nbank_p2p_orgnum = alm_m12_lm_cell_nbank_p2p_orgnum;
	}
	public String getAlm_m12_lm_cell_nbank_mc_orgnum() {
		return alm_m12_lm_cell_nbank_mc_orgnum;
	}
	public void setAlm_m12_lm_cell_nbank_mc_orgnum(String alm_m12_lm_cell_nbank_mc_orgnum) {
		this.alm_m12_lm_cell_nbank_mc_orgnum = alm_m12_lm_cell_nbank_mc_orgnum;
	}
	public String getAlm_m12_lm_cell_nbank_ca_orgnum() {
		return alm_m12_lm_cell_nbank_ca_orgnum;
	}
	public void setAlm_m12_lm_cell_nbank_ca_orgnum(String alm_m12_lm_cell_nbank_ca_orgnum) {
		this.alm_m12_lm_cell_nbank_ca_orgnum = alm_m12_lm_cell_nbank_ca_orgnum;
	}
	public String getAlm_m12_lm_cell_nbank_cf_orgnum() {
		return alm_m12_lm_cell_nbank_cf_orgnum;
	}
	public void setAlm_m12_lm_cell_nbank_cf_orgnum(String alm_m12_lm_cell_nbank_cf_orgnum) {
		this.alm_m12_lm_cell_nbank_cf_orgnum = alm_m12_lm_cell_nbank_cf_orgnum;
	}
	public String getAlm_m12_lm_cell_nbank_com_orgnum() {
		return alm_m12_lm_cell_nbank_com_orgnum;
	}
	public void setAlm_m12_lm_cell_nbank_com_orgnum(String alm_m12_lm_cell_nbank_com_orgnum) {
		this.alm_m12_lm_cell_nbank_com_orgnum = alm_m12_lm_cell_nbank_com_orgnum;
	}
	public String getAlm_m12_lm_cell_nbank_oth_orgnum() {
		return alm_m12_lm_cell_nbank_oth_orgnum;
	}
	public void setAlm_m12_lm_cell_nbank_oth_orgnum(String alm_m12_lm_cell_nbank_oth_orgnum) {
		this.alm_m12_lm_cell_nbank_oth_orgnum = alm_m12_lm_cell_nbank_oth_orgnum;
	}
	@Override
    public String toString() {
        String[] others = new String[] {};
        return ReflectionToStringBuilder.toStringExclude(this, others);
    }
	

}
