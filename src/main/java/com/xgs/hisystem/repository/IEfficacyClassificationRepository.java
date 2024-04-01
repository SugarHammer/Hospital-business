package com.xgs.hisystem.repository;

import com.xgs.hisystem.pojo.entity.EfficacyClassificationEntity;

/**
 * @author HaiTao
 * @date 2019-5-28
 * @description:
 */
public interface IEfficacyClassificationRepository extends BaseRepository<EfficacyClassificationEntity> {

    EfficacyClassificationEntity findByEfficacyClassification(String efficacyClassification);
}
