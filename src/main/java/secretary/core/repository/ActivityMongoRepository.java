package secretary.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import secretary.core.domain.Activity;

public interface ActivityMongoRepository extends MongoRepository<Activity, String> {
	
	
}
