package com.br.netflix.seriesservice.repository;

import com.br.netflix.seriesservice.NetflixSeries;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetflixSeriesRepository extends MongoRepository<NetflixSeries, String> {
	List<NetflixSeries> findByGeneroIgnoreCase(String text);
}
