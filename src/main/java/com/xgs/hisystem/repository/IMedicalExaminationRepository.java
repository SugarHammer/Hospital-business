package com.xgs.hisystem.repository;

import com.xgs.hisystem.pojo.entity.MedicalExaminationEntity;

/**
 * @author HaiTao
 * @date 2019-5-18
 * @description:
 */
public interface IMedicalExaminationRepository extends BaseRepository<MedicalExaminationEntity> {

    MedicalExaminationEntity findByPrescriptionNum(String prescriptionNum);

    MedicalExaminationEntity findByRegisterId(String registerId);
}
