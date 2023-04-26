package test.service;

import javax.servlet.http.HttpServletResponse;

import test.entity.TOrderEntity;
import test.entity.PageData;
import java.util.List;

public interface TOrderService {

	void add(TOrderEntity entity);

	void delete(TOrderEntity entity);

	void update(TOrderEntity entity);

	List<TOrderEntity> select(TOrderEntity entity);

	PageData<TOrderEntity> likeSelect(TOrderEntity entity);

    void exportExcel(TOrderEntity entity, HttpServletResponse response);

}
