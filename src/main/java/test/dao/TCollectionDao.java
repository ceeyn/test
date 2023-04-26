package test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import test.entity.TCollectionEntity;



@Mapper
@Repository
public interface TCollectionDao extends BaseDao<TCollectionEntity> {

}
