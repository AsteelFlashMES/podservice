package com.asteelflash.repository;

import com.asteelflash.entity.MaterialDataEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by hunter.fei on 2018/5/17.
 */
public interface MaterialDataRepository extends JpaRepository<MaterialDataEntity, String> {

  List<MaterialDataEntity> findMaterialDataEntitiesByLineNoAndAndCreateTimeBetween(
      @Param("lineNo") int lineNo, @Param("beginTime") long beginTime,
      @Param("endTime") long endTime);
}
