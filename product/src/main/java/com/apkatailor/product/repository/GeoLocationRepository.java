package com.apkatailor.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apkatailor.product.entity.GeoLocation;

public interface GeoLocationRepository extends JpaRepository<GeoLocation, Long> {
}