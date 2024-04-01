package com.xgs.hisystem.repository;

import com.xgs.hisystem.pojo.entity.PatientEntity;

/**
 * @author HaiTao
 * @date 2019/4/27
 * @description:
 */
public interface IPatientRepository extends BaseRepository<PatientEntity> {

    PatientEntity findByCardId(String cardID);

    PatientEntity findByIdCard(String IDcard);
}
