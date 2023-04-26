package test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import test.entity.TKindEntity;



@Mapper
@Repository
public interface TKindDao extends BaseDao<TKindEntity> {

}
