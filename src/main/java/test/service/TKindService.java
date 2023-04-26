package test.service;

import javax.servlet.http.HttpServletResponse;

import test.entity.TKindEntity;
import test.entity.PageData;
import java.util.List;

public interface TKindService {

	void add(TKindEntity entity);

	void delete(TKindEntity entity);

	void update(TKindEntity entity);

	List<TKindEntity> select(TKindEntity entity);

	PageData<TKindEntity> likeSelect(TKindEntity entity);

    void exportExcel(TKindEntity entity, HttpServletResponse response);

}
