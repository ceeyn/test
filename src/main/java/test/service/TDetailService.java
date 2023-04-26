package test.service;

import javax.servlet.http.HttpServletResponse;

import test.entity.TDetailEntity;
import test.entity.PageData;
import java.util.List;

public interface TDetailService {

	void add(TDetailEntity entity);

	void delete(TDetailEntity entity);

	void update(TDetailEntity entity);

	List<TDetailEntity> select(TDetailEntity entity);

	PageData<TDetailEntity> likeSelect(TDetailEntity entity);

    void exportExcel(TDetailEntity entity, HttpServletResponse response);

}
