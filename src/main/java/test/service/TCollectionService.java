package test.service;

import javax.servlet.http.HttpServletResponse;

import test.entity.TCollectionEntity;
import test.entity.PageData;
import java.util.List;

public interface TCollectionService {

	void add(TCollectionEntity entity);

	void delete(TCollectionEntity entity);

	void update(TCollectionEntity entity);

	List<TCollectionEntity> select(TCollectionEntity entity);

	PageData<TCollectionEntity> likeSelect(TCollectionEntity entity);

    void exportExcel(TCollectionEntity entity, HttpServletResponse response);

}
