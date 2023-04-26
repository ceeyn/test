package test.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TOrderDao;
import test.service.TOrderService;
import test.entity.PageData;
import test.utils.ExcelUtil;
import test.utils.PageUtil;
import java.util.LinkedHashMap;
import test.entity.TOrderEntity;
import java.util.List;
import java.util.Map;

@Service
public class TOrderServiceImpl implements TOrderService {


	private final TOrderDao dao;

	@Autowired
	public TOrderServiceImpl(TOrderDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TOrderEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TOrderEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TOrderEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TOrderEntity> select(TOrderEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TOrderEntity> likeSelect(TOrderEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TOrderEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "order_id", "user_id", "order_status", "good_num", "good_id", "detail_id", "addr", "add_name", "add_tel", "time_submit", "time_pay", "time_cancel", "time_ship", "time_return", "time_finish"};

		String[] headEngList = new String[]{ "orderId", "userId", "orderStatus", "goodNum", "goodId", "detailId", "addr", "addName", "addTel", "timeSubmit", "timePay", "timeCancel", "timeShip", "timeReturn", "timeFinish"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
