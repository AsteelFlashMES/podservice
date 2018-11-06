package com.asteelflash.repository;

import com.asteelflash.entity.PackageInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hunter.fei on 2018/8/31.
 */
public interface PackageInfoRepository extends JpaRepository<PackageInfoEntity, String> {

}
