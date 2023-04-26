package test.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TCollectionDao;
import test.service.TCollectionService;
import test.entity.PageData;
import test.utils.ExcelUtil;
import test.utils.PageUtil;
import java.util.LinkedHashMap;
import test.entity.TCollectionEntity;
import java.util.List;
import java.util.Map;

@Service
public class TCollectionServiceImpl implements TCollectionService {


	private final TCollectionDao dao;

	@Autowired
	public TCollectionServiceImpl(TCollectionDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TCollectionEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TCollectionEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TCollectionEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TCollectionEntity> select(TCollectionEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TCollectionEntity> likeSelect(TCollectionEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TCollectionEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "user_id", "good_id"};

		String[] headEngList = new String[]{ "userId", "goodId"};

		String[] describeList = new String[] { "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
