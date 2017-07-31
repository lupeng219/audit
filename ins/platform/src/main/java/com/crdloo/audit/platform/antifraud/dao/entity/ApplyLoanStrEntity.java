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
@Table(name = "bfd_applyLoanStr")
public class ApplyLoanStrEntity extends BaseEntity {

    private static final long serialVersionUID = 6016230900693813568L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String swift_number;// 流水号

    @Column
    private String flag_applyloanstr="";
    @Column
    private String als_d7_id_bank_selfnum="";
    @Column
    private String als_d7_id_bank_allnum="";
    @Column
    private String als_d7_id_bank_orgnum="";
    @Column
    private String als_d7_id_nbank_selfnum="";
    @Column
    private String als_d7_id_nbank_allnum="";
    @Column
    private String als_d7_id_nbank_p2p_allnum="";
    @Column
    private String als_d7_id_nbank_mc_allnum="";
    @Column
    private String als_d7_id_nbank_ca_allnum="";
    @Column
    private String als_d7_id_nbank_cf_allnum="";
    @Column
    private String als_d7_id_nbank_com_allnum="";
    @Column
    private String als_d7_id_nbank_oth_allnum="";
    @Column
    private String als_d7_id_nbank_orgnum="";
    @Column
    private String als_d7_id_nbank_p2p_orgnum="";
    @Column
    private String als_d7_id_nbank_mc_orgnum="";
    @Column
    private String als_d7_id_nbank_ca_orgnum="";
    @Column
    private String als_d7_id_nbank_cf_orgnum="";
    @Column
    private String als_d7_id_nbank_com_orgnum="";
    @Column
    private String als_d7_id_nbank_oth_orgnum="";
    @Column
    private String als_d7_cell_bank_selfnum="";
    @Column
    private String als_d7_cell_bank_allnum="";
    @Column
    private String als_d7_cell_bank_orgnum="";
    @Column
    private String als_d7_cell_nbank_selfnum="";
    @Column
    private String als_d7_cell_nbank_allnum="";
    @Column
    private String als_d7_cell_nbank_p2p_allnum="";
    @Column
    private String als_d7_cell_nbank_mc_allnum="";
    @Column
    private String als_d7_cell_nbank_ca_allnum="";
    @Column
    private String als_d7_cell_nbank_cf_allnum="";
    @Column
    private String als_d7_cell_nbank_com_allnum="";
    @Column
    private String als_d7_cell_nbank_oth_allnum="";
    @Column
    private String als_d7_cell_nbank_orgnum="";
    @Column
    private String als_d7_cell_nbank_p2p_orgnum="";
    @Column
    private String als_d7_cell_nbank_mc_orgnum="";
    @Column
    private String als_d7_cell_nbank_ca_orgnum="";
    @Column
    private String als_d7_cell_nbank_cf_orgnum="";
    @Column
    private String als_d7_cell_nbank_com_orgnum="";
    @Column
    private String als_d7_cell_nbank_oth_orgnum="";
    @Column
    private String als_d15_id_bank_selfnum="";
    @Column
    private String als_d15_id_bank_allnum="";
    @Column
    private String als_d15_id_bank_orgnum="";
    @Column
    private String als_d15_id_nbank_selfnum="";
    @Column
    private String als_d15_id_nbank_allnum="";
    @Column
    private String als_d15_id_nbank_p2p_allnum="";
    @Column
    private String als_d15_id_nbank_mc_allnum="";
    @Column
    private String als_d15_id_nbank_ca_allnum="";
    @Column
    private String als_d15_id_nbank_cf_allnum="";
    @Column
    private String als_d15_id_nbank_com_allnum="";
    @Column
    private String als_d15_id_nbank_oth_allnum="";
    @Column
    private String als_d15_id_nbank_orgnum="";
    @Column
    private String als_d15_id_nbank_p2p_orgnum="";
    @Column
    private String als_d15_id_nbank_mc_orgnum="";
    @Column
    private String als_d15_id_nbank_ca_orgnum="";
    @Column
    private String als_d15_id_nbank_cf_orgnum="";
    @Column
    private String als_d15_id_nbank_com_orgnum="";
    @Column
    private String als_d15_id_nbank_oth_orgnum="";
    @Column
    private String als_d15_cell_bank_selfnum="";
    @Column
    private String als_d15_cell_bank_allnum="";
    @Column
    private String als_d15_cell_bank_orgnum="";
    @Column
    private String als_d15_cell_nbank_selfnum="";
    @Column
    private String als_d15_cell_nbank_allnum="";
    @Column
    private String als_d15_cell_nbank_p2p_allnum="";
    @Column
    private String als_d15_cell_nbank_mc_allnum="";
    @Column
    private String als_d15_cell_nbank_ca_allnum="";
    @Column
    private String als_d15_cell_nbank_cf_allnum="";
    @Column
    private String als_d15_cell_nbank_com_allnum="";
    @Column
    private String als_d15_cell_nbank_oth_allnum="";
    @Column
    private String als_d15_cell_nbank_orgnum="";
    @Column
    private String als_d15_cell_nbank_p2p_orgnum="";
    @Column
    private String als_d15_cell_nbank_mc_orgnum="";
    @Column
    private String als_d15_cell_nbank_ca_orgnum="";
    @Column
    private String als_d15_cell_nbank_cf_orgnum="";
    @Column
    private String als_d15_cell_nbank_com_orgnum="";
    @Column
    private String als_d15_cell_nbank_oth_orgnum="";
    @Column
    private String als_m1_id_bank_selfnum="";
    @Column
    private String als_m1_id_bank_allnum="";
    @Column
    private String als_m1_id_bank_orgnum="";
    @Column
    private String als_m1_id_nbank_selfnum="";
    @Column
    private String als_m1_id_nbank_allnum="";
    @Column
    private String als_m1_id_nbank_p2p_allnum="";
    @Column
    private String als_m1_id_nbank_mc_allnum="";
    @Column
    private String als_m1_id_nbank_ca_allnum="";
    @Column
    private String als_m1_id_nbank_cf_allnum="";
    @Column
    private String als_m1_id_nbank_com_allnum="";
    @Column
    private String als_m1_id_nbank_oth_allnum="";
    @Column
    private String als_m1_id_nbank_orgnum="";
    @Column
    private String als_m1_id_nbank_p2p_orgnum="";
    @Column
    private String als_m1_id_nbank_mc_orgnum="";
    @Column
    private String als_m1_id_nbank_ca_orgnum="";
    @Column
    private String als_m1_id_nbank_cf_orgnum="";
    @Column
    private String als_m1_id_nbank_com_orgnum="";
    @Column
    private String als_m1_id_nbank_oth_orgnum="";
    @Column
    private String als_m1_cell_bank_selfnum="";
    @Column
    private String als_m1_cell_bank_allnum="";
    @Column
    private String als_m1_cell_bank_orgnum="";
    @Column
    private String als_m1_cell_nbank_selfnum="";
    @Column
    private String als_m1_cell_nbank_allnum="";
    @Column
    private String als_m1_cell_nbank_p2p_allnum="";
    @Column
    private String als_m1_cell_nbank_mc_allnum="";
    @Column
    private String als_m1_cell_nbank_ca_allnum="";
    @Column
    private String als_m1_cell_nbank_cf_allnum="";
    @Column
    private String als_m1_cell_nbank_com_allnum="";
    @Column
    private String als_m1_cell_nbank_oth_allnum="";
    @Column
    private String als_m1_cell_nbank_orgnum="";
    @Column
    private String als_m1_cell_nbank_p2p_orgnum="";
    @Column
    private String als_m1_cell_nbank_mc_orgnum="";
    @Column
    private String als_m1_cell_nbank_ca_orgnum="";
    @Column
    private String als_m1_cell_nbank_cf_orgnum="";
    @Column
    private String als_m1_cell_nbank_com_orgnum="";
    @Column
    private String als_m1_cell_nbank_oth_orgnum="";
    @Column
    private String als_m3_id_max_inteday="";
    @Column
    private String als_m3_id_min_inteday="";
    @Column
    private String als_m3_id_tot_mons="";
    @Column
    private String als_m3_id_avg_monnum="";
    @Column
    private String als_m3_id_max_monnum="";
    @Column
    private String als_m3_id_min_monnum="";
    @Column
    private String als_m3_id_bank_selfnum="";
    @Column
    private String als_m3_id_bank_allnum="";
    @Column
    private String als_m3_id_bank_orgnum="";
    @Column
    private String als_m3_id_bank_tot_mons="";
    @Column
    private String als_m3_id_bank_avg_monnum="";
    @Column
    private String als_m3_id_bank_max_monnum="";
    @Column
    private String als_m3_id_bank_min_monnum="";
    @Column
    private String als_m3_id_bank_max_inteday="";
    @Column
    private String als_m3_id_bank_min_inteday="";
    @Column
    private String als_m3_id_nbank_selfnum="";
    @Column
    private String als_m3_id_nbank_allnum="";
    @Column
    private String als_m3_id_nbank_p2p_allnum="";
    @Column
    private String als_m3_id_nbank_mc_allnum="";
    @Column
    private String als_m3_id_nbank_ca_allnum="";
    @Column
    private String als_m3_id_nbank_cf_allnum="";
    @Column
    private String als_m3_id_nbank_com_allnum="";
    @Column
    private String als_m3_id_nbank_oth_allnum="";
    @Column
    private String als_m3_id_nbank_orgnum="";
    @Column
    private String als_m3_id_nbank_p2p_orgnum="";
    @Column
    private String als_m3_id_nbank_mc_orgnum="";
    @Column
    private String als_m3_id_nbank_ca_orgnum="";
    @Column
    private String als_m3_id_nbank_cf_orgnum="";
    @Column
    private String als_m3_id_nbank_com_orgnum="";
    @Column
    private String als_m3_id_nbank_oth_orgnum="";
    @Column
    private String als_m3_id_nbank_tot_mons="";
    @Column
    private String als_m3_id_nbank_avg_monnum="";
    @Column
    private String als_m3_id_nbank_max_monnum="";
    @Column
    private String als_m3_id_nbank_min_monnum="";
    @Column
    private String als_m3_id_nbank_max_inteday="";
    @Column
    private String als_m3_id_nbank_min_inteday="";
    @Column
    private String als_m3_cell_max_inteday="";
    @Column
    private String als_m3_cell_min_inteday="";
    @Column
    private String als_m3_cell_tot_mons="";
    @Column
    private String als_m3_cell_avg_monnum="";
    @Column
    private String als_m3_cell_max_monnum="";
    @Column
    private String als_m3_cell_min_monnum="";
    @Column
    private String als_m3_cell_bank_selfnum="";
    @Column
    private String als_m3_cell_bank_allnum="";
    @Column
    private String als_m3_cell_bank_orgnum="";
    @Column
    private String als_m3_cell_bank_tot_mons="";
    @Column
    private String als_m3_cell_bank_avg_monnum="";
    @Column
    private String als_m3_cell_bank_max_monnum="";
    @Column
    private String als_m3_cell_bank_min_monnum="";
    @Column
    private String als_m3_cell_bank_max_inteday="";
    @Column
    private String als_m3_cell_bank_min_inteday="";
    @Column
    private String als_m3_cell_nbank_selfnum="";
    @Column
    private String als_m3_cell_nbank_allnum="";
    @Column
    private String als_m3_cell_nbank_p2p_allnum="";
    @Column
    private String als_m3_cell_nbank_mc_allnum="";
    @Column
    private String als_m3_cell_nbank_ca_allnum="";
    @Column
    private String als_m3_cell_nbank_cf_allnum="";
    @Column
    private String als_m3_cell_nbank_com_allnum="";
    @Column
    private String als_m3_cell_nbank_oth_allnum="";
    @Column
    private String als_m3_cell_nbank_orgnum="";
    @Column
    private String als_m3_cell_nbank_p2p_orgnum="";
    @Column
    private String als_m3_cell_nbank_mc_orgnum="";
    @Column
    private String als_m3_cell_nbank_ca_orgnum="";
    @Column
    private String als_m3_cell_nbank_cf_orgnum="";
    @Column
    private String als_m3_cell_nbank_com_orgnum="";
    @Column
    private String als_m3_cell_nbank_oth_orgnum="";
    @Column
    private String als_m3_cell_nbank_tot_mons="";
    @Column
    private String als_m3_cell_nbank_avg_monnum="";
    @Column
    private String als_m3_cell_nbank_max_monnum="";
    @Column
    private String als_m3_cell_nbank_min_monnum="";
    @Column
    private String als_m3_cell_nbank_max_inteday="";
    @Column
    private String als_m3_cell_nbank_min_inteday="";
    @Column
    private String als_m6_id_max_inteday="";
    @Column
    private String als_m6_id_min_inteday="";
    @Column
    private String als_m6_id_tot_mons="";
    @Column
    private String als_m6_id_avg_monnum="";
    @Column
    private String als_m6_id_max_monnum="";
    @Column
    private String als_m6_id_min_monnum="";
    @Column
    private String als_m6_id_bank_selfnum="";
    @Column
    private String als_m6_id_bank_allnum="";
    @Column
    private String als_m6_id_bank_orgnum="";
    @Column
    private String als_m6_id_bank_tot_mons="";
    @Column
    private String als_m6_id_bank_avg_monnum="";
    @Column
    private String als_m6_id_bank_max_monnum="";
    @Column
    private String als_m6_id_bank_min_monnum="";
    @Column
    private String als_m6_id_bank_max_inteday="";
    @Column
    private String als_m6_id_bank_min_inteday="";
    @Column
    private String als_m6_id_nbank_selfnum="";
    @Column
    private String als_m6_id_nbank_allnum="";
    @Column
    private String als_m6_id_nbank_p2p_allnum="";
    @Column
    private String als_m6_id_nbank_mc_allnum="";
    @Column
    private String als_m6_id_nbank_ca_allnum="";
    @Column
    private String als_m6_id_nbank_cf_allnum="";
    @Column
    private String als_m6_id_nbank_com_allnum="";
    @Column
    private String als_m6_id_nbank_oth_allnum="";
    @Column
    private String als_m6_id_nbank_orgnum="";
    @Column
    private String als_m6_id_nbank_p2p_orgnum="";
    @Column
    private String als_m6_id_nbank_mc_orgnum="";
    @Column
    private String als_m6_id_nbank_ca_orgnum="";
    @Column
    private String als_m6_id_nbank_cf_orgnum="";
    @Column
    private String als_m6_id_nbank_com_orgnum="";
    @Column
    private String als_m6_id_nbank_oth_orgnum="";
    @Column
    private String als_m6_id_nbank_tot_mons="";
    @Column
    private String als_m6_id_nbank_avg_monnum="";
    @Column
    private String als_m6_id_nbank_max_monnum="";
    @Column
    private String als_m6_id_nbank_min_monnum="";
    @Column
    private String als_m6_id_nbank_max_inteday="";
    @Column
    private String als_m6_id_nbank_min_inteday="";
    @Column
    private String als_m6_cell_max_inteday="";
    @Column
    private String als_m6_cell_min_inteday="";
    @Column
    private String als_m6_cell_tot_mons="";
    @Column
    private String als_m6_cell_avg_monnum="";
    @Column
    private String als_m6_cell_max_monnum="";
    @Column
    private String als_m6_cell_min_monnum="";
    @Column
    private String als_m6_cell_bank_selfnum="";
    @Column
    private String als_m6_cell_bank_allnum="";
    @Column
    private String als_m6_cell_bank_orgnum="";
    @Column
    private String als_m6_cell_bank_tot_mons="";
    @Column
    private String als_m6_cell_bank_avg_monnum="";
    @Column
    private String als_m6_cell_bank_max_monnum="";
    @Column
    private String als_m6_cell_bank_min_monnum="";
    @Column
    private String als_m6_cell_bank_max_inteday="";
    @Column
    private String als_m6_cell_bank_min_inteday="";
    @Column
    private String als_m6_cell_nbank_selfnum="";
    @Column
    private String als_m6_cell_nbank_allnum="";
    @Column
    private String als_m6_cell_nbank_p2p_allnum="";
    @Column
    private String als_m6_cell_nbank_mc_allnum="";
    @Column
    private String als_m6_cell_nbank_ca_allnum="";
    @Column
    private String als_m6_cell_nbank_cf_allnum="";
    @Column
    private String als_m6_cell_nbank_com_allnum="";
    @Column
    private String als_m6_cell_nbank_oth_allnum="";
    @Column
    private String als_m6_cell_nbank_orgnum="";
    @Column
    private String als_m6_cell_nbank_p2p_orgnum="";
    @Column
    private String als_m6_cell_nbank_mc_orgnum="";
    @Column
    private String als_m6_cell_nbank_ca_orgnum="";
    @Column
    private String als_m6_cell_nbank_cf_orgnum="";
    @Column
    private String als_m6_cell_nbank_com_orgnum="";
    @Column
    private String als_m6_cell_nbank_oth_orgnum="";
    @Column
    private String als_m6_cell_nbank_tot_mons="";
    @Column
    private String als_m6_cell_nbank_avg_monnum="";
    @Column
    private String als_m6_cell_nbank_max_monnum="";
    @Column
    private String als_m6_cell_nbank_min_monnum="";
    @Column
    private String als_m6_cell_nbank_max_inteday="";
    @Column
    private String als_m6_cell_nbank_min_inteday="";
    @Column
    private String als_m12_id_max_inteday="";
    @Column
    private String als_m12_id_min_inteday="";
    @Column
    private String als_m12_id_tot_mons="";
    @Column
    private String als_m12_id_avg_monnum="";
    @Column
    private String als_m12_id_max_monnum="";
    @Column
    private String als_m12_id_min_monnum="";
    @Column
    private String als_m12_id_bank_selfnum="";
    @Column
    private String als_m12_id_bank_allnum="";
    @Column
    private String als_m12_id_bank_orgnum="";
    @Column
    private String als_m12_id_bank_tot_mons="";
    @Column
    private String als_m12_id_bank_avg_monnum="";
    @Column
    private String als_m12_id_bank_max_monnum="";
    @Column
    private String als_m12_id_bank_min_monnum="";
    @Column
    private String als_m12_id_bank_max_inteday="";
    @Column
    private String als_m12_id_bank_min_inteday="";
    @Column
    private String als_m12_id_nbank_selfnum="";
    @Column
    private String als_m12_id_nbank_allnum="";
    @Column
    private String als_m12_id_nbank_p2p_allnum="";
    @Column
    private String als_m12_id_nbank_mc_allnum="";
    @Column
    private String als_m12_id_nbank_ca_allnum="";
    @Column
    private String als_m12_id_nbank_cf_allnum="";
    @Column
    private String als_m12_id_nbank_com_allnum="";
    @Column
    private String als_m12_id_nbank_oth_allnum="";
    @Column
    private String als_m12_id_nbank_orgnum="";
    @Column
    private String als_m12_id_nbank_p2p_orgnum="";
    @Column
    private String als_m12_id_nbank_mc_orgnum="";
    @Column
    private String als_m12_id_nbank_ca_orgnum="";
    @Column
    private String als_m12_id_nbank_cf_orgnum="";
    @Column
    private String als_m12_id_nbank_com_orgnum="";
    @Column
    private String als_m12_id_nbank_oth_orgnum="";
    @Column
    private String als_m12_id_nbank_tot_mons="";
    @Column
    private String als_m12_id_nbank_avg_monnum="";
    @Column
    private String als_m12_id_nbank_max_monnum="";
    @Column
    private String als_m12_id_nbank_min_monnum="";
    @Column
    private String als_m12_id_nbank_max_inteday="";
    @Column
    private String als_m12_id_nbank_min_inteday="";
    @Column
    private String als_m12_cell_max_inteday="";
    @Column
    private String als_m12_cell_min_inteday="";
    @Column
    private String als_m12_cell_tot_mons="";
    @Column
    private String als_m12_cell_avg_monnum="";
    @Column
    private String als_m12_cell_max_monnum="";
    @Column
    private String als_m12_cell_min_monnum="";
    @Column
    private String als_m12_cell_bank_selfnum="";
    @Column
    private String als_m12_cell_bank_allnum="";
    @Column
    private String als_m12_cell_bank_orgnum="";
    @Column
    private String als_m12_cell_bank_tot_mons="";
    @Column
    private String als_m12_cell_bank_avg_monnum="";
    @Column
    private String als_m12_cell_bank_max_monnum="";
    @Column
    private String als_m12_cell_bank_min_monnum="";
    @Column
    private String als_m12_cell_bank_max_inteday="";
    @Column
    private String als_m12_cell_bank_min_inteday="";
    @Column
    private String als_m12_cell_nbank_selfnum="";
    @Column
    private String als_m12_cell_nbank_allnum="";
    @Column
    private String als_m12_cell_nbank_p2p_allnum="";
    @Column
    private String als_m12_cell_nbank_mc_allnum="";
    @Column
    private String als_m12_cell_nbank_ca_allnum="";
    @Column
    private String als_m12_cell_nbank_cf_allnum="";
    @Column
    private String als_m12_cell_nbank_com_allnum="";
    @Column
    private String als_m12_cell_nbank_oth_allnum="";
    @Column
    private String als_m12_cell_nbank_orgnum="";
    @Column
    private String als_m12_cell_nbank_p2p_orgnum="";
    @Column
    private String als_m12_cell_nbank_mc_orgnum="";
    @Column
    private String als_m12_cell_nbank_ca_orgnum="";
    @Column
    private String als_m12_cell_nbank_cf_orgnum="";
    @Column
    private String als_m12_cell_nbank_com_orgnum="";
    @Column
    private String als_m12_cell_nbank_oth_orgnum="";
    @Column
    private String als_m12_cell_nbank_tot_mons="";
    @Column
    private String als_m12_cell_nbank_avg_monnum="";
    @Column
    private String als_m12_cell_nbank_max_monnum="";
    @Column
    private String als_m12_cell_nbank_min_monnum="";
    @Column
    private String als_m12_cell_nbank_max_inteday="";
    @Column
    private String als_m12_cell_nbank_min_inteday="";
    @Column
    private String als_fst_id_bank_inteday="";
    @Column
    private String als_fst_id_nbank_inteday="";
    @Column
    private String als_fst_cell_bank_inteday="";
    @Column
    private String als_fst_cell_nbank_inteday="";
    @Column
    private String als_lst_id_bank_inteday="";
    @Column
    private String als_lst_id_bank_consnum="";
    @Column
    private String als_lst_id_bank_csinteday="";
    @Column
    private String als_lst_id_nbank_inteday="";
    @Column
    private String als_lst_id_nbank_consnum="";
    @Column
    private String als_lst_id_nbank_csinteday="";
    @Column
    private String als_lst_cell_bank_inteday="";
    @Column
    private String als_lst_cell_bank_consnum="";
    @Column
    private String als_lst_cell_bank_csinteday="";
    @Column
    private String als_lst_cell_nbank_inteday="";
    @Column
    private String als_lst_cell_nbank_consnum="";
    @Column
    private String als_lst_cell_nbank_csinteday="";


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

    public String getFlag_applyloanstr() {
        return flag_applyloanstr;
    }

    public void setFlag_applyloanstr(String flag_applyloanstr) {
        this.flag_applyloanstr = flag_applyloanstr;
    }

    public String getAls_d7_id_bank_selfnum() {
        return als_d7_id_bank_selfnum;
    }

    public void setAls_d7_id_bank_selfnum(String als_d7_id_bank_selfnum) {
        this.als_d7_id_bank_selfnum = als_d7_id_bank_selfnum;
    }

    public String getAls_d7_id_bank_allnum() {
        return als_d7_id_bank_allnum;
    }

    public void setAls_d7_id_bank_allnum(String als_d7_id_bank_allnum) {
        this.als_d7_id_bank_allnum = als_d7_id_bank_allnum;
    }

    public String getAls_d7_id_bank_orgnum() {
        return als_d7_id_bank_orgnum;
    }

    public void setAls_d7_id_bank_orgnum(String als_d7_id_bank_orgnum) {
        this.als_d7_id_bank_orgnum = als_d7_id_bank_orgnum;
    }

    public String getAls_d7_id_nbank_selfnum() {
        return als_d7_id_nbank_selfnum;
    }

    public void setAls_d7_id_nbank_selfnum(String als_d7_id_nbank_selfnum) {
        this.als_d7_id_nbank_selfnum = als_d7_id_nbank_selfnum;
    }

    public String getAls_d7_id_nbank_allnum() {
        return als_d7_id_nbank_allnum;
    }

    public void setAls_d7_id_nbank_allnum(String als_d7_id_nbank_allnum) {
        this.als_d7_id_nbank_allnum = als_d7_id_nbank_allnum;
    }

    public String getAls_d7_id_nbank_p2p_allnum() {
        return als_d7_id_nbank_p2p_allnum;
    }

    public void setAls_d7_id_nbank_p2p_allnum(String als_d7_id_nbank_p2p_allnum) {
        this.als_d7_id_nbank_p2p_allnum = als_d7_id_nbank_p2p_allnum;
    }

    public String getAls_d7_id_nbank_mc_allnum() {
        return als_d7_id_nbank_mc_allnum;
    }

    public void setAls_d7_id_nbank_mc_allnum(String als_d7_id_nbank_mc_allnum) {
        this.als_d7_id_nbank_mc_allnum = als_d7_id_nbank_mc_allnum;
    }

    public String getAls_d7_id_nbank_ca_allnum() {
        return als_d7_id_nbank_ca_allnum;
    }

    public void setAls_d7_id_nbank_ca_allnum(String als_d7_id_nbank_ca_allnum) {
        this.als_d7_id_nbank_ca_allnum = als_d7_id_nbank_ca_allnum;
    }

    public String getAls_d7_id_nbank_cf_allnum() {
        return als_d7_id_nbank_cf_allnum;
    }

    public void setAls_d7_id_nbank_cf_allnum(String als_d7_id_nbank_cf_allnum) {
        this.als_d7_id_nbank_cf_allnum = als_d7_id_nbank_cf_allnum;
    }

    public String getAls_d7_id_nbank_com_allnum() {
        return als_d7_id_nbank_com_allnum;
    }

    public void setAls_d7_id_nbank_com_allnum(String als_d7_id_nbank_com_allnum) {
        this.als_d7_id_nbank_com_allnum = als_d7_id_nbank_com_allnum;
    }

    public String getAls_d7_id_nbank_oth_allnum() {
        return als_d7_id_nbank_oth_allnum;
    }

    public void setAls_d7_id_nbank_oth_allnum(String als_d7_id_nbank_oth_allnum) {
        this.als_d7_id_nbank_oth_allnum = als_d7_id_nbank_oth_allnum;
    }

    public String getAls_d7_id_nbank_orgnum() {
        return als_d7_id_nbank_orgnum;
    }

    public void setAls_d7_id_nbank_orgnum(String als_d7_id_nbank_orgnum) {
        this.als_d7_id_nbank_orgnum = als_d7_id_nbank_orgnum;
    }

    public String getAls_d7_id_nbank_p2p_orgnum() {
        return als_d7_id_nbank_p2p_orgnum;
    }

    public void setAls_d7_id_nbank_p2p_orgnum(String als_d7_id_nbank_p2p_orgnum) {
        this.als_d7_id_nbank_p2p_orgnum = als_d7_id_nbank_p2p_orgnum;
    }

    public String getAls_d7_id_nbank_mc_orgnum() {
        return als_d7_id_nbank_mc_orgnum;
    }

    public void setAls_d7_id_nbank_mc_orgnum(String als_d7_id_nbank_mc_orgnum) {
        this.als_d7_id_nbank_mc_orgnum = als_d7_id_nbank_mc_orgnum;
    }

    public String getAls_d7_id_nbank_ca_orgnum() {
        return als_d7_id_nbank_ca_orgnum;
    }

    public void setAls_d7_id_nbank_ca_orgnum(String als_d7_id_nbank_ca_orgnum) {
        this.als_d7_id_nbank_ca_orgnum = als_d7_id_nbank_ca_orgnum;
    }

    public String getAls_d7_id_nbank_cf_orgnum() {
        return als_d7_id_nbank_cf_orgnum;
    }

    public void setAls_d7_id_nbank_cf_orgnum(String als_d7_id_nbank_cf_orgnum) {
        this.als_d7_id_nbank_cf_orgnum = als_d7_id_nbank_cf_orgnum;
    }

    public String getAls_d7_id_nbank_com_orgnum() {
        return als_d7_id_nbank_com_orgnum;
    }

    public void setAls_d7_id_nbank_com_orgnum(String als_d7_id_nbank_com_orgnum) {
        this.als_d7_id_nbank_com_orgnum = als_d7_id_nbank_com_orgnum;
    }

    public String getAls_d7_id_nbank_oth_orgnum() {
        return als_d7_id_nbank_oth_orgnum;
    }

    public void setAls_d7_id_nbank_oth_orgnum(String als_d7_id_nbank_oth_orgnum) {
        this.als_d7_id_nbank_oth_orgnum = als_d7_id_nbank_oth_orgnum;
    }

    public String getAls_d7_cell_bank_selfnum() {
        return als_d7_cell_bank_selfnum;
    }

    public void setAls_d7_cell_bank_selfnum(String als_d7_cell_bank_selfnum) {
        this.als_d7_cell_bank_selfnum = als_d7_cell_bank_selfnum;
    }

    public String getAls_d7_cell_bank_allnum() {
        return als_d7_cell_bank_allnum;
    }

    public void setAls_d7_cell_bank_allnum(String als_d7_cell_bank_allnum) {
        this.als_d7_cell_bank_allnum = als_d7_cell_bank_allnum;
    }

    public String getAls_d7_cell_bank_orgnum() {
        return als_d7_cell_bank_orgnum;
    }

    public void setAls_d7_cell_bank_orgnum(String als_d7_cell_bank_orgnum) {
        this.als_d7_cell_bank_orgnum = als_d7_cell_bank_orgnum;
    }

    public String getAls_d7_cell_nbank_selfnum() {
        return als_d7_cell_nbank_selfnum;
    }

    public void setAls_d7_cell_nbank_selfnum(String als_d7_cell_nbank_selfnum) {
        this.als_d7_cell_nbank_selfnum = als_d7_cell_nbank_selfnum;
    }

    public String getAls_d7_cell_nbank_allnum() {
        return als_d7_cell_nbank_allnum;
    }

    public void setAls_d7_cell_nbank_allnum(String als_d7_cell_nbank_allnum) {
        this.als_d7_cell_nbank_allnum = als_d7_cell_nbank_allnum;
    }

    public String getAls_d7_cell_nbank_p2p_allnum() {
        return als_d7_cell_nbank_p2p_allnum;
    }

    public void setAls_d7_cell_nbank_p2p_allnum(String als_d7_cell_nbank_p2p_allnum) {
        this.als_d7_cell_nbank_p2p_allnum = als_d7_cell_nbank_p2p_allnum;
    }

    public String getAls_d7_cell_nbank_mc_allnum() {
        return als_d7_cell_nbank_mc_allnum;
    }

    public void setAls_d7_cell_nbank_mc_allnum(String als_d7_cell_nbank_mc_allnum) {
        this.als_d7_cell_nbank_mc_allnum = als_d7_cell_nbank_mc_allnum;
    }

    public String getAls_d7_cell_nbank_ca_allnum() {
        return als_d7_cell_nbank_ca_allnum;
    }

    public void setAls_d7_cell_nbank_ca_allnum(String als_d7_cell_nbank_ca_allnum) {
        this.als_d7_cell_nbank_ca_allnum = als_d7_cell_nbank_ca_allnum;
    }

    public String getAls_d7_cell_nbank_cf_allnum() {
        return als_d7_cell_nbank_cf_allnum;
    }

    public void setAls_d7_cell_nbank_cf_allnum(String als_d7_cell_nbank_cf_allnum) {
        this.als_d7_cell_nbank_cf_allnum = als_d7_cell_nbank_cf_allnum;
    }

    public String getAls_d7_cell_nbank_com_allnum() {
        return als_d7_cell_nbank_com_allnum;
    }

    public void setAls_d7_cell_nbank_com_allnum(String als_d7_cell_nbank_com_allnum) {
        this.als_d7_cell_nbank_com_allnum = als_d7_cell_nbank_com_allnum;
    }

    public String getAls_d7_cell_nbank_oth_allnum() {
        return als_d7_cell_nbank_oth_allnum;
    }

    public void setAls_d7_cell_nbank_oth_allnum(String als_d7_cell_nbank_oth_allnum) {
        this.als_d7_cell_nbank_oth_allnum = als_d7_cell_nbank_oth_allnum;
    }

    public String getAls_d7_cell_nbank_orgnum() {
        return als_d7_cell_nbank_orgnum;
    }

    public void setAls_d7_cell_nbank_orgnum(String als_d7_cell_nbank_orgnum) {
        this.als_d7_cell_nbank_orgnum = als_d7_cell_nbank_orgnum;
    }

    public String getAls_d7_cell_nbank_p2p_orgnum() {
        return als_d7_cell_nbank_p2p_orgnum;
    }

    public void setAls_d7_cell_nbank_p2p_orgnum(String als_d7_cell_nbank_p2p_orgnum) {
        this.als_d7_cell_nbank_p2p_orgnum = als_d7_cell_nbank_p2p_orgnum;
    }

    public String getAls_d7_cell_nbank_mc_orgnum() {
        return als_d7_cell_nbank_mc_orgnum;
    }

    public void setAls_d7_cell_nbank_mc_orgnum(String als_d7_cell_nbank_mc_orgnum) {
        this.als_d7_cell_nbank_mc_orgnum = als_d7_cell_nbank_mc_orgnum;
    }

    public String getAls_d7_cell_nbank_ca_orgnum() {
        return als_d7_cell_nbank_ca_orgnum;
    }

    public void setAls_d7_cell_nbank_ca_orgnum(String als_d7_cell_nbank_ca_orgnum) {
        this.als_d7_cell_nbank_ca_orgnum = als_d7_cell_nbank_ca_orgnum;
    }

    public String getAls_d7_cell_nbank_cf_orgnum() {
        return als_d7_cell_nbank_cf_orgnum;
    }

    public void setAls_d7_cell_nbank_cf_orgnum(String als_d7_cell_nbank_cf_orgnum) {
        this.als_d7_cell_nbank_cf_orgnum = als_d7_cell_nbank_cf_orgnum;
    }

    public String getAls_d7_cell_nbank_com_orgnum() {
        return als_d7_cell_nbank_com_orgnum;
    }

    public void setAls_d7_cell_nbank_com_orgnum(String als_d7_cell_nbank_com_orgnum) {
        this.als_d7_cell_nbank_com_orgnum = als_d7_cell_nbank_com_orgnum;
    }

    public String getAls_d7_cell_nbank_oth_orgnum() {
        return als_d7_cell_nbank_oth_orgnum;
    }

    public void setAls_d7_cell_nbank_oth_orgnum(String als_d7_cell_nbank_oth_orgnum) {
        this.als_d7_cell_nbank_oth_orgnum = als_d7_cell_nbank_oth_orgnum;
    }

    public String getAls_d15_id_bank_selfnum() {
        return als_d15_id_bank_selfnum;
    }

    public void setAls_d15_id_bank_selfnum(String als_d15_id_bank_selfnum) {
        this.als_d15_id_bank_selfnum = als_d15_id_bank_selfnum;
    }

    public String getAls_d15_id_bank_allnum() {
        return als_d15_id_bank_allnum;
    }

    public void setAls_d15_id_bank_allnum(String als_d15_id_bank_allnum) {
        this.als_d15_id_bank_allnum = als_d15_id_bank_allnum;
    }

    public String getAls_d15_id_bank_orgnum() {
        return als_d15_id_bank_orgnum;
    }

    public void setAls_d15_id_bank_orgnum(String als_d15_id_bank_orgnum) {
        this.als_d15_id_bank_orgnum = als_d15_id_bank_orgnum;
    }

    public String getAls_d15_id_nbank_selfnum() {
        return als_d15_id_nbank_selfnum;
    }

    public void setAls_d15_id_nbank_selfnum(String als_d15_id_nbank_selfnum) {
        this.als_d15_id_nbank_selfnum = als_d15_id_nbank_selfnum;
    }

    public String getAls_d15_id_nbank_allnum() {
        return als_d15_id_nbank_allnum;
    }

    public void setAls_d15_id_nbank_allnum(String als_d15_id_nbank_allnum) {
        this.als_d15_id_nbank_allnum = als_d15_id_nbank_allnum;
    }

    public String getAls_d15_id_nbank_p2p_allnum() {
        return als_d15_id_nbank_p2p_allnum;
    }

    public void setAls_d15_id_nbank_p2p_allnum(String als_d15_id_nbank_p2p_allnum) {
        this.als_d15_id_nbank_p2p_allnum = als_d15_id_nbank_p2p_allnum;
    }

    public String getAls_d15_id_nbank_mc_allnum() {
        return als_d15_id_nbank_mc_allnum;
    }

    public void setAls_d15_id_nbank_mc_allnum(String als_d15_id_nbank_mc_allnum) {
        this.als_d15_id_nbank_mc_allnum = als_d15_id_nbank_mc_allnum;
    }

    public String getAls_d15_id_nbank_ca_allnum() {
        return als_d15_id_nbank_ca_allnum;
    }

    public void setAls_d15_id_nbank_ca_allnum(String als_d15_id_nbank_ca_allnum) {
        this.als_d15_id_nbank_ca_allnum = als_d15_id_nbank_ca_allnum;
    }

    public String getAls_d15_id_nbank_cf_allnum() {
        return als_d15_id_nbank_cf_allnum;
    }

    public void setAls_d15_id_nbank_cf_allnum(String als_d15_id_nbank_cf_allnum) {
        this.als_d15_id_nbank_cf_allnum = als_d15_id_nbank_cf_allnum;
    }

    public String getAls_d15_id_nbank_com_allnum() {
        return als_d15_id_nbank_com_allnum;
    }

    public void setAls_d15_id_nbank_com_allnum(String als_d15_id_nbank_com_allnum) {
        this.als_d15_id_nbank_com_allnum = als_d15_id_nbank_com_allnum;
    }

    public String getAls_d15_id_nbank_oth_allnum() {
        return als_d15_id_nbank_oth_allnum;
    }

    public void setAls_d15_id_nbank_oth_allnum(String als_d15_id_nbank_oth_allnum) {
        this.als_d15_id_nbank_oth_allnum = als_d15_id_nbank_oth_allnum;
    }

    public String getAls_d15_id_nbank_orgnum() {
        return als_d15_id_nbank_orgnum;
    }

    public void setAls_d15_id_nbank_orgnum(String als_d15_id_nbank_orgnum) {
        this.als_d15_id_nbank_orgnum = als_d15_id_nbank_orgnum;
    }

    public String getAls_d15_id_nbank_p2p_orgnum() {
        return als_d15_id_nbank_p2p_orgnum;
    }

    public void setAls_d15_id_nbank_p2p_orgnum(String als_d15_id_nbank_p2p_orgnum) {
        this.als_d15_id_nbank_p2p_orgnum = als_d15_id_nbank_p2p_orgnum;
    }

    public String getAls_d15_id_nbank_mc_orgnum() {
        return als_d15_id_nbank_mc_orgnum;
    }

    public void setAls_d15_id_nbank_mc_orgnum(String als_d15_id_nbank_mc_orgnum) {
        this.als_d15_id_nbank_mc_orgnum = als_d15_id_nbank_mc_orgnum;
    }

    public String getAls_d15_id_nbank_ca_orgnum() {
        return als_d15_id_nbank_ca_orgnum;
    }

    public void setAls_d15_id_nbank_ca_orgnum(String als_d15_id_nbank_ca_orgnum) {
        this.als_d15_id_nbank_ca_orgnum = als_d15_id_nbank_ca_orgnum;
    }

    public String getAls_d15_id_nbank_cf_orgnum() {
        return als_d15_id_nbank_cf_orgnum;
    }

    public void setAls_d15_id_nbank_cf_orgnum(String als_d15_id_nbank_cf_orgnum) {
        this.als_d15_id_nbank_cf_orgnum = als_d15_id_nbank_cf_orgnum;
    }

    public String getAls_d15_id_nbank_com_orgnum() {
        return als_d15_id_nbank_com_orgnum;
    }

    public void setAls_d15_id_nbank_com_orgnum(String als_d15_id_nbank_com_orgnum) {
        this.als_d15_id_nbank_com_orgnum = als_d15_id_nbank_com_orgnum;
    }

    public String getAls_d15_id_nbank_oth_orgnum() {
        return als_d15_id_nbank_oth_orgnum;
    }

    public void setAls_d15_id_nbank_oth_orgnum(String als_d15_id_nbank_oth_orgnum) {
        this.als_d15_id_nbank_oth_orgnum = als_d15_id_nbank_oth_orgnum;
    }

    public String getAls_d15_cell_bank_selfnum() {
        return als_d15_cell_bank_selfnum;
    }

    public void setAls_d15_cell_bank_selfnum(String als_d15_cell_bank_selfnum) {
        this.als_d15_cell_bank_selfnum = als_d15_cell_bank_selfnum;
    }

    public String getAls_d15_cell_bank_allnum() {
        return als_d15_cell_bank_allnum;
    }

    public void setAls_d15_cell_bank_allnum(String als_d15_cell_bank_allnum) {
        this.als_d15_cell_bank_allnum = als_d15_cell_bank_allnum;
    }

    public String getAls_d15_cell_bank_orgnum() {
        return als_d15_cell_bank_orgnum;
    }

    public void setAls_d15_cell_bank_orgnum(String als_d15_cell_bank_orgnum) {
        this.als_d15_cell_bank_orgnum = als_d15_cell_bank_orgnum;
    }

    public String getAls_d15_cell_nbank_selfnum() {
        return als_d15_cell_nbank_selfnum;
    }

    public void setAls_d15_cell_nbank_selfnum(String als_d15_cell_nbank_selfnum) {
        this.als_d15_cell_nbank_selfnum = als_d15_cell_nbank_selfnum;
    }

    public String getAls_d15_cell_nbank_allnum() {
        return als_d15_cell_nbank_allnum;
    }

    public void setAls_d15_cell_nbank_allnum(String als_d15_cell_nbank_allnum) {
        this.als_d15_cell_nbank_allnum = als_d15_cell_nbank_allnum;
    }

    public String getAls_d15_cell_nbank_p2p_allnum() {
        return als_d15_cell_nbank_p2p_allnum;
    }

    public void setAls_d15_cell_nbank_p2p_allnum(String als_d15_cell_nbank_p2p_allnum) {
        this.als_d15_cell_nbank_p2p_allnum = als_d15_cell_nbank_p2p_allnum;
    }

    public String getAls_d15_cell_nbank_mc_allnum() {
        return als_d15_cell_nbank_mc_allnum;
    }

    public void setAls_d15_cell_nbank_mc_allnum(String als_d15_cell_nbank_mc_allnum) {
        this.als_d15_cell_nbank_mc_allnum = als_d15_cell_nbank_mc_allnum;
    }

    public String getAls_d15_cell_nbank_ca_allnum() {
        return als_d15_cell_nbank_ca_allnum;
    }

    public void setAls_d15_cell_nbank_ca_allnum(String als_d15_cell_nbank_ca_allnum) {
        this.als_d15_cell_nbank_ca_allnum = als_d15_cell_nbank_ca_allnum;
    }

    public String getAls_d15_cell_nbank_cf_allnum() {
        return als_d15_cell_nbank_cf_allnum;
    }

    public void setAls_d15_cell_nbank_cf_allnum(String als_d15_cell_nbank_cf_allnum) {
        this.als_d15_cell_nbank_cf_allnum = als_d15_cell_nbank_cf_allnum;
    }

    public String getAls_d15_cell_nbank_com_allnum() {
        return als_d15_cell_nbank_com_allnum;
    }

    public void setAls_d15_cell_nbank_com_allnum(String als_d15_cell_nbank_com_allnum) {
        this.als_d15_cell_nbank_com_allnum = als_d15_cell_nbank_com_allnum;
    }

    public String getAls_d15_cell_nbank_oth_allnum() {
        return als_d15_cell_nbank_oth_allnum;
    }

    public void setAls_d15_cell_nbank_oth_allnum(String als_d15_cell_nbank_oth_allnum) {
        this.als_d15_cell_nbank_oth_allnum = als_d15_cell_nbank_oth_allnum;
    }

    public String getAls_d15_cell_nbank_orgnum() {
        return als_d15_cell_nbank_orgnum;
    }

    public void setAls_d15_cell_nbank_orgnum(String als_d15_cell_nbank_orgnum) {
        this.als_d15_cell_nbank_orgnum = als_d15_cell_nbank_orgnum;
    }

    public String getAls_d15_cell_nbank_p2p_orgnum() {
        return als_d15_cell_nbank_p2p_orgnum;
    }

    public void setAls_d15_cell_nbank_p2p_orgnum(String als_d15_cell_nbank_p2p_orgnum) {
        this.als_d15_cell_nbank_p2p_orgnum = als_d15_cell_nbank_p2p_orgnum;
    }

    public String getAls_d15_cell_nbank_mc_orgnum() {
        return als_d15_cell_nbank_mc_orgnum;
    }

    public void setAls_d15_cell_nbank_mc_orgnum(String als_d15_cell_nbank_mc_orgnum) {
        this.als_d15_cell_nbank_mc_orgnum = als_d15_cell_nbank_mc_orgnum;
    }

    public String getAls_d15_cell_nbank_ca_orgnum() {
        return als_d15_cell_nbank_ca_orgnum;
    }

    public void setAls_d15_cell_nbank_ca_orgnum(String als_d15_cell_nbank_ca_orgnum) {
        this.als_d15_cell_nbank_ca_orgnum = als_d15_cell_nbank_ca_orgnum;
    }

    public String getAls_d15_cell_nbank_cf_orgnum() {
        return als_d15_cell_nbank_cf_orgnum;
    }

    public void setAls_d15_cell_nbank_cf_orgnum(String als_d15_cell_nbank_cf_orgnum) {
        this.als_d15_cell_nbank_cf_orgnum = als_d15_cell_nbank_cf_orgnum;
    }

    public String getAls_d15_cell_nbank_com_orgnum() {
        return als_d15_cell_nbank_com_orgnum;
    }

    public void setAls_d15_cell_nbank_com_orgnum(String als_d15_cell_nbank_com_orgnum) {
        this.als_d15_cell_nbank_com_orgnum = als_d15_cell_nbank_com_orgnum;
    }

    public String getAls_d15_cell_nbank_oth_orgnum() {
        return als_d15_cell_nbank_oth_orgnum;
    }

    public void setAls_d15_cell_nbank_oth_orgnum(String als_d15_cell_nbank_oth_orgnum) {
        this.als_d15_cell_nbank_oth_orgnum = als_d15_cell_nbank_oth_orgnum;
    }

    public String getAls_m1_id_bank_selfnum() {
        return als_m1_id_bank_selfnum;
    }

    public void setAls_m1_id_bank_selfnum(String als_m1_id_bank_selfnum) {
        this.als_m1_id_bank_selfnum = als_m1_id_bank_selfnum;
    }

    public String getAls_m1_id_bank_allnum() {
        return als_m1_id_bank_allnum;
    }

    public void setAls_m1_id_bank_allnum(String als_m1_id_bank_allnum) {
        this.als_m1_id_bank_allnum = als_m1_id_bank_allnum;
    }

    public String getAls_m1_id_bank_orgnum() {
        return als_m1_id_bank_orgnum;
    }

    public void setAls_m1_id_bank_orgnum(String als_m1_id_bank_orgnum) {
        this.als_m1_id_bank_orgnum = als_m1_id_bank_orgnum;
    }

    public String getAls_m1_id_nbank_selfnum() {
        return als_m1_id_nbank_selfnum;
    }

    public void setAls_m1_id_nbank_selfnum(String als_m1_id_nbank_selfnum) {
        this.als_m1_id_nbank_selfnum = als_m1_id_nbank_selfnum;
    }

    public String getAls_m1_id_nbank_allnum() {
        return als_m1_id_nbank_allnum;
    }

    public void setAls_m1_id_nbank_allnum(String als_m1_id_nbank_allnum) {
        this.als_m1_id_nbank_allnum = als_m1_id_nbank_allnum;
    }

    public String getAls_m1_id_nbank_p2p_allnum() {
        return als_m1_id_nbank_p2p_allnum;
    }

    public void setAls_m1_id_nbank_p2p_allnum(String als_m1_id_nbank_p2p_allnum) {
        this.als_m1_id_nbank_p2p_allnum = als_m1_id_nbank_p2p_allnum;
    }

    public String getAls_m1_id_nbank_mc_allnum() {
        return als_m1_id_nbank_mc_allnum;
    }

    public void setAls_m1_id_nbank_mc_allnum(String als_m1_id_nbank_mc_allnum) {
        this.als_m1_id_nbank_mc_allnum = als_m1_id_nbank_mc_allnum;
    }

    public String getAls_m1_id_nbank_ca_allnum() {
        return als_m1_id_nbank_ca_allnum;
    }

    public void setAls_m1_id_nbank_ca_allnum(String als_m1_id_nbank_ca_allnum) {
        this.als_m1_id_nbank_ca_allnum = als_m1_id_nbank_ca_allnum;
    }

    public String getAls_m1_id_nbank_cf_allnum() {
        return als_m1_id_nbank_cf_allnum;
    }

    public void setAls_m1_id_nbank_cf_allnum(String als_m1_id_nbank_cf_allnum) {
        this.als_m1_id_nbank_cf_allnum = als_m1_id_nbank_cf_allnum;
    }

    public String getAls_m1_id_nbank_com_allnum() {
        return als_m1_id_nbank_com_allnum;
    }

    public void setAls_m1_id_nbank_com_allnum(String als_m1_id_nbank_com_allnum) {
        this.als_m1_id_nbank_com_allnum = als_m1_id_nbank_com_allnum;
    }

    public String getAls_m1_id_nbank_oth_allnum() {
        return als_m1_id_nbank_oth_allnum;
    }

    public void setAls_m1_id_nbank_oth_allnum(String als_m1_id_nbank_oth_allnum) {
        this.als_m1_id_nbank_oth_allnum = als_m1_id_nbank_oth_allnum;
    }

    public String getAls_m1_id_nbank_orgnum() {
        return als_m1_id_nbank_orgnum;
    }

    public void setAls_m1_id_nbank_orgnum(String als_m1_id_nbank_orgnum) {
        this.als_m1_id_nbank_orgnum = als_m1_id_nbank_orgnum;
    }

    public String getAls_m1_id_nbank_p2p_orgnum() {
        return als_m1_id_nbank_p2p_orgnum;
    }

    public void setAls_m1_id_nbank_p2p_orgnum(String als_m1_id_nbank_p2p_orgnum) {
        this.als_m1_id_nbank_p2p_orgnum = als_m1_id_nbank_p2p_orgnum;
    }

    public String getAls_m1_id_nbank_mc_orgnum() {
        return als_m1_id_nbank_mc_orgnum;
    }

    public void setAls_m1_id_nbank_mc_orgnum(String als_m1_id_nbank_mc_orgnum) {
        this.als_m1_id_nbank_mc_orgnum = als_m1_id_nbank_mc_orgnum;
    }

    public String getAls_m1_id_nbank_ca_orgnum() {
        return als_m1_id_nbank_ca_orgnum;
    }

    public void setAls_m1_id_nbank_ca_orgnum(String als_m1_id_nbank_ca_orgnum) {
        this.als_m1_id_nbank_ca_orgnum = als_m1_id_nbank_ca_orgnum;
    }

    public String getAls_m1_id_nbank_cf_orgnum() {
        return als_m1_id_nbank_cf_orgnum;
    }

    public void setAls_m1_id_nbank_cf_orgnum(String als_m1_id_nbank_cf_orgnum) {
        this.als_m1_id_nbank_cf_orgnum = als_m1_id_nbank_cf_orgnum;
    }

    public String getAls_m1_id_nbank_com_orgnum() {
        return als_m1_id_nbank_com_orgnum;
    }

    public void setAls_m1_id_nbank_com_orgnum(String als_m1_id_nbank_com_orgnum) {
        this.als_m1_id_nbank_com_orgnum = als_m1_id_nbank_com_orgnum;
    }

    public String getAls_m1_id_nbank_oth_orgnum() {
        return als_m1_id_nbank_oth_orgnum;
    }

    public void setAls_m1_id_nbank_oth_orgnum(String als_m1_id_nbank_oth_orgnum) {
        this.als_m1_id_nbank_oth_orgnum = als_m1_id_nbank_oth_orgnum;
    }

    public String getAls_m1_cell_bank_selfnum() {
        return als_m1_cell_bank_selfnum;
    }

    public void setAls_m1_cell_bank_selfnum(String als_m1_cell_bank_selfnum) {
        this.als_m1_cell_bank_selfnum = als_m1_cell_bank_selfnum;
    }

    public String getAls_m1_cell_bank_allnum() {
        return als_m1_cell_bank_allnum;
    }

    public void setAls_m1_cell_bank_allnum(String als_m1_cell_bank_allnum) {
        this.als_m1_cell_bank_allnum = als_m1_cell_bank_allnum;
    }

    public String getAls_m1_cell_bank_orgnum() {
        return als_m1_cell_bank_orgnum;
    }

    public void setAls_m1_cell_bank_orgnum(String als_m1_cell_bank_orgnum) {
        this.als_m1_cell_bank_orgnum = als_m1_cell_bank_orgnum;
    }

    public String getAls_m1_cell_nbank_selfnum() {
        return als_m1_cell_nbank_selfnum;
    }

    public void setAls_m1_cell_nbank_selfnum(String als_m1_cell_nbank_selfnum) {
        this.als_m1_cell_nbank_selfnum = als_m1_cell_nbank_selfnum;
    }

    public String getAls_m1_cell_nbank_allnum() {
        return als_m1_cell_nbank_allnum;
    }

    public void setAls_m1_cell_nbank_allnum(String als_m1_cell_nbank_allnum) {
        this.als_m1_cell_nbank_allnum = als_m1_cell_nbank_allnum;
    }

    public String getAls_m1_cell_nbank_p2p_allnum() {
        return als_m1_cell_nbank_p2p_allnum;
    }

    public void setAls_m1_cell_nbank_p2p_allnum(String als_m1_cell_nbank_p2p_allnum) {
        this.als_m1_cell_nbank_p2p_allnum = als_m1_cell_nbank_p2p_allnum;
    }

    public String getAls_m1_cell_nbank_mc_allnum() {
        return als_m1_cell_nbank_mc_allnum;
    }

    public void setAls_m1_cell_nbank_mc_allnum(String als_m1_cell_nbank_mc_allnum) {
        this.als_m1_cell_nbank_mc_allnum = als_m1_cell_nbank_mc_allnum;
    }

    public String getAls_m1_cell_nbank_ca_allnum() {
        return als_m1_cell_nbank_ca_allnum;
    }

    public void setAls_m1_cell_nbank_ca_allnum(String als_m1_cell_nbank_ca_allnum) {
        this.als_m1_cell_nbank_ca_allnum = als_m1_cell_nbank_ca_allnum;
    }

    public String getAls_m1_cell_nbank_cf_allnum() {
        return als_m1_cell_nbank_cf_allnum;
    }

    public void setAls_m1_cell_nbank_cf_allnum(String als_m1_cell_nbank_cf_allnum) {
        this.als_m1_cell_nbank_cf_allnum = als_m1_cell_nbank_cf_allnum;
    }

    public String getAls_m1_cell_nbank_com_allnum() {
        return als_m1_cell_nbank_com_allnum;
    }

    public void setAls_m1_cell_nbank_com_allnum(String als_m1_cell_nbank_com_allnum) {
        this.als_m1_cell_nbank_com_allnum = als_m1_cell_nbank_com_allnum;
    }

    public String getAls_m1_cell_nbank_oth_allnum() {
        return als_m1_cell_nbank_oth_allnum;
    }

    public void setAls_m1_cell_nbank_oth_allnum(String als_m1_cell_nbank_oth_allnum) {
        this.als_m1_cell_nbank_oth_allnum = als_m1_cell_nbank_oth_allnum;
    }

    public String getAls_m1_cell_nbank_orgnum() {
        return als_m1_cell_nbank_orgnum;
    }

    public void setAls_m1_cell_nbank_orgnum(String als_m1_cell_nbank_orgnum) {
        this.als_m1_cell_nbank_orgnum = als_m1_cell_nbank_orgnum;
    }

    public String getAls_m1_cell_nbank_p2p_orgnum() {
        return als_m1_cell_nbank_p2p_orgnum;
    }

    public void setAls_m1_cell_nbank_p2p_orgnum(String als_m1_cell_nbank_p2p_orgnum) {
        this.als_m1_cell_nbank_p2p_orgnum = als_m1_cell_nbank_p2p_orgnum;
    }

    public String getAls_m1_cell_nbank_mc_orgnum() {
        return als_m1_cell_nbank_mc_orgnum;
    }

    public void setAls_m1_cell_nbank_mc_orgnum(String als_m1_cell_nbank_mc_orgnum) {
        this.als_m1_cell_nbank_mc_orgnum = als_m1_cell_nbank_mc_orgnum;
    }

    public String getAls_m1_cell_nbank_ca_orgnum() {
        return als_m1_cell_nbank_ca_orgnum;
    }

    public void setAls_m1_cell_nbank_ca_orgnum(String als_m1_cell_nbank_ca_orgnum) {
        this.als_m1_cell_nbank_ca_orgnum = als_m1_cell_nbank_ca_orgnum;
    }

    public String getAls_m1_cell_nbank_cf_orgnum() {
        return als_m1_cell_nbank_cf_orgnum;
    }

    public void setAls_m1_cell_nbank_cf_orgnum(String als_m1_cell_nbank_cf_orgnum) {
        this.als_m1_cell_nbank_cf_orgnum = als_m1_cell_nbank_cf_orgnum;
    }

    public String getAls_m1_cell_nbank_com_orgnum() {
        return als_m1_cell_nbank_com_orgnum;
    }

    public void setAls_m1_cell_nbank_com_orgnum(String als_m1_cell_nbank_com_orgnum) {
        this.als_m1_cell_nbank_com_orgnum = als_m1_cell_nbank_com_orgnum;
    }

    public String getAls_m1_cell_nbank_oth_orgnum() {
        return als_m1_cell_nbank_oth_orgnum;
    }

    public void setAls_m1_cell_nbank_oth_orgnum(String als_m1_cell_nbank_oth_orgnum) {
        this.als_m1_cell_nbank_oth_orgnum = als_m1_cell_nbank_oth_orgnum;
    }

    public String getAls_m3_id_max_inteday() {
        return als_m3_id_max_inteday;
    }

    public void setAls_m3_id_max_inteday(String als_m3_id_max_inteday) {
        this.als_m3_id_max_inteday = als_m3_id_max_inteday;
    }

    public String getAls_m3_id_min_inteday() {
        return als_m3_id_min_inteday;
    }

    public void setAls_m3_id_min_inteday(String als_m3_id_min_inteday) {
        this.als_m3_id_min_inteday = als_m3_id_min_inteday;
    }

    public String getAls_m3_id_tot_mons() {
        return als_m3_id_tot_mons;
    }

    public void setAls_m3_id_tot_mons(String als_m3_id_tot_mons) {
        this.als_m3_id_tot_mons = als_m3_id_tot_mons;
    }

    public String getAls_m3_id_avg_monnum() {
        return als_m3_id_avg_monnum;
    }

    public void setAls_m3_id_avg_monnum(String als_m3_id_avg_monnum) {
        this.als_m3_id_avg_monnum = als_m3_id_avg_monnum;
    }

    public String getAls_m3_id_max_monnum() {
        return als_m3_id_max_monnum;
    }

    public void setAls_m3_id_max_monnum(String als_m3_id_max_monnum) {
        this.als_m3_id_max_monnum = als_m3_id_max_monnum;
    }

    public String getAls_m3_id_min_monnum() {
        return als_m3_id_min_monnum;
    }

    public void setAls_m3_id_min_monnum(String als_m3_id_min_monnum) {
        this.als_m3_id_min_monnum = als_m3_id_min_monnum;
    }

    public String getAls_m3_id_bank_selfnum() {
        return als_m3_id_bank_selfnum;
    }

    public void setAls_m3_id_bank_selfnum(String als_m3_id_bank_selfnum) {
        this.als_m3_id_bank_selfnum = als_m3_id_bank_selfnum;
    }

    public String getAls_m3_id_bank_allnum() {
        return als_m3_id_bank_allnum;
    }

    public void setAls_m3_id_bank_allnum(String als_m3_id_bank_allnum) {
        this.als_m3_id_bank_allnum = als_m3_id_bank_allnum;
    }

    public String getAls_m3_id_bank_orgnum() {
        return als_m3_id_bank_orgnum;
    }

    public void setAls_m3_id_bank_orgnum(String als_m3_id_bank_orgnum) {
        this.als_m3_id_bank_orgnum = als_m3_id_bank_orgnum;
    }

    public String getAls_m3_id_bank_tot_mons() {
        return als_m3_id_bank_tot_mons;
    }

    public void setAls_m3_id_bank_tot_mons(String als_m3_id_bank_tot_mons) {
        this.als_m3_id_bank_tot_mons = als_m3_id_bank_tot_mons;
    }

    public String getAls_m3_id_bank_avg_monnum() {
        return als_m3_id_bank_avg_monnum;
    }

    public void setAls_m3_id_bank_avg_monnum(String als_m3_id_bank_avg_monnum) {
        this.als_m3_id_bank_avg_monnum = als_m3_id_bank_avg_monnum;
    }

    public String getAls_m3_id_bank_max_monnum() {
        return als_m3_id_bank_max_monnum;
    }

    public void setAls_m3_id_bank_max_monnum(String als_m3_id_bank_max_monnum) {
        this.als_m3_id_bank_max_monnum = als_m3_id_bank_max_monnum;
    }

    public String getAls_m3_id_bank_min_monnum() {
        return als_m3_id_bank_min_monnum;
    }

    public void setAls_m3_id_bank_min_monnum(String als_m3_id_bank_min_monnum) {
        this.als_m3_id_bank_min_monnum = als_m3_id_bank_min_monnum;
    }

    public String getAls_m3_id_bank_max_inteday() {
        return als_m3_id_bank_max_inteday;
    }

    public void setAls_m3_id_bank_max_inteday(String als_m3_id_bank_max_inteday) {
        this.als_m3_id_bank_max_inteday = als_m3_id_bank_max_inteday;
    }

    public String getAls_m3_id_bank_min_inteday() {
        return als_m3_id_bank_min_inteday;
    }

    public void setAls_m3_id_bank_min_inteday(String als_m3_id_bank_min_inteday) {
        this.als_m3_id_bank_min_inteday = als_m3_id_bank_min_inteday;
    }

    public String getAls_m3_id_nbank_selfnum() {
        return als_m3_id_nbank_selfnum;
    }

    public void setAls_m3_id_nbank_selfnum(String als_m3_id_nbank_selfnum) {
        this.als_m3_id_nbank_selfnum = als_m3_id_nbank_selfnum;
    }

    public String getAls_m3_id_nbank_allnum() {
        return als_m3_id_nbank_allnum;
    }

    public void setAls_m3_id_nbank_allnum(String als_m3_id_nbank_allnum) {
        this.als_m3_id_nbank_allnum = als_m3_id_nbank_allnum;
    }

    public String getAls_m3_id_nbank_p2p_allnum() {
        return als_m3_id_nbank_p2p_allnum;
    }

    public void setAls_m3_id_nbank_p2p_allnum(String als_m3_id_nbank_p2p_allnum) {
        this.als_m3_id_nbank_p2p_allnum = als_m3_id_nbank_p2p_allnum;
    }

    public String getAls_m3_id_nbank_mc_allnum() {
        return als_m3_id_nbank_mc_allnum;
    }

    public void setAls_m3_id_nbank_mc_allnum(String als_m3_id_nbank_mc_allnum) {
        this.als_m3_id_nbank_mc_allnum = als_m3_id_nbank_mc_allnum;
    }

    public String getAls_m3_id_nbank_ca_allnum() {
        return als_m3_id_nbank_ca_allnum;
    }

    public void setAls_m3_id_nbank_ca_allnum(String als_m3_id_nbank_ca_allnum) {
        this.als_m3_id_nbank_ca_allnum = als_m3_id_nbank_ca_allnum;
    }

    public String getAls_m3_id_nbank_cf_allnum() {
        return als_m3_id_nbank_cf_allnum;
    }

    public void setAls_m3_id_nbank_cf_allnum(String als_m3_id_nbank_cf_allnum) {
        this.als_m3_id_nbank_cf_allnum = als_m3_id_nbank_cf_allnum;
    }

    public String getAls_m3_id_nbank_com_allnum() {
        return als_m3_id_nbank_com_allnum;
    }

    public void setAls_m3_id_nbank_com_allnum(String als_m3_id_nbank_com_allnum) {
        this.als_m3_id_nbank_com_allnum = als_m3_id_nbank_com_allnum;
    }

    public String getAls_m3_id_nbank_oth_allnum() {
        return als_m3_id_nbank_oth_allnum;
    }

    public void setAls_m3_id_nbank_oth_allnum(String als_m3_id_nbank_oth_allnum) {
        this.als_m3_id_nbank_oth_allnum = als_m3_id_nbank_oth_allnum;
    }

    public String getAls_m3_id_nbank_orgnum() {
        return als_m3_id_nbank_orgnum;
    }

    public void setAls_m3_id_nbank_orgnum(String als_m3_id_nbank_orgnum) {
        this.als_m3_id_nbank_orgnum = als_m3_id_nbank_orgnum;
    }

    public String getAls_m3_id_nbank_p2p_orgnum() {
        return als_m3_id_nbank_p2p_orgnum;
    }

    public void setAls_m3_id_nbank_p2p_orgnum(String als_m3_id_nbank_p2p_orgnum) {
        this.als_m3_id_nbank_p2p_orgnum = als_m3_id_nbank_p2p_orgnum;
    }

    public String getAls_m3_id_nbank_mc_orgnum() {
        return als_m3_id_nbank_mc_orgnum;
    }

    public void setAls_m3_id_nbank_mc_orgnum(String als_m3_id_nbank_mc_orgnum) {
        this.als_m3_id_nbank_mc_orgnum = als_m3_id_nbank_mc_orgnum;
    }

    public String getAls_m3_id_nbank_ca_orgnum() {
        return als_m3_id_nbank_ca_orgnum;
    }

    public void setAls_m3_id_nbank_ca_orgnum(String als_m3_id_nbank_ca_orgnum) {
        this.als_m3_id_nbank_ca_orgnum = als_m3_id_nbank_ca_orgnum;
    }

    public String getAls_m3_id_nbank_cf_orgnum() {
        return als_m3_id_nbank_cf_orgnum;
    }

    public void setAls_m3_id_nbank_cf_orgnum(String als_m3_id_nbank_cf_orgnum) {
        this.als_m3_id_nbank_cf_orgnum = als_m3_id_nbank_cf_orgnum;
    }

    public String getAls_m3_id_nbank_com_orgnum() {
        return als_m3_id_nbank_com_orgnum;
    }

    public void setAls_m3_id_nbank_com_orgnum(String als_m3_id_nbank_com_orgnum) {
        this.als_m3_id_nbank_com_orgnum = als_m3_id_nbank_com_orgnum;
    }

    public String getAls_m3_id_nbank_oth_orgnum() {
        return als_m3_id_nbank_oth_orgnum;
    }

    public void setAls_m3_id_nbank_oth_orgnum(String als_m3_id_nbank_oth_orgnum) {
        this.als_m3_id_nbank_oth_orgnum = als_m3_id_nbank_oth_orgnum;
    }

    public String getAls_m3_id_nbank_tot_mons() {
        return als_m3_id_nbank_tot_mons;
    }

    public void setAls_m3_id_nbank_tot_mons(String als_m3_id_nbank_tot_mons) {
        this.als_m3_id_nbank_tot_mons = als_m3_id_nbank_tot_mons;
    }

    public String getAls_m3_id_nbank_avg_monnum() {
        return als_m3_id_nbank_avg_monnum;
    }

    public void setAls_m3_id_nbank_avg_monnum(String als_m3_id_nbank_avg_monnum) {
        this.als_m3_id_nbank_avg_monnum = als_m3_id_nbank_avg_monnum;
    }

    public String getAls_m3_id_nbank_max_monnum() {
        return als_m3_id_nbank_max_monnum;
    }

    public void setAls_m3_id_nbank_max_monnum(String als_m3_id_nbank_max_monnum) {
        this.als_m3_id_nbank_max_monnum = als_m3_id_nbank_max_monnum;
    }

    public String getAls_m3_id_nbank_min_monnum() {
        return als_m3_id_nbank_min_monnum;
    }

    public void setAls_m3_id_nbank_min_monnum(String als_m3_id_nbank_min_monnum) {
        this.als_m3_id_nbank_min_monnum = als_m3_id_nbank_min_monnum;
    }

    public String getAls_m3_id_nbank_max_inteday() {
        return als_m3_id_nbank_max_inteday;
    }

    public void setAls_m3_id_nbank_max_inteday(String als_m3_id_nbank_max_inteday) {
        this.als_m3_id_nbank_max_inteday = als_m3_id_nbank_max_inteday;
    }

    public String getAls_m3_id_nbank_min_inteday() {
        return als_m3_id_nbank_min_inteday;
    }

    public void setAls_m3_id_nbank_min_inteday(String als_m3_id_nbank_min_inteday) {
        this.als_m3_id_nbank_min_inteday = als_m3_id_nbank_min_inteday;
    }

    public String getAls_m3_cell_max_inteday() {
        return als_m3_cell_max_inteday;
    }

    public void setAls_m3_cell_max_inteday(String als_m3_cell_max_inteday) {
        this.als_m3_cell_max_inteday = als_m3_cell_max_inteday;
    }

    public String getAls_m3_cell_min_inteday() {
        return als_m3_cell_min_inteday;
    }

    public void setAls_m3_cell_min_inteday(String als_m3_cell_min_inteday) {
        this.als_m3_cell_min_inteday = als_m3_cell_min_inteday;
    }

    public String getAls_m3_cell_tot_mons() {
        return als_m3_cell_tot_mons;
    }

    public void setAls_m3_cell_tot_mons(String als_m3_cell_tot_mons) {
        this.als_m3_cell_tot_mons = als_m3_cell_tot_mons;
    }

    public String getAls_m3_cell_avg_monnum() {
        return als_m3_cell_avg_monnum;
    }

    public void setAls_m3_cell_avg_monnum(String als_m3_cell_avg_monnum) {
        this.als_m3_cell_avg_monnum = als_m3_cell_avg_monnum;
    }

    public String getAls_m3_cell_max_monnum() {
        return als_m3_cell_max_monnum;
    }

    public void setAls_m3_cell_max_monnum(String als_m3_cell_max_monnum) {
        this.als_m3_cell_max_monnum = als_m3_cell_max_monnum;
    }

    public String getAls_m3_cell_min_monnum() {
        return als_m3_cell_min_monnum;
    }

    public void setAls_m3_cell_min_monnum(String als_m3_cell_min_monnum) {
        this.als_m3_cell_min_monnum = als_m3_cell_min_monnum;
    }

    public String getAls_m3_cell_bank_selfnum() {
        return als_m3_cell_bank_selfnum;
    }

    public void setAls_m3_cell_bank_selfnum(String als_m3_cell_bank_selfnum) {
        this.als_m3_cell_bank_selfnum = als_m3_cell_bank_selfnum;
    }

    public String getAls_m3_cell_bank_allnum() {
        return als_m3_cell_bank_allnum;
    }

    public void setAls_m3_cell_bank_allnum(String als_m3_cell_bank_allnum) {
        this.als_m3_cell_bank_allnum = als_m3_cell_bank_allnum;
    }

    public String getAls_m3_cell_bank_orgnum() {
        return als_m3_cell_bank_orgnum;
    }

    public void setAls_m3_cell_bank_orgnum(String als_m3_cell_bank_orgnum) {
        this.als_m3_cell_bank_orgnum = als_m3_cell_bank_orgnum;
    }

    public String getAls_m3_cell_bank_tot_mons() {
        return als_m3_cell_bank_tot_mons;
    }

    public void setAls_m3_cell_bank_tot_mons(String als_m3_cell_bank_tot_mons) {
        this.als_m3_cell_bank_tot_mons = als_m3_cell_bank_tot_mons;
    }

    public String getAls_m3_cell_bank_avg_monnum() {
        return als_m3_cell_bank_avg_monnum;
    }

    public void setAls_m3_cell_bank_avg_monnum(String als_m3_cell_bank_avg_monnum) {
        this.als_m3_cell_bank_avg_monnum = als_m3_cell_bank_avg_monnum;
    }

    public String getAls_m3_cell_bank_max_monnum() {
        return als_m3_cell_bank_max_monnum;
    }

    public void setAls_m3_cell_bank_max_monnum(String als_m3_cell_bank_max_monnum) {
        this.als_m3_cell_bank_max_monnum = als_m3_cell_bank_max_monnum;
    }

    public String getAls_m3_cell_bank_min_monnum() {
        return als_m3_cell_bank_min_monnum;
    }

    public void setAls_m3_cell_bank_min_monnum(String als_m3_cell_bank_min_monnum) {
        this.als_m3_cell_bank_min_monnum = als_m3_cell_bank_min_monnum;
    }

    public String getAls_m3_cell_bank_max_inteday() {
        return als_m3_cell_bank_max_inteday;
    }

    public void setAls_m3_cell_bank_max_inteday(String als_m3_cell_bank_max_inteday) {
        this.als_m3_cell_bank_max_inteday = als_m3_cell_bank_max_inteday;
    }

    public String getAls_m3_cell_bank_min_inteday() {
        return als_m3_cell_bank_min_inteday;
    }

    public void setAls_m3_cell_bank_min_inteday(String als_m3_cell_bank_min_inteday) {
        this.als_m3_cell_bank_min_inteday = als_m3_cell_bank_min_inteday;
    }

    public String getAls_m3_cell_nbank_selfnum() {
        return als_m3_cell_nbank_selfnum;
    }

    public void setAls_m3_cell_nbank_selfnum(String als_m3_cell_nbank_selfnum) {
        this.als_m3_cell_nbank_selfnum = als_m3_cell_nbank_selfnum;
    }

    public String getAls_m3_cell_nbank_allnum() {
        return als_m3_cell_nbank_allnum;
    }

    public void setAls_m3_cell_nbank_allnum(String als_m3_cell_nbank_allnum) {
        this.als_m3_cell_nbank_allnum = als_m3_cell_nbank_allnum;
    }

    public String getAls_m3_cell_nbank_p2p_allnum() {
        return als_m3_cell_nbank_p2p_allnum;
    }

    public void setAls_m3_cell_nbank_p2p_allnum(String als_m3_cell_nbank_p2p_allnum) {
        this.als_m3_cell_nbank_p2p_allnum = als_m3_cell_nbank_p2p_allnum;
    }

    public String getAls_m3_cell_nbank_mc_allnum() {
        return als_m3_cell_nbank_mc_allnum;
    }

    public void setAls_m3_cell_nbank_mc_allnum(String als_m3_cell_nbank_mc_allnum) {
        this.als_m3_cell_nbank_mc_allnum = als_m3_cell_nbank_mc_allnum;
    }

    public String getAls_m3_cell_nbank_ca_allnum() {
        return als_m3_cell_nbank_ca_allnum;
    }

    public void setAls_m3_cell_nbank_ca_allnum(String als_m3_cell_nbank_ca_allnum) {
        this.als_m3_cell_nbank_ca_allnum = als_m3_cell_nbank_ca_allnum;
    }

    public String getAls_m3_cell_nbank_cf_allnum() {
        return als_m3_cell_nbank_cf_allnum;
    }

    public void setAls_m3_cell_nbank_cf_allnum(String als_m3_cell_nbank_cf_allnum) {
        this.als_m3_cell_nbank_cf_allnum = als_m3_cell_nbank_cf_allnum;
    }

    public String getAls_m3_cell_nbank_com_allnum() {
        return als_m3_cell_nbank_com_allnum;
    }

    public void setAls_m3_cell_nbank_com_allnum(String als_m3_cell_nbank_com_allnum) {
        this.als_m3_cell_nbank_com_allnum = als_m3_cell_nbank_com_allnum;
    }

    public String getAls_m3_cell_nbank_oth_allnum() {
        return als_m3_cell_nbank_oth_allnum;
    }

    public void setAls_m3_cell_nbank_oth_allnum(String als_m3_cell_nbank_oth_allnum) {
        this.als_m3_cell_nbank_oth_allnum = als_m3_cell_nbank_oth_allnum;
    }

    public String getAls_m3_cell_nbank_orgnum() {
        return als_m3_cell_nbank_orgnum;
    }

    public void setAls_m3_cell_nbank_orgnum(String als_m3_cell_nbank_orgnum) {
        this.als_m3_cell_nbank_orgnum = als_m3_cell_nbank_orgnum;
    }

    public String getAls_m3_cell_nbank_p2p_orgnum() {
        return als_m3_cell_nbank_p2p_orgnum;
    }

    public void setAls_m3_cell_nbank_p2p_orgnum(String als_m3_cell_nbank_p2p_orgnum) {
        this.als_m3_cell_nbank_p2p_orgnum = als_m3_cell_nbank_p2p_orgnum;
    }

    public String getAls_m3_cell_nbank_mc_orgnum() {
        return als_m3_cell_nbank_mc_orgnum;
    }

    public void setAls_m3_cell_nbank_mc_orgnum(String als_m3_cell_nbank_mc_orgnum) {
        this.als_m3_cell_nbank_mc_orgnum = als_m3_cell_nbank_mc_orgnum;
    }

    public String getAls_m3_cell_nbank_ca_orgnum() {
        return als_m3_cell_nbank_ca_orgnum;
    }

    public void setAls_m3_cell_nbank_ca_orgnum(String als_m3_cell_nbank_ca_orgnum) {
        this.als_m3_cell_nbank_ca_orgnum = als_m3_cell_nbank_ca_orgnum;
    }

    public String getAls_m3_cell_nbank_cf_orgnum() {
        return als_m3_cell_nbank_cf_orgnum;
    }

    public void setAls_m3_cell_nbank_cf_orgnum(String als_m3_cell_nbank_cf_orgnum) {
        this.als_m3_cell_nbank_cf_orgnum = als_m3_cell_nbank_cf_orgnum;
    }

    public String getAls_m3_cell_nbank_com_orgnum() {
        return als_m3_cell_nbank_com_orgnum;
    }

    public void setAls_m3_cell_nbank_com_orgnum(String als_m3_cell_nbank_com_orgnum) {
        this.als_m3_cell_nbank_com_orgnum = als_m3_cell_nbank_com_orgnum;
    }

    public String getAls_m3_cell_nbank_oth_orgnum() {
        return als_m3_cell_nbank_oth_orgnum;
    }

    public void setAls_m3_cell_nbank_oth_orgnum(String als_m3_cell_nbank_oth_orgnum) {
        this.als_m3_cell_nbank_oth_orgnum = als_m3_cell_nbank_oth_orgnum;
    }

    public String getAls_m3_cell_nbank_tot_mons() {
        return als_m3_cell_nbank_tot_mons;
    }

    public void setAls_m3_cell_nbank_tot_mons(String als_m3_cell_nbank_tot_mons) {
        this.als_m3_cell_nbank_tot_mons = als_m3_cell_nbank_tot_mons;
    }

    public String getAls_m3_cell_nbank_avg_monnum() {
        return als_m3_cell_nbank_avg_monnum;
    }

    public void setAls_m3_cell_nbank_avg_monnum(String als_m3_cell_nbank_avg_monnum) {
        this.als_m3_cell_nbank_avg_monnum = als_m3_cell_nbank_avg_monnum;
    }

    public String getAls_m3_cell_nbank_max_monnum() {
        return als_m3_cell_nbank_max_monnum;
    }

    public void setAls_m3_cell_nbank_max_monnum(String als_m3_cell_nbank_max_monnum) {
        this.als_m3_cell_nbank_max_monnum = als_m3_cell_nbank_max_monnum;
    }

    public String getAls_m3_cell_nbank_min_monnum() {
        return als_m3_cell_nbank_min_monnum;
    }

    public void setAls_m3_cell_nbank_min_monnum(String als_m3_cell_nbank_min_monnum) {
        this.als_m3_cell_nbank_min_monnum = als_m3_cell_nbank_min_monnum;
    }

    public String getAls_m3_cell_nbank_max_inteday() {
        return als_m3_cell_nbank_max_inteday;
    }

    public void setAls_m3_cell_nbank_max_inteday(String als_m3_cell_nbank_max_inteday) {
        this.als_m3_cell_nbank_max_inteday = als_m3_cell_nbank_max_inteday;
    }

    public String getAls_m3_cell_nbank_min_inteday() {
        return als_m3_cell_nbank_min_inteday;
    }

    public void setAls_m3_cell_nbank_min_inteday(String als_m3_cell_nbank_min_inteday) {
        this.als_m3_cell_nbank_min_inteday = als_m3_cell_nbank_min_inteday;
    }

    public String getAls_m6_id_max_inteday() {
        return als_m6_id_max_inteday;
    }

    public void setAls_m6_id_max_inteday(String als_m6_id_max_inteday) {
        this.als_m6_id_max_inteday = als_m6_id_max_inteday;
    }

    public String getAls_m6_id_min_inteday() {
        return als_m6_id_min_inteday;
    }

    public void setAls_m6_id_min_inteday(String als_m6_id_min_inteday) {
        this.als_m6_id_min_inteday = als_m6_id_min_inteday;
    }

    public String getAls_m6_id_tot_mons() {
        return als_m6_id_tot_mons;
    }

    public void setAls_m6_id_tot_mons(String als_m6_id_tot_mons) {
        this.als_m6_id_tot_mons = als_m6_id_tot_mons;
    }

    public String getAls_m6_id_avg_monnum() {
        return als_m6_id_avg_monnum;
    }

    public void setAls_m6_id_avg_monnum(String als_m6_id_avg_monnum) {
        this.als_m6_id_avg_monnum = als_m6_id_avg_monnum;
    }

    public String getAls_m6_id_max_monnum() {
        return als_m6_id_max_monnum;
    }

    public void setAls_m6_id_max_monnum(String als_m6_id_max_monnum) {
        this.als_m6_id_max_monnum = als_m6_id_max_monnum;
    }

    public String getAls_m6_id_min_monnum() {
        return als_m6_id_min_monnum;
    }

    public void setAls_m6_id_min_monnum(String als_m6_id_min_monnum) {
        this.als_m6_id_min_monnum = als_m6_id_min_monnum;
    }

    public String getAls_m6_id_bank_selfnum() {
        return als_m6_id_bank_selfnum;
    }

    public void setAls_m6_id_bank_selfnum(String als_m6_id_bank_selfnum) {
        this.als_m6_id_bank_selfnum = als_m6_id_bank_selfnum;
    }

    public String getAls_m6_id_bank_allnum() {
        return als_m6_id_bank_allnum;
    }

    public void setAls_m6_id_bank_allnum(String als_m6_id_bank_allnum) {
        this.als_m6_id_bank_allnum = als_m6_id_bank_allnum;
    }

    public String getAls_m6_id_bank_orgnum() {
        return als_m6_id_bank_orgnum;
    }

    public void setAls_m6_id_bank_orgnum(String als_m6_id_bank_orgnum) {
        this.als_m6_id_bank_orgnum = als_m6_id_bank_orgnum;
    }

    public String getAls_m6_id_bank_tot_mons() {
        return als_m6_id_bank_tot_mons;
    }

    public void setAls_m6_id_bank_tot_mons(String als_m6_id_bank_tot_mons) {
        this.als_m6_id_bank_tot_mons = als_m6_id_bank_tot_mons;
    }

    public String getAls_m6_id_bank_avg_monnum() {
        return als_m6_id_bank_avg_monnum;
    }

    public void setAls_m6_id_bank_avg_monnum(String als_m6_id_bank_avg_monnum) {
        this.als_m6_id_bank_avg_monnum = als_m6_id_bank_avg_monnum;
    }

    public String getAls_m6_id_bank_max_monnum() {
        return als_m6_id_bank_max_monnum;
    }

    public void setAls_m6_id_bank_max_monnum(String als_m6_id_bank_max_monnum) {
        this.als_m6_id_bank_max_monnum = als_m6_id_bank_max_monnum;
    }

    public String getAls_m6_id_bank_min_monnum() {
        return als_m6_id_bank_min_monnum;
    }

    public void setAls_m6_id_bank_min_monnum(String als_m6_id_bank_min_monnum) {
        this.als_m6_id_bank_min_monnum = als_m6_id_bank_min_monnum;
    }

    public String getAls_m6_id_bank_max_inteday() {
        return als_m6_id_bank_max_inteday;
    }

    public void setAls_m6_id_bank_max_inteday(String als_m6_id_bank_max_inteday) {
        this.als_m6_id_bank_max_inteday = als_m6_id_bank_max_inteday;
    }

    public String getAls_m6_id_bank_min_inteday() {
        return als_m6_id_bank_min_inteday;
    }

    public void setAls_m6_id_bank_min_inteday(String als_m6_id_bank_min_inteday) {
        this.als_m6_id_bank_min_inteday = als_m6_id_bank_min_inteday;
    }

    public String getAls_m6_id_nbank_selfnum() {
        return als_m6_id_nbank_selfnum;
    }

    public void setAls_m6_id_nbank_selfnum(String als_m6_id_nbank_selfnum) {
        this.als_m6_id_nbank_selfnum = als_m6_id_nbank_selfnum;
    }

    public String getAls_m6_id_nbank_allnum() {
        return als_m6_id_nbank_allnum;
    }

    public void setAls_m6_id_nbank_allnum(String als_m6_id_nbank_allnum) {
        this.als_m6_id_nbank_allnum = als_m6_id_nbank_allnum;
    }

    public String getAls_m6_id_nbank_p2p_allnum() {
        return als_m6_id_nbank_p2p_allnum;
    }

    public void setAls_m6_id_nbank_p2p_allnum(String als_m6_id_nbank_p2p_allnum) {
        this.als_m6_id_nbank_p2p_allnum = als_m6_id_nbank_p2p_allnum;
    }

    public String getAls_m6_id_nbank_mc_allnum() {
        return als_m6_id_nbank_mc_allnum;
    }

    public void setAls_m6_id_nbank_mc_allnum(String als_m6_id_nbank_mc_allnum) {
        this.als_m6_id_nbank_mc_allnum = als_m6_id_nbank_mc_allnum;
    }

    public String getAls_m6_id_nbank_ca_allnum() {
        return als_m6_id_nbank_ca_allnum;
    }

    public void setAls_m6_id_nbank_ca_allnum(String als_m6_id_nbank_ca_allnum) {
        this.als_m6_id_nbank_ca_allnum = als_m6_id_nbank_ca_allnum;
    }

    public String getAls_m6_id_nbank_cf_allnum() {
        return als_m6_id_nbank_cf_allnum;
    }

    public void setAls_m6_id_nbank_cf_allnum(String als_m6_id_nbank_cf_allnum) {
        this.als_m6_id_nbank_cf_allnum = als_m6_id_nbank_cf_allnum;
    }

    public String getAls_m6_id_nbank_com_allnum() {
        return als_m6_id_nbank_com_allnum;
    }

    public void setAls_m6_id_nbank_com_allnum(String als_m6_id_nbank_com_allnum) {
        this.als_m6_id_nbank_com_allnum = als_m6_id_nbank_com_allnum;
    }

    public String getAls_m6_id_nbank_oth_allnum() {
        return als_m6_id_nbank_oth_allnum;
    }

    public void setAls_m6_id_nbank_oth_allnum(String als_m6_id_nbank_oth_allnum) {
        this.als_m6_id_nbank_oth_allnum = als_m6_id_nbank_oth_allnum;
    }

    public String getAls_m6_id_nbank_orgnum() {
        return als_m6_id_nbank_orgnum;
    }

    public void setAls_m6_id_nbank_orgnum(String als_m6_id_nbank_orgnum) {
        this.als_m6_id_nbank_orgnum = als_m6_id_nbank_orgnum;
    }

    public String getAls_m6_id_nbank_p2p_orgnum() {
        return als_m6_id_nbank_p2p_orgnum;
    }

    public void setAls_m6_id_nbank_p2p_orgnum(String als_m6_id_nbank_p2p_orgnum) {
        this.als_m6_id_nbank_p2p_orgnum = als_m6_id_nbank_p2p_orgnum;
    }

    public String getAls_m6_id_nbank_mc_orgnum() {
        return als_m6_id_nbank_mc_orgnum;
    }

    public void setAls_m6_id_nbank_mc_orgnum(String als_m6_id_nbank_mc_orgnum) {
        this.als_m6_id_nbank_mc_orgnum = als_m6_id_nbank_mc_orgnum;
    }

    public String getAls_m6_id_nbank_ca_orgnum() {
        return als_m6_id_nbank_ca_orgnum;
    }

    public void setAls_m6_id_nbank_ca_orgnum(String als_m6_id_nbank_ca_orgnum) {
        this.als_m6_id_nbank_ca_orgnum = als_m6_id_nbank_ca_orgnum;
    }

    public String getAls_m6_id_nbank_cf_orgnum() {
        return als_m6_id_nbank_cf_orgnum;
    }

    public void setAls_m6_id_nbank_cf_orgnum(String als_m6_id_nbank_cf_orgnum) {
        this.als_m6_id_nbank_cf_orgnum = als_m6_id_nbank_cf_orgnum;
    }

    public String getAls_m6_id_nbank_com_orgnum() {
        return als_m6_id_nbank_com_orgnum;
    }

    public void setAls_m6_id_nbank_com_orgnum(String als_m6_id_nbank_com_orgnum) {
        this.als_m6_id_nbank_com_orgnum = als_m6_id_nbank_com_orgnum;
    }

    public String getAls_m6_id_nbank_oth_orgnum() {
        return als_m6_id_nbank_oth_orgnum;
    }

    public void setAls_m6_id_nbank_oth_orgnum(String als_m6_id_nbank_oth_orgnum) {
        this.als_m6_id_nbank_oth_orgnum = als_m6_id_nbank_oth_orgnum;
    }

    public String getAls_m6_id_nbank_tot_mons() {
        return als_m6_id_nbank_tot_mons;
    }

    public void setAls_m6_id_nbank_tot_mons(String als_m6_id_nbank_tot_mons) {
        this.als_m6_id_nbank_tot_mons = als_m6_id_nbank_tot_mons;
    }

    public String getAls_m6_id_nbank_avg_monnum() {
        return als_m6_id_nbank_avg_monnum;
    }

    public void setAls_m6_id_nbank_avg_monnum(String als_m6_id_nbank_avg_monnum) {
        this.als_m6_id_nbank_avg_monnum = als_m6_id_nbank_avg_monnum;
    }

    public String getAls_m6_id_nbank_max_monnum() {
        return als_m6_id_nbank_max_monnum;
    }

    public void setAls_m6_id_nbank_max_monnum(String als_m6_id_nbank_max_monnum) {
        this.als_m6_id_nbank_max_monnum = als_m6_id_nbank_max_monnum;
    }

    public String getAls_m6_id_nbank_min_monnum() {
        return als_m6_id_nbank_min_monnum;
    }

    public void setAls_m6_id_nbank_min_monnum(String als_m6_id_nbank_min_monnum) {
        this.als_m6_id_nbank_min_monnum = als_m6_id_nbank_min_monnum;
    }

    public String getAls_m6_id_nbank_max_inteday() {
        return als_m6_id_nbank_max_inteday;
    }

    public void setAls_m6_id_nbank_max_inteday(String als_m6_id_nbank_max_inteday) {
        this.als_m6_id_nbank_max_inteday = als_m6_id_nbank_max_inteday;
    }

    public String getAls_m6_id_nbank_min_inteday() {
        return als_m6_id_nbank_min_inteday;
    }

    public void setAls_m6_id_nbank_min_inteday(String als_m6_id_nbank_min_inteday) {
        this.als_m6_id_nbank_min_inteday = als_m6_id_nbank_min_inteday;
    }

    public String getAls_m6_cell_max_inteday() {
        return als_m6_cell_max_inteday;
    }

    public void setAls_m6_cell_max_inteday(String als_m6_cell_max_inteday) {
        this.als_m6_cell_max_inteday = als_m6_cell_max_inteday;
    }

    public String getAls_m6_cell_min_inteday() {
        return als_m6_cell_min_inteday;
    }

    public void setAls_m6_cell_min_inteday(String als_m6_cell_min_inteday) {
        this.als_m6_cell_min_inteday = als_m6_cell_min_inteday;
    }

    public String getAls_m6_cell_tot_mons() {
        return als_m6_cell_tot_mons;
    }

    public void setAls_m6_cell_tot_mons(String als_m6_cell_tot_mons) {
        this.als_m6_cell_tot_mons = als_m6_cell_tot_mons;
    }

    public String getAls_m6_cell_avg_monnum() {
        return als_m6_cell_avg_monnum;
    }

    public void setAls_m6_cell_avg_monnum(String als_m6_cell_avg_monnum) {
        this.als_m6_cell_avg_monnum = als_m6_cell_avg_monnum;
    }

    public String getAls_m6_cell_max_monnum() {
        return als_m6_cell_max_monnum;
    }

    public void setAls_m6_cell_max_monnum(String als_m6_cell_max_monnum) {
        this.als_m6_cell_max_monnum = als_m6_cell_max_monnum;
    }

    public String getAls_m6_cell_min_monnum() {
        return als_m6_cell_min_monnum;
    }

    public void setAls_m6_cell_min_monnum(String als_m6_cell_min_monnum) {
        this.als_m6_cell_min_monnum = als_m6_cell_min_monnum;
    }

    public String getAls_m6_cell_bank_selfnum() {
        return als_m6_cell_bank_selfnum;
    }

    public void setAls_m6_cell_bank_selfnum(String als_m6_cell_bank_selfnum) {
        this.als_m6_cell_bank_selfnum = als_m6_cell_bank_selfnum;
    }

    public String getAls_m6_cell_bank_allnum() {
        return als_m6_cell_bank_allnum;
    }

    public void setAls_m6_cell_bank_allnum(String als_m6_cell_bank_allnum) {
        this.als_m6_cell_bank_allnum = als_m6_cell_bank_allnum;
    }

    public String getAls_m6_cell_bank_orgnum() {
        return als_m6_cell_bank_orgnum;
    }

    public void setAls_m6_cell_bank_orgnum(String als_m6_cell_bank_orgnum) {
        this.als_m6_cell_bank_orgnum = als_m6_cell_bank_orgnum;
    }

    public String getAls_m6_cell_bank_tot_mons() {
        return als_m6_cell_bank_tot_mons;
    }

    public void setAls_m6_cell_bank_tot_mons(String als_m6_cell_bank_tot_mons) {
        this.als_m6_cell_bank_tot_mons = als_m6_cell_bank_tot_mons;
    }

    public String getAls_m6_cell_bank_avg_monnum() {
        return als_m6_cell_bank_avg_monnum;
    }

    public void setAls_m6_cell_bank_avg_monnum(String als_m6_cell_bank_avg_monnum) {
        this.als_m6_cell_bank_avg_monnum = als_m6_cell_bank_avg_monnum;
    }

    public String getAls_m6_cell_bank_max_monnum() {
        return als_m6_cell_bank_max_monnum;
    }

    public void setAls_m6_cell_bank_max_monnum(String als_m6_cell_bank_max_monnum) {
        this.als_m6_cell_bank_max_monnum = als_m6_cell_bank_max_monnum;
    }

    public String getAls_m6_cell_bank_min_monnum() {
        return als_m6_cell_bank_min_monnum;
    }

    public void setAls_m6_cell_bank_min_monnum(String als_m6_cell_bank_min_monnum) {
        this.als_m6_cell_bank_min_monnum = als_m6_cell_bank_min_monnum;
    }

    public String getAls_m6_cell_bank_max_inteday() {
        return als_m6_cell_bank_max_inteday;
    }

    public void setAls_m6_cell_bank_max_inteday(String als_m6_cell_bank_max_inteday) {
        this.als_m6_cell_bank_max_inteday = als_m6_cell_bank_max_inteday;
    }

    public String getAls_m6_cell_bank_min_inteday() {
        return als_m6_cell_bank_min_inteday;
    }

    public void setAls_m6_cell_bank_min_inteday(String als_m6_cell_bank_min_inteday) {
        this.als_m6_cell_bank_min_inteday = als_m6_cell_bank_min_inteday;
    }

    public String getAls_m6_cell_nbank_selfnum() {
        return als_m6_cell_nbank_selfnum;
    }

    public void setAls_m6_cell_nbank_selfnum(String als_m6_cell_nbank_selfnum) {
        this.als_m6_cell_nbank_selfnum = als_m6_cell_nbank_selfnum;
    }

    public String getAls_m6_cell_nbank_allnum() {
        return als_m6_cell_nbank_allnum;
    }

    public void setAls_m6_cell_nbank_allnum(String als_m6_cell_nbank_allnum) {
        this.als_m6_cell_nbank_allnum = als_m6_cell_nbank_allnum;
    }

    public String getAls_m6_cell_nbank_p2p_allnum() {
        return als_m6_cell_nbank_p2p_allnum;
    }

    public void setAls_m6_cell_nbank_p2p_allnum(String als_m6_cell_nbank_p2p_allnum) {
        this.als_m6_cell_nbank_p2p_allnum = als_m6_cell_nbank_p2p_allnum;
    }

    public String getAls_m6_cell_nbank_mc_allnum() {
        return als_m6_cell_nbank_mc_allnum;
    }

    public void setAls_m6_cell_nbank_mc_allnum(String als_m6_cell_nbank_mc_allnum) {
        this.als_m6_cell_nbank_mc_allnum = als_m6_cell_nbank_mc_allnum;
    }

    public String getAls_m6_cell_nbank_ca_allnum() {
        return als_m6_cell_nbank_ca_allnum;
    }

    public void setAls_m6_cell_nbank_ca_allnum(String als_m6_cell_nbank_ca_allnum) {
        this.als_m6_cell_nbank_ca_allnum = als_m6_cell_nbank_ca_allnum;
    }

    public String getAls_m6_cell_nbank_cf_allnum() {
        return als_m6_cell_nbank_cf_allnum;
    }

    public void setAls_m6_cell_nbank_cf_allnum(String als_m6_cell_nbank_cf_allnum) {
        this.als_m6_cell_nbank_cf_allnum = als_m6_cell_nbank_cf_allnum;
    }

    public String getAls_m6_cell_nbank_com_allnum() {
        return als_m6_cell_nbank_com_allnum;
    }

    public void setAls_m6_cell_nbank_com_allnum(String als_m6_cell_nbank_com_allnum) {
        this.als_m6_cell_nbank_com_allnum = als_m6_cell_nbank_com_allnum;
    }

    public String getAls_m6_cell_nbank_oth_allnum() {
        return als_m6_cell_nbank_oth_allnum;
    }

    public void setAls_m6_cell_nbank_oth_allnum(String als_m6_cell_nbank_oth_allnum) {
        this.als_m6_cell_nbank_oth_allnum = als_m6_cell_nbank_oth_allnum;
    }

    public String getAls_m6_cell_nbank_orgnum() {
        return als_m6_cell_nbank_orgnum;
    }

    public void setAls_m6_cell_nbank_orgnum(String als_m6_cell_nbank_orgnum) {
        this.als_m6_cell_nbank_orgnum = als_m6_cell_nbank_orgnum;
    }

    public String getAls_m6_cell_nbank_p2p_orgnum() {
        return als_m6_cell_nbank_p2p_orgnum;
    }

    public void setAls_m6_cell_nbank_p2p_orgnum(String als_m6_cell_nbank_p2p_orgnum) {
        this.als_m6_cell_nbank_p2p_orgnum = als_m6_cell_nbank_p2p_orgnum;
    }

    public String getAls_m6_cell_nbank_mc_orgnum() {
        return als_m6_cell_nbank_mc_orgnum;
    }

    public void setAls_m6_cell_nbank_mc_orgnum(String als_m6_cell_nbank_mc_orgnum) {
        this.als_m6_cell_nbank_mc_orgnum = als_m6_cell_nbank_mc_orgnum;
    }

    public String getAls_m6_cell_nbank_ca_orgnum() {
        return als_m6_cell_nbank_ca_orgnum;
    }

    public void setAls_m6_cell_nbank_ca_orgnum(String als_m6_cell_nbank_ca_orgnum) {
        this.als_m6_cell_nbank_ca_orgnum = als_m6_cell_nbank_ca_orgnum;
    }

    public String getAls_m6_cell_nbank_cf_orgnum() {
        return als_m6_cell_nbank_cf_orgnum;
    }

    public void setAls_m6_cell_nbank_cf_orgnum(String als_m6_cell_nbank_cf_orgnum) {
        this.als_m6_cell_nbank_cf_orgnum = als_m6_cell_nbank_cf_orgnum;
    }

    public String getAls_m6_cell_nbank_com_orgnum() {
        return als_m6_cell_nbank_com_orgnum;
    }

    public void setAls_m6_cell_nbank_com_orgnum(String als_m6_cell_nbank_com_orgnum) {
        this.als_m6_cell_nbank_com_orgnum = als_m6_cell_nbank_com_orgnum;
    }

    public String getAls_m6_cell_nbank_oth_orgnum() {
        return als_m6_cell_nbank_oth_orgnum;
    }

    public void setAls_m6_cell_nbank_oth_orgnum(String als_m6_cell_nbank_oth_orgnum) {
        this.als_m6_cell_nbank_oth_orgnum = als_m6_cell_nbank_oth_orgnum;
    }

    public String getAls_m6_cell_nbank_tot_mons() {
        return als_m6_cell_nbank_tot_mons;
    }

    public void setAls_m6_cell_nbank_tot_mons(String als_m6_cell_nbank_tot_mons) {
        this.als_m6_cell_nbank_tot_mons = als_m6_cell_nbank_tot_mons;
    }

    public String getAls_m6_cell_nbank_avg_monnum() {
        return als_m6_cell_nbank_avg_monnum;
    }

    public void setAls_m6_cell_nbank_avg_monnum(String als_m6_cell_nbank_avg_monnum) {
        this.als_m6_cell_nbank_avg_monnum = als_m6_cell_nbank_avg_monnum;
    }

    public String getAls_m6_cell_nbank_max_monnum() {
        return als_m6_cell_nbank_max_monnum;
    }

    public void setAls_m6_cell_nbank_max_monnum(String als_m6_cell_nbank_max_monnum) {
        this.als_m6_cell_nbank_max_monnum = als_m6_cell_nbank_max_monnum;
    }

    public String getAls_m6_cell_nbank_min_monnum() {
        return als_m6_cell_nbank_min_monnum;
    }

    public void setAls_m6_cell_nbank_min_monnum(String als_m6_cell_nbank_min_monnum) {
        this.als_m6_cell_nbank_min_monnum = als_m6_cell_nbank_min_monnum;
    }

    public String getAls_m6_cell_nbank_max_inteday() {
        return als_m6_cell_nbank_max_inteday;
    }

    public void setAls_m6_cell_nbank_max_inteday(String als_m6_cell_nbank_max_inteday) {
        this.als_m6_cell_nbank_max_inteday = als_m6_cell_nbank_max_inteday;
    }

    public String getAls_m6_cell_nbank_min_inteday() {
        return als_m6_cell_nbank_min_inteday;
    }

    public void setAls_m6_cell_nbank_min_inteday(String als_m6_cell_nbank_min_inteday) {
        this.als_m6_cell_nbank_min_inteday = als_m6_cell_nbank_min_inteday;
    }

    public String getAls_m12_id_max_inteday() {
        return als_m12_id_max_inteday;
    }

    public void setAls_m12_id_max_inteday(String als_m12_id_max_inteday) {
        this.als_m12_id_max_inteday = als_m12_id_max_inteday;
    }

    public String getAls_m12_id_min_inteday() {
        return als_m12_id_min_inteday;
    }

    public void setAls_m12_id_min_inteday(String als_m12_id_min_inteday) {
        this.als_m12_id_min_inteday = als_m12_id_min_inteday;
    }

    public String getAls_m12_id_tot_mons() {
        return als_m12_id_tot_mons;
    }

    public void setAls_m12_id_tot_mons(String als_m12_id_tot_mons) {
        this.als_m12_id_tot_mons = als_m12_id_tot_mons;
    }

    public String getAls_m12_id_avg_monnum() {
        return als_m12_id_avg_monnum;
    }

    public void setAls_m12_id_avg_monnum(String als_m12_id_avg_monnum) {
        this.als_m12_id_avg_monnum = als_m12_id_avg_monnum;
    }

    public String getAls_m12_id_max_monnum() {
        return als_m12_id_max_monnum;
    }

    public void setAls_m12_id_max_monnum(String als_m12_id_max_monnum) {
        this.als_m12_id_max_monnum = als_m12_id_max_monnum;
    }

    public String getAls_m12_id_min_monnum() {
        return als_m12_id_min_monnum;
    }

    public void setAls_m12_id_min_monnum(String als_m12_id_min_monnum) {
        this.als_m12_id_min_monnum = als_m12_id_min_monnum;
    }

    public String getAls_m12_id_bank_selfnum() {
        return als_m12_id_bank_selfnum;
    }

    public void setAls_m12_id_bank_selfnum(String als_m12_id_bank_selfnum) {
        this.als_m12_id_bank_selfnum = als_m12_id_bank_selfnum;
    }

    public String getAls_m12_id_bank_allnum() {
        return als_m12_id_bank_allnum;
    }

    public void setAls_m12_id_bank_allnum(String als_m12_id_bank_allnum) {
        this.als_m12_id_bank_allnum = als_m12_id_bank_allnum;
    }

    public String getAls_m12_id_bank_orgnum() {
        return als_m12_id_bank_orgnum;
    }

    public void setAls_m12_id_bank_orgnum(String als_m12_id_bank_orgnum) {
        this.als_m12_id_bank_orgnum = als_m12_id_bank_orgnum;
    }

    public String getAls_m12_id_bank_tot_mons() {
        return als_m12_id_bank_tot_mons;
    }

    public void setAls_m12_id_bank_tot_mons(String als_m12_id_bank_tot_mons) {
        this.als_m12_id_bank_tot_mons = als_m12_id_bank_tot_mons;
    }

    public String getAls_m12_id_bank_avg_monnum() {
        return als_m12_id_bank_avg_monnum;
    }

    public void setAls_m12_id_bank_avg_monnum(String als_m12_id_bank_avg_monnum) {
        this.als_m12_id_bank_avg_monnum = als_m12_id_bank_avg_monnum;
    }

    public String getAls_m12_id_bank_max_monnum() {
        return als_m12_id_bank_max_monnum;
    }

    public void setAls_m12_id_bank_max_monnum(String als_m12_id_bank_max_monnum) {
        this.als_m12_id_bank_max_monnum = als_m12_id_bank_max_monnum;
    }

    public String getAls_m12_id_bank_min_monnum() {
        return als_m12_id_bank_min_monnum;
    }

    public void setAls_m12_id_bank_min_monnum(String als_m12_id_bank_min_monnum) {
        this.als_m12_id_bank_min_monnum = als_m12_id_bank_min_monnum;
    }

    public String getAls_m12_id_bank_max_inteday() {
        return als_m12_id_bank_max_inteday;
    }

    public void setAls_m12_id_bank_max_inteday(String als_m12_id_bank_max_inteday) {
        this.als_m12_id_bank_max_inteday = als_m12_id_bank_max_inteday;
    }

    public String getAls_m12_id_bank_min_inteday() {
        return als_m12_id_bank_min_inteday;
    }

    public void setAls_m12_id_bank_min_inteday(String als_m12_id_bank_min_inteday) {
        this.als_m12_id_bank_min_inteday = als_m12_id_bank_min_inteday;
    }

    public String getAls_m12_id_nbank_selfnum() {
        return als_m12_id_nbank_selfnum;
    }

    public void setAls_m12_id_nbank_selfnum(String als_m12_id_nbank_selfnum) {
        this.als_m12_id_nbank_selfnum = als_m12_id_nbank_selfnum;
    }

    public String getAls_m12_id_nbank_allnum() {
        return als_m12_id_nbank_allnum;
    }

    public void setAls_m12_id_nbank_allnum(String als_m12_id_nbank_allnum) {
        this.als_m12_id_nbank_allnum = als_m12_id_nbank_allnum;
    }

    public String getAls_m12_id_nbank_p2p_allnum() {
        return als_m12_id_nbank_p2p_allnum;
    }

    public void setAls_m12_id_nbank_p2p_allnum(String als_m12_id_nbank_p2p_allnum) {
        this.als_m12_id_nbank_p2p_allnum = als_m12_id_nbank_p2p_allnum;
    }

    public String getAls_m12_id_nbank_mc_allnum() {
        return als_m12_id_nbank_mc_allnum;
    }

    public void setAls_m12_id_nbank_mc_allnum(String als_m12_id_nbank_mc_allnum) {
        this.als_m12_id_nbank_mc_allnum = als_m12_id_nbank_mc_allnum;
    }

    public String getAls_m12_id_nbank_ca_allnum() {
        return als_m12_id_nbank_ca_allnum;
    }

    public void setAls_m12_id_nbank_ca_allnum(String als_m12_id_nbank_ca_allnum) {
        this.als_m12_id_nbank_ca_allnum = als_m12_id_nbank_ca_allnum;
    }

    public String getAls_m12_id_nbank_cf_allnum() {
        return als_m12_id_nbank_cf_allnum;
    }

    public void setAls_m12_id_nbank_cf_allnum(String als_m12_id_nbank_cf_allnum) {
        this.als_m12_id_nbank_cf_allnum = als_m12_id_nbank_cf_allnum;
    }

    public String getAls_m12_id_nbank_com_allnum() {
        return als_m12_id_nbank_com_allnum;
    }

    public void setAls_m12_id_nbank_com_allnum(String als_m12_id_nbank_com_allnum) {
        this.als_m12_id_nbank_com_allnum = als_m12_id_nbank_com_allnum;
    }

    public String getAls_m12_id_nbank_oth_allnum() {
        return als_m12_id_nbank_oth_allnum;
    }

    public void setAls_m12_id_nbank_oth_allnum(String als_m12_id_nbank_oth_allnum) {
        this.als_m12_id_nbank_oth_allnum = als_m12_id_nbank_oth_allnum;
    }

    public String getAls_m12_id_nbank_orgnum() {
        return als_m12_id_nbank_orgnum;
    }

    public void setAls_m12_id_nbank_orgnum(String als_m12_id_nbank_orgnum) {
        this.als_m12_id_nbank_orgnum = als_m12_id_nbank_orgnum;
    }

    public String getAls_m12_id_nbank_p2p_orgnum() {
        return als_m12_id_nbank_p2p_orgnum;
    }

    public void setAls_m12_id_nbank_p2p_orgnum(String als_m12_id_nbank_p2p_orgnum) {
        this.als_m12_id_nbank_p2p_orgnum = als_m12_id_nbank_p2p_orgnum;
    }

    public String getAls_m12_id_nbank_mc_orgnum() {
        return als_m12_id_nbank_mc_orgnum;
    }

    public void setAls_m12_id_nbank_mc_orgnum(String als_m12_id_nbank_mc_orgnum) {
        this.als_m12_id_nbank_mc_orgnum = als_m12_id_nbank_mc_orgnum;
    }

    public String getAls_m12_id_nbank_ca_orgnum() {
        return als_m12_id_nbank_ca_orgnum;
    }

    public void setAls_m12_id_nbank_ca_orgnum(String als_m12_id_nbank_ca_orgnum) {
        this.als_m12_id_nbank_ca_orgnum = als_m12_id_nbank_ca_orgnum;
    }

    public String getAls_m12_id_nbank_cf_orgnum() {
        return als_m12_id_nbank_cf_orgnum;
    }

    public void setAls_m12_id_nbank_cf_orgnum(String als_m12_id_nbank_cf_orgnum) {
        this.als_m12_id_nbank_cf_orgnum = als_m12_id_nbank_cf_orgnum;
    }

    public String getAls_m12_id_nbank_com_orgnum() {
        return als_m12_id_nbank_com_orgnum;
    }

    public void setAls_m12_id_nbank_com_orgnum(String als_m12_id_nbank_com_orgnum) {
        this.als_m12_id_nbank_com_orgnum = als_m12_id_nbank_com_orgnum;
    }

    public String getAls_m12_id_nbank_oth_orgnum() {
        return als_m12_id_nbank_oth_orgnum;
    }

    public void setAls_m12_id_nbank_oth_orgnum(String als_m12_id_nbank_oth_orgnum) {
        this.als_m12_id_nbank_oth_orgnum = als_m12_id_nbank_oth_orgnum;
    }

    public String getAls_m12_id_nbank_tot_mons() {
        return als_m12_id_nbank_tot_mons;
    }

    public void setAls_m12_id_nbank_tot_mons(String als_m12_id_nbank_tot_mons) {
        this.als_m12_id_nbank_tot_mons = als_m12_id_nbank_tot_mons;
    }

    public String getAls_m12_id_nbank_avg_monnum() {
        return als_m12_id_nbank_avg_monnum;
    }

    public void setAls_m12_id_nbank_avg_monnum(String als_m12_id_nbank_avg_monnum) {
        this.als_m12_id_nbank_avg_monnum = als_m12_id_nbank_avg_monnum;
    }

    public String getAls_m12_id_nbank_max_monnum() {
        return als_m12_id_nbank_max_monnum;
    }

    public void setAls_m12_id_nbank_max_monnum(String als_m12_id_nbank_max_monnum) {
        this.als_m12_id_nbank_max_monnum = als_m12_id_nbank_max_monnum;
    }

    public String getAls_m12_id_nbank_min_monnum() {
        return als_m12_id_nbank_min_monnum;
    }

    public void setAls_m12_id_nbank_min_monnum(String als_m12_id_nbank_min_monnum) {
        this.als_m12_id_nbank_min_monnum = als_m12_id_nbank_min_monnum;
    }

    public String getAls_m12_id_nbank_max_inteday() {
        return als_m12_id_nbank_max_inteday;
    }

    public void setAls_m12_id_nbank_max_inteday(String als_m12_id_nbank_max_inteday) {
        this.als_m12_id_nbank_max_inteday = als_m12_id_nbank_max_inteday;
    }

    public String getAls_m12_id_nbank_min_inteday() {
        return als_m12_id_nbank_min_inteday;
    }

    public void setAls_m12_id_nbank_min_inteday(String als_m12_id_nbank_min_inteday) {
        this.als_m12_id_nbank_min_inteday = als_m12_id_nbank_min_inteday;
    }

    public String getAls_m12_cell_max_inteday() {
        return als_m12_cell_max_inteday;
    }

    public void setAls_m12_cell_max_inteday(String als_m12_cell_max_inteday) {
        this.als_m12_cell_max_inteday = als_m12_cell_max_inteday;
    }

    public String getAls_m12_cell_min_inteday() {
        return als_m12_cell_min_inteday;
    }

    public void setAls_m12_cell_min_inteday(String als_m12_cell_min_inteday) {
        this.als_m12_cell_min_inteday = als_m12_cell_min_inteday;
    }

    public String getAls_m12_cell_tot_mons() {
        return als_m12_cell_tot_mons;
    }

    public void setAls_m12_cell_tot_mons(String als_m12_cell_tot_mons) {
        this.als_m12_cell_tot_mons = als_m12_cell_tot_mons;
    }

    public String getAls_m12_cell_avg_monnum() {
        return als_m12_cell_avg_monnum;
    }

    public void setAls_m12_cell_avg_monnum(String als_m12_cell_avg_monnum) {
        this.als_m12_cell_avg_monnum = als_m12_cell_avg_monnum;
    }

    public String getAls_m12_cell_max_monnum() {
        return als_m12_cell_max_monnum;
    }

    public void setAls_m12_cell_max_monnum(String als_m12_cell_max_monnum) {
        this.als_m12_cell_max_monnum = als_m12_cell_max_monnum;
    }

    public String getAls_m12_cell_min_monnum() {
        return als_m12_cell_min_monnum;
    }

    public void setAls_m12_cell_min_monnum(String als_m12_cell_min_monnum) {
        this.als_m12_cell_min_monnum = als_m12_cell_min_monnum;
    }

    public String getAls_m12_cell_bank_selfnum() {
        return als_m12_cell_bank_selfnum;
    }

    public void setAls_m12_cell_bank_selfnum(String als_m12_cell_bank_selfnum) {
        this.als_m12_cell_bank_selfnum = als_m12_cell_bank_selfnum;
    }

    public String getAls_m12_cell_bank_allnum() {
        return als_m12_cell_bank_allnum;
    }

    public void setAls_m12_cell_bank_allnum(String als_m12_cell_bank_allnum) {
        this.als_m12_cell_bank_allnum = als_m12_cell_bank_allnum;
    }

    public String getAls_m12_cell_bank_orgnum() {
        return als_m12_cell_bank_orgnum;
    }

    public void setAls_m12_cell_bank_orgnum(String als_m12_cell_bank_orgnum) {
        this.als_m12_cell_bank_orgnum = als_m12_cell_bank_orgnum;
    }

    public String getAls_m12_cell_bank_tot_mons() {
        return als_m12_cell_bank_tot_mons;
    }

    public void setAls_m12_cell_bank_tot_mons(String als_m12_cell_bank_tot_mons) {
        this.als_m12_cell_bank_tot_mons = als_m12_cell_bank_tot_mons;
    }

    public String getAls_m12_cell_bank_avg_monnum() {
        return als_m12_cell_bank_avg_monnum;
    }

    public void setAls_m12_cell_bank_avg_monnum(String als_m12_cell_bank_avg_monnum) {
        this.als_m12_cell_bank_avg_monnum = als_m12_cell_bank_avg_monnum;
    }

    public String getAls_m12_cell_bank_max_monnum() {
        return als_m12_cell_bank_max_monnum;
    }

    public void setAls_m12_cell_bank_max_monnum(String als_m12_cell_bank_max_monnum) {
        this.als_m12_cell_bank_max_monnum = als_m12_cell_bank_max_monnum;
    }

    public String getAls_m12_cell_bank_min_monnum() {
        return als_m12_cell_bank_min_monnum;
    }

    public void setAls_m12_cell_bank_min_monnum(String als_m12_cell_bank_min_monnum) {
        this.als_m12_cell_bank_min_monnum = als_m12_cell_bank_min_monnum;
    }

    public String getAls_m12_cell_bank_max_inteday() {
        return als_m12_cell_bank_max_inteday;
    }

    public void setAls_m12_cell_bank_max_inteday(String als_m12_cell_bank_max_inteday) {
        this.als_m12_cell_bank_max_inteday = als_m12_cell_bank_max_inteday;
    }

    public String getAls_m12_cell_bank_min_inteday() {
        return als_m12_cell_bank_min_inteday;
    }

    public void setAls_m12_cell_bank_min_inteday(String als_m12_cell_bank_min_inteday) {
        this.als_m12_cell_bank_min_inteday = als_m12_cell_bank_min_inteday;
    }

    public String getAls_m12_cell_nbank_selfnum() {
        return als_m12_cell_nbank_selfnum;
    }

    public void setAls_m12_cell_nbank_selfnum(String als_m12_cell_nbank_selfnum) {
        this.als_m12_cell_nbank_selfnum = als_m12_cell_nbank_selfnum;
    }

    public String getAls_m12_cell_nbank_allnum() {
        return als_m12_cell_nbank_allnum;
    }

    public void setAls_m12_cell_nbank_allnum(String als_m12_cell_nbank_allnum) {
        this.als_m12_cell_nbank_allnum = als_m12_cell_nbank_allnum;
    }

    public String getAls_m12_cell_nbank_p2p_allnum() {
        return als_m12_cell_nbank_p2p_allnum;
    }

    public void setAls_m12_cell_nbank_p2p_allnum(String als_m12_cell_nbank_p2p_allnum) {
        this.als_m12_cell_nbank_p2p_allnum = als_m12_cell_nbank_p2p_allnum;
    }

    public String getAls_m12_cell_nbank_mc_allnum() {
        return als_m12_cell_nbank_mc_allnum;
    }

    public void setAls_m12_cell_nbank_mc_allnum(String als_m12_cell_nbank_mc_allnum) {
        this.als_m12_cell_nbank_mc_allnum = als_m12_cell_nbank_mc_allnum;
    }

    public String getAls_m12_cell_nbank_ca_allnum() {
        return als_m12_cell_nbank_ca_allnum;
    }

    public void setAls_m12_cell_nbank_ca_allnum(String als_m12_cell_nbank_ca_allnum) {
        this.als_m12_cell_nbank_ca_allnum = als_m12_cell_nbank_ca_allnum;
    }

    public String getAls_m12_cell_nbank_cf_allnum() {
        return als_m12_cell_nbank_cf_allnum;
    }

    public void setAls_m12_cell_nbank_cf_allnum(String als_m12_cell_nbank_cf_allnum) {
        this.als_m12_cell_nbank_cf_allnum = als_m12_cell_nbank_cf_allnum;
    }

    public String getAls_m12_cell_nbank_com_allnum() {
        return als_m12_cell_nbank_com_allnum;
    }

    public void setAls_m12_cell_nbank_com_allnum(String als_m12_cell_nbank_com_allnum) {
        this.als_m12_cell_nbank_com_allnum = als_m12_cell_nbank_com_allnum;
    }

    public String getAls_m12_cell_nbank_oth_allnum() {
        return als_m12_cell_nbank_oth_allnum;
    }

    public void setAls_m12_cell_nbank_oth_allnum(String als_m12_cell_nbank_oth_allnum) {
        this.als_m12_cell_nbank_oth_allnum = als_m12_cell_nbank_oth_allnum;
    }

    public String getAls_m12_cell_nbank_orgnum() {
        return als_m12_cell_nbank_orgnum;
    }

    public void setAls_m12_cell_nbank_orgnum(String als_m12_cell_nbank_orgnum) {
        this.als_m12_cell_nbank_orgnum = als_m12_cell_nbank_orgnum;
    }

    public String getAls_m12_cell_nbank_p2p_orgnum() {
        return als_m12_cell_nbank_p2p_orgnum;
    }

    public void setAls_m12_cell_nbank_p2p_orgnum(String als_m12_cell_nbank_p2p_orgnum) {
        this.als_m12_cell_nbank_p2p_orgnum = als_m12_cell_nbank_p2p_orgnum;
    }

    public String getAls_m12_cell_nbank_mc_orgnum() {
        return als_m12_cell_nbank_mc_orgnum;
    }

    public void setAls_m12_cell_nbank_mc_orgnum(String als_m12_cell_nbank_mc_orgnum) {
        this.als_m12_cell_nbank_mc_orgnum = als_m12_cell_nbank_mc_orgnum;
    }

    public String getAls_m12_cell_nbank_ca_orgnum() {
        return als_m12_cell_nbank_ca_orgnum;
    }

    public void setAls_m12_cell_nbank_ca_orgnum(String als_m12_cell_nbank_ca_orgnum) {
        this.als_m12_cell_nbank_ca_orgnum = als_m12_cell_nbank_ca_orgnum;
    }

    public String getAls_m12_cell_nbank_cf_orgnum() {
        return als_m12_cell_nbank_cf_orgnum;
    }

    public void setAls_m12_cell_nbank_cf_orgnum(String als_m12_cell_nbank_cf_orgnum) {
        this.als_m12_cell_nbank_cf_orgnum = als_m12_cell_nbank_cf_orgnum;
    }

    public String getAls_m12_cell_nbank_com_orgnum() {
        return als_m12_cell_nbank_com_orgnum;
    }

    public void setAls_m12_cell_nbank_com_orgnum(String als_m12_cell_nbank_com_orgnum) {
        this.als_m12_cell_nbank_com_orgnum = als_m12_cell_nbank_com_orgnum;
    }

    public String getAls_m12_cell_nbank_oth_orgnum() {
        return als_m12_cell_nbank_oth_orgnum;
    }

    public void setAls_m12_cell_nbank_oth_orgnum(String als_m12_cell_nbank_oth_orgnum) {
        this.als_m12_cell_nbank_oth_orgnum = als_m12_cell_nbank_oth_orgnum;
    }

    public String getAls_m12_cell_nbank_tot_mons() {
        return als_m12_cell_nbank_tot_mons;
    }

    public void setAls_m12_cell_nbank_tot_mons(String als_m12_cell_nbank_tot_mons) {
        this.als_m12_cell_nbank_tot_mons = als_m12_cell_nbank_tot_mons;
    }

    public String getAls_m12_cell_nbank_avg_monnum() {
        return als_m12_cell_nbank_avg_monnum;
    }

    public void setAls_m12_cell_nbank_avg_monnum(String als_m12_cell_nbank_avg_monnum) {
        this.als_m12_cell_nbank_avg_monnum = als_m12_cell_nbank_avg_monnum;
    }

    public String getAls_m12_cell_nbank_max_monnum() {
        return als_m12_cell_nbank_max_monnum;
    }

    public void setAls_m12_cell_nbank_max_monnum(String als_m12_cell_nbank_max_monnum) {
        this.als_m12_cell_nbank_max_monnum = als_m12_cell_nbank_max_monnum;
    }

    public String getAls_m12_cell_nbank_min_monnum() {
        return als_m12_cell_nbank_min_monnum;
    }

    public void setAls_m12_cell_nbank_min_monnum(String als_m12_cell_nbank_min_monnum) {
        this.als_m12_cell_nbank_min_monnum = als_m12_cell_nbank_min_monnum;
    }

    public String getAls_m12_cell_nbank_max_inteday() {
        return als_m12_cell_nbank_max_inteday;
    }

    public void setAls_m12_cell_nbank_max_inteday(String als_m12_cell_nbank_max_inteday) {
        this.als_m12_cell_nbank_max_inteday = als_m12_cell_nbank_max_inteday;
    }

    public String getAls_m12_cell_nbank_min_inteday() {
        return als_m12_cell_nbank_min_inteday;
    }

    public void setAls_m12_cell_nbank_min_inteday(String als_m12_cell_nbank_min_inteday) {
        this.als_m12_cell_nbank_min_inteday = als_m12_cell_nbank_min_inteday;
    }

    public String getAls_fst_id_bank_inteday() {
        return als_fst_id_bank_inteday;
    }

    public void setAls_fst_id_bank_inteday(String als_fst_id_bank_inteday) {
        this.als_fst_id_bank_inteday = als_fst_id_bank_inteday;
    }

    public String getAls_fst_id_nbank_inteday() {
        return als_fst_id_nbank_inteday;
    }

    public void setAls_fst_id_nbank_inteday(String als_fst_id_nbank_inteday) {
        this.als_fst_id_nbank_inteday = als_fst_id_nbank_inteday;
    }

    public String getAls_fst_cell_bank_inteday() {
        return als_fst_cell_bank_inteday;
    }

    public void setAls_fst_cell_bank_inteday(String als_fst_cell_bank_inteday) {
        this.als_fst_cell_bank_inteday = als_fst_cell_bank_inteday;
    }

    public String getAls_fst_cell_nbank_inteday() {
        return als_fst_cell_nbank_inteday;
    }

    public void setAls_fst_cell_nbank_inteday(String als_fst_cell_nbank_inteday) {
        this.als_fst_cell_nbank_inteday = als_fst_cell_nbank_inteday;
    }

    public String getAls_lst_id_bank_inteday() {
        return als_lst_id_bank_inteday;
    }

    public void setAls_lst_id_bank_inteday(String als_lst_id_bank_inteday) {
        this.als_lst_id_bank_inteday = als_lst_id_bank_inteday;
    }

    public String getAls_lst_id_bank_consnum() {
        return als_lst_id_bank_consnum;
    }

    public void setAls_lst_id_bank_consnum(String als_lst_id_bank_consnum) {
        this.als_lst_id_bank_consnum = als_lst_id_bank_consnum;
    }

    public String getAls_lst_id_bank_csinteday() {
        return als_lst_id_bank_csinteday;
    }

    public void setAls_lst_id_bank_csinteday(String als_lst_id_bank_csinteday) {
        this.als_lst_id_bank_csinteday = als_lst_id_bank_csinteday;
    }

    public String getAls_lst_id_nbank_inteday() {
        return als_lst_id_nbank_inteday;
    }

    public void setAls_lst_id_nbank_inteday(String als_lst_id_nbank_inteday) {
        this.als_lst_id_nbank_inteday = als_lst_id_nbank_inteday;
    }

    public String getAls_lst_id_nbank_consnum() {
        return als_lst_id_nbank_consnum;
    }

    public void setAls_lst_id_nbank_consnum(String als_lst_id_nbank_consnum) {
        this.als_lst_id_nbank_consnum = als_lst_id_nbank_consnum;
    }

    public String getAls_lst_id_nbank_csinteday() {
        return als_lst_id_nbank_csinteday;
    }

    public void setAls_lst_id_nbank_csinteday(String als_lst_id_nbank_csinteday) {
        this.als_lst_id_nbank_csinteday = als_lst_id_nbank_csinteday;
    }

    public String getAls_lst_cell_bank_inteday() {
        return als_lst_cell_bank_inteday;
    }

    public void setAls_lst_cell_bank_inteday(String als_lst_cell_bank_inteday) {
        this.als_lst_cell_bank_inteday = als_lst_cell_bank_inteday;
    }

    public String getAls_lst_cell_bank_consnum() {
        return als_lst_cell_bank_consnum;
    }

    public void setAls_lst_cell_bank_consnum(String als_lst_cell_bank_consnum) {
        this.als_lst_cell_bank_consnum = als_lst_cell_bank_consnum;
    }

    public String getAls_lst_cell_bank_csinteday() {
        return als_lst_cell_bank_csinteday;
    }

    public void setAls_lst_cell_bank_csinteday(String als_lst_cell_bank_csinteday) {
        this.als_lst_cell_bank_csinteday = als_lst_cell_bank_csinteday;
    }

    public String getAls_lst_cell_nbank_inteday() {
        return als_lst_cell_nbank_inteday;
    }

    public void setAls_lst_cell_nbank_inteday(String als_lst_cell_nbank_inteday) {
        this.als_lst_cell_nbank_inteday = als_lst_cell_nbank_inteday;
    }

    public String getAls_lst_cell_nbank_consnum() {
        return als_lst_cell_nbank_consnum;
    }

    public void setAls_lst_cell_nbank_consnum(String als_lst_cell_nbank_consnum) {
        this.als_lst_cell_nbank_consnum = als_lst_cell_nbank_consnum;
    }

    public String getAls_lst_cell_nbank_csinteday() {
        return als_lst_cell_nbank_csinteday;
    }

    public void setAls_lst_cell_nbank_csinteday(String als_lst_cell_nbank_csinteday) {
        this.als_lst_cell_nbank_csinteday = als_lst_cell_nbank_csinteday;
    }
    @Override
    public String toString() {
        String[] others = new String[] {};
        return ReflectionToStringBuilder.toStringExclude(this, others);
    }
}
