package com.asteelflash.repository;

import com.asteelflash.entity.MaterialCodeEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by hunter.fei on 2018/5/17.
 */
public interface MaterialCodeRepository extends JpaRepository<MaterialCodeEntity, String>{

  List<MaterialCodeEntity> getMaterialCodeEntitiesByMaterialKind(@Param("materialKind") int materialKind);

  MaterialCodeEntity getMaterialCodeEntityByMaterialCode(@Param("materialCode")String materialCode);

}
